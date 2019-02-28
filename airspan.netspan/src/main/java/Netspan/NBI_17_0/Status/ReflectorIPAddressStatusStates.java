
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReflectorIPAddressStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReflectorIPAddressStatusStates"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Fail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
