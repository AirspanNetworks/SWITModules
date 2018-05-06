/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;class agscMtsSetRfCalibration {	public static int _id = -1;	public static final String _name = "SetRfCalibration";	public static int marshall(byte[] buf, int maxSz, OutValue<Integer> _offset, final short[] data, boolean flash) {		int st = Status.STATUS_OK;		// dataQty		Util.Copy32ToBuffer(buf, data.length, _offset);		// dataArray		for (int i = 0; i<data.length; i++) {			Util.Copy8ToBuffer(buf, data[i], _offset);		}		// flash		Util.Copy32ToBuffer(buf, flash, _offset);		return st;	}	public static int unmarshall(final byte[] buf, int maxSz, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		return st;	}}