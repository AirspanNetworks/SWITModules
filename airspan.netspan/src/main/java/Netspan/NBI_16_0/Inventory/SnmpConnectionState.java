
package Netspan.NBI_16_0.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnmpConnectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SnmpConnectionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="ConflictInIpAddress"/>
 *     &lt;enumeration value="InvalidSnmpAgentType"/>
 *     &lt;enumeration value="NoSnmpAgent"/>
 *     &lt;enumeration value="NoComms"/>
 *     &lt;enumeration value="UnknownSocketException"/>
 *     &lt;enumeration value="UnknownException"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="InvalidWriteCommunity"/>
 *     &lt;enumeration value="Inactive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SnmpConnectionState")
@XmlEnum
public enum SnmpConnectionState {

    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("ConflictInIpAddress")
    CONFLICT_IN_IP_ADDRESS("ConflictInIpAddress"),
    @XmlEnumValue("InvalidSnmpAgentType")
    INVALID_SNMP_AGENT_TYPE("InvalidSnmpAgentType"),
    @XmlEnumValue("NoSnmpAgent")
    NO_SNMP_AGENT("NoSnmpAgent"),
    @XmlEnumValue("NoComms")
    NO_COMMS("NoComms"),
    @XmlEnumValue("UnknownSocketException")
    UNKNOWN_SOCKET_EXCEPTION("UnknownSocketException"),
    @XmlEnumValue("UnknownException")
    UNKNOWN_EXCEPTION("UnknownException"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("InvalidWriteCommunity")
    INVALID_WRITE_COMMUNITY("InvalidWriteCommunity"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    SnmpConnectionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SnmpConnectionState fromValue(String v) {
        for (SnmpConnectionState c: SnmpConnectionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
