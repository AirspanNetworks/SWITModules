
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SinrRanking.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SinrRanking"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DrmBasedOnSeAndRsrp"/&gt;
 *     &lt;enumeration value="DrmBasedOnSinrAndRsrp"/&gt;
 *     &lt;enumeration value="RSRP"/&gt;
 *     &lt;enumeration value="RSSI"/&gt;
 *     &lt;enumeration value="RSRQ"/&gt;
 *     &lt;enumeration value="SINR"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SinrRanking")
@XmlEnum
public enum SinrRanking {

    @XmlEnumValue("DrmBasedOnSeAndRsrp")
    DRM_BASED_ON_SE_AND_RSRP("DrmBasedOnSeAndRsrp"),
    @XmlEnumValue("DrmBasedOnSinrAndRsrp")
    DRM_BASED_ON_SINR_AND_RSRP("DrmBasedOnSinrAndRsrp"),
    RSRP("RSRP"),
    RSSI("RSSI"),
    RSRQ("RSRQ"),
    SINR("SINR"),
    SE("SE");
    private final String value;

    SinrRanking(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SinrRanking fromValue(String v) {
        for (SinrRanking c: SinrRanking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
