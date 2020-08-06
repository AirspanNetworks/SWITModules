
package Netspan.NBI_18_0.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeGroupResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeGroupResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="NodeGroupNotFound"/&gt;
 *     &lt;enumeration value="NodeGroupError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeGroupResultValues")
@XmlEnum
public enum NodeGroupResultValues {

    OK("OK"),
    @XmlEnumValue("NodeGroupNotFound")
    NODE_GROUP_NOT_FOUND("NodeGroupNotFound"),
    @XmlEnumValue("NodeGroupError")
    NODE_GROUP_ERROR("NodeGroupError");
    private final String value;

    NodeGroupResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeGroupResultValues fromValue(String v) {
        for (NodeGroupResultValues c: NodeGroupResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
