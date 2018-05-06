
package Netspan.NBI_14_0.API.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeManagementModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeManagementModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unmanaged"/>
 *     &lt;enumeration value="Managed"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NodeManagementModeType")
@XmlEnum
public enum NodeManagementModeType {

    @XmlEnumValue("Unmanaged")
    UNMANAGED("Unmanaged"),
    @XmlEnumValue("Managed")
    MANAGED("Managed"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    NodeManagementModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeManagementModeType fromValue(String v) {
        for (NodeManagementModeType c: NodeManagementModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
