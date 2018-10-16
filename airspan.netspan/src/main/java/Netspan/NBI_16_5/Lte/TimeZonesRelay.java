
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZonesRelay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeZonesRelay"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UTC"/&gt;
 *     &lt;enumeration value="Local"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeZonesRelay")
@XmlEnum
public enum TimeZonesRelay {

    UTC("UTC"),
    @XmlEnumValue("Local")
    LOCAL("Local");
    private final String value;

    TimeZonesRelay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeZonesRelay fromValue(String v) {
        for (TimeZonesRelay c: TimeZonesRelay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
