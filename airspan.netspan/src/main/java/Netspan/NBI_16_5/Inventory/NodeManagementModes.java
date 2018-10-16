
package Netspan.NBI_16_5.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeManagementModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeManagementModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unmanaged"/&gt;
 *     &lt;enumeration value="Managed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeManagementModes")
@XmlEnum
public enum NodeManagementModes {

    @XmlEnumValue("Unmanaged")
    UNMANAGED("Unmanaged"),
    @XmlEnumValue("Managed")
    MANAGED("Managed");
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
