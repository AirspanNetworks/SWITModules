
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DpdActions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DpdActions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Clear"/&gt;
 *     &lt;enumeration value="Hold"/&gt;
 *     &lt;enumeration value="Restart"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DpdActions")
@XmlEnum
public enum DpdActions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Clear")
    CLEAR("Clear"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Restart")
    RESTART("Restart");
    private final String value;

    DpdActions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DpdActions fromValue(String v) {
        for (DpdActions c: DpdActions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
