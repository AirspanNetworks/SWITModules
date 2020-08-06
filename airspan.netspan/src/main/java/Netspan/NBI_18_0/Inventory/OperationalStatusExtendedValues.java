
package Netspan.NBI_18_0.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalStatusExtendedValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalStatusExtendedValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="InService"/&gt;
 *     &lt;enumeration value="OutOfService"/&gt;
 *     &lt;enumeration value="Maintenance"/&gt;
 *     &lt;enumeration value="OutOfServiceGraceful"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationalStatusExtendedValues")
@XmlEnum
public enum OperationalStatusExtendedValues {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService"),
    @XmlEnumValue("Maintenance")
    MAINTENANCE("Maintenance"),
    @XmlEnumValue("OutOfServiceGraceful")
    OUT_OF_SERVICE_GRACEFUL("OutOfServiceGraceful");
    private final String value;

    OperationalStatusExtendedValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationalStatusExtendedValues fromValue(String v) {
        for (OperationalStatusExtendedValues c: OperationalStatusExtendedValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
