
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsfTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SsfTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SSF5"/>
 *     &lt;enumeration value="SSF7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SsfTypes")
@XmlEnum
public enum SsfTypes {

    @XmlEnumValue("SSF5")
    SSF_5("SSF5"),
    @XmlEnumValue("SSF7")
    SSF_7("SSF7");
    private final String value;

    SsfTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SsfTypes fromValue(String v) {
        for (SsfTypes c: SsfTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
