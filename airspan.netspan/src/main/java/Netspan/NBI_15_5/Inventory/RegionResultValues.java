
package Netspan.NBI_15_5.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionResultValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="RegionNotFound"/>
 *     &lt;enumeration value="RegionError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
