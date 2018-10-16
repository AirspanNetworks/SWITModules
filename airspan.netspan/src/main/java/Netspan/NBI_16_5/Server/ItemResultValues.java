
package Netspan.NBI_16_5.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="NotFound"/&gt;
 *     &lt;enumeration value="ValidationError"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemResultValues")
@XmlEnum
public enum ItemResultValues {

    OK("OK"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    ItemResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemResultValues fromValue(String v) {
        for (ItemResultValues c: ItemResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
