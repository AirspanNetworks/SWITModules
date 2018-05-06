
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BhQosProfileTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BhQosProfileTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProfileNa"/>
 *     &lt;enumeration value="ProfileOne"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BhQosProfileTypes")
@XmlEnum
public enum BhQosProfileTypes {

    @XmlEnumValue("ProfileNa")
    PROFILE_NA("ProfileNa"),
    @XmlEnumValue("ProfileOne")
    PROFILE_ONE("ProfileOne");
    private final String value;

    BhQosProfileTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BhQosProfileTypes fromValue(String v) {
        for (BhQosProfileTypes c: BhQosProfileTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
