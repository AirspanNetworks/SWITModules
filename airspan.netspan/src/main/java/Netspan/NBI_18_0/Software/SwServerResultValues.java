
package Netspan.NBI_18_0.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwServerResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwServerResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="SwServerNotFound"/&gt;
 *     &lt;enumeration value="SwServerError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SwServerResultValues")
@XmlEnum
public enum SwServerResultValues {

    OK("OK"),
    @XmlEnumValue("SwServerNotFound")
    SW_SERVER_NOT_FOUND("SwServerNotFound"),
    @XmlEnumValue("SwServerError")
    SW_SERVER_ERROR("SwServerError");
    private final String value;

    SwServerResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwServerResultValues fromValue(String v) {
        for (SwServerResultValues c: SwServerResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
