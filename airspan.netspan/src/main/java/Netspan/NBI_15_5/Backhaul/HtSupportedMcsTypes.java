
package Netspan.NBI_15_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HtSupportedMcsTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HtSupportedMcsTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MCS 0-7"/>
 *     &lt;enumeration value="MCS 0-8"/>
 *     &lt;enumeration value="MCS 0-9"/>
 *     &lt;enumeration value="MCS 0-10"/>
 *     &lt;enumeration value="MCS 0-11"/>
 *     &lt;enumeration value="MCS 0-12"/>
 *     &lt;enumeration value="MCS 0-13"/>
 *     &lt;enumeration value="MCS 0-14"/>
 *     &lt;enumeration value="MCS 0-15"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HtSupportedMcsTypes")
@XmlEnum
public enum HtSupportedMcsTypes {

    @XmlEnumValue("MCS 0-7")
    MCS_0_7("MCS 0-7"),
    @XmlEnumValue("MCS 0-8")
    MCS_0_8("MCS 0-8"),
    @XmlEnumValue("MCS 0-9")
    MCS_0_9("MCS 0-9"),
    @XmlEnumValue("MCS 0-10")
    MCS_0_10("MCS 0-10"),
    @XmlEnumValue("MCS 0-11")
    MCS_0_11("MCS 0-11"),
    @XmlEnumValue("MCS 0-12")
    MCS_0_12("MCS 0-12"),
    @XmlEnumValue("MCS 0-13")
    MCS_0_13("MCS 0-13"),
    @XmlEnumValue("MCS 0-14")
    MCS_0_14("MCS 0-14"),
    @XmlEnumValue("MCS 0-15")
    MCS_0_15("MCS 0-15");
    private final String value;

    HtSupportedMcsTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HtSupportedMcsTypes fromValue(String v) {
        for (HtSupportedMcsTypes c: HtSupportedMcsTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
