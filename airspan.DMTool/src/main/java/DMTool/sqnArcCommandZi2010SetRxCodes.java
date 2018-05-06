/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnArcCommandZi2010SetRxCodes {	public boolean force;	public char[] bbVgaCodes = new char[2];	public char[] rfVgaCodes = new char[2];	public char[] lnaCodes = new char[2];	public char[] elnaCodes = new char[2];	public sqnArcCommandZi2010SetRxCodes() {		// Initialization	}	public static int marshall(byte[] buf, final sqnArcCommandZi2010SetRxCodes p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		// force		Util.Copy32ToBuffer(buf, p.force, _offset);		// bbVgaCodes		for (int i = 0; i<2; i++) {			Util.Copy8ToBuffer(buf, p.bbVgaCodes[i], _offset);		}		// rfVgaCodes		for (int i = 0; i<2; i++) {			Util.Copy8ToBuffer(buf, p.rfVgaCodes[i], _offset);		}		// lnaCodes		for (int i = 0; i<2; i++) {			Util.Copy8ToBuffer(buf, p.lnaCodes[i], _offset);		}		// elnaCodes		for (int i = 0; i<2; i++) {			Util.Copy8ToBuffer(buf, p.elnaCodes[i], _offset);		}		return st;	}	public static int unmarshall(final byte[] buf, sqnArcCommandZi2010SetRxCodes p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		// force		p.force = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// bbVgaCodes		for (int i = 0; i<2; i++) {			p.bbVgaCodes[i] = (char) Util.Copy8FromBuffer(buf, _offset);		}		// rfVgaCodes		for (int i = 0; i<2; i++) {			p.rfVgaCodes[i] = (char) Util.Copy8FromBuffer(buf, _offset);		}		// lnaCodes		for (int i = 0; i<2; i++) {			p.lnaCodes[i] = (char) Util.Copy8FromBuffer(buf, _offset);		}		// elnaCodes		for (int i = 0; i<2; i++) {			p.elnaCodes[i] = (char) Util.Copy8FromBuffer(buf, _offset);		}		return st;	}}