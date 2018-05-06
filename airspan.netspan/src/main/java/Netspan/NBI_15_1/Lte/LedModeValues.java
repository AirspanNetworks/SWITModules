
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LedModeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LedModeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="DuringStartup"/>
 *     &lt;enumeration value="Disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LedModeValues")
@XmlEnum
public enum LedModeValues {

    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("DuringStartup")
    DURING_STARTUP("DuringStartup"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    LedModeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LedModeValues fromValue(String v) {
        for (LedModeValues c: LedModeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
