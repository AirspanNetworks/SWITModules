
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PnpHardwareTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirSynergy2000"/&gt;
 *     &lt;enumeration value="AirHarmony1000"/&gt;
 *     &lt;enumeration value="AirHarmony1000D"/&gt;
 *     &lt;enumeration value="AirHarmony1100"/&gt;
 *     &lt;enumeration value="AirHarmony4000"/&gt;
 *     &lt;enumeration value="AirHarmony4200"/&gt;
 *     &lt;enumeration value="AirHarmony4400"/&gt;
 *     &lt;enumeration value="AirVelocity1000PoE"/&gt;
 *     &lt;enumeration value="AirVelocity1000WiFi"/&gt;
 *     &lt;enumeration value="AirVelocity1000SFP"/&gt;
 *     &lt;enumeration value="AirVelocity1000GPS"/&gt;
 *     &lt;enumeration value="AirVelocity500WiFi"/&gt;
 *     &lt;enumeration value="AirVelocity600Wifi"/&gt;
 *     &lt;enumeration value="AirVelocity600"/&gt;
 *     &lt;enumeration value="AirVelocity1500"/&gt;
 *     &lt;enumeration value="AirVelocity1200WiFi"/&gt;
 *     &lt;enumeration value="AirVelocity1200"/&gt;
 *     &lt;enumeration value="AirVelocity1000Outdoor"/&gt;
 *     &lt;enumeration value="AirVelocity100C"/&gt;
 *     &lt;enumeration value="AirVelocity100"/&gt;
 *     &lt;enumeration value="AirSpeed1000"/&gt;
 *     &lt;enumeration value="AirSpeed1200R"/&gt;
 *     &lt;enumeration value="AirSpeed1200T"/&gt;
 *     &lt;enumeration value="AirSpeed1250Wired"/&gt;
 *     &lt;enumeration value="AirSpeed1300"/&gt;
 *     &lt;enumeration value="AirSpeed1050"/&gt;
 *     &lt;enumeration value="AirStrand1000T"/&gt;
 *     &lt;enumeration value="AirStrand1200T"/&gt;
 *     &lt;enumeration value="AirStrand1300"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PnpHardwareTypes")
@XmlEnum
public enum PnpHardwareTypes {

    @XmlEnumValue("AirSynergy2000")
    AIR_SYNERGY_2000("AirSynergy2000"),
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
    @XmlEnumValue("AirVelocity1500")
    AIR_VELOCITY_1500("AirVelocity1500"),
    @XmlEnumValue("AirVelocity1200WiFi")
    AIR_VELOCITY_1200_WI_FI("AirVelocity1200WiFi"),
    @XmlEnumValue("AirVelocity1200")
    AIR_VELOCITY_1200("AirVelocity1200"),
    @XmlEnumValue("AirVelocity1000Outdoor")
    AIR_VELOCITY_1000_OUTDOOR("AirVelocity1000Outdoor"),
    @XmlEnumValue("AirVelocity100C")
    AIR_VELOCITY_100_C("AirVelocity100C"),
    @XmlEnumValue("AirVelocity100")
    AIR_VELOCITY_100("AirVelocity100"),
    @XmlEnumValue("AirSpeed1000")
    AIR_SPEED_1000("AirSpeed1000"),
    @XmlEnumValue("AirSpeed1200R")
    AIR_SPEED_1200_R("AirSpeed1200R"),
    @XmlEnumValue("AirSpeed1200T")
    AIR_SPEED_1200_T("AirSpeed1200T"),
    @XmlEnumValue("AirSpeed1250Wired")
    AIR_SPEED_1250_WIRED("AirSpeed1250Wired"),
    @XmlEnumValue("AirSpeed1300")
    AIR_SPEED_1300("AirSpeed1300"),
    @XmlEnumValue("AirSpeed1050")
    AIR_SPEED_1050("AirSpeed1050"),
    @XmlEnumValue("AirStrand1000T")
    AIR_STRAND_1000_T("AirStrand1000T"),
    @XmlEnumValue("AirStrand1200T")
    AIR_STRAND_1200_T("AirStrand1200T"),
    @XmlEnumValue("AirStrand1300")
    AIR_STRAND_1300("AirStrand1300");
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
