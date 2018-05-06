/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class sqnImsAkaResultSuccess {	public short[] res;	public short[] ck;	public short[] ik;	public sqnImsAkaResultSuccess() {		// Initialization	}	public static int marshall(byte[] buf, final sqnImsAkaResultSuccess p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+3)) return DccError.ERR_OVERFLOW;		// resQty		if(p.res == null)			Util.Copy8ToBuffer(buf, 0, _offset);		else {			Util.Copy8ToBuffer(buf, p.res.length, _offset);			// resArray			for (int i = 0; i<p.res.length; i++) {				Util.Copy8ToBuffer(buf, p.res[i], _offset);			}		}		// ckQty		if(p.ck == null)			Util.Copy8ToBuffer(buf, 0, _offset);		else {			Util.Copy8ToBuffer(buf, p.ck.length, _offset);			// ckArray			for (int i = 0; i<p.ck.length; i++) {				Util.Copy8ToBuffer(buf, p.ck[i], _offset);			}		}		// ikQty		if(p.ik == null)			Util.Copy8ToBuffer(buf, 0, _offset);		else {			Util.Copy8ToBuffer(buf, p.ik.length, _offset);			// ikArray			for (int i = 0; i<p.ik.length; i++) {				Util.Copy8ToBuffer(buf, p.ik[i], _offset);			}		}		return st;	}	public static int unmarshall(final byte[] buf, sqnImsAkaResultSuccess p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+3)) return DccError.ERR_OVERFLOW;		// Array		{			// resQty			int arrSize = (int) Util.Copy8FromBuffer(buf, _offset);			// resArray			p.res = new short[arrSize];			for (int i = 0; i<p.res.length; i++) {				p.res[i] = (short) Util.Copy8FromBuffer(buf, _offset);			}		}		// Array		{			// ckQty			int arrSize = (int) Util.Copy8FromBuffer(buf, _offset);			// ckArray			p.ck = new short[arrSize];			for (int i = 0; i<p.ck.length; i++) {				p.ck[i] = (short) Util.Copy8FromBuffer(buf, _offset);			}		}		// Array		{			// ikQty			int arrSize = (int) Util.Copy8FromBuffer(buf, _offset);			// ikArray			p.ik = new short[arrSize];			for (int i = 0; i<p.ik.length; i++) {				p.ik[i] = (short) Util.Copy8FromBuffer(buf, _offset);			}		}		return st;	}}