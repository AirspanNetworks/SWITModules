
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReflectorIPAddressStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReflectorIPAddressStatusStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Fail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReflectorIPAddressStatusStates")
@XmlEnum
public enum ReflectorIPAddressStatusStates {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Fail")
    FAIL("Fail");
    private final String value;

    ReflectorIPAddressStatusStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReflectorIPAddressStatusStates fromValue(String v) {
        for (ReflectorIPAddressStatusStates c: ReflectorIPAddressStatusStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
