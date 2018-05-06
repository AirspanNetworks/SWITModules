/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnMtsIdentities {	public boolean[] burn = new boolean[3];	public long mac;	public sqnImei imei;	public char[] serial = new char[64];	public sqnMtsIdentities() {		// Initialization		// imei		imei = new sqnImei();	}	public static int marshall(byte[] buf, final sqnMtsIdentities p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+8)) return DccError.ERR_OVERFLOW;		// burn		for (int i = 0; i<3; i++) {			Util.Copy32ToBuffer(buf, p.burn[i], _offset);		}		// mac		Util.Copy64ToBuffer(buf, p.mac, _offset);		// imei		if ( Status.STATUS_OK != (st = sqnImei.marshall(buf, p.imei, _offset)) ) return st;		// serial		for (int i = 0; i<64; i++) {			Util.Copy8ToBuffer(buf, p.serial[i], _offset);		}		return st;	}	public static int unmarshall(final byte[] buf, sqnMtsIdentities p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+8)) return DccError.ERR_OVERFLOW;		// burn		for (int i = 0; i<3; i++) {			p.burn[i] = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		}		// mac		p.mac = (long) Util.Copy64FromBuffer(buf, _offset);		// imei		if ( Status.STATUS_OK != (st = sqnImei.unmarshall(buf, p.imei, _offset)) ) return st;		// serial		for (int i = 0; i<64; i++) {			p.serial[i] = (char) Util.Copy8FromBuffer(buf, _offset);		}		return st;	}}