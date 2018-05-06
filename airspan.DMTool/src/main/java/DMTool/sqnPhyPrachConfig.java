/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnPhyPrachConfig {	public boolean highSpeedFlag;	public short prachConfigurationIndex;	public short prachFreqencyOffset;	public int logicRootSeqNum;	public short nCsConfiguration;	public sqnPhyPrachConfig() {		// Initialization	}	public static int marshall(byte[] buf, final sqnPhyPrachConfig p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+9)) return DccError.ERR_OVERFLOW;		// highSpeedFlag		Util.Copy32ToBuffer(buf, p.highSpeedFlag, _offset);		// prachConfigurationIndex		Util.Copy8ToBuffer(buf, p.prachConfigurationIndex, _offset);		// prachFreqencyOffset		Util.Copy8ToBuffer(buf, p.prachFreqencyOffset, _offset);		// logicRootSeqNum		Util.Copy16ToBuffer(buf, p.logicRootSeqNum, _offset);		// nCsConfiguration		Util.Copy8ToBuffer(buf, p.nCsConfiguration, _offset);		return st;	}	public static int unmarshall(final byte[] buf, sqnPhyPrachConfig p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+9)) return DccError.ERR_OVERFLOW;		// highSpeedFlag		p.highSpeedFlag = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// prachConfigurationIndex		p.prachConfigurationIndex = (short) Util.Copy8FromBuffer(buf, _offset);		// prachFreqencyOffset		p.prachFreqencyOffset = (short) Util.Copy8FromBuffer(buf, _offset);		// logicRootSeqNum		p.logicRootSeqNum = (int) Util.Copy16FromBuffer(buf, _offset);		// nCsConfiguration		p.nCsConfiguration = (short) Util.Copy8FromBuffer(buf, _offset);		return st;	}}