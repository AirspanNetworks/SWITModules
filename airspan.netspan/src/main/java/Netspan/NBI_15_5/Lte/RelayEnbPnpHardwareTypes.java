
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayEnbPnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayEnbPnpHardwareTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirDensity386"/>
 *     &lt;enumeration value="AirDensity420"/>
 *     &lt;enumeration value="AirSpeed1000"/>
 *     &lt;enumeration value="AirSpeed1200"/>
 *     &lt;enumeration value="AirUnity420"/>
 *     &lt;enumeration value="AirUnity540"/>
 *     &lt;enumeration value="AirUnity544"/>
 *     &lt;enumeration value="AirUnity545"/>
 *     &lt;enumeration value="AirUnity546"/>
 *     &lt;enumeration value="AirUnity586"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelayEnbPnpHardwareTypes")
@XmlEnum
public enum RelayEnbPnpHardwareTypes {

    @XmlEnumValue("AirDensity386")
    AIR_DENSITY_386("AirDensity386"),
    @XmlEnumValue("AirDensity420")
    AIR_DENSITY_420("AirDensity420"),
    @XmlEnumValue("AirSpeed1000")
    AIR_SPEED_1000("AirSpeed1000"),
    @XmlEnumValue("AirSpeed1200")
    AIR_SPEED_1200("AirSpeed1200"),
    @XmlEnumValue("AirUnity420")
    AIR_UNITY_420("AirUnity420"),
    @XmlEnumValue("AirUnity540")
    AIR_UNITY_540("AirUnity540"),
    @XmlEnumValue("AirUnity544")
    AIR_UNITY_544("AirUnity544"),
    @XmlEnumValue("AirUnity545")
    AIR_UNITY_545("AirUnity545"),
    @XmlEnumValue("AirUnity546")
    AIR_UNITY_546("AirUnity546"),
    @XmlEnumValue("AirUnity586")
    AIR_UNITY_586("AirUnity586");
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
