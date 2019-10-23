
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplexType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="HalfDuplex"/&gt;
 *     &lt;enumeration value="FullDuplex"/&gt;
 *     &lt;enumeration value="AutoNeg"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DuplexType")
@XmlEnum
public enum DuplexType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("HalfDuplex")
    HALF_DUPLEX("HalfDuplex"),
    @XmlEnumValue("FullDuplex")
    FULL_DUPLEX("FullDuplex"),
    @XmlEnumValue("AutoNeg")
    AUTO_NEG("AutoNeg");
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
