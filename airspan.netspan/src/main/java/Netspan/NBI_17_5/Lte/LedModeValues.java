
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LedModeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LedModeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="DuringStartup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LedModeValues")
@XmlEnum
public enum LedModeValues {

    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("DuringStartup")
    DURING_STARTUP("DuringStartup");
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
