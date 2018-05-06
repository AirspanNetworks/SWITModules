
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceManagementTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceManagementTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="SFR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceManagementTypes")
@XmlEnum
public enum ResourceManagementTypes {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    SFR("SFR");
    private final String value;

    ResourceManagementTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceManagementTypes fromValue(String v) {
        for (ResourceManagementTypes c: ResourceManagementTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
