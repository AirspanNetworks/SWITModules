
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutonomousRescanModeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutonomousRescanModeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Immediate"/>
 *     &lt;enumeration value="MaintenanceWindow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
