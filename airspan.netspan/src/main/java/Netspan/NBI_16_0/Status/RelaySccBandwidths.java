
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelaySccBandwidths.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelaySccBandwidths">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OneTo4MHz"/>
 *     &lt;enumeration value="ThreeMHz"/>
 *     &lt;enumeration value="FiveMHz"/>
 *     &lt;enumeration value="TenMHz"/>
 *     &lt;enumeration value="FifteenMHz"/>
 *     &lt;enumeration value="TwentyMHz"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
