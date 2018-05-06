/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class Sms {	public static void SmsInitialize(final SmsClient c) {		agscSmsImpl ai = new agscSmsImpl();		ai.initialize(c);	}	public static int SetServiceCenterAddress(final sqnSmsAddress scAddress) {		return agscSmsImpl.SetServiceCenterAddress( scAddress);	}	public static int GetServiceCenterAddress(OutValue<sqnSmsAddress> scAddress) {		return agscSmsImpl.GetServiceCenterAddress( scAddress);	}	public static int SetSmsMemoryStorage(sqnMemoryType memType) {		return agscSmsImpl.SetSmsMemoryStorage( memType);	}	public static int GetSmsMemoryStorage(OutValue<sqnMemoryType> memType, OutValue<Long> total, OutValue<Long> used) {		return agscSmsImpl.GetSmsMemoryStorage( memType, total, used);	}	public static int SmsReadMessage(long index, OutValue<sqnSmsPduWithStatus> smsPdu) {		return agscSmsImpl.SmsReadMessage( index, smsPdu);	}	public static int SmsDeleteMessage(long index) {		return agscSmsImpl.SmsDeleteMessage( index);	}	public static int SmsDeleteMessagesList(sqnMbimSmsStatus flag) {		return agscSmsImpl.SmsDeleteMessagesList( flag);	}	public static int SmsReadMessagesList(sqnMbimSmsStatus status, OutArray<sqnSmsPduWithStatus> msg) {		return agscSmsImpl.SmsReadMessagesList( status, msg);	}	public static int SmsSendMessage(final sqnSmsPdu smsPdu) {		return agscSmsImpl.SmsSendMessage( smsPdu);	}}