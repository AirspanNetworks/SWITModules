/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class agscArcImpl extends DccClient {	public void initialize(final ArcClient c) {		_use = c;		name = "arc";		DeviceController.registerClient(this);	}	public int resolveService(final String name, int id) {		if (agscArcGetClockTime._name.equalsIgnoreCase(name)) {			agscArcGetClockTime._id = id;			return Status.STATUS_OK;		}		if (agscArcSendArcScript._name.equalsIgnoreCase(name)) {			agscArcSendArcScript._id = id;			return Status.STATUS_OK;		}		if (agscArcMb86lxxxGetTxPowerDetectorReadback._name.equalsIgnoreCase(name)) {			agscArcMb86lxxxGetTxPowerDetectorReadback._id = id;			return Status.STATUS_OK;		}		if (agscArcMb86lxxxSetOpenLoop._name.equalsIgnoreCase(name)) {			agscArcMb86lxxxSetOpenLoop._id = id;			return Status.STATUS_OK;		}		return Status.STATUS_FAILURE;	}	public int processNotification(int id, final byte[] buf) {		return Status.STATUS_FAILURE;	}	public int getServicesQty() {		return 4;	}	public int getServiceFromIndex(int index, OutValue<String> name, OutValue<Integer> id, ServiceType serviceType) {		id._value = -1;		serviceType.value = ServiceType.SERVICE_COMMAND;		if (index==0) {			name._value = agscArcGetClockTime._name;			id._value = agscArcGetClockTime._id;			return Status.STATUS_OK;		}		if (index==1) {			name._value = agscArcSendArcScript._name;			id._value = agscArcSendArcScript._id;			return Status.STATUS_OK;		}		if (index==2) {			name._value = agscArcMb86lxxxGetTxPowerDetectorReadback._name;			id._value = agscArcMb86lxxxGetTxPowerDetectorReadback._id;			return Status.STATUS_OK;		}		if (index==3) {			name._value = agscArcMb86lxxxSetOpenLoop._name;			id._value = agscArcMb86lxxxSetOpenLoop._id;			return Status.STATUS_OK;		}		return Status.STATUS_FAILURE;	}	// Services	public static int GetClockTime(OutValue<Integer> timeMs) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscArcGetClockTime.marshall(marshallBuf, 16000, _offset);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscArcGetClockTime._id, agscArcGetClockTime._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscArcGetClockTime.unmarshall(returnBuf, returnBuf.length, _offset, timeMs);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int SendArcScript(final sqnArcScript script) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscArcSendArcScript.marshall(marshallBuf, 16000, _offset, script);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscArcSendArcScript._id, agscArcSendArcScript._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscArcSendArcScript.unmarshall(returnBuf, returnBuf.length, _offset);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int Mb86lxxxGetTxPowerDetectorReadback(OutValue<Integer> power, OutValue<Integer> gainError, OutValue<Integer> vdet) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscArcMb86lxxxGetTxPowerDetectorReadback.marshall(marshallBuf, 16000, _offset);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscArcMb86lxxxGetTxPowerDetectorReadback._id, agscArcMb86lxxxGetTxPowerDetectorReadback._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscArcMb86lxxxGetTxPowerDetectorReadback.unmarshall(returnBuf, returnBuf.length, _offset, power, gainError, vdet);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int Mb86lxxxSetOpenLoop(boolean enabled) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscArcMb86lxxxSetOpenLoop.marshall(marshallBuf, 16000, _offset, enabled);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscArcMb86lxxxSetOpenLoop._id, agscArcMb86lxxxSetOpenLoop._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscArcMb86lxxxSetOpenLoop.unmarshall(returnBuf, returnBuf.length, _offset);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	// External services	public static ArcClient _use;}