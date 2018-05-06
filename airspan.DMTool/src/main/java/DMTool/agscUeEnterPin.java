/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;class agscUeEnterPin {	public static int _id = -1;	public static final String _name = "EnterPin";	public static int marshall(byte[] buf, int maxSz, OutValue<Integer> _offset, final String pin) {		int st = Status.STATUS_OK;		// pin		if (buf.length < (_offset._value+pin.length())) return DccError.ERR_OVERFLOW;		for (int i=0; i<pin.length(); i++, _offset._value = _offset._value + 1) {			buf[_offset._value] = (byte) pin.charAt(i);		}		buf[_offset._value] = 0;		_offset._value = _offset._value + 1;		return st;	}	public static int unmarshall(final byte[] buf, int maxSz, OutValue<Integer> _offset, OutValue<Integer> status, OutValue<Short> remainingAttempts) {		int st = Status.STATUS_OK;		// status		status._value = (int) Util.Copy32FromBuffer(buf, _offset);		// remainingAttempts		remainingAttempts._value = (short) Util.Copy8FromBuffer(buf, _offset);		return st;	}}