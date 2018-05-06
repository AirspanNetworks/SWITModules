
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeNodeBClockStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeNodeBClockStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="Acquiring"/>
 *     &lt;enumeration value="noCommunications"/>
 *     &lt;enumeration value="notEnabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeNodeBClockStatus")
@XmlEnum
public enum DeNodeBClockStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Acquiring")
    ACQUIRING("Acquiring"),
    @XmlEnumValue("noCommunications")
    NO_COMMUNICATIONS("noCommunications"),
    @XmlEnumValue("notEnabled")
    NOT_ENABLED("notEnabled");
    private final String value;

    DeNodeBClockStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeNodeBClockStatus fromValue(String v) {
        for (DeNodeBClockStatus c: DeNodeBClockStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
