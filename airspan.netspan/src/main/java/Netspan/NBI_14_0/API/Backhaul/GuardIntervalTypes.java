
package Netspan.NBI_14_0.API.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuardIntervalTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuardIntervalTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Long"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
