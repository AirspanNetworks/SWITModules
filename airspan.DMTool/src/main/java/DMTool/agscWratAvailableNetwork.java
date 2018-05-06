/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;class agscWratAvailableNetwork {	public static int _id = -1;	public static final String _name = "wrat:AvailableNetwork";	public static int notify(final byte[] buf) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		// Declaration of output parameters		sqnUserNetworkDescription[] nwk;		// Array		{			// nwkQty			int arrSize = (int) Util.Copy32FromBuffer(buf, _offset);			// nwkArray			nwk = new sqnUserNetworkDescription[arrSize];			for (int i = 0; i<nwk.length; i++) {				nwk[i] = new sqnUserNetworkDescription();			}			for (int i = 0; i<nwk.length; i++) {				if ( Status.STATUS_OK != (st = sqnUserNetworkDescription.unmarshall(buf, nwk[i], _offset)) ) return st;			}		}		// Call the callback		if (agscWratImpl._use!=null) agscWratImpl._use.AvailableNetwork(nwk);		return Status.STATUS_OK;	}}