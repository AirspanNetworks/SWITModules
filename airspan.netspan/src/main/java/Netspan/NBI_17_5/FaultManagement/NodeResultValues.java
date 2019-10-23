
package Netspan.NBI_17_5.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="NodeNotFound"/&gt;
 *     &lt;enumeration value="NodeError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeResultValues")
@XmlEnum
public enum NodeResultValues {

    OK("OK"),
    @XmlEnumValue("NodeNotFound")
    NODE_NOT_FOUND("NodeNotFound"),
    @XmlEnumValue("NodeError")
    NODE_ERROR("NodeError");
    private final String value;

    NodeResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeResultValues fromValue(String v) {
        for (NodeResultValues c: NodeResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
