/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnAttachReqEpsBearerInfo {	public EpsPdnTypeTag pdnType;	public EpsIpv4AddrAllocTag ipv4AddrAlloc;	public boolean apnPresent;	public char[] apn = new char[110];	public sqnAttachReqEpsBearerInfo() {		// Initialization		// pdnType		pdnType = new EpsPdnTypeTag();		// ipv4AddrAlloc		ipv4AddrAlloc = new EpsIpv4AddrAllocTag();	}	public static int marshall(byte[] buf, final sqnAttachReqEpsBearerInfo p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+12)) return DccError.ERR_OVERFLOW;		// pdnType		if ( Status.STATUS_OK != (st = EpsPdnTypeTag.marshall(buf, p.pdnType, _offset)) ) return st;		// ipv4AddrAlloc		if ( Status.STATUS_OK != (st = EpsIpv4AddrAllocTag.marshall(buf, p.ipv4AddrAlloc, _offset)) ) return st;		// apnPresent		Util.Copy32ToBuffer(buf, p.apnPresent, _offset);		// apn		for (int i = 0; i<110; i++) {			Util.Copy8ToBuffer(buf, p.apn[i], _offset);		}		return st;	}	public static int unmarshall(final byte[] buf, sqnAttachReqEpsBearerInfo p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+12)) return DccError.ERR_OVERFLOW;		// pdnType		if ( Status.STATUS_OK != (st = EpsPdnTypeTag.unmarshall(buf, p.pdnType, _offset)) ) return st;		// ipv4AddrAlloc		if ( Status.STATUS_OK != (st = EpsIpv4AddrAllocTag.unmarshall(buf, p.ipv4AddrAlloc, _offset)) ) return st;		// apnPresent		p.apnPresent = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// apn		for (int i = 0; i<110; i++) {			p.apn[i] = (char) Util.Copy8FromBuffer(buf, _offset);		}		return st;	}}