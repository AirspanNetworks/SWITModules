
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lte3rdPartyResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Lte3rdPartyResultValues"&gt;
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
@XmlType(name = "Lte3rdPartyResultValues")
@XmlEnum
public enum Lte3RdPartyResultValues {

    OK("OK"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    Lte3RdPartyResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Lte3RdPartyResultValues fromValue(String v) {
        for (Lte3RdPartyResultValues c: Lte3RdPartyResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
