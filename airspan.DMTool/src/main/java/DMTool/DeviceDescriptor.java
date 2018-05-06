/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class DeviceDescriptor {	public long mac;	public String networkDescriptor;	public sqnDeviceState state;	public DeviceDescriptor() {		// Initialization		// networkDescriptor		networkDescriptor = "";		// state		state = new sqnDeviceState();	}	public static int marshall(byte[] buf, final DeviceDescriptor p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+12)) return DccError.ERR_OVERFLOW;		// mac		Util.Copy64ToBuffer(buf, p.mac, _offset);		// networkDescriptor		if (buf.length < (_offset._value+p.networkDescriptor.length())) return DccError.ERR_OVERFLOW;		for (int i=0; i<p.networkDescriptor.length(); i++, _offset._value = _offset._value + 1) {			buf[_offset._value] = (byte) p.networkDescriptor.charAt(i);		}		buf[_offset._value] = 0;		_offset._value = _offset._value + 1;		// state		if ( Status.STATUS_OK != (st = sqnDeviceState.marshall(buf, p.state, _offset)) ) return st;		return st;	}	public static int unmarshall(final byte[] buf, DeviceDescriptor p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+12)) return DccError.ERR_OVERFLOW;		// mac		p.mac = (long) Util.Copy64FromBuffer(buf, _offset);		// networkDescriptor		p.networkDescriptor = "";		while (buf[_offset._value] != 0) {			p.networkDescriptor += (char) buf[_offset._value];			_offset._value = _offset._value + 1;		}		_offset._value = _offset._value + 1;		// state		if ( Status.STATUS_OK != (st = sqnDeviceState.unmarshall(buf, p.state, _offset)) ) return st;		return st;	}}