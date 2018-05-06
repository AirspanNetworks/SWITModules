/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class agscInternalImpl extends DccClient {	public void initialize(final InternalClient c) {		_use = c;		name = "internal";		DeviceController.registerClient(this);	}	public int resolveService(final String name, int id) {		if (agscInternalMsDetected._name.equalsIgnoreCase(name)) {			agscInternalMsDetected._id = id;			return Status.STATUS_OK;		}		if (agscInternalGetAvailableMs._name.equalsIgnoreCase(name)) {			agscInternalGetAvailableMs._id = id;			return Status.STATUS_OK;		}		if (agscInternalGetDetectedDevices._name.equalsIgnoreCase(name)) {			agscInternalGetDetectedDevices._id = id;			return Status.STATUS_OK;		}		if (agscInternalConnectToMs._name.equalsIgnoreCase(name)) {			agscInternalConnectToMs._id = id;			return Status.STATUS_OK;		}		if (agscInternalRequestNtf._name.equalsIgnoreCase(name)) {			agscInternalRequestNtf._id = id;			return Status.STATUS_OK;		}		if (agscInternalGetDriverVersions._name.equalsIgnoreCase(name)) {			agscInternalGetDriverVersions._id = id;			return Status.STATUS_OK;		}		if (agscInternalSetPersistentSsState._name.equalsIgnoreCase(name)) {			agscInternalSetPersistentSsState._id = id;			return Status.STATUS_OK;		}		return Status.STATUS_FAILURE;	}	public int processNotification(int id, final byte[] buf) {		if (agscInternalMsDetected._id == id) return agscInternalMsDetected.notify(buf);		return Status.STATUS_FAILURE;	}	public int getServicesQty() {		return 7;	}	public int getServiceFromIndex(int index, OutValue<String> name, OutValue<Integer> id, ServiceType serviceType) {		id._value = -1;		serviceType.value = ServiceType.SERVICE_COMMAND;		if (index==0) {			serviceType.value = (agscInternalImpl._use!=null)?ServiceType.SERVICE_NOTIFICATION:ServiceType.SERVICE_UNBOUND_NOTIFICATION;			name._value = agscInternalMsDetected._name;			id._value = agscInternalMsDetected._id;			return Status.STATUS_OK;		}		if (index==1) {			name._value = agscInternalGetAvailableMs._name;			id._value = agscInternalGetAvailableMs._id;			return Status.STATUS_OK;		}		if (index==2) {			name._value = agscInternalGetDetectedDevices._name;			id._value = agscInternalGetDetectedDevices._id;			return Status.STATUS_OK;		}		if (index==3) {			name._value = agscInternalConnectToMs._name;			id._value = agscInternalConnectToMs._id;			return Status.STATUS_OK;		}		if (index==4) {			name._value = agscInternalRequestNtf._name;			id._value = agscInternalRequestNtf._id;			return Status.STATUS_OK;		}		if (index==5) {			name._value = agscInternalGetDriverVersions._name;			id._value = agscInternalGetDriverVersions._id;			return Status.STATUS_OK;		}		if (index==6) {			name._value = agscInternalSetPersistentSsState._name;			id._value = agscInternalSetPersistentSsState._id;			return Status.STATUS_OK;		}		return Status.STATUS_FAILURE;	}	// Services	public static int GetAvailableMs(OutArray<MsDescriptor> ms) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscInternalGetAvailableMs.marshall(marshallBuf, 16000, _offset);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscInternalGetAvailableMs._id, agscInternalGetAvailableMs._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscInternalGetAvailableMs.unmarshall(returnBuf, returnBuf.length, _offset, ms);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int GetDetectedDevices(OutArray<DeviceDescriptor> devices) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscInternalGetDetectedDevices.marshall(marshallBuf, 16000, _offset);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscInternalGetDetectedDevices._id, agscInternalGetDetectedDevices._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscInternalGetDetectedDevices.unmarshall(returnBuf, returnBuf.length, _offset, devices);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int ConnectToMs(long mac, OutValue<Long> msHandle) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscInternalConnectToMs.marshall(marshallBuf, 16000, _offset, mac);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscInternalConnectToMs._id, agscInternalConnectToMs._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscInternalConnectToMs.unmarshall(returnBuf, returnBuf.length, _offset, msHandle);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int RequestNtf(final NtfName[] ntf) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscInternalRequestNtf.marshall(marshallBuf, 16000, _offset, ntf);		if (st != Status.STATUS_OK) return st;			byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification			System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);			byte[] returnBuf = DeviceController.invoke(agscInternalRequestNtf._id, agscInternalRequestNtf._name, queryBuf, false);		return Status.STATUS_OK;	}	public static int GetDriverVersions(OutValue<String> serviceLayer, OutValue<String> kernelLayer) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscInternalGetDriverVersions.marshall(marshallBuf, 16000, _offset);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscInternalGetDriverVersions._id, agscInternalGetDriverVersions._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscInternalGetDriverVersions.unmarshall(returnBuf, returnBuf.length, _offset, serviceLayer, kernelLayer);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int SetPersistentSsState(boolean state) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscInternalSetPersistentSsState.marshall(marshallBuf, 16000, _offset, state);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscInternalSetPersistentSsState._id, agscInternalSetPersistentSsState._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscInternalSetPersistentSsState.unmarshall(returnBuf, returnBuf.length, _offset);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	// External services	public static InternalClient _use;}