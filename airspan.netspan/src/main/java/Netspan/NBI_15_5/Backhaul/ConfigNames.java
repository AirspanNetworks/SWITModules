
package Netspan.NBI_15_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Low Interference Mode"/>
 *     &lt;enumeration value="Factory Mode"/>
 *     &lt;enumeration value="Optimised Mode A"/>
 *     &lt;enumeration value="Optimised Mode B"/>
 *     &lt;enumeration value="Optimised Mode C"/>
 *     &lt;enumeration value="Robust Mode"/>
 *     &lt;enumeration value="Commissioned Configuration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConfigNames")
@XmlEnum
public enum ConfigNames {

    @XmlEnumValue("Low Interference Mode")
    LOW_INTERFERENCE_MODE("Low Interference Mode"),
    @XmlEnumValue("Factory Mode")
    FACTORY_MODE("Factory Mode"),
    @XmlEnumValue("Optimised Mode A")
    OPTIMISED_MODE_A("Optimised Mode A"),
    @XmlEnumValue("Optimised Mode B")
    OPTIMISED_MODE_B("Optimised Mode B"),
    @XmlEnumValue("Optimised Mode C")
    OPTIMISED_MODE_C("Optimised Mode C"),
    @XmlEnumValue("Robust Mode")
    ROBUST_MODE("Robust Mode"),
    @XmlEnumValue("Commissioned Configuration")
    COMMISSIONED_CONFIGURATION("Commissioned Configuration");
    private final String value;

    ConfigNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigNames fromValue(String v) {
        for (ConfigNames c: ConfigNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
