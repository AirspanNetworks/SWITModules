/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnArcCommandSqn3140UnsetRxCodes {		public long dummy;	public sqnArcCommandSqn3140UnsetRxCodes() {		// Initialization	}	public static int marshall(byte[] buf, final sqnArcCommandSqn3140UnsetRxCodes p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		// dummy		Util.Copy32ToBuffer(buf, p.dummy, _offset);		return st;	}	public static int unmarshall(final byte[] buf, sqnArcCommandSqn3140UnsetRxCodes p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		// dummy		p.dummy = (long) Util.Copy32FromBuffer(buf, _offset);		return st;	}}