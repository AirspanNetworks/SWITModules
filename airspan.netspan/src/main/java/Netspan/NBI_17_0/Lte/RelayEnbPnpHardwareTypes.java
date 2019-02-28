
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayEnbPnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayEnbPnpHardwareTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirDensity140"/&gt;
 *     &lt;enumeration value="AirDensity386"/&gt;
 *     &lt;enumeration value="AirDensity420"/&gt;
 *     &lt;enumeration value="AirDensity421"/&gt;
 *     &lt;enumeration value="AirDensity480"/&gt;
 *     &lt;enumeration value="AirDensity447"/&gt;
 *     &lt;enumeration value="AirSpeed1200"/&gt;
 *     &lt;enumeration value="AirSpeed1200R2"/&gt;
 *     &lt;enumeration value="AirSpeed1250"/&gt;
 *     &lt;enumeration value="AirUnity420"/&gt;
 *     &lt;enumeration value="AirUnity480"/&gt;
 *     &lt;enumeration value="AirUnity484"/&gt;
 *     &lt;enumeration value="AirUnity540"/&gt;
 *     &lt;enumeration value="AirUnity544"/&gt;
 *     &lt;enumeration value="AirUnity545"/&gt;
 *     &lt;enumeration value="AirUnity546"/&gt;
 *     &lt;enumeration value="AirUnity586"/&gt;
 *     &lt;enumeration value="AirUnity587"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelayEnbPnpHardwareTypes")
@XmlEnum
public enum RelayEnbPnpHardwareTypes {

    @XmlEnumValue("AirDensity140")
    AIR_DENSITY_140("AirDensity140"),
    @XmlEnumValue("AirDensity386")
    AIR_DENSITY_386("AirDensity386"),
    @XmlEnumValue("AirDensity420")
    AIR_DENSITY_420("AirDensity420"),
    @XmlEnumValue("AirDensity421")
    AIR_DENSITY_421("AirDensity421"),
    @XmlEnumValue("AirDensity480")
    AIR_DENSITY_480("AirDensity480"),
    @XmlEnumValue("AirDensity447")
    AIR_DENSITY_447("AirDensity447"),
    @XmlEnumValue("AirSpeed1200")
    AIR_SPEED_1200("AirSpeed1200"),
    @XmlEnumValue("AirSpeed1200R2")
    AIR_SPEED_1200_R_2("AirSpeed1200R2"),
    @XmlEnumValue("AirSpeed1250")
    AIR_SPEED_1250("AirSpeed1250"),
    @XmlEnumValue("AirUnity420")
    AIR_UNITY_420("AirUnity420"),
    @XmlEnumValue("AirUnity480")
    AIR_UNITY_480("AirUnity480"),
    @XmlEnumValue("AirUnity484")
    AIR_UNITY_484("AirUnity484"),
    @XmlEnumValue("AirUnity540")
    AIR_UNITY_540("AirUnity540"),
    @XmlEnumValue("AirUnity544")
    AIR_UNITY_544("AirUnity544"),
    @XmlEnumValue("AirUnity545")
    AIR_UNITY_545("AirUnity545"),
    @XmlEnumValue("AirUnity546")
    AIR_UNITY_546("AirUnity546"),
    @XmlEnumValue("AirUnity586")
    AIR_UNITY_586("AirUnity586"),
    @XmlEnumValue("AirUnity587")
    AIR_UNITY_587("AirUnity587");
    private final String value;

    RelayEnbPnpHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayEnbPnpHardwareTypes fromValue(String v) {
        for (RelayEnbPnpHardwareTypes c: RelayEnbPnpHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
