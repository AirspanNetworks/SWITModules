
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VhtSupportedMcsTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VhtSupportedMcsTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MCS0-7"/&gt;
 *     &lt;enumeration value="MCS0-8"/&gt;
 *     &lt;enumeration value="MCS0-9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VhtSupportedMcsTypes")
@XmlEnum
public enum VhtSupportedMcsTypes {

    @XmlEnumValue("MCS0-7")
    MCS_0_7("MCS0-7"),
    @XmlEnumValue("MCS0-8")
    MCS_0_8("MCS0-8"),
    @XmlEnumValue("MCS0-9")
    MCS_0_9("MCS0-9");
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
