
package Netspan.NBI_18_0.Backhaul;

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
 *     &lt;enumeration value="LowInterferenceMode"/&gt;
 *     &lt;enumeration value="FactoryMode"/&gt;
 *     &lt;enumeration value="OptimisedModeA"/&gt;
 *     &lt;enumeration value="OptimisedModeB"/&gt;
 *     &lt;enumeration value="OptimisedModeC"/&gt;
 *     &lt;enumeration value="RobustMode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigNamesSet")
@XmlEnum
public enum ConfigNamesSet {

    @XmlEnumValue("LowInterferenceMode")
    LOW_INTERFERENCE_MODE("LowInterferenceMode"),
    @XmlEnumValue("FactoryMode")
    FACTORY_MODE("FactoryMode"),
    @XmlEnumValue("OptimisedModeA")
    OPTIMISED_MODE_A("OptimisedModeA"),
    @XmlEnumValue("OptimisedModeB")
    OPTIMISED_MODE_B("OptimisedModeB"),
    @XmlEnumValue("OptimisedModeC")
    OPTIMISED_MODE_C("OptimisedModeC"),
    @XmlEnumValue("RobustMode")
    ROBUST_MODE("RobustMode");
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
