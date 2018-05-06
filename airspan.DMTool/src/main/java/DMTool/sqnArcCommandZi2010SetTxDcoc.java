/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnArcCommandZi2010SetTxDcoc {	public int dcOffsetI;	public int dcOffsetQ;	public sqnArcCommandZi2010SetTxDcoc() {		// Initialization	}	public static int marshall(byte[] buf, final sqnArcCommandZi2010SetTxDcoc p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+8)) return DccError.ERR_OVERFLOW;		// dcOffsetI		Util.Copy32ToBuffer(buf, p.dcOffsetI, _offset);		// dcOffsetQ		Util.Copy32ToBuffer(buf, p.dcOffsetQ, _offset);		return st;	}	public static int unmarshall(final byte[] buf, sqnArcCommandZi2010SetTxDcoc p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+8)) return DccError.ERR_OVERFLOW;		// dcOffsetI		p.dcOffsetI = (int) Util.Copy32FromBuffer(buf, _offset);		// dcOffsetQ		p.dcOffsetQ = (int) Util.Copy32FromBuffer(buf, _offset);		return st;	}}