/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnCellReselectionInfo {	public short nCellChangeMedium;	public short nCellChangeHigh;	public int pCompensation;	public int peMax;	public int puMax;	public int qHyst;	public short qRxLevMinOffset;	public int rxLevMin;	public int qHystSfMedium;	public int qHystSfHigh;	public int tEvaluation;	public int tHystNormal;	public sqnCellReselectionServingFreqInfo cellReselServingInfo;	public sqnIntraFreqCarrierFreq intraFreq;	public sqnInterFreqCarrierFreq[] interFreq;	public sqnCellReselectionInfo() {		// Initialization		// cellReselServingInfo		cellReselServingInfo = new sqnCellReselectionServingFreqInfo();		// intraFreq		intraFreq = new sqnIntraFreqCarrierFreq();	}	public static int marshall(byte[] buf, final sqnCellReselectionInfo p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+41)) return DccError.ERR_OVERFLOW;		// nCellChangeMedium		Util.Copy8ToBuffer(buf, p.nCellChangeMedium, _offset);		// nCellChangeHigh		Util.Copy8ToBuffer(buf, p.nCellChangeHigh, _offset);		// pCompensation		Util.Copy32ToBuffer(buf, p.pCompensation, _offset);		// peMax		Util.Copy32ToBuffer(buf, p.peMax, _offset);		// puMax		Util.Copy32ToBuffer(buf, p.puMax, _offset);		// qHyst		Util.Copy16ToBuffer(buf, p.qHyst, _offset);		// qRxLevMinOffset		Util.Copy8ToBuffer(buf, p.qRxLevMinOffset, _offset);		// rxLevMin		Util.Copy32ToBuffer(buf, p.rxLevMin, _offset);		// qHystSfMedium		Util.Copy32ToBuffer(buf, p.qHystSfMedium, _offset);		// qHystSfHigh		Util.Copy32ToBuffer(buf, p.qHystSfHigh, _offset);		// tEvaluation		Util.Copy32ToBuffer(buf, p.tEvaluation, _offset);		// tHystNormal		Util.Copy32ToBuffer(buf, p.tHystNormal, _offset);		// cellReselServingInfo		if ( Status.STATUS_OK != (st = sqnCellReselectionServingFreqInfo.marshall(buf, p.cellReselServingInfo, _offset)) ) return st;		// intraFreq		if ( Status.STATUS_OK != (st = sqnIntraFreqCarrierFreq.marshall(buf, p.intraFreq, _offset)) ) return st;		// interFreqQty		if(p.interFreq == null)			Util.Copy32ToBuffer(buf, 0, _offset);		else {			Util.Copy32ToBuffer(buf, p.interFreq.length, _offset);			// interFreqArray			for (int i = 0; i<p.interFreq.length; i++) {				if ( Status.STATUS_OK != (st = sqnInterFreqCarrierFreq.marshall(buf, p.interFreq[i], _offset)) ) return st;			}		}		return st;	}	public static int unmarshall(final byte[] buf, sqnCellReselectionInfo p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+41)) return DccError.ERR_OVERFLOW;		// nCellChangeMedium		p.nCellChangeMedium = (short) Util.Copy8FromBuffer(buf, _offset);		// nCellChangeHigh		p.nCellChangeHigh = (short) Util.Copy8FromBuffer(buf, _offset);		// pCompensation		p.pCompensation = (int) Util.Copy32FromBuffer(buf, _offset);		// peMax		p.peMax = (int) Util.Copy32FromBuffer(buf, _offset);		// puMax		p.puMax = (int) Util.Copy32FromBuffer(buf, _offset);		// qHyst		p.qHyst = (int) Util.Copy16FromBuffer(buf, _offset);		// qRxLevMinOffset		p.qRxLevMinOffset = (short) Util.Copy8FromBuffer(buf, _offset);		// rxLevMin		p.rxLevMin = (int) Util.Copy32FromBuffer(buf, _offset);		// qHystSfMedium		p.qHystSfMedium = (int) Util.Copy32FromBuffer(buf, _offset);		// qHystSfHigh		p.qHystSfHigh = (int) Util.Copy32FromBuffer(buf, _offset);		// tEvaluation		p.tEvaluation = (int) Util.Copy32FromBuffer(buf, _offset);		// tHystNormal		p.tHystNormal = (int) Util.Copy32FromBuffer(buf, _offset);		// cellReselServingInfo		if ( Status.STATUS_OK != (st = sqnCellReselectionServingFreqInfo.unmarshall(buf, p.cellReselServingInfo, _offset)) ) return st;		// intraFreq		if ( Status.STATUS_OK != (st = sqnIntraFreqCarrierFreq.unmarshall(buf, p.intraFreq, _offset)) ) return st;		// Array		{			// interFreqQty			int arrSize = (int) Util.Copy32FromBuffer(buf, _offset);			// interFreqArray			p.interFreq = new sqnInterFreqCarrierFreq[arrSize];			for (int i = 0; i<p.interFreq.length; i++) {				p.interFreq[i] = new sqnInterFreqCarrierFreq();			}			for (int i = 0; i<p.interFreq.length; i++) {				if ( Status.STATUS_OK != (st = sqnInterFreqCarrierFreq.unmarshall(buf, p.interFreq[i], _offset)) ) return st;			}		}		return st;	}}