
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallTraceMessageDirections.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallTraceMessageDirections">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Outgoing"/>
 *     &lt;enumeration value="Incoming"/>
 *     &lt;enumeration value="BiDirectional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallTraceMessageDirections")
@XmlEnum
public enum CallTraceMessageDirections {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Outgoing")
    OUTGOING("Outgoing"),
    @XmlEnumValue("Incoming")
    INCOMING("Incoming"),
    @XmlEnumValue("BiDirectional")
    BI_DIRECTIONAL("BiDirectional");
    private final String value;

    CallTraceMessageDirections(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallTraceMessageDirections fromValue(String v) {
        for (CallTraceMessageDirections c: CallTraceMessageDirections.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
