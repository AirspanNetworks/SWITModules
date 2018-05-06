/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;class agscImsGetPcscfAddress {	public static int _id = -1;	public static final String _name = "GetPcscfAddress";	public static int marshall(byte[] buf, int maxSz, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		return st;	}	public static int unmarshall(final byte[] buf, int maxSz, OutValue<Integer> _offset, OutArray<sqnString> pcscf) {		int st = Status.STATUS_OK;		// Array		{			// pcscfQty			int arrSize = (int) Util.Copy32FromBuffer(buf, _offset);			// pcscfArray			pcscf._array = new sqnString[arrSize];			for (int i = 0; i<pcscf._array.length; i++) {				pcscf._array[i] = new sqnString();			}			for (int i = 0; i<pcscf._array.length; i++) {				if ( Status.STATUS_OK != (st = sqnString.unmarshall(buf, pcscf._array[i], _offset)) ) return st;			}		}		return st;	}}