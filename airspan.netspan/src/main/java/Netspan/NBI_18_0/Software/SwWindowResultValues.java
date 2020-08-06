
package Netspan.NBI_18_0.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwWindowResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwWindowResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="SwWindowNotFound"/&gt;
 *     &lt;enumeration value="SwWindowError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SwWindowResultValues")
@XmlEnum
public enum SwWindowResultValues {

    OK("OK"),
    @XmlEnumValue("SwWindowNotFound")
    SW_WINDOW_NOT_FOUND("SwWindowNotFound"),
    @XmlEnumValue("SwWindowError")
    SW_WINDOW_ERROR("SwWindowError");
    private final String value;

    SwWindowResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwWindowResultValues fromValue(String v) {
        for (SwWindowResultValues c: SwWindowResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
