
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApnAuthenticationTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApnAuthenticationTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Pap"/&gt;
 *     &lt;enumeration value="Chap"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
