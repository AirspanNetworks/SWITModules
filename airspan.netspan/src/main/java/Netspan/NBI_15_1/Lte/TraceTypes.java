
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TraceTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Continuous"/>
 *     &lt;enumeration value="Recurrence"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TraceTypes")
@XmlEnum
public enum TraceTypes {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Continuous")
    CONTINUOUS("Continuous"),
    @XmlEnumValue("Recurrence")
    RECURRENCE("Recurrence");
    private final String value;

    TraceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraceTypes fromValue(String v) {
        for (TraceTypes c: TraceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
