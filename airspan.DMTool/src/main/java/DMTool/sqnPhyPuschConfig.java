/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnPhyPuschConfig {	public boolean ueSpecificValid;	public boolean enable64QAM;	public short ulRsCyclicShift;	public short deltaOffsetAckIndex;	public short deltaOffsetRiIndex;	public short deltaOffsetCqiIndex;	public short ulRsGroupAssignPusch;	public boolean groupHoppingEnabled;	public boolean intraSubFrameHopping;	public short subBandNumber;	public short puschHoppingOffset;	public boolean ulRsSequenceHoppingEnabled;	public sqnPhyPuschConfig() {		// Initialization	}	public static int marshall(byte[] buf, final sqnPhyPuschConfig p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+27)) return DccError.ERR_OVERFLOW;		// ueSpecificValid		Util.Copy32ToBuffer(buf, p.ueSpecificValid, _offset);		// enable64QAM		Util.Copy32ToBuffer(buf, p.enable64QAM, _offset);		// ulRsCyclicShift		Util.Copy8ToBuffer(buf, p.ulRsCyclicShift, _offset);		// deltaOffsetAckIndex		Util.Copy8ToBuffer(buf, p.deltaOffsetAckIndex, _offset);		// deltaOffsetRiIndex		Util.Copy8ToBuffer(buf, p.deltaOffsetRiIndex, _offset);		// deltaOffsetCqiIndex		Util.Copy8ToBuffer(buf, p.deltaOffsetCqiIndex, _offset);		// ulRsGroupAssignPusch		Util.Copy8ToBuffer(buf, p.ulRsGroupAssignPusch, _offset);		// groupHoppingEnabled		Util.Copy32ToBuffer(buf, p.groupHoppingEnabled, _offset);		// intraSubFrameHopping		Util.Copy32ToBuffer(buf, p.intraSubFrameHopping, _offset);		// subBandNumber		Util.Copy8ToBuffer(buf, p.subBandNumber, _offset);		// puschHoppingOffset		Util.Copy8ToBuffer(buf, p.puschHoppingOffset, _offset);		// ulRsSequenceHoppingEnabled		Util.Copy32ToBuffer(buf, p.ulRsSequenceHoppingEnabled, _offset);		return st;	}	public static int unmarshall(final byte[] buf, sqnPhyPuschConfig p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+27)) return DccError.ERR_OVERFLOW;		// ueSpecificValid		p.ueSpecificValid = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// enable64QAM		p.enable64QAM = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// ulRsCyclicShift		p.ulRsCyclicShift = (short) Util.Copy8FromBuffer(buf, _offset);		// deltaOffsetAckIndex		p.deltaOffsetAckIndex = (short) Util.Copy8FromBuffer(buf, _offset);		// deltaOffsetRiIndex		p.deltaOffsetRiIndex = (short) Util.Copy8FromBuffer(buf, _offset);		// deltaOffsetCqiIndex		p.deltaOffsetCqiIndex = (short) Util.Copy8FromBuffer(buf, _offset);		// ulRsGroupAssignPusch		p.ulRsGroupAssignPusch = (short) Util.Copy8FromBuffer(buf, _offset);		// groupHoppingEnabled		p.groupHoppingEnabled = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// intraSubFrameHopping		p.intraSubFrameHopping = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// subBandNumber		p.subBandNumber = (short) Util.Copy8FromBuffer(buf, _offset);		// puschHoppingOffset		p.puschHoppingOffset = (short) Util.Copy8FromBuffer(buf, _offset);		// ulRsSequenceHoppingEnabled		p.ulRsSequenceHoppingEnabled = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		return st;	}}