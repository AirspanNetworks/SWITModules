/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class EpsPacketFilterComponent {	public EpsPacketFilterComponentTypeIdTag epsPacketFilterComponentTypeId;	public EpsPacketFilterComponentTag epsPacketFilterComponentValue;	public EpsPacketFilterComponent() {		// Initialization		// epsPacketFilterComponentTypeId		epsPacketFilterComponentTypeId = new EpsPacketFilterComponentTypeIdTag();		// epsPacketFilterComponentValue		epsPacketFilterComponentValue = new EpsPacketFilterComponentTag();	}	public static int marshall(byte[] buf, final EpsPacketFilterComponent p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		// epsPacketFilterComponentTypeId		if ( Status.STATUS_OK != (st = EpsPacketFilterComponentTypeIdTag.marshall(buf, p.epsPacketFilterComponentTypeId, _offset)) ) return st;		// epsPacketFilterComponentValue		if ( Status.STATUS_OK != (st = EpsPacketFilterComponentTag.marshall(buf, p.epsPacketFilterComponentValue, _offset)) ) return st;		return st;	}	public static int unmarshall(final byte[] buf, EpsPacketFilterComponent p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		// epsPacketFilterComponentTypeId		if ( Status.STATUS_OK != (st = EpsPacketFilterComponentTypeIdTag.unmarshall(buf, p.epsPacketFilterComponentTypeId, _offset)) ) return st;		// epsPacketFilterComponentValue		if ( Status.STATUS_OK != (st = EpsPacketFilterComponentTag.unmarshall(buf, p.epsPacketFilterComponentValue, _offset)) ) return st;		return st;	}}