/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class AdapterStatistics {	public long rxTHPPackets;	public long rxTHPBytes;	public long txTHPPackets;	public long txTHPBytes;	public long rxIPPacketsOK;	public long rxIPBytesOK;	public long rxIPPacketsKO;	public long rxIPPacketsMissed;	public long txIPPacketsOK;	public long txIPBytesOK;	public long txIPPacketsKO;	public AdapterStatistics() {		// Initialization	}	public static int marshall(byte[] buf, final AdapterStatistics p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+88)) return DccError.ERR_OVERFLOW;		// rxTHPPackets		Util.Copy64ToBuffer(buf, p.rxTHPPackets, _offset);		// rxTHPBytes		Util.Copy64ToBuffer(buf, p.rxTHPBytes, _offset);		// txTHPPackets		Util.Copy64ToBuffer(buf, p.txTHPPackets, _offset);		// txTHPBytes		Util.Copy64ToBuffer(buf, p.txTHPBytes, _offset);		// rxIPPacketsOK		Util.Copy64ToBuffer(buf, p.rxIPPacketsOK, _offset);		// rxIPBytesOK		Util.Copy64ToBuffer(buf, p.rxIPBytesOK, _offset);		// rxIPPacketsKO		Util.Copy64ToBuffer(buf, p.rxIPPacketsKO, _offset);		// rxIPPacketsMissed		Util.Copy64ToBuffer(buf, p.rxIPPacketsMissed, _offset);		// txIPPacketsOK		Util.Copy64ToBuffer(buf, p.txIPPacketsOK, _offset);		// txIPBytesOK		Util.Copy64ToBuffer(buf, p.txIPBytesOK, _offset);		// txIPPacketsKO		Util.Copy64ToBuffer(buf, p.txIPPacketsKO, _offset);		return st;	}	public static int unmarshall(final byte[] buf, AdapterStatistics p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+88)) return DccError.ERR_OVERFLOW;		// rxTHPPackets		p.rxTHPPackets = (long) Util.Copy64FromBuffer(buf, _offset);		// rxTHPBytes		p.rxTHPBytes = (long) Util.Copy64FromBuffer(buf, _offset);		// txTHPPackets		p.txTHPPackets = (long) Util.Copy64FromBuffer(buf, _offset);		// txTHPBytes		p.txTHPBytes = (long) Util.Copy64FromBuffer(buf, _offset);		// rxIPPacketsOK		p.rxIPPacketsOK = (long) Util.Copy64FromBuffer(buf, _offset);		// rxIPBytesOK		p.rxIPBytesOK = (long) Util.Copy64FromBuffer(buf, _offset);		// rxIPPacketsKO		p.rxIPPacketsKO = (long) Util.Copy64FromBuffer(buf, _offset);		// rxIPPacketsMissed		p.rxIPPacketsMissed = (long) Util.Copy64FromBuffer(buf, _offset);		// txIPPacketsOK		p.txIPPacketsOK = (long) Util.Copy64FromBuffer(buf, _offset);		// txIPBytesOK		p.txIPBytesOK = (long) Util.Copy64FromBuffer(buf, _offset);		// txIPPacketsKO		p.txIPPacketsKO = (long) Util.Copy64FromBuffer(buf, _offset);		return st;	}}