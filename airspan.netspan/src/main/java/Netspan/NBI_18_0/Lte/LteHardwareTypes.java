
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LteHardwareTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Air4G"/&gt;
 *     &lt;enumeration value="AirSynergy"/&gt;
 *     &lt;enumeration value="AirHarmony"/&gt;
 *     &lt;enumeration value="AirVelocity"/&gt;
 *     &lt;enumeration value="AirVelocityFemto"/&gt;
 *     &lt;enumeration value="AirUnity"/&gt;
 *     &lt;enumeration value="AirSpeed"/&gt;
 *     &lt;enumeration value="AirSpeed-Relay"/&gt;
 *     &lt;enumeration value="AirDensity"/&gt;
 *     &lt;enumeration value="AirDensityFemto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LteHardwareTypes")
@XmlEnum
public enum LteHardwareTypes {

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
    @XmlEnumValue("AirUnity")
    AIR_UNITY("AirUnity"),
    @XmlEnumValue("AirSpeed")
    AIR_SPEED("AirSpeed"),
    @XmlEnumValue("AirSpeed-Relay")
    AIR_SPEED_RELAY("AirSpeed-Relay"),
    @XmlEnumValue("AirDensity")
    AIR_DENSITY("AirDensity"),
    @XmlEnumValue("AirDensityFemto")
    AIR_DENSITY_FEMTO("AirDensityFemto");
    private final String value;

    LteHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LteHardwareTypes fromValue(String v) {
        for (LteHardwareTypes c: LteHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
