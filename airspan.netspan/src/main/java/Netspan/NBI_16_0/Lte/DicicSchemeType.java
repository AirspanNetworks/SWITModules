
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DicicSchemeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DicicSchemeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DynamicSfr"/>
 *     &lt;enumeration value="SemiStaticSfr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DicicSchemeType")
@XmlEnum
public enum DicicSchemeType {

    @XmlEnumValue("DynamicSfr")
    DYNAMIC_SFR("DynamicSfr"),
    @XmlEnumValue("SemiStaticSfr")
    SEMI_STATIC_SFR("SemiStaticSfr");
    private final String value;

    DicicSchemeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DicicSchemeType fromValue(String v) {
        for (DicicSchemeType c: DicicSchemeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
