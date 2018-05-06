
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApnAuthenticationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApnAuthenticationTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Pap"/>
 *     &lt;enumeration value="Chap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApnAuthenticationTypes")
@XmlEnum
public enum ApnAuthenticationTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Pap")
    PAP("Pap"),
    @XmlEnumValue("Chap")
    CHAP("Chap");
    private final String value;

    ApnAuthenticationTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApnAuthenticationTypes fromValue(String v) {
        for (ApnAuthenticationTypes c: ApnAuthenticationTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
