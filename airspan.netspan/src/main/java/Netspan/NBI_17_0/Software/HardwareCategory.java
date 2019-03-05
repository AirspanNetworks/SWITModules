
package Netspan.NBI_17_0.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HardwareCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HardwareCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Air4G"/&gt;
 *     &lt;enumeration value="AirSynergy"/&gt;
 *     &lt;enumeration value="AirHarmony"/&gt;
 *     &lt;enumeration value="AirVelocity"/&gt;
 *     &lt;enumeration value="AirVelocityFemto"/&gt;
 *     &lt;enumeration value="iBridge 400/450"/&gt;
 *     &lt;enumeration value="iBridge 440"/&gt;
 *     &lt;enumeration value="iBridge 460"/&gt;
 *     &lt;enumeration value="iRelay"/&gt;
 *     &lt;enumeration value="AirUnity"/&gt;
 *     &lt;enumeration value="AirDensity"/&gt;
 *     &lt;enumeration value="AirDensityFemto"/&gt;
 *     &lt;enumeration value="AirSpeed"/&gt;
 *     &lt;enumeration value="AirSpeed-Relay"/&gt;
 *     &lt;enumeration value="LTE"/&gt;
 *     &lt;enumeration value="iBridge440-Lite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HardwareCategory")
@XmlEnum
public enum HardwareCategory {

    @XmlEnumValue("Air4G")
    AIR_4_G("Air4G"),
    @XmlEnumValue("AirSynergy")
    AIR_SYNERGY("AirSynergy"),
    @XmlEnumValue("AirHarmony")
    AIR_HARMONY("AirHarmony"),
    @XmlEnumValue("AirVelocity")
    AIR_VELOCITY("AirVelocity"),
    @XmlEnumValue("AirVelocityFemto")
    AIR_VELOCITY_FEMTO("AirVelocityFemto"),
    @XmlEnumValue("iBridge 400/450")
    I_BRIDGE_400_450("iBridge 400/450"),
    @XmlEnumValue("iBridge 440")
    I_BRIDGE_440("iBridge 440"),
    @XmlEnumValue("iBridge 460")
    I_BRIDGE_460("iBridge 460"),
    @XmlEnumValue("iRelay")
    I_RELAY("iRelay"),
    @XmlEnumValue("AirUnity")
    AIR_UNITY("AirUnity"),
    @XmlEnumValue("AirDensity")
    AIR_DENSITY("AirDensity"),
    @XmlEnumValue("AirDensityFemto")
    AIR_DENSITY_FEMTO("AirDensityFemto"),
    @XmlEnumValue("AirSpeed")
    AIR_SPEED("AirSpeed"),
    @XmlEnumValue("AirSpeed-Relay")
    AIR_SPEED_RELAY("AirSpeed-Relay"),
    LTE("LTE"),
    @XmlEnumValue("iBridge440-Lite")
    I_BRIDGE_440_LITE("iBridge440-Lite");
    private final String value;

    HardwareCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HardwareCategory fromValue(String v) {
        for (HardwareCategory c: HardwareCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
