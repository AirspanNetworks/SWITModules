/*

 *****************************************************************

 *

 * Module : DCC - Device Controller Client

 *

 *

 *****************************************************************

 *

 *  Copyright (c) 2009 SEQUANS Communications.

 *  All rights reserved.

 *  

 *  This is confidential and proprietary source code of SEQUANS

 *  Communications. The use of the present source code and all

 *  its derived forms is exclusively governed by the restricted

 *  terms and conditions set forth in the SEQUANS

 *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE

 *  AGREEMENT. The present source code and all its derived

 *  forms can ONLY and EXCLUSIVELY be used with SEQUANS

 *  Communications' products. The distribution/sale of the

 *  present source code and all its derived forms is EXCLUSIVELY

 *  RESERVED to regular LICENCE holder and otherwise STRICTLY

 *  PROHIBITED.

 *

 *****************************************************************

 */

// Define the package

package DMTool;

// Some external includes

import java.io.*;

import java.net.*;

import java.util.*;

import java.util.concurrent.*;

import java.lang.reflect.Method;

// Main class definition

public class DeviceController {

	DMtool dm;

	static final boolean DEBUG = false;

	static String byteArrayToHexString(byte in[]) {

		byte ch = 0x00;

		int i = 0;

		if (in == null)

			return "(null)";

		if (in.length <= 0)

			return "(empty)";

		String pseudo[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

		StringBuffer out = new StringBuffer(in.length * 2);

		while (i < in.length) {

			ch = (byte) (in[i] & 0xF0); // Strip off high nibble

			ch = (byte) (ch >>> 4);

			// shift the bits down

			ch = (byte) (ch & 0x0F);

			// must do this is high order bit is on!

			out.append(pseudo[(int) ch]); // convert the nibble to a String
											// Character

			ch = (byte) (in[i] & 0x0F); // Strip off low nibble

			out.append(pseudo[(int) ch]); // convert the nibble to a String
											// Character

			out.append(" ");

			i++;

		}

		String rslt = new String(out);

		return rslt;

	}

	// Internal NTF

	public class InternalNtf extends InternalClient {

		public void MsDetected(long mac) {

			if(DEBUG)
				_out.println("<DCP> MS detected");

		}

	}

	public class DeviceInfoNtf extends DeviceInfoClient {

		DeviceInfoClient _clientUses;

		public DeviceInfoNtf(DeviceInfoClient clientUses) {

			_clientUses = clientUses;

		}

		@Override

		public void MsDetached(long errorCode) {

			_targetDisconnectReceived = true;
			if(DEBUG)
				_out.println("<DCP> MS detached");

			if (_clientUses != null)
				_clientUses.MsDetached(errorCode);

		}

		@Override

		public void MsReady() {

			if (_clientUses != null)
				_clientUses.MsReady();

		}

		@Override

		public void MsLoading(long progress) {

			if (_clientUses != null)
				_clientUses.MsLoading(progress);

		}

		@Override

		public void MsFatalError(final String message) {

			_targetDisconnectReceived = true;

			if (DEBUG)
				_out.printlnError("<DCP> MS fatal error: " + message);

			if (_clientUses != null)
				_clientUses.MsFatalError(message);

		}

		@Override

		public void AuthenticationState(boolean success) {

			if (_clientUses != null)
				_clientUses.AuthenticationState(success);

		}

	}

	void checkDeviceInfoOverridden() {

		// Runtime check if THP got updated and we've forgot to forward the
		// method call

		Method myMethods[] = DeviceInfoNtf.class.getDeclaredMethods();

		Method parentMethods[] = DeviceInfoClient.class.getDeclaredMethods();

		for (Method parent : parentMethods) {

			if (parent.getName().equals("DeviceInfoClient"))

				continue;

			boolean notFound = true;

			for (Method my : myMethods) {

				if (my.getName().equals(parent.getName()))

					notFound = false;

			}

			if (notFound)

			{

				System.out.println(
						"DeviceController.DeviceInfoNtf class does not override all callbacks of DeviceInfoClient class");

				throw new RuntimeException(
						"DeviceController.DeviceInfoNtf class does not override all callbacks of DeviceInfoClient class");

			}

		}

	}

	// Public methods

	// ===============

	// Constructor

	public DeviceController(final DccInitConfig cfg, boolean asyncTx, DMtool dm) {

		this.dm = dm;

		checkDeviceInfoOverridden();

		_cfg = cfg;

		_out = _cfg.consoleOutput;

		// Service information

		_responseWaitSemaphore = new Semaphore(0);

		// for service dump

		_services = new Hashtable<String, Integer>();

		// DB of services handler

		_clients = new Hashtable<String, DccClient>();

		// Socket information

		_serverIp = _cfg.serverIp;

		_serverPort = _cfg.serverPort;

		// Initialize some required DCC services

		_singleton = this;

		Internal.InternalInitialize(new InternalNtf());

		DeviceInfo.DeviceInfoInitialize(new DeviceInfoNtf(cfg.device));

		Dbg.DbgInitialize(cfg.dbg);

		Evt.EvtInitialize(cfg.evt);

		Cnx.CnxInitialize(cfg.cnx);

		Ue.UeInitialize(cfg.ue);

		// PlaInfo.PlaInfoInitialize();

		// UsimInfo.UsimInfoInitialize();

		Has.HasInitialize(cfg.has);

		Mts.MtsInitialize(cfg.mts);

		// Arc.ArcInitialize();

		// Pla.PlaInitialize();

		// PlaDbg.PlaDbgInitialize();

		Wrat.WratInitialize(cfg.wrat);

	}

	// Start the Device Controller client

	public boolean startDc() {

		if (_dcSocketConnectThread == null) {

			_dcNtfProcessorThread = new dcNtfProcessor(this);

			_dcNtfProcessorThread.start();

			_dcSocketConnectThread = new dcSocketConnect(this);

			_dcSocketConnectThread.start();

			if (DEBUG)
				_out.println("<DC> DC started");

		}

		return true;

	}

	// Stop the Device Controller client

	public void stopDc() {

		if (_dcSocketConnectThread != null) {
			if (DEBUG)
				_out.println("<DC> Stopping DC");

			_targetDisconnectReceived = true;

			_dcSocketConnectThread.isAborted = true;

			_dcSocketConnectThread.interrupt();

			try {

				_dcSocketConnectThread.join(2000);

			} catch (InterruptedException e) {

			}

			_dcSocketConnectThread = null;

			_dcNtfProcessorThread.isAborted = true;

			_dcNtfProcessorThread.interrupt();

			try {

				_dcNtfProcessorThread.join(2000);

			} catch (InterruptedException e) {

			}

			_dcNtfProcessorThread = null;

		}

	}

	// Connection methods

	// ===================

	int writeCommand(final byte[] cmdBuf) {

		// Write the buffer to the socket

		try {

			_socketOut.write(cmdBuf, 0, cmdBuf.length);

		} catch (IOException e) {
			if (DEBUG)
				_out.printlnError("<DC SEND> Write IO error: msg='" + e.getMessage() + "'");

			_targetDisconnectReceived = true;

			return Status.STATUS_FAILURE;

		}

		return Status.STATUS_OK;

	}

	void connectAndProcess() {

		Socket socket = null;

		try {
			if (DEBUG)
				_out.println("<DC> Trying to establish a connection to DC server.");

			socket = new Socket(_serverIp, _serverPort);

			socket.setSoTimeout(1000);

			OutputStream socketOut = socket.getOutputStream();

			InputStream socketIn = socket.getInputStream();

			if (socketIn != null && socketOut != null) {

				_socket = socket;

				_socketOut = socketOut;

				_socketIn = socketIn;

				_dccConnected = false;

				_targetConnected = false;

				_targetDisconnectReceived = false;

				_discoverMessageReceived = false;

				_dcNtfProcessorThread.clear();

				_responseId = -1;

				_responseBuffer = null;
				if (DEBUG)
					_out.println("<DC> Connected to DC server.");

				try {

					socketReaderLoop();
					if(DEBUG)
						_out.printlnError("<DC> Connection to server closed");

				} catch (IOException e) {
					if(DEBUG)
						_out.printlnError("<DC> IO error: '" + e.toString() + "'");

				} catch (InterruptedException e) {

				} catch (Exception e) {
					if(DEBUG)
						_out.printlnError("<DC> error: '" + e.toString() + "'");

				}

				boolean targetWasConnected = _targetConnected;

				_dccConnected = false;

				_targetConnected = false;

				_discoverMessageReceived = false;

				if (_dcTargetConnectThread != null) {

					_dcTargetConnectThread.isAborted = true;

					_dcTargetConnectThread.interrupt();

					try {

						_dcTargetConnectThread.join(2000);

					} catch (InterruptedException e) {

					}

					_dcTargetConnectThread = null;

				} else {

				}

				_targetDisconnectReceived = false;

				try {

					_socketOut.close();

					_socketIn.close();

				} catch (IOException e) {

				}

				_socket = null;

				_socketOut = null;

				_socketIn = null;

				_dcNtfProcessorThread.clear();

				_services.clear();

				_responseId = -1;

				_responseBuffer = null;

				_responseWaitSemaphore.release();

				synchronized (_responseWaitSemaphore) {

					_responseWaitSemaphore.drainPermits();

				}

				if (_cfg.use != null && targetWasConnected)

					_cfg.use.disconnected();

			}

		}

		catch (UnknownHostException e) {
			if(DEBUG)
				_out.printlnError("<DC CONNECT> Unknown Host error '" + _serverIp + "': msg='" + e.getMessage() + "'");

		} catch (IOException e) {
			if(DEBUG)
				_out.printlnError("<DC CONNECT> IO error: msg='" + e.getMessage() + "'");

		}

		try {

			if (socket != null)

				socket.close();

		} catch (IOException e) {

		}

	}

	private void socketReaderLoop() throws IOException, InterruptedException {

		byte[] headerBuf = new byte[16];

		while (!_targetDisconnectReceived) {

			int length = 0;

			while (length < 16 && !_targetDisconnectReceived) {

				int ret = 0;

				try {

					ret = _socketIn.read(headerBuf, length, 16 - length);

				} catch (SocketTimeoutException e) {

				}

				if (ret != -1) {

					length += ret;

				} else {
					if(DEBUG)
						_out.println("<DCP RECV>: server closed connection");

					_targetDisconnectReceived = true;

					break;

				}

			}

			if (_targetDisconnectReceived)

				break;

			dcpHeader header = new dcpHeader();

			if (!header.processHeader(headerBuf)) {
				if(DEBUG)
					_out.println("<DCP RECV> Incorrect header was received");
					_out.println("<DCP RECV> Data: " + byteArrayToHexString(headerBuf));

				_targetDisconnectReceived = true;

				continue;

			}

			// Read the payload

			int dataToRead = header._size;

			byte[] cmdBuf = new byte[dataToRead];

			length = 0;

			while (length < dataToRead && !_targetDisconnectReceived) {

				int ret = 0;

				try {

					ret = _socketIn.read(cmdBuf, length, dataToRead - length);

				} catch (SocketTimeoutException e) {

				}

				if (ret != -1) {

					length += ret;

				} else {
					if(DEBUG)
						_out.println("<DCP RECV>: server closed connection");

					_targetDisconnectReceived = true;

					break;

				}

			}

			if (_targetDisconnectReceived)

				break;

			// Process the received command

			processRxCommand(header, cmdBuf);

		}

	}

	void processRxCommand(dcpHeader header, final byte[] cmdBuff) {

		if (DEBUG)
			_out.println("RX: recv id " + String.format("0x%08X", header._type) + " data "
					+ byteArrayToHexString(header.marshall()) + byteArrayToHexString(cmdBuff));

		// Handle bad status

		if (header._status != 0 && (header._type == _responseId || _responseId == -1)) {
			if(DEBUG)
				_out.printlnError("<DCP RECV> Bad return status " + String.format("0x%08X", header._status) + " id "
					+ String.format("0x%08X", header._type));

			if (DEBUG)
				_out.printlnError("<DCP RECV> data: " + byteArrayToHexString(cmdBuff));

			_responseBuffer = null;

			_responseId = -1;

			_responseWaitSemaphore.release();
			
			if(DEBUG)
				_out.println("RX: recv " + byteArrayToHexString(header.marshall()) +
					byteArrayToHexString(cmdBuff));

			return;

		}

		// Is the answer the "service discover" command ?

		if (header._type == 0xFFFFFFFF) {

			synchronized (_services) {

				if (!processServiceDiscoverMsg(header, cmdBuff)) {
					if(DEBUG)
						_out.printlnError("<DCP RECV> Service descovery message invalid");

					if (DEBUG)
						_out.printlnError("<DCP RECV> data: " + byteArrayToHexString(cmdBuff));

					_targetDisconnectReceived = true;

					return;

				}

				_dccConnected = true;

				_discoverMessageReceived = true;

				/*
				 * 
				 * if( _dcTargetConnectThread != null ) {
				 * 
				 * _responseWaitSemaphore.release();
				 * 
				 * }
				 * 
				 */

				if (!_targetConnected && _dcTargetConnectThread == null) {

					_dcTargetConnectThread = new dcTargetConnect(this);

					_dcTargetConnectThread.start();

				}

			}

		}

		// Is it the answer to the last command ?

		else if (header._type == _responseId) {

			_responseId = -1;

			_responseBuffer = cmdBuff;

			_responseWaitSemaphore.release();

		}

		// Is it a notification ?

		else {

			_dcNtfProcessorThread.push(header._type, cmdBuff);

		}

	}

	// Service methods

	// ================

	public static void registerClient(DccClient clt) {

		_singleton.addDccClient(clt);

	}

	void addDccClient(DccClient clt) {

		_clients.put(clt.name, clt);

	}

	int pushNtfToServer() {

		OutValue<String> name = new OutValue<String>("");

		OutValue<Integer> id = new OutValue<Integer>(-1);

		ServiceType serviceType = new ServiceType();

		Vector<NtfName> ntfNameVec = new Vector<NtfName>();

		Enumeration<String> e = _clients.keys();

		while (e.hasMoreElements()) {

			String serviceName = e.nextElement();

			for (int i = 0; i < _clients.get(serviceName).getServicesQty(); i++) {

				int st = _clients.get(serviceName).getServiceFromIndex(i, name, id, serviceType);

				if (st == Status.STATUS_OK && serviceType.value == ServiceType.SERVICE_NOTIFICATION) {

					NtfName newEl = new NtfName();

					newEl.serviceName = name._value;

					ntfNameVec.add(newEl);

					if (DEBUG)
						_out.println("<DCP DEBUG> Ntf push: name=" + name._value + " id="
								+ String.format("0x%08X", id._value));

				}

			}

		}

		if (ntfNameVec.size() != 0) {

			return Internal.RequestNtf(ntfNameVec.toArray(new NtfName[0]));

		} else {

			return Status.STATUS_OK;

		}

	}

	void cleanServices() {

		OutValue<String> name = new OutValue<String>("");

		OutValue<Integer> id = new OutValue<Integer>(-1);

		ServiceType serviceType = new ServiceType();

		Enumeration<String> e = _clients.keys();

		while (e.hasMoreElements()) {

			String serviceName = e.nextElement();

			for (int i = 0; i < _clients.get(serviceName).getServicesQty(); i++) {

				int st = _clients.get(serviceName).getServiceFromIndex(i, name, id, serviceType);

				if (st == Status.STATUS_OK) {

					_clients.get(serviceName).resolveService(name._value, -1);

				}

			}

		}

	}

	void initService(final String name, int id) {

		Enumeration<String> e = _clients.keys();

		while (e.hasMoreElements()) {

			String serviceName = e.nextElement();

			if (_clients.get(serviceName).resolveService(name, id) == Status.STATUS_OK) {

				_services.put(name, new Integer(id));

				return;

			}

		}
		
		if(DEBUG)
			_out.println("<DCP INIT> Unknown service: name'"+name+"'id="+String.format("0x%08X",id));

	}

	boolean processServiceDiscoverMsg(dcpHeader header, final byte[] cmdBuf) {

		// Initialize the service database

		_services.clear();

		cleanServices();

		_clientHandle = header._handle;

		// Start discover message parsing

		int idx = 0;

		int serviceQty = ((cmdBuf[idx + 0] & 0xFF) << 24)

				| ((cmdBuf[idx + 1] & 0xFF) << 16)

				| ((cmdBuf[idx + 2] & 0xFF) << 8) | (cmdBuf[idx + 3] & 0xFF);

		idx += 4;

		// Loop on declared services

		for (int i = 0; i < serviceQty; ++i) {

			// Get service name

			String serviceName = "";

			int serviceId = ((((int) cmdBuf[idx + 0]) & 0xFF) << 24)

					| ((((int) cmdBuf[idx + 1]) & 0xFF) << 16)

					| ((((int) cmdBuf[idx + 2]) & 0xFF) << 8)

					| ((((int) cmdBuf[idx + 3]) & 0xFF) << 0);

			idx += 4;

			while (cmdBuf[idx] != 0) {

				serviceName += (char) cmdBuf[idx];

				idx += 1;

			}

			idx += 1;

			// Store new service

			initService(serviceName, new Integer(serviceId));

		}

		// Connection valid

		if (DEBUG)
			dumpServices();

		return true;

	}

	public static byte[] invoke(int serviceId, final String serviceName,

			final byte[] commandBuffer, boolean wait) {

		return _singleton.processTxCommand(serviceId, serviceName, commandBuffer, wait);

	}

	byte[] processTxCommand(int serviceId, final String serviceName, final byte[] serviceBuffer, boolean wait) {

		if (serviceId == -1) {
			if(DEBUG)
				_out.printlnError("<DCP SEND> Unknown command name='" + serviceName + "'");

			return null;

		}

		synchronized (_responseWaitSemaphore) {

			synchronized (_services) {

				if (Thread.currentThread() != _dcTargetConnectThread) {

					if (!_targetConnected)

						return null;

				}

				_responseId = serviceId;

				_responseBuffer = null;

				dcpHeader header = new dcpHeader(serviceBuffer.length, serviceId,

						_clientHandle, 0);

				byte[] headerBuffer = header.marshall();

				// Create the full buffer (transport header + service command)

				byte[] fullBuffer = new byte[headerBuffer.length + serviceBuffer.length];

				System.arraycopy(headerBuffer, 0, fullBuffer, 0, 16);

				System.arraycopy(serviceBuffer, 0, fullBuffer, 16,

						serviceBuffer.length);

				_responseWaitSemaphore.drainPermits(); // Clear data that can be
														// left from previous
														// commands

				if (DEBUG)
					_out.println("TX: send " + serviceName + " id " + String.format("0x%08X", serviceId) + " data "
							+ byteArrayToHexString(fullBuffer));

				if (writeCommand(fullBuffer) != Status.STATUS_OK) {

					return null;

				}

			}

			// If it is a command, we shall block on a semaphore until answer
			// arrives

			if (wait) {

				try {

					if (DEBUG)
						_out.println("TX: waiting for " + serviceName + " id " + String.format("0x%08X", serviceId));

					if (!_responseWaitSemaphore.tryAcquire(5000, TimeUnit.MILLISECONDS)) {
						if(DEBUG)
							_out.printlnError("<DCP SEND> Service '" + serviceName + " id "
								+ String.format("0x%08X", serviceId) + "' was cancelled by timout.");

						_responseId = -1;

						return null;

					}

				} catch (InterruptedException e) {

					if (DEBUG)
						_out.println("TX: waiting for " + serviceName + " id " + String.format("0x%08X", serviceId)
								+ " interrupted");

					_responseId = -1;

					return null;

				}
				if(DEBUG)
					_out.println("TX: recv " + byteArrayToHexString(_responseBuffer));

				_responseId = -1;

				return _responseBuffer;

			}

		}

		return null;

	}

	// Socket Connect Thread Class

	private class dcSocketConnect extends Thread {

		DeviceController _dc = null;

		public volatile boolean isAborted = false;

		public dcSocketConnect(DeviceController dc) {

			_dc = dc;

		}

		public void run() {

			// Socket loop

			while (!isAborted) {

				_dc.connectAndProcess();

				// Connect to the server

				if (!isAborted) {

					try {

						Thread.sleep(2000);

					} catch (InterruptedException e) {

					}

				}

			}

		}

	}

	private class dcTargetConnect extends Thread {

		DeviceController _dc = null;

		public volatile boolean isAborted = false;

		public dcTargetConnect(DeviceController dc) {

			_dc = dc;

		}

		public void run() {

			if (_dc.pushNtfToServer() != Status.STATUS_OK) {

				if(DEBUG)
					_out.printlnError("<DCP SEND> Can't enable notifications on the server");

				_dc._targetDisconnectReceived = true;

				return;

			}

			while (!isAborted) {

				// Wait for discover message reception, and also target
				// connection

				OutArray<MsDescriptor> msDescArray = new OutArray<MsDescriptor>();

				OutValue<Long> msHandle = new OutValue<Long>(new Long(0));

				// If discover message is received, then try to get the MS mac
				// address

				int status = Internal.GetAvailableMs(msDescArray);

				if (status == Status.STATUS_OK && msDescArray._array.length != 0) {

					int tryConnectToMsQty = 15;

					_discoverMessageReceived = false;

					while (!isAborted && tryConnectToMsQty > 0) {

						status = Internal.ConnectToMs(msDescArray._array[0].mac, msHandle);

						if (status == Status.STATUS_OK) {

							int tryDiscoverMessageMsQty = 5;

							while (!isAborted && tryDiscoverMessageMsQty > 0) {

								if (_dc._discoverMessageReceived) {
									if(DEBUG)
										_out.println("<DCP CONNECT> Connected to MS");

									// Call the connect callback

									_dc._targetConnected = true;

									if (_dc._cfg.use != null) {

										_dc._cfg.use.connected();

									}

									if (_dc.pushNtfToServer() != Status.STATUS_OK) {
										if(DEBUG)
											_out.printlnError("<DCP SEND> Can't enable notifications on the server");

										_dc._targetDisconnectReceived = true;

									}

									return;

								} else {

									tryDiscoverMessageMsQty--;

									// Wait a bit before retrying

									if (tryDiscoverMessageMsQty > 0)
										try {

											Thread.sleep(2000);

										} catch (InterruptedException e) {

										}

								}

							}

						} else {
							if(DEBUG)
								_out.printlnError("<DCP CONNECT> Can't connect to MS");

							tryConnectToMsQty--;

							// Wait a bit before retrying

							if (tryConnectToMsQty > 0)
								try {

									Thread.sleep(2000);

								} catch (InterruptedException e) {

								}

						}

					}

				} else {

					if (status == Status.STATUS_OK)
						if(DEBUG)
							_out.printlnError("<DCP CONNECT> MS list is empty");

					else
						if(DEBUG)
							_out.printlnError("<DCP CONNECT> Error getting list of the MS");

				}

				// Wait a bit before retrying

				if (!isAborted) {

					try {

						Thread.sleep(3000);

					} catch (InterruptedException e) {

					}

				}

			}

		}

	}

	// NTF process Thread Class

	private class dcNtfProcessor extends Thread {

		private DeviceController _dc = null;

		private LinkedList<ntfElement> _queue = new LinkedList<ntfElement>();

		private Semaphore _ntfWaitSemaphore = new Semaphore(0);

		public volatile boolean isAborted = false;

		private class ntfElement {

			public int _id;

			public byte[] _buf;

			public ntfElement(int id, final byte[] buf) {

				_id = id;

				_buf = buf;

			}

		}

		public dcNtfProcessor(DeviceController dc) {

			_dc = dc;

		}

		// add the NTF from the queue

		public synchronized void push(int id, final byte[] buf) {

			_queue.offer(new ntfElement(id, buf));

			while (_queue.size() > 1000) { // Do not allow list to grow too big,
											// especially when no client is
											// connected

				_queue.poll();

			}

			_ntfWaitSemaphore.release();

		}

		// get the NTF from the queue

		private synchronized ntfElement pop() {

			if (_queue.isEmpty()) {

				return null;

			} else {

				return _queue.poll();

			}

		}

		public synchronized void clear() {

			while (!_queue.isEmpty()) {

				_queue.poll();

			}

		}

		public void run() {

			while (!isAborted) {

				ntfElement ne = null;

				try {

					_ntfWaitSemaphore.tryAcquire(1000, TimeUnit.MILLISECONDS);

					ne = pop();

				} catch (InterruptedException e) {

				}

				if (isAborted || ne == null)

					continue;

				boolean ntfProcessed = false;

				synchronized (_dc._services) {

					Enumeration<String> e = _dc._clients.keys();

					while (!isAborted && e.hasMoreElements()) {

						String serviceName = e.nextElement();

						try {

							int x = 1;

							if (ne._id == -2146959218)

								x++;

							if (_dc._clients.get(serviceName).processNotification(ne._id,
									ne._buf) == Status.STATUS_OK) {

								ntfProcessed = true;

								break;

							}

						} catch (Exception ex) {

							StringWriter writer = new StringWriter();

							PrintWriter printWriter = new PrintWriter(writer);

							ex.printStackTrace(printWriter);

							printWriter.flush();

							if(DEBUG)
								_dc._out.println("<DCP NTF> error parsing notification " + serviceName + ": " + ex.toString() + " at " + writer.toString());

							dm.setInitialize(false);

						}

					}

				}

				if (!ntfProcessed && !isAborted) {

					if(DEBUG)
						_dc._out.println("<DCP NTF> Unknown notification id: " + String.format("0x%08X",ne._id));

					if (DEBUG)
						_dc._out.println("<DCP NTF> data: " + byteArrayToHexString(ne._buf));

				}

			}

		}

	}

	// Other methods

	// ==============

	void dumpServices() {

		_out.println("+------------------------------------------+------------+");

		_out.println("|              SERVICE NAME                |     ID     |");

		_out.println("|------------------------------------------+------------|");

		Enumeration<String> e = _services.keys();

		while (e.hasMoreElements()) {

			String serviceName = e.nextElement();

			_out.println("| " + String.format("%-40s", serviceName)

					+ " | "

					+ String.format("0x%08X", _services.get(serviceName)) + " |");

		}

		_out.println("+------------------------------------------+------------+");

	}

	private class dcpHeader {

		dcpHeader() {

		}

		dcpHeader(int inSize, int inServiceType, int inHandle, int inStatus) {

			_size = inSize;

			_type = inServiceType;

			_handle = inHandle;

			_status = inStatus;

		}

		boolean processHeader(final byte[] buf) {

			return unmarshall(buf);

		}

		// Marshalling/Unmarshalling header methods

		byte[] marshall() {

			byte[] buf = new byte[16];

			OutValue<Integer> offset = new OutValue<Integer>(0);

			Util.Copy16ToBuffer(buf, _proVersion, offset);

			Util.Copy16ToBuffer(buf, _size, offset);

			Util.Copy32ToBuffer(buf, _type, offset);

			Util.Copy32ToBuffer(buf, _handle, offset);

			Util.Copy32ToBuffer(buf, _status, offset);

			return buf;

		}

		boolean unmarshall(final byte[] buf) {

			OutValue<Integer> offset = new OutValue<Integer>(0);

			// Version check

			int version = Util.Copy16FromBuffer(buf, offset);

			if (version != _proVersion) {

				if(DEBUG)
					_out.printlnError("<DCP HEADER PROBLEM> proVersion is " + version);

				return false;

			}

			_size = Util.Copy16FromBuffer(buf, offset);

			/*
			 * 
			 * if (_size>=16*1024) {
			 * 
			 * _out.printlnError("<DCP HEADER PROBLEM> size is " + _size +
			 * " larger than " + 16*1024);
			 * 
			 * return false;
			 * 
			 * }
			 * 
			 */

			_type = (int) Util.Copy32FromBuffer(buf, offset);

			_handle = (int) Util.Copy32FromBuffer(buf, offset);

			_status = (int) Util.Copy32FromBuffer(buf, offset);

			return true;

		}

		void dump() {

			_out.println("DCP Header : type=" + Integer.toHexString(_type)

					+ "  size=" + _size + " handle="

					+ Integer.toHexString(_handle) + " status="

					+ Integer.toHexString(_status));

		}

		// Inner Fields

		static final int _proVersion = 0x0105;

		int _size;

		int _type;

		int _handle;

		int _status;

	} // End of DcpHeader inner class

	// Class private fields

	// Config

	DccInitConfig _cfg;

	// Console Output

	DccStdOut _out;

	// Services

	int _clientHandle = 66;

	volatile boolean _targetConnected = false;

	volatile boolean _targetDisconnectReceived = false;

	volatile boolean _dccConnected = false;

	volatile boolean _discoverMessageReceived = false;

	Hashtable<String, Integer> _services = null;

	Hashtable<String, DccClient> _clients = null;

	volatile byte[] _responseBuffer = null;

	Semaphore _responseWaitSemaphore = null;

	volatile int _responseId = -1;

	volatile dcSocketConnect _dcSocketConnectThread = null;

	volatile dcTargetConnect _dcTargetConnectThread = null;

	volatile dcNtfProcessor _dcNtfProcessorThread = null;

	// Sockets

	String _serverIp = "";

	int _serverPort = 0;

	Socket _socket = null;

	OutputStream _socketOut = null;

	InputStream _socketIn = null;

	// Static

	static private DeviceController _singleton = null;

} // End of DeviceController class
