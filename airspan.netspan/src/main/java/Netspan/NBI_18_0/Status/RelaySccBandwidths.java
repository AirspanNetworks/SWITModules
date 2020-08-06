
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelaySccBandwidths.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelaySccBandwidths"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="OneTo4MHz"/&gt;
 *     &lt;enumeration value="ThreeMHz"/&gt;
 *     &lt;enumeration value="FiveMHz"/&gt;
 *     &lt;enumeration value="TenMHz"/&gt;
 *     &lt;enumeration value="FifteenMHz"/&gt;
 *     &lt;enumeration value="TwentyMHz"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelaySccBandwidths")
@XmlEnum
public enum RelaySccBandwidths {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("OneTo4MHz")
    ONE_TO_4_M_HZ("OneTo4MHz"),
    @XmlEnumValue("ThreeMHz")
    THREE_M_HZ("ThreeMHz"),
    @XmlEnumValue("FiveMHz")
    FIVE_M_HZ("FiveMHz"),
    @XmlEnumValue("TenMHz")
    TEN_M_HZ("TenMHz"),
    @XmlEnumValue("FifteenMHz")
    FIFTEEN_M_HZ("FifteenMHz"),
    @XmlEnumValue("TwentyMHz")
    TWENTY_M_HZ("TwentyMHz");
    private final String value;

    RelaySccBandwidths(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelaySccBandwidths fromValue(String v) {
        for (RelaySccBandwidths c: RelaySccBandwidths.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
