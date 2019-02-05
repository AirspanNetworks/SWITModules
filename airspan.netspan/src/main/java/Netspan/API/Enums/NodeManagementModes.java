
package Netspan.API.Enums;

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
public enum NodeManagementModes {

    @XmlEnumValue("Unmanaged")
    UNMANAGED("Unmanaged"),
    @XmlEnumValue("Managed")
    MANAGED("Managed"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    NodeManagementModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeManagementModes fromValue(String v) {
        for (NodeManagementModes c: NodeManagementModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
