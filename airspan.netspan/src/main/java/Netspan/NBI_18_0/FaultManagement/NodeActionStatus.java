
package Netspan.NBI_18_0.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeActionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeActionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Clear"/&gt;
 *     &lt;enumeration value="Raise"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeActionStatus")
@XmlEnum
public enum NodeActionStatus {

    @XmlEnumValue("Clear")
    CLEAR("Clear"),
    @XmlEnumValue("Raise")
    RAISE("Raise");
    private final String value;

    NodeActionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeActionStatus fromValue(String v) {
        for (NodeActionStatus c: NodeActionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
