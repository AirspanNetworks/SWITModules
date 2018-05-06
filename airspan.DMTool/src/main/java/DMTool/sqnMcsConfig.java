/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnMcsConfig {	public long code0Count;	public sqnQamBits cod0Mod;	public long code0RbCount;	public long code1Count;	public sqnQamBits cod1Mod;	public long code1RbCount;	public long schedulingCount;	public sqnQamBits modulation;	public long rbCount;	public long dlTtiCount;	public sqnMcsConfig() {		// Initialization		// cod0Mod		cod0Mod = new sqnQamBits();		// cod1Mod		cod1Mod = new sqnQamBits();		// modulation		modulation = new sqnQamBits();	}	public static int marshall(byte[] buf, final sqnMcsConfig p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+40)) return DccError.ERR_OVERFLOW;		// code0Count		Util.Copy32ToBuffer(buf, p.code0Count, _offset);		// cod0Mod		if ( Status.STATUS_OK != (st = sqnQamBits.marshall(buf, p.cod0Mod, _offset)) ) return st;		// code0RbCount		Util.Copy32ToBuffer(buf, p.code0RbCount, _offset);		// code1Count		Util.Copy32ToBuffer(buf, p.code1Count, _offset);		// cod1Mod		if ( Status.STATUS_OK != (st = sqnQamBits.marshall(buf, p.cod1Mod, _offset)) ) return st;		// code1RbCount		Util.Copy32ToBuffer(buf, p.code1RbCount, _offset);		// schedulingCount		Util.Copy32ToBuffer(buf, p.schedulingCount, _offset);		// modulation		if ( Status.STATUS_OK != (st = sqnQamBits.marshall(buf, p.modulation, _offset)) ) return st;		// rbCount		Util.Copy32ToBuffer(buf, p.rbCount, _offset);		// dlTtiCount		Util.Copy32ToBuffer(buf, p.dlTtiCount, _offset);		return st;	}	public static int unmarshall(final byte[] buf, sqnMcsConfig p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+40)) return DccError.ERR_OVERFLOW;		// code0Count		p.code0Count = (long) Util.Copy32FromBuffer(buf, _offset);		// cod0Mod		if ( Status.STATUS_OK != (st = sqnQamBits.unmarshall(buf, p.cod0Mod, _offset)) ) return st;		// code0RbCount		p.code0RbCount = (long) Util.Copy32FromBuffer(buf, _offset);		// code1Count		p.code1Count = (long) Util.Copy32FromBuffer(buf, _offset);		// cod1Mod		if ( Status.STATUS_OK != (st = sqnQamBits.unmarshall(buf, p.cod1Mod, _offset)) ) return st;		// code1RbCount		p.code1RbCount = (long) Util.Copy32FromBuffer(buf, _offset);		// schedulingCount		p.schedulingCount = (long) Util.Copy32FromBuffer(buf, _offset);		// modulation		if ( Status.STATUS_OK != (st = sqnQamBits.unmarshall(buf, p.modulation, _offset)) ) return st;		// rbCount		p.rbCount = (long) Util.Copy32FromBuffer(buf, _offset);		// dlTtiCount		p.dlTtiCount = (long) Util.Copy32FromBuffer(buf, _offset);		return st;	}}