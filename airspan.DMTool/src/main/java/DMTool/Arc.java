/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class Arc {	public static void ArcInitialize(final ArcClient c) {		agscArcImpl ai = new agscArcImpl();		ai.initialize(c);	}	public static int GetClockTime(OutValue<Integer> timeMs) {		return agscArcImpl.GetClockTime( timeMs);	}	public static int SendArcScript(final sqnArcScript script) {		return agscArcImpl.SendArcScript( script);	}	public static int Mb86lxxxGetTxPowerDetectorReadback(OutValue<Integer> power, OutValue<Integer> gainError, OutValue<Integer> vdet) {		return agscArcImpl.Mb86lxxxGetTxPowerDetectorReadback( power, gainError, vdet);	}	public static int Mb86lxxxSetOpenLoop(boolean enabled) {		return agscArcImpl.Mb86lxxxSetOpenLoop( enabled);	}}