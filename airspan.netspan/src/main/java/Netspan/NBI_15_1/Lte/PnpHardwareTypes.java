
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PnpHardwareTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirSynergy2000"/>
 *     &lt;enumeration value="AirSynergy3000"/>
 *     &lt;enumeration value="AirHarmony1000"/>
 *     &lt;enumeration value="AirHarmony1000D"/>
 *     &lt;enumeration value="AirHarmony1100"/>
 *     &lt;enumeration value="AirHarmony4000"/>
 *     &lt;enumeration value="AirHarmony4200"/>
 *     &lt;enumeration value="AirHarmony4400"/>
 *     &lt;enumeration value="AirVelocity1000PoE"/>
 *     &lt;enumeration value="AirVelocity1000WiFi"/>
 *     &lt;enumeration value="AirVelocity1000SFP"/>
 *     &lt;enumeration value="AirVelocity1000GPS"/>
 *     &lt;enumeration value="AirVelocity500WiFi"/>
 *     &lt;enumeration value="AirVelocity600Wifi"/>
 *     &lt;enumeration value="AirVelocity600"/>
 *     &lt;enumeration value="AirVelocity1200Wifi"/>
 *     &lt;enumeration value="AirVelocity1200"/>
 *     &lt;enumeration value="AirVelocity1000Outdoor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PnpHardwareTypes")
@XmlEnum
public enum PnpHardwareTypes {

    @XmlEnumValue("AirSynergy2000")
    AIR_SYNERGY_2000("AirSynergy2000"),
    @XmlEnumValue("AirSynergy3000")
    AIR_SYNERGY_3000("AirSynergy3000"),
    @XmlEnumValue("AirHarmony1000")
    AIR_HARMONY_1000("AirHarmony1000"),
    @XmlEnumValue("AirHarmony1000D")
    AIR_HARMONY_1000_D("AirHarmony1000D"),
    @XmlEnumValue("AirHarmony1100")
    AIR_HARMONY_1100("AirHarmony1100"),
    @XmlEnumValue("AirHarmony4000")
    AIR_HARMONY_4000("AirHarmony4000"),
    @XmlEnumValue("AirHarmony4200")
    AIR_HARMONY_4200("AirHarmony4200"),
    @XmlEnumValue("AirHarmony4400")
    AIR_HARMONY_4400("AirHarmony4400"),
    @XmlEnumValue("AirVelocity1000PoE")
    AIR_VELOCITY_1000_PO_E("AirVelocity1000PoE"),
    @XmlEnumValue("AirVelocity1000WiFi")
    AIR_VELOCITY_1000_WI_FI("AirVelocity1000WiFi"),
    @XmlEnumValue("AirVelocity1000SFP")
    AIR_VELOCITY_1000_SFP("AirVelocity1000SFP"),
    @XmlEnumValue("AirVelocity1000GPS")
    AIR_VELOCITY_1000_GPS("AirVelocity1000GPS"),
    @XmlEnumValue("AirVelocity500WiFi")
    AIR_VELOCITY_500_WI_FI("AirVelocity500WiFi"),
    @XmlEnumValue("AirVelocity600Wifi")
    AIR_VELOCITY_600_WIFI("AirVelocity600Wifi"),
    @XmlEnumValue("AirVelocity600")
    AIR_VELOCITY_600("AirVelocity600"),
    @XmlEnumValue("AirVelocity1200Wifi")
    AIR_VELOCITY_1200_WIFI("AirVelocity1200Wifi"),
    @XmlEnumValue("AirVelocity1200")
    AIR_VELOCITY_1200("AirVelocity1200"),
    @XmlEnumValue("AirVelocity1000Outdoor")
    AIR_VELOCITY_1000_OUTDOOR("AirVelocity1000Outdoor");
    private final String value;

    PnpHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PnpHardwareTypes fromValue(String v) {
        for (PnpHardwareTypes c: PnpHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
