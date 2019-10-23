
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZones.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeZones"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UTC"/&gt;
 *     &lt;enumeration value="Local"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeZones")
@XmlEnum
public enum TimeZones {

    UTC("UTC"),
    @XmlEnumValue("Local")
    LOCAL("Local");
    private final String value;

    TimeZones(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeZones fromValue(String v) {
        for (TimeZones c: TimeZones.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
