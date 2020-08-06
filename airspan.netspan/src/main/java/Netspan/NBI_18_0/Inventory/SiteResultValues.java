
package Netspan.NBI_18_0.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="SiteNotFound"/&gt;
 *     &lt;enumeration value="SiteError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
