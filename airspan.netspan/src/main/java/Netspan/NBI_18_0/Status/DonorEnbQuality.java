
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DonorEnbQuality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DonorEnbQuality"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="BelowThreshold"/&gt;
 *     &lt;enumeration value="AboveThreshold"/&gt;
 *     &lt;enumeration value="MonitoringDisabled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DonorEnbQuality")
@XmlEnum
public enum DonorEnbQuality {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("BelowThreshold")
    BELOW_THRESHOLD("BelowThreshold"),
    @XmlEnumValue("AboveThreshold")
    ABOVE_THRESHOLD("AboveThreshold"),
    @XmlEnumValue("MonitoringDisabled")
    MONITORING_DISABLED("MonitoringDisabled");
    private final String value;

    DonorEnbQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DonorEnbQuality fromValue(String v) {
        for (DonorEnbQuality c: DonorEnbQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
