
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallTraceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallTraceTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Continuous"/>
 *     &lt;enumeration value="Recurrence"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallTraceTypes")
@XmlEnum
public enum CallTraceTypes {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Continuous")
    CONTINUOUS("Continuous"),
    @XmlEnumValue("Recurrence")
    RECURRENCE("Recurrence");
    private final String value;

    CallTraceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallTraceTypes fromValue(String v) {
        for (CallTraceTypes c: CallTraceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
