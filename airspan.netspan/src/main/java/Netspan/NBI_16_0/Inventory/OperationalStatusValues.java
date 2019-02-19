
package Netspan.NBI_16_0.Inventory;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalStatusValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalStatusValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="InService"/&gt;
 *     &lt;enumeration value="OutOfService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationalStatusValues")
@XmlEnum
public enum OperationalStatusValues {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService");
    private final String value;

    OperationalStatusValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationalStatusValues fromValue(String v) {
        for (OperationalStatusValues c: OperationalStatusValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
