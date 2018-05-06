/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class agscDcmImpl extends DccClient {	public void initialize(final DcmClient c) {		_use = c;		name = "dcm";		DeviceController.registerClient(this);	}	public int resolveService(final String name, int id) {		if (agscDcmStartDump._name.equalsIgnoreCase(name)) {			agscDcmStartDump._id = id;			return Status.STATUS_OK;		}		if (agscDcmChunkDump._name.equalsIgnoreCase(name)) {			agscDcmChunkDump._id = id;			return Status.STATUS_OK;		}		if (agscDcmStopDump._name.equalsIgnoreCase(name)) {			agscDcmStopDump._id = id;			return Status.STATUS_OK;		}		if (agscDcmDump._name.equalsIgnoreCase(name)) {			agscDcmDump._id = id;			return Status.STATUS_OK;		}		return Status.STATUS_FAILURE;	}	public int processNotification(int id, final byte[] buf) {		if (agscDcmDump._id == id) return agscDcmDump.notify(buf);		return Status.STATUS_FAILURE;	}	public int getServicesQty() {		return 4;	}	public int getServiceFromIndex(int index, OutValue<String> name, OutValue<Integer> id, ServiceType serviceType) {		id._value = -1;		serviceType.value = ServiceType.SERVICE_COMMAND;		if (index==0) {			name._value = agscDcmStartDump._name;			id._value = agscDcmStartDump._id;			return Status.STATUS_OK;		}		if (index==1) {			name._value = agscDcmChunkDump._name;			id._value = agscDcmChunkDump._id;			return Status.STATUS_OK;		}		if (index==2) {			name._value = agscDcmStopDump._name;			id._value = agscDcmStopDump._id;			return Status.STATUS_OK;		}		if (index==3) {			serviceType.value = (agscDcmImpl._use!=null)?ServiceType.SERVICE_NOTIFICATION:ServiceType.SERVICE_UNBOUND_NOTIFICATION;			name._value = agscDcmDump._name;			id._value = agscDcmDump._id;			return Status.STATUS_OK;		}		return Status.STATUS_FAILURE;	}	// Services	public static int StartDump(OutValue<Integer> bufferSize) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscDcmStartDump.marshall(marshallBuf, 16000, _offset);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscDcmStartDump._id, agscDcmStartDump._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscDcmStartDump.unmarshall(returnBuf, returnBuf.length, _offset, bufferSize);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int ChunkDump(int startOffset, OutArray<Short> chunk) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscDcmChunkDump.marshall(marshallBuf, 16000, _offset, startOffset);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscDcmChunkDump._id, agscDcmChunkDump._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscDcmChunkDump.unmarshall(returnBuf, returnBuf.length, _offset, chunk);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int StopDump(OutArray<Short> buffer) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscDcmStopDump.marshall(marshallBuf, 16000, _offset);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscDcmStopDump._id, agscDcmStopDump._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscDcmStopDump.unmarshall(returnBuf, returnBuf.length, _offset, buffer);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	// External services	public static DcmClient _use;}