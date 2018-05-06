/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class EpsEsmCauseTag {	public int value;	public static final int EPS_ESM_CAUSE_OPERATOR_DETERMINED_BARRING = 8;	public static final int EPS_ESM_CAUSE_INSUFFICIENT_RESOURCES = 26;	public static final int EPS_ESM_CAUSE_UNKNOWN_OR_MISSING_APN = 27;	public static final int EPS_ESM_CAUSE_UNKNOWN_PDN_TYPE = 28;	public static final int EPS_ESM_CAUSE_USER_AUTHENTICATION_FAILED = 29;	public static final int EPS_ESM_CAUSE_ACTIVATION_REJECTED_BY_GW = 30;	public static final int EPS_ESM_CAUSE_ACIVTATION_REJECTED_UNSPECIFIED = 31;	public static final int EPS_ESM_CAUSE_SERVICE_OPTION_NOT_SUPPORTED = 32;	public static final int EPS_ESM_CAUSE_REQUESTED_SERVICE_OPTION_NOT_SUBSCRIBED = 33;	public static final int EPS_ESM_CAUSE_SERVICE_OPTION_TEMPORARILY_OUT_OF_ORDER = 34;	public static final int EPS_ESM_CAUSE_PTI_ALREADY_IN_USE = 35;	public static final int EPS_ESM_CAUSE_REGULAR_DEACTIVATION = 36;	public static final int EPS_ESM_CAUSE_EPS_QOS_NOT_ACCEPTED = 37;	public static final int EPS_ESM_CAUSE_NETWORK_FAILURE = 38;	public static final int EPS_ESM_CAUSE_REACTIVATION_REQUESTED = 39;	public static final int EPS_ESM_CAUSE_FEATURE_NOT_SUPPORTED = 40;	public static final int EPS_ESM_CAUSE_SEMANTIC_ERROR_IN_THE_TFT_OPERATION = 41;	public static final int EPS_ESM_CAUSE_SYNTACTICAL_ERROR_IN_THE_TFT_OPERATION = 42;	public static final int EPS_ESM_CAUSE_UNKNOWN_EPS_BEARER_CONTEXT = 43;	public static final int EPS_ESM_CAUSE_SEMANTIC_ERRORS_IN_PACKET_FILTERS = 44;	public static final int EPS_ESM_CAUSE_SYNTACTICAL_ERRORS_IN_PACKET_FILTERS = 45;	public static final int EPS_ESM_CAUSE_BEARER_CONTEXT_WITHOUT_TFT_ALREADY_ACTIVATED = 46;	public static final int EPS_ESM_CAUSE_PTI_MISMATCH = 47;	public static final int EPS_ESM_CAUSE_LAST_PDN_DISCONNECTION_NOT_ALLOWED = 49;	public static final int EPS_ESM_CAUSE_PDN_TYPE_IPV4_ONLY_ALLOWED = 50;	public static final int EPS_ESM_CAUSE_PDN_TYPE_IPV6_ONLY_ALLOWED = 51;	public static final int EPS_ESM_CAUSE_SINGLE_ADDRESS_BEARERS_ONLY_ALLOWED = 52;	public static final int EPS_ESM_CAUSE_ESM_INFORMATION_NOT_RECEIVED = 53;	public static final int EPS_ESM_CAUSE_PDN_CONNECTION_DOES_NOT_EXIST = 54;	public static final int EPS_ESM_CAUSE_COLLISION_WITH_NETWORK_INITIATED_REQUEST = 56;	public static final int EPS_ESM_CAUSE_INVALID_PTI_VALUE = 81;	public static final int EPS_ESM_CAUSE_SEMANTICALLY_INCORRECT_MESSAGE = 95;	public static final int EPS_ESM_CAUSE_INVALID_MANDATORY_INFORMATION = 96;	public static final int EPS_ESM_CAUSE_MSG_TYPE_NON_EXISTENT_OR_NOT_IMPLEMENTED = 97;	public static final int EPS_ESM_CAUSE_MSG_TYPE_NOT_COMPATIBLE_WITH_PROTOCOL_STATE = 98;	public static final int EPS_ESM_CAUSE_IE_NON_EXISTENT_OR_NOT_IMPLEMENTED = 99;	public static final int EPS_ESM_CAUSE_CONDITIONAL_IE_ERROR = 100;	public static final int EPS_ESM_CAUSE_MSG_NOT_COMPATIBLE_WITH_PROTOCOL_STATE = 101;	public static final int EPS_ESM_CAUSE_PROTOCOL_ERROR_UNSPECIFIED = 111;	public static final int EPS_ESM_CAUSE_APN_RESTRICTION_VALUE_INCOMPATIBLE_WITH_ACTIVE_CONTEXT = 112;	public static final int EPS_ESM_CAUSE_3GPP_MAX = 112;	public static final int ESM_BEARER_CAUSE_SUCCESS = 113;	public static final int ESM_BEARER_CAUSE_NO_FREE_BEARERS = 114;	public static final int ESM_BEARER_CAUSE_NO_FREE_PTI = 115;	public static final int ESM_BEARER_CAUSE_BAD_DEDICATED_REQ = 116;	public static final int ESM_BEARER_CAUSE_BAD_DEFAULT_REQ = 117;	public static final int ESM_BEARER_CAUSE_IGNORE_MESSAGE = 118;	public static final int ESM_BEARER_CAUSE_INVALID_PDN_TYPE = 119;	public static final int ESM_BEARER_CAUSE_BEARER_NOT_ACTIVE = 120;	public static final int ESM_BEARER_CAUSE_MUST_SET_ISDEFAULT_FOR_DEFAULT_BEARER = 121;	public static final int ESM_BEARER_CAUSE_NOT_A_DEFAULT_BEARER = 122;	public static final int ESM_BEARER_CAUSE_RELEASED_BY_AS = 123;	public static final int ESM_BEARER_CAUSE_LAST_PDN = 124;	public static final int ESM_BEARER_CAUSE_NOT_EMM_ATTACHED = 125;	public static final int ESM_BEARER_CAUSE_ENCODE_ERROR = 126;	public static final int ESM_BEARER_CAUSE_UL_DATA_FAILED_MAX_RETRANS = 127;	public static final int ESM_BEARER_CAUSE_FAILURE = 128;	public static final int ESM_CAUSE_NETWORK_ERROR = 129;	public static final int ESM_BEARER_CAUSE_DEFAULT_BEARER_RELEASED = 130;	public static final int ESM_BEARER_CAUSE_PF_NOT_FOUND = 131;	public static final int ESM_BEARER_CAUSE_NO_CHANGE_REQUIRED = 132;	public static final int ESM_BEARER_CAUSE_PF_ADD_AND_MODIFY = 133;	public static final int ESM_BEARER_CAUSE_COLLISION_WITH_DEAC_REQ = 134;	public static final int ESM_BEARER_CAUSE_PDN_THROTTLING_CONDITION = 135;	public static final int ESM_BEARER_CAUSE_FORBIDDEN_APN = 136;	public static final int EPS_ESM_CAUSE_MAX = 137;	public static int marshall(byte[] buf, final EpsEsmCauseTag p, OutValue<Integer> _offset) {		// Check the size of the buffer		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		Util.Copy32ToBuffer(buf, p.value, _offset);		return Status.STATUS_OK;	}	public static int unmarshall(final byte[] buf, EpsEsmCauseTag p, OutValue<Integer> _offset) {		// Check the size of the buffer		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		p.value = (int) Util.Copy32FromBuffer(buf, _offset);		return Status.STATUS_OK;	}}