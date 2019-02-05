
package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityProfileOptionalOrMandatory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityProfileOptionalOrMandatory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Optional"/&gt;
 *     &lt;enumeration value="Mandatory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityProfileOptionalOrMandatory")
@XmlEnum
public enum SecurityProfileOptionalOrMandatory {

    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Mandatory")
    MANDATORY("Mandatory");
    private final String value;

    SecurityProfileOptionalOrMandatory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityProfileOptionalOrMandatory fromValue(String v) {
        for (SecurityProfileOptionalOrMandatory c: SecurityProfileOptionalOrMandatory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
