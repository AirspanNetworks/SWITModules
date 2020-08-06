
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackhaulModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackhaulModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OutofBand"/&gt;
 *     &lt;enumeration value="InBandFsOnLapOn"/&gt;
 *     &lt;enumeration value="InBandFsOnLapOff"/&gt;
 *     &lt;enumeration value="InBandFsOffLapOn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BackhaulModesWs")
@XmlEnum
public enum BackhaulModesWs {

    @XmlEnumValue("OutofBand")
    OUTOF_BAND("OutofBand"),
    @XmlEnumValue("InBandFsOnLapOn")
    IN_BAND_FS_ON_LAP_ON("InBandFsOnLapOn"),
    @XmlEnumValue("InBandFsOnLapOff")
    IN_BAND_FS_ON_LAP_OFF("InBandFsOnLapOff"),
    @XmlEnumValue("InBandFsOffLapOn")
    IN_BAND_FS_OFF_LAP_ON("InBandFsOffLapOn");
    private final String value;

    BackhaulModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BackhaulModesWs fromValue(String v) {
        for (BackhaulModesWs c: BackhaulModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
