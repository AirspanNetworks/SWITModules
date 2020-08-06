
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HtSupportedMcsTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HtSupportedMcsTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MCS0-7"/&gt;
 *     &lt;enumeration value="MCS0-8"/&gt;
 *     &lt;enumeration value="MCS0-9"/&gt;
 *     &lt;enumeration value="MCS0-10"/&gt;
 *     &lt;enumeration value="MCS0-11"/&gt;
 *     &lt;enumeration value="MCS0-12"/&gt;
 *     &lt;enumeration value="MCS0-13"/&gt;
 *     &lt;enumeration value="MCS0-14"/&gt;
 *     &lt;enumeration value="MCS0-15"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HtSupportedMcsTypes")
@XmlEnum
public enum HtSupportedMcsTypes {

    @XmlEnumValue("MCS0-7")
    MCS_0_7("MCS0-7"),
    @XmlEnumValue("MCS0-8")
    MCS_0_8("MCS0-8"),
    @XmlEnumValue("MCS0-9")
    MCS_0_9("MCS0-9"),
    @XmlEnumValue("MCS0-10")
    MCS_0_10("MCS0-10"),
    @XmlEnumValue("MCS0-11")
    MCS_0_11("MCS0-11"),
    @XmlEnumValue("MCS0-12")
    MCS_0_12("MCS0-12"),
    @XmlEnumValue("MCS0-13")
    MCS_0_13("MCS0-13"),
    @XmlEnumValue("MCS0-14")
    MCS_0_14("MCS0-14"),
    @XmlEnumValue("MCS0-15")
    MCS_0_15("MCS0-15");
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
