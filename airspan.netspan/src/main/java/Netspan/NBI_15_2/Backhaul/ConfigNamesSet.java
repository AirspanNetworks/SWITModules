
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigNamesSet.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigNamesSet"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Low Interference Mode"/&gt;
 *     &lt;enumeration value="Factory Mode"/&gt;
 *     &lt;enumeration value="Optimised Mode A"/&gt;
 *     &lt;enumeration value="Optimised Mode B"/&gt;
 *     &lt;enumeration value="Optimised Mode C"/&gt;
 *     &lt;enumeration value="Robust Mode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigNamesSet")
@XmlEnum
public enum ConfigNamesSet {

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
    ROBUST_MODE("Robust Mode");
    private final String value;

    ConfigNamesSet(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigNamesSet fromValue(String v) {
        for (ConfigNamesSet c: ConfigNamesSet.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
