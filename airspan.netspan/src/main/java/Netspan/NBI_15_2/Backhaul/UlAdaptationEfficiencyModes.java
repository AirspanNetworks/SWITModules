
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UlAdaptationEfficiencyModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UlAdaptationEfficiencyModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Spectral"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UlAdaptationEfficiencyModes")
@XmlEnum
public enum UlAdaptationEfficiencyModes {

    @XmlEnumValue("Spectral")
    SPECTRAL("Spectral"),
    MS("MS"),
    @XmlEnumValue("Auto")
    AUTO("Auto");
    private final String value;

    UlAdaptationEfficiencyModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UlAdaptationEfficiencyModes fromValue(String v) {
        for (UlAdaptationEfficiencyModes c: UlAdaptationEfficiencyModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
