
package Netspan.NBI_16_0.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HardwareCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HardwareCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Air4G"/>
 *     &lt;enumeration value="AirSynergy"/>
 *     &lt;enumeration value="AirHarmony"/>
 *     &lt;enumeration value="AirVelocity"/>
 *     &lt;enumeration value="iBridge 400/450"/>
 *     &lt;enumeration value="iBridge 440"/>
 *     &lt;enumeration value="iBridge 460"/>
 *     &lt;enumeration value="iRelay"/>
 *     &lt;enumeration value="AirUnity"/>
 *     &lt;enumeration value="AirDensity"/>
 *     &lt;enumeration value="AirSpeed"/>
 *     &lt;enumeration value="AirSpeed-Relay"/>
 *     &lt;enumeration value="LTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
    @XmlEnumValue("AirSpeed")
    AIR_SPEED("AirSpeed"),
    @XmlEnumValue("AirSpeed-Relay")
    AIR_SPEED_RELAY("AirSpeed-Relay"),
    LTE("LTE");
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
