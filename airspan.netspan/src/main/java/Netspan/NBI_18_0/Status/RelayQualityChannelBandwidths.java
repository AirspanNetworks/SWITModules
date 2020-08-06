
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayQualityChannelBandwidths.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayQualityChannelBandwidths"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Bwi1dot4MHz"/&gt;
 *     &lt;enumeration value="Bwi3MHz"/&gt;
 *     &lt;enumeration value="Bwi5MHz"/&gt;
 *     &lt;enumeration value="Bwi10MHz"/&gt;
 *     &lt;enumeration value="Bwi15MHz"/&gt;
 *     &lt;enumeration value="Bwi20MHz"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelayQualityChannelBandwidths")
@XmlEnum
public enum RelayQualityChannelBandwidths {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Bwi1dot4MHz")
    BWI_1_DOT_4_M_HZ("Bwi1dot4MHz"),
    @XmlEnumValue("Bwi3MHz")
    BWI_3_M_HZ("Bwi3MHz"),
    @XmlEnumValue("Bwi5MHz")
    BWI_5_M_HZ("Bwi5MHz"),
    @XmlEnumValue("Bwi10MHz")
    BWI_10_M_HZ("Bwi10MHz"),
    @XmlEnumValue("Bwi15MHz")
    BWI_15_M_HZ("Bwi15MHz"),
    @XmlEnumValue("Bwi20MHz")
    BWI_20_M_HZ("Bwi20MHz");
    private final String value;

    RelayQualityChannelBandwidths(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayQualityChannelBandwidths fromValue(String v) {
        for (RelayQualityChannelBandwidths c: RelayQualityChannelBandwidths.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
