
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackhaulModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackhaulModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OutofBand"/>
 *     &lt;enumeration value="InBandFsOnLapOn"/>
 *     &lt;enumeration value="InBandFsOnLapOff"/>
 *     &lt;enumeration value="InBandFsOffLapOn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BackhaulModes")
@XmlEnum
public enum BackhaulModes {

    @XmlEnumValue("OutofBand")
    OUTOF_BAND("OutofBand"),
    @XmlEnumValue("InBandFsOnLapOn")
    IN_BAND_FS_ON_LAP_ON("InBandFsOnLapOn"),
    @XmlEnumValue("InBandFsOnLapOff")
    IN_BAND_FS_ON_LAP_OFF("InBandFsOnLapOff"),
    @XmlEnumValue("InBandFsOffLapOn")
    IN_BAND_FS_OFF_LAP_ON("InBandFsOffLapOn");
    private final String value;

    BackhaulModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BackhaulModes fromValue(String v) {
        for (BackhaulModes c: BackhaulModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
