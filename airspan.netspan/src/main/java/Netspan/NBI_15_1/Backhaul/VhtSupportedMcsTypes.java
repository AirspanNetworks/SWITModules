
package Netspan.NBI_15_1.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VhtSupportedMcsTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VhtSupportedMcsTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MCS 0-7"/>
 *     &lt;enumeration value="MCS 0-8"/>
 *     &lt;enumeration value="MCS 0-9"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VhtSupportedMcsTypes")
@XmlEnum
public enum VhtSupportedMcsTypes {

    @XmlEnumValue("MCS 0-7")
    MCS_0_7("MCS 0-7"),
    @XmlEnumValue("MCS 0-8")
    MCS_0_8("MCS 0-8"),
    @XmlEnumValue("MCS 0-9")
    MCS_0_9("MCS 0-9");
    private final String value;

    VhtSupportedMcsTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VhtSupportedMcsTypes fromValue(String v) {
        for (VhtSupportedMcsTypes c: VhtSupportedMcsTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
