
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PciConflictHandlingValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PciConflictHandlingValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Immediate"/&gt;
 *     &lt;enumeration value="Deferred"/&gt;
 *     &lt;enumeration value="Alarm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PciConflictHandlingValues")
@XmlEnum
public enum PciConflictHandlingValues {

    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),
    @XmlEnumValue("Deferred")
    DEFERRED("Deferred"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm");
    private final String value;

    PciConflictHandlingValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PciConflictHandlingValues fromValue(String v) {
        for (PciConflictHandlingValues c: PciConflictHandlingValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
