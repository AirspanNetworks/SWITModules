
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnityPnpHardwareTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnityPnpHardwareTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirUnity420"/>
 *     &lt;enumeration value="AirUnity540"/>
 *     &lt;enumeration value="AirUnity545"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnityPnpHardwareTypes")
@XmlEnum
public enum UnityPnpHardwareTypes {

    @XmlEnumValue("AirUnity420")
    AIR_UNITY_420("AirUnity420"),
    @XmlEnumValue("AirUnity540")
    AIR_UNITY_540("AirUnity540"),
    @XmlEnumValue("AirUnity545")
    AIR_UNITY_545("AirUnity545");
    private final String value;

    UnityPnpHardwareTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnityPnpHardwareTypes fromValue(String v) {
        for (UnityPnpHardwareTypes c: UnityPnpHardwareTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
