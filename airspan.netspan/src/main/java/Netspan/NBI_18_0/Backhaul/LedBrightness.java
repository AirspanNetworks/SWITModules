
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LedBrightness.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LedBrightness"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Medium"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LedBrightness")
@XmlEnum
public enum LedBrightness {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    LedBrightness(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LedBrightness fromValue(String v) {
        for (LedBrightness c: LedBrightness.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
