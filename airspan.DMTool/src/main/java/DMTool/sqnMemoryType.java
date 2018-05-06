/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnMemoryType {	public int value;	public static final int SQN_MEMORY_DEVICE = 0;	public static final int SQN_MEMORY_SIM = 1;	public static int marshall(byte[] buf, final sqnMemoryType p, OutValue<Integer> _offset) {		// Check the size of the buffer		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		Util.Copy32ToBuffer(buf, p.value, _offset);		return Status.STATUS_OK;	}	public static int unmarshall(final byte[] buf, sqnMemoryType p, OutValue<Integer> _offset) {		// Check the size of the buffer		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		p.value = (int) Util.Copy32FromBuffer(buf, _offset);		return Status.STATUS_OK;	}}