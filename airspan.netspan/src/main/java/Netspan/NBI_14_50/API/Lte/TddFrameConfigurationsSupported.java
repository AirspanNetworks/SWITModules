
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TddFrameConfigurationsSupported.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TddFrameConfigurationsSupported">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DL40UL40SP20"/>
 *     &lt;enumeration value="DL60UL20SP20"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TddFrameConfigurationsSupported")
@XmlEnum
public enum TddFrameConfigurationsSupported {

    @XmlEnumValue("DL40UL40SP20")
    DL_40_UL_40_SP_20("DL40UL40SP20"),
    @XmlEnumValue("DL60UL20SP20")
    DL_60_UL_20_SP_20("DL60UL20SP20");
    private final String value;

    TddFrameConfigurationsSupported(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TddFrameConfigurationsSupported fromValue(String v) {
        for (TddFrameConfigurationsSupported c: TddFrameConfigurationsSupported.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
