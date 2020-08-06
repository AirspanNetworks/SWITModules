
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbTypesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnbTypesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Macro"/&gt;
 *     &lt;enumeration value="Home"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnbTypesWs")
@XmlEnum
public enum EnbTypesWs {

    @XmlEnumValue("Macro")
    MACRO("Macro"),
    @XmlEnumValue("Home")
    HOME("Home");
    private final String value;

    EnbTypesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnbTypesWs fromValue(String v) {
        for (EnbTypesWs c: EnbTypesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
