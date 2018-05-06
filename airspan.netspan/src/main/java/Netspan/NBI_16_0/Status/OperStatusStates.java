
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperStatusStates.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperStatusStates">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Up"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperStatusStates")
@XmlEnum
public enum OperStatusStates {

    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Up")
    UP("Up");
    private final String value;

    OperStatusStates(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperStatusStates fromValue(String v) {
        for (OperStatusStates c: OperStatusStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
