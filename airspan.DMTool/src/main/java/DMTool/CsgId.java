/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class CsgId {	public CsgType csgType;	public boolean csgSupported;	public boolean hnbNamePresent;	public short hnbNameLength;	public short[] hnbName = new short[48];	public long csgIdentity;	public CsgId() {		// Initialization		// csgType		csgType = new CsgType();	}	public static int marshall(byte[] buf, final CsgId p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+17)) return DccError.ERR_OVERFLOW;		// csgType		if ( Status.STATUS_OK != (st = CsgType.marshall(buf, p.csgType, _offset)) ) return st;		// csgSupported		Util.Copy32ToBuffer(buf, p.csgSupported, _offset);		// hnbNamePresent		Util.Copy32ToBuffer(buf, p.hnbNamePresent, _offset);		// hnbNameLength		Util.Copy8ToBuffer(buf, p.hnbNameLength, _offset);		// hnbName		for (int i = 0; i<48; i++) {			Util.Copy8ToBuffer(buf, p.hnbName[i], _offset);		}		// csgIdentity		Util.Copy32ToBuffer(buf, p.csgIdentity, _offset);		return st;	}	public static int unmarshall(final byte[] buf, CsgId p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+17)) return DccError.ERR_OVERFLOW;		// csgType		if ( Status.STATUS_OK != (st = CsgType.unmarshall(buf, p.csgType, _offset)) ) return st;		// csgSupported		p.csgSupported = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// hnbNamePresent		p.hnbNamePresent = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// hnbNameLength		p.hnbNameLength = (short) Util.Copy8FromBuffer(buf, _offset);		// hnbName		for (int i = 0; i<48; i++) {			p.hnbName[i] = (short) Util.Copy8FromBuffer(buf, _offset);		}		// csgIdentity		p.csgIdentity = (long) Util.Copy32FromBuffer(buf, _offset);		return st;	}}