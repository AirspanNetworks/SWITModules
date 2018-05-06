
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnbTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Macro"/>
 *     &lt;enumeration value="Home"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnbTypes")
@XmlEnum
public enum EnbTypes {

    @XmlEnumValue("Macro")
    MACRO("Macro"),
    @XmlEnumValue("Home")
    HOME("Home");
    private final String value;

    EnbTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnbTypes fromValue(String v) {
        for (EnbTypes c: EnbTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
