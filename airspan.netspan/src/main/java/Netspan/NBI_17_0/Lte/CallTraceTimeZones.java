
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallTraceTimeZones.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallTraceTimeZones"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UTC"/&gt;
 *     &lt;enumeration value="Local"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallTraceTimeZones")
@XmlEnum
public enum CallTraceTimeZones {

    UTC("UTC"),
    @XmlEnumValue("Local")
    LOCAL("Local");
    private final String value;

    CallTraceTimeZones(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallTraceTimeZones fromValue(String v) {
        for (CallTraceTimeZones c: CallTraceTimeZones.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
