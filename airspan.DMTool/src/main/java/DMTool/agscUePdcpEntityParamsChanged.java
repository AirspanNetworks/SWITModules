/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;class agscUePdcpEntityParamsChanged {	public static int _id = -1;	public static final String _name = "PdcpEntityParamsChanged";	public static int notify(final byte[] buf) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		// Declaration of output parameters		sqnPdcpEntityParams[] entity;		// Array		{			// entityQty			int arrSize = (int) Util.Copy32FromBuffer(buf, _offset);			// entityArray			entity = new sqnPdcpEntityParams[arrSize];			for (int i = 0; i<entity.length; i++) {				entity[i] = new sqnPdcpEntityParams();			}			for (int i = 0; i<entity.length; i++) {				if ( Status.STATUS_OK != (st = sqnPdcpEntityParams.unmarshall(buf, entity[i], _offset)) ) return st;			}		}		// Call the callback		if (agscUeImpl._use!=null) agscUeImpl._use.PdcpEntityParamsChanged(entity);		return Status.STATUS_OK;	}}