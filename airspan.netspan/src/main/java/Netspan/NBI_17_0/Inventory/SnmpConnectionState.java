
package Netspan.NBI_17_0.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnmpConnectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SnmpConnectionState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Online"/&gt;
 *     &lt;enumeration value="ConflictInIpAddress"/&gt;
 *     &lt;enumeration value="InvalidSnmpAgentType"/&gt;
 *     &lt;enumeration value="NoSnmpAgent"/&gt;
 *     &lt;enumeration value="NoComms"/&gt;
 *     &lt;enumeration value="UnknownSocketException"/&gt;
 *     &lt;enumeration value="UnknownException"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="InvalidWriteCommunity"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
