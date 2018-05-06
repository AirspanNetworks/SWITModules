
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionStatusStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Fault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionStatusStates")
@XmlEnum
public enum ConnectionStatusStates {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Fault")
    FAULT("Fault");
    private final String value;

    ConnectionStatusStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionStatusStates fromValue(String v) {
        for (ConnectionStatusStates c: ConnectionStatusStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
