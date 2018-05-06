/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class PhyStatsDl {	public int meanRssi;	public int meanCinr;	public PhyStatsDl() {		// Initialization	}	public static int marshall(byte[] buf, final PhyStatsDl p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+8)) return DccError.ERR_OVERFLOW;		// meanRssi		Util.Copy32ToBuffer(buf, p.meanRssi, _offset);		// meanCinr		Util.Copy32ToBuffer(buf, p.meanCinr, _offset);		return st;	}	public static int unmarshall(final byte[] buf, PhyStatsDl p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+8)) return DccError.ERR_OVERFLOW;		// meanRssi		p.meanRssi = (int) Util.Copy32FromBuffer(buf, _offset);		// meanCinr		p.meanCinr = (int) Util.Copy32FromBuffer(buf, _offset);		return st;	}}