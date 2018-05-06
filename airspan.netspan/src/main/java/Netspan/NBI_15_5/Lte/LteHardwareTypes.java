
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LteHardwareTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Air4G"/>
 *     &lt;enumeration value="AirSynergy"/>
 *     &lt;enumeration value="AirHarmony"/>
 *     &lt;enumeration value="AirVelocity"/>
 *     &lt;enumeration value="AirUnity"/>
 *     &lt;enumeration value="AirSpeed"/>
 *     &lt;enumeration value="AirDensity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
    @XmlEnumValue("AirUnity")
    AIR_UNITY("AirUnity"),
    @XmlEnumValue("AirSpeed")
    AIR_SPEED("AirSpeed"),
    @XmlEnumValue("AirDensity")
    AIR_DENSITY("AirDensity");
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
