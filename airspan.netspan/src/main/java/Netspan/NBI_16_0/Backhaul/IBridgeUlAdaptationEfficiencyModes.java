
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeUlAdaptationEfficiencyModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridgeUlAdaptationEfficiencyModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Spectral"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridgeUlAdaptationEfficiencyModes")
@XmlEnum
public enum IBridgeUlAdaptationEfficiencyModes {

    @XmlEnumValue("Spectral")
    SPECTRAL("Spectral"),
    MS("MS"),
    @XmlEnumValue("Auto")
    AUTO("Auto");
    private final String value;

    IBridgeUlAdaptationEfficiencyModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridgeUlAdaptationEfficiencyModes fromValue(String v) {
        for (IBridgeUlAdaptationEfficiencyModes c: IBridgeUlAdaptationEfficiencyModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
