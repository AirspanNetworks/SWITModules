
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlmnGlobalConfigResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlmnGlobalConfigResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="MccMncNotFound"/&gt;
 *     &lt;enumeration value="ValidationError"/&gt;
 *     &lt;enumeration value="InvalidParameters"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlmnGlobalConfigResultValues")
@XmlEnum
public enum PlmnGlobalConfigResultValues {

    OK("OK"),
    @XmlEnumValue("MccMncNotFound")
    MCC_MNC_NOT_FOUND("MccMncNotFound"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError"),
    @XmlEnumValue("InvalidParameters")
    INVALID_PARAMETERS("InvalidParameters"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    PlmnGlobalConfigResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlmnGlobalConfigResultValues fromValue(String v) {
        for (PlmnGlobalConfigResultValues c: PlmnGlobalConfigResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
