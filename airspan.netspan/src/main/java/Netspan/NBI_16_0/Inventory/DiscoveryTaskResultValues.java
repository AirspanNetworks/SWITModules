
package Netspan.NBI_16_0.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryTaskResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscoveryTaskResultValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="DiscoveryTaskNotFound"/>
 *     &lt;enumeration value="DiscoveryTaskError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscoveryTaskResultValues")
@XmlEnum
public enum DiscoveryTaskResultValues {

    OK("OK"),
    @XmlEnumValue("DiscoveryTaskNotFound")
    DISCOVERY_TASK_NOT_FOUND("DiscoveryTaskNotFound"),
    @XmlEnumValue("DiscoveryTaskError")
    DISCOVERY_TASK_ERROR("DiscoveryTaskError");
    private final String value;

    DiscoveryTaskResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscoveryTaskResultValues fromValue(String v) {
        for (DiscoveryTaskResultValues c: DiscoveryTaskResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
