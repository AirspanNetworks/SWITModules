
package Netspan.NBI_14_50.API.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteResultValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="SiteNotFound"/>
 *     &lt;enumeration value="SiteError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteResultValues")
@XmlEnum
public enum SiteResultValues {

    OK("OK"),
    @XmlEnumValue("SiteNotFound")
    SITE_NOT_FOUND("SiteNotFound"),
    @XmlEnumValue("SiteError")
    SITE_ERROR("SiteError");
    private final String value;

    SiteResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteResultValues fromValue(String v) {
        for (SiteResultValues c: SiteResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
