/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnEmmSubState {	public int value;	public static final int SQN_EMM_NORMAL_SERVICE = 0;	public static final int SQN_EMM_LIMITED_SERVICE = 1;	public static final int SQN_EMM_ATTEMPTING_TO_ATTACH = 2;	public static final int SQN_EMM_PLMN_SEARCH = 3;	public static final int SQN_EMM_NO_IMSI = 4;	public static final int SQN_EMM_ATTACH_NEEDED = 5;	public static final int SQN_EMM_NO_CELL_AVAILABLE = 6;	public static final int SQN_EMM_ATTEMPTING_TO_UPDATE = 7;	public static final int SQN_EMM_UPDATE_NEEDED = 8;	public static final int SQN_EMM_SUB_STATE_QTY = 9;	public static int marshall(byte[] buf, final sqnEmmSubState p, OutValue<Integer> _offset) {		// Check the size of the buffer		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		Util.Copy32ToBuffer(buf, p.value, _offset);		return Status.STATUS_OK;	}	public static int unmarshall(final byte[] buf, sqnEmmSubState p, OutValue<Integer> _offset) {		// Check the size of the buffer		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		p.value = (int) Util.Copy32FromBuffer(buf, _offset);		return Status.STATUS_OK;	}}