/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class agscMpdnImpl extends DccClient {	public void initialize(final MpdnClient c) {		_use = c;		name = "mpdn";		DeviceController.registerClient(this);	}	public int resolveService(final String name, int id) {		if (agscMpdnGetIfPort._name.equalsIgnoreCase(name)) {			agscMpdnGetIfPort._id = id;			return Status.STATUS_OK;		}		if (agscMpdnIfUp._name.equalsIgnoreCase(name)) {			agscMpdnIfUp._id = id;			return Status.STATUS_OK;		}		if (agscMpdnIfDown._name.equalsIgnoreCase(name)) {			agscMpdnIfDown._id = id;			return Status.STATUS_OK;		}		if (agscMpdnGetIfState._name.equalsIgnoreCase(name)) {			agscMpdnGetIfState._id = id;			return Status.STATUS_OK;		}		if (agscMpdnIfNewIpConfig._name.equalsIgnoreCase(name)) {			agscMpdnIfNewIpConfig._id = id;			return Status.STATUS_OK;		}		return Status.STATUS_FAILURE;	}	public int processNotification(int id, final byte[] buf) {		if (agscMpdnIfUp._id == id) return agscMpdnIfUp.notify(buf);		if (agscMpdnIfDown._id == id) return agscMpdnIfDown.notify(buf);		if (agscMpdnIfNewIpConfig._id == id) return agscMpdnIfNewIpConfig.notify(buf);		return Status.STATUS_FAILURE;	}	public int getServicesQty() {		return 5;	}	public int getServiceFromIndex(int index, OutValue<String> name, OutValue<Integer> id, ServiceType serviceType) {		id._value = -1;		serviceType.value = ServiceType.SERVICE_COMMAND;		if (index==0) {			name._value = agscMpdnGetIfPort._name;			id._value = agscMpdnGetIfPort._id;			return Status.STATUS_OK;		}		if (index==1) {			serviceType.value = (agscMpdnImpl._use!=null)?ServiceType.SERVICE_NOTIFICATION:ServiceType.SERVICE_UNBOUND_NOTIFICATION;			name._value = agscMpdnIfUp._name;			id._value = agscMpdnIfUp._id;			return Status.STATUS_OK;		}		if (index==2) {			serviceType.value = (agscMpdnImpl._use!=null)?ServiceType.SERVICE_NOTIFICATION:ServiceType.SERVICE_UNBOUND_NOTIFICATION;			name._value = agscMpdnIfDown._name;			id._value = agscMpdnIfDown._id;			return Status.STATUS_OK;		}		if (index==3) {			name._value = agscMpdnGetIfState._name;			id._value = agscMpdnGetIfState._id;			return Status.STATUS_OK;		}		if (index==4) {			serviceType.value = (agscMpdnImpl._use!=null)?ServiceType.SERVICE_NOTIFICATION:ServiceType.SERVICE_UNBOUND_NOTIFICATION;			name._value = agscMpdnIfNewIpConfig._name;			id._value = agscMpdnIfNewIpConfig._id;			return Status.STATUS_OK;		}		return Status.STATUS_FAILURE;	}	// Services	public static int GetIfPort(short instance, OutValue<Short> itfQty, OutValue<Long> firstVid) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscMpdnGetIfPort.marshall(marshallBuf, 16000, _offset, instance);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscMpdnGetIfPort._id, agscMpdnGetIfPort._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscMpdnGetIfPort.unmarshall(returnBuf, returnBuf.length, _offset, itfQty, firstVid);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	public static int GetIfState(short channel, OutValue<sqnIfState> state, OutValue<String> apn) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		byte[] marshallBuf = new byte[16000]; // Could be shared?		st = agscMpdnGetIfState.marshall(marshallBuf, 16000, _offset, channel);		if (st != Status.STATUS_OK) return st;		byte[] queryBuf = new byte[_offset._value]; // Because Java does not support array size modification		System.arraycopy(marshallBuf, 0, queryBuf, 0, _offset._value);		byte[] returnBuf = DeviceController.invoke(agscMpdnGetIfState._id, agscMpdnGetIfState._name, queryBuf, true);		if(returnBuf==null) return Status.STATUS_FAILURE;		_offset._value = 0;		try {			st = agscMpdnGetIfState.unmarshall(returnBuf, returnBuf.length, _offset, state, apn);		} catch (Exception e) {			st = Status.STATUS_FAILURE;		} catch (Error e) {			st = Status.STATUS_FAILURE;		}		return st;	}	// External services	public static MpdnClient _use;}