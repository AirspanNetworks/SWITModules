
package Netspan.NBI_15_2.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CtsResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CtsResultValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="CtsNotFound"/>
 *     &lt;enumeration value="ValidationError"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CtsResultValues")
@XmlEnum
public enum CtsResultValues {

    OK("OK"),
    @XmlEnumValue("CtsNotFound")
    CTS_NOT_FOUND("CtsNotFound"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    CtsResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CtsResultValues fromValue(String v) {
        for (CtsResultValues c: CtsResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
