
package Netspan.NBI_16_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionStatusStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Fault"/&gt;
 *     &lt;enumeration value="MassStorage"/&gt;
 *     &lt;enumeration value="PowerMode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
    FAULT("Fault"),
    @XmlEnumValue("MassStorage")
    MASS_STORAGE("MassStorage"),
    @XmlEnumValue("PowerMode")
    POWER_MODE("PowerMode");
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
