
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSyncSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockSyncSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Gps"/&gt;
 *     &lt;enumeration value="Internal"/&gt;
 *     &lt;enumeration value="Ptp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClockSyncSource")
@XmlEnum
public enum ClockSyncSource {

    @XmlEnumValue("Gps")
    GPS("Gps"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Ptp")
    PTP("Ptp");
    private final String value;

    ClockSyncSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockSyncSource fromValue(String v) {
        for (ClockSyncSource c: ClockSyncSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
