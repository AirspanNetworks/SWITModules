
package Netspan.NBI_15_2.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryTaskResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscoveryTaskResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="DiscoveryTaskNotFound"/&gt;
 *     &lt;enumeration value="DiscoveryTaskError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
