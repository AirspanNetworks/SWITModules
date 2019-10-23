
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutonomousRescanModeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutonomousRescanModeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Immediate"/&gt;
 *     &lt;enumeration value="MaintenanceWindow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutonomousRescanModeValues")
@XmlEnum
public enum AutonomousRescanModeValues {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),
    @XmlEnumValue("MaintenanceWindow")
    MAINTENANCE_WINDOW("MaintenanceWindow");
    private final String value;

    AutonomousRescanModeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutonomousRescanModeValues fromValue(String v) {
        for (AutonomousRescanModeValues c: AutonomousRescanModeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
