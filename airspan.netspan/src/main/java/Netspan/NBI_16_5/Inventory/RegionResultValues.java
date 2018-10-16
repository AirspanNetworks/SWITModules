
package Netspan.NBI_16_5.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="RegionNotFound"/&gt;
 *     &lt;enumeration value="RegionError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegionResultValues")
@XmlEnum
public enum RegionResultValues {

    OK("OK"),
    @XmlEnumValue("RegionNotFound")
    REGION_NOT_FOUND("RegionNotFound"),
    @XmlEnumValue("RegionError")
    REGION_ERROR("RegionError");
    private final String value;

    RegionResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionResultValues fromValue(String v) {
        for (RegionResultValues c: RegionResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
