/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnMtsComponentInfo {	public char[] name = new char[64];	public sqnComponentVersion versionNbr;	public char[] versionStr = new char[256];	public sqnMtsComponentInfo() {		// Initialization		// versionNbr		versionNbr = new sqnComponentVersion();	}	public static int marshall(byte[] buf, final sqnMtsComponentInfo p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+0)) return DccError.ERR_OVERFLOW;		// name		for (int i = 0; i<64; i++) {			Util.Copy8ToBuffer(buf, p.name[i], _offset);		}		// versionNbr		if ( Status.STATUS_OK != (st = sqnComponentVersion.marshall(buf, p.versionNbr, _offset)) ) return st;		// versionStr		for (int i = 0; i<256; i++) {			Util.Copy8ToBuffer(buf, p.versionStr[i], _offset);		}		return st;	}	public static int unmarshall(final byte[] buf, sqnMtsComponentInfo p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+0)) return DccError.ERR_OVERFLOW;		// name		for (int i = 0; i<64; i++) {			p.name[i] = (char) Util.Copy8FromBuffer(buf, _offset);		}		// versionNbr		if ( Status.STATUS_OK != (st = sqnComponentVersion.unmarshall(buf, p.versionNbr, _offset)) ) return st;		// versionStr		for (int i = 0; i<256; i++) {			p.versionStr[i] = (char) Util.Copy8FromBuffer(buf, _offset);		}		return st;	}}