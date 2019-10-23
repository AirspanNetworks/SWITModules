
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoPowerModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoPowerModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="MinPower"/&gt;
 *     &lt;enumeration value="MaxPower"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutoPowerModes")
@XmlEnum
public enum AutoPowerModes {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("MinPower")
    MIN_POWER("MinPower"),
    @XmlEnumValue("MaxPower")
    MAX_POWER("MaxPower");
    private final String value;

    AutoPowerModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoPowerModes fromValue(String v) {
        for (AutoPowerModes c: AutoPowerModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
