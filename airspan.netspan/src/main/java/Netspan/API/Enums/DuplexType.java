
package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplexType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Half Duplex"/>
 *     &lt;enumeration value="Full Duplex"/>
 *     &lt;enumeration value="Auto Neg"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DuplexType")
@XmlEnum
public enum DuplexType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Half Duplex")
    HALF_DUPLEX("Half Duplex"),
    @XmlEnumValue("Full Duplex")
    FULL_DUPLEX("Full Duplex"),
    @XmlEnumValue("Auto Neg")
    AUTO_NEG("Auto Neg");
    private final String value;

    DuplexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DuplexType fromValue(String v) {
        for (DuplexType c: DuplexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}