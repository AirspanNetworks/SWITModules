/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;class agscMpdnGetMacAddresses {	public static int _id = -1;	public static final String _name = "GetMacAddresses";	public static int marshall(byte[] buf, int maxSz, OutValue<Integer> _offset, short instance) {		int st = Status.STATUS_OK;		// instance		Util.Copy8ToBuffer(buf, instance, _offset);		return st;	}	public static int unmarshall(final byte[] buf, int maxSz, OutValue<Integer> _offset, OutValue<Short> itfQty, OutValue<Long> firstAddr) {		int st = Status.STATUS_OK;		// itfQty		itfQty._value = (short) Util.Copy8FromBuffer(buf, _offset);		// firstAddr		firstAddr._value = (long) Util.Copy64FromBuffer(buf, _offset);		return st;	}}