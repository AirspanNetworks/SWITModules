
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutonomousRebootValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutonomousRebootValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Immediate"/>
 *     &lt;enumeration value="MaintenanceWindow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
