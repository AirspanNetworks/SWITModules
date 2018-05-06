
package Netspan.NBI_15_5.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwImageResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwImageResultValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="SwImageNotFound"/>
 *     &lt;enumeration value="SwImageError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
