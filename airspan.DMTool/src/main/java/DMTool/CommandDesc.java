/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class CommandDesc {	public int index;	public String module;	public String command;	public String description;	public String keywords;	public boolean isPrivate;	public CommandArgDescr[] arg;	public CommandDesc() {		// Initialization		// module		module = "";		// command		command = "";		// description		description = "";		// keywords		keywords = "";	}	public static int marshall(byte[] buf, final CommandDesc p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+12)) return DccError.ERR_OVERFLOW;		// index		Util.Copy32ToBuffer(buf, p.index, _offset);		// module		if (buf.length < (_offset._value+p.module.length())) return DccError.ERR_OVERFLOW;		for (int i=0; i<p.module.length(); i++, _offset._value = _offset._value + 1) {			buf[_offset._value] = (byte) p.module.charAt(i);		}		buf[_offset._value] = 0;		_offset._value = _offset._value + 1;		// command		if (buf.length < (_offset._value+p.command.length())) return DccError.ERR_OVERFLOW;		for (int i=0; i<p.command.length(); i++, _offset._value = _offset._value + 1) {			buf[_offset._value] = (byte) p.command.charAt(i);		}		buf[_offset._value] = 0;		_offset._value = _offset._value + 1;		// description		if (buf.length < (_offset._value+p.description.length())) return DccError.ERR_OVERFLOW;		for (int i=0; i<p.description.length(); i++, _offset._value = _offset._value + 1) {			buf[_offset._value] = (byte) p.description.charAt(i);		}		buf[_offset._value] = 0;		_offset._value = _offset._value + 1;		// keywords		if (buf.length < (_offset._value+p.keywords.length())) return DccError.ERR_OVERFLOW;		for (int i=0; i<p.keywords.length(); i++, _offset._value = _offset._value + 1) {			buf[_offset._value] = (byte) p.keywords.charAt(i);		}		buf[_offset._value] = 0;		_offset._value = _offset._value + 1;		// isPrivate		Util.Copy32ToBuffer(buf, p.isPrivate, _offset);		// argQty		if(p.arg == null)			Util.Copy32ToBuffer(buf, 0, _offset);		else {			Util.Copy32ToBuffer(buf, p.arg.length, _offset);			// argArray			for (int i = 0; i<p.arg.length; i++) {				if ( Status.STATUS_OK != (st = CommandArgDescr.marshall(buf, p.arg[i], _offset)) ) return st;			}		}		return st;	}	public static int unmarshall(final byte[] buf, CommandDesc p, OutValue<Integer> _offset) {		int st = Status.STATUS_OK;		// Check the size of the fundamental types of the structure		if (buf.length < (_offset._value+12)) return DccError.ERR_OVERFLOW;		// index		p.index = (int) Util.Copy32FromBuffer(buf, _offset);		// module		p.module = "";		while (buf[_offset._value] != 0) {			p.module += (char) buf[_offset._value];			_offset._value = _offset._value + 1;		}		_offset._value = _offset._value + 1;		// command		p.command = "";		while (buf[_offset._value] != 0) {			p.command += (char) buf[_offset._value];			_offset._value = _offset._value + 1;		}		_offset._value = _offset._value + 1;		// description		p.description = "";		while (buf[_offset._value] != 0) {			p.description += (char) buf[_offset._value];			_offset._value = _offset._value + 1;		}		_offset._value = _offset._value + 1;		// keywords		p.keywords = "";		while (buf[_offset._value] != 0) {			p.keywords += (char) buf[_offset._value];			_offset._value = _offset._value + 1;		}		_offset._value = _offset._value + 1;		// isPrivate		p.isPrivate = Util.Copy32FromBuffer(buf, _offset) == 0? false:true;		// Array		{			// argQty			int arrSize = (int) Util.Copy32FromBuffer(buf, _offset);			// argArray			p.arg = new CommandArgDescr[arrSize];			for (int i = 0; i<p.arg.length; i++) {				p.arg[i] = new CommandArgDescr();			}			for (int i = 0; i<p.arg.length; i++) {				if ( Status.STATUS_OK != (st = CommandArgDescr.unmarshall(buf, p.arg[i], _offset)) ) return st;			}		}		return st;	}}