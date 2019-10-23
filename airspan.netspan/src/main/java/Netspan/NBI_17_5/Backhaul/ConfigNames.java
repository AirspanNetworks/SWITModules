
package Netspan.NBI_17_5.Backhaul;

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
 *     &lt;enumeration value="LowInterferenceMode"/&gt;
 *     &lt;enumeration value="FactoryMode"/&gt;
 *     &lt;enumeration value="OptimizedModeA"/&gt;
 *     &lt;enumeration value="OptimizedModeB"/&gt;
 *     &lt;enumeration value="OptimizedModeC"/&gt;
 *     &lt;enumeration value="RobustMode"/&gt;
 *     &lt;enumeration value="CommissionedConfiguration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigNames")
@XmlEnum
public enum ConfigNames {

    @XmlEnumValue("LowInterferenceMode")
    LOW_INTERFERENCE_MODE("LowInterferenceMode"),
    @XmlEnumValue("FactoryMode")
    FACTORY_MODE("FactoryMode"),
    @XmlEnumValue("OptimizedModeA")
    OPTIMIZED_MODE_A("OptimizedModeA"),
    @XmlEnumValue("OptimizedModeB")
    OPTIMIZED_MODE_B("OptimizedModeB"),
    @XmlEnumValue("OptimizedModeC")
    OPTIMIZED_MODE_C("OptimizedModeC"),
    @XmlEnumValue("RobustMode")
    ROBUST_MODE("RobustMode"),
    @XmlEnumValue("CommissionedConfiguration")
    COMMISSIONED_CONFIGURATION("CommissionedConfiguration");
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
