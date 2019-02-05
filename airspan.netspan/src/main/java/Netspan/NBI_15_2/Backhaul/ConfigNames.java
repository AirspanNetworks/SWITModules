
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Low Interference Mode"/&gt;
 *     &lt;enumeration value="Factory Mode"/&gt;
 *     &lt;enumeration value="Optimized Mode A"/&gt;
 *     &lt;enumeration value="Optimized Mode B"/&gt;
 *     &lt;enumeration value="Optimized Mode C"/&gt;
 *     &lt;enumeration value="Robust Mode"/&gt;
 *     &lt;enumeration value="Commissioned Configuration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
    @XmlEnumValue("Optimized Mode A")
    OPTIMIZED_MODE_A("Optimized Mode A"),
    @XmlEnumValue("Optimized Mode B")
    OPTIMIZED_MODE_B("Optimized Mode B"),
    @XmlEnumValue("Optimized Mode C")
    OPTIMIZED_MODE_C("Optimized Mode C"),
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
