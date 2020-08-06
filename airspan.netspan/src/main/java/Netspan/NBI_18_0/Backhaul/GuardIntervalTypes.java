
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuardIntervalTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuardIntervalTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Long"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GuardIntervalTypes")
@XmlEnum
public enum GuardIntervalTypes {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Long")
    LONG("Long");
    private final String value;

    GuardIntervalTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuardIntervalTypes fromValue(String v) {
        for (GuardIntervalTypes c: GuardIntervalTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
