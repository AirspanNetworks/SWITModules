
package Netspan.NBI_16_5.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwImageResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwImageResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="SwImageNotFound"/&gt;
 *     &lt;enumeration value="SwImageError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SwImageResultValues")
@XmlEnum
public enum SwImageResultValues {

    OK("OK"),
    @XmlEnumValue("SwImageNotFound")
    SW_IMAGE_NOT_FOUND("SwImageNotFound"),
    @XmlEnumValue("SwImageError")
    SW_IMAGE_ERROR("SwImageError");
    private final String value;

    SwImageResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwImageResultValues fromValue(String v) {
        for (SwImageResultValues c: SwImageResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
