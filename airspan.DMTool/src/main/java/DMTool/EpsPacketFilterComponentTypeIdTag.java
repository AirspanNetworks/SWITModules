/*  -*- java -*- ****************************************************************** * * Module  : DCC - Device Controller Client in Java for Sequans devices * * Purpose : THIS FILE IS AUTOMATICALLY GENERATED ! * ***************************************************************** * *  Copyright (c) 2009 SEQUANS Communications. *  All rights reserved. *   *  This is confidential and proprietary source code of SEQUANS *  Communications. The use of the present source code and all *  its derived forms is exclusively governed by the restricted *  terms and conditions set forth in the SEQUANS *  Communications' EARLY ADOPTER AGREEMENT and/or LICENCE *  AGREEMENT. The present source code and all its derived *  forms can ONLY and EXCLUSIVELY be used with SEQUANS *  Communications' products. The distribution/sale of the *  present source code and all its derived forms is EXCLUSIVELY *  RESERVED to regular LICENCE holder and otherwise STRICTLY *  PROHIBITED. * ***************************************************************** */package DMTool;public class EpsPacketFilterComponentTypeIdTag {	public int value;	public static final int EPS_PACKET_FILTER_COMPONENT_IPV4_REMOTE_ADDRESS_TYPE = 16;	public static final int EPS_PACKET_FILTER_COMPONENT_IPV6_REMOTE_ADDRESS_TYPE = 32;	public static final int EPS_PACKET_FILTER_COMPONENT_PROTOCOL_ID_NEXT_HEADER_TYPE = 48;	public static final int EPS_PACKET_FILTER_COMPONENT_SINGLE_LOCAL_PORT_TYPE = 64;	public static final int EPS_PACKET_FILTER_COMPONENT_LOCAL_PORT_RANGE_TYPE = 65;	public static final int EPS_PACKET_FILTER_COMPONENT_SINGLE_REMOTE_PORT_TYPE = 80;	public static final int EPS_PACKET_FILTER_COMPONENT_REMOTE_PORT_RANGE_TYPE = 81;	public static final int EPS_PACKET_FILTER_COMPONENT_SECURITY_PARAMETER_INDEX_TYPE = 96;	public static final int EPS_PACKET_FILTER_COMPONENT_TYPE_OF_SERVICE_TRAFFIC_CLASS_TYPE = 112;	public static final int EPS_PACKET_FILTER_COMPONENT_FLOW_LABEL_TYPE = 128;	public static final int EPS_NUM_OF_PACKET_FILTER_COMPONENTS = 10;	public static int marshall(byte[] buf, final EpsPacketFilterComponentTypeIdTag p, OutValue<Integer> _offset) {		// Check the size of the buffer		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		Util.Copy32ToBuffer(buf, p.value, _offset);		return Status.STATUS_OK;	}	public static int unmarshall(final byte[] buf, EpsPacketFilterComponentTypeIdTag p, OutValue<Integer> _offset) {		// Check the size of the buffer		if (buf.length < (_offset._value+4)) return DccError.ERR_OVERFLOW;		p.value = (int) Util.Copy32FromBuffer(buf, _offset);		return Status.STATUS_OK;	}}