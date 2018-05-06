
package Netspan.NBI_15_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NotAuthorized"/>
 *     &lt;enumeration value="NotLicensed"/>
 *     &lt;enumeration value="InvalidParameters"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCodes")
@XmlEnum
public enum ErrorCodes {

    OK("OK"),
    @XmlEnumValue("NotAuthorized")
    NOT_AUTHORIZED("NotAuthorized"),
    @XmlEnumValue("NotLicensed")
    NOT_LICENSED("NotLicensed"),
    @XmlEnumValue("InvalidParameters")
    INVALID_PARAMETERS("InvalidParameters"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    ErrorCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCodes fromValue(String v) {
        for (ErrorCodes c: ErrorCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
