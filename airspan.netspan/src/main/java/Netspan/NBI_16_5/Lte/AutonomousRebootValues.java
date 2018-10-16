
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutonomousRebootValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutonomousRebootValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Immediate"/&gt;
 *     &lt;enumeration value="MaintenanceWindow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutonomousRebootValues")
@XmlEnum
public enum AutonomousRebootValues {

    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),
    @XmlEnumValue("MaintenanceWindow")
    MAINTENANCE_WINDOW("MaintenanceWindow");
    private final String value;

    AutonomousRebootValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutonomousRebootValues fromValue(String v) {
        for (AutonomousRebootValues c: AutonomousRebootValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
