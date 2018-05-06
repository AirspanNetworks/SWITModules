/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnUeConfiguration {	public boolean disableInitialPlmnSel;	public boolean imsSupported;	public sqnUeConfiguration() {		// Initialization	}	public static int marshall(byte[] buf, final sqnUeConfiguration p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+8)) return DccError.ERR_OVERFLOW;		// disableInitialPlmnSel		Util.Copy32ToBuffer(buf, p.disableInitialPlmnSel, _offset);		// imsSupported		Util.Copy32ToBuffer(buf, p.imsSupported, _offset);		return st;	}	public static int unmarshall(final byte[] buf, sqnUeConfiguration p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+8)) return DccError.ERR_OVERFLOW;		// disableInitialPlmnSel		p.disableInitialPlmnSel = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// imsSupported		p.imsSupported = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		return st;	}}