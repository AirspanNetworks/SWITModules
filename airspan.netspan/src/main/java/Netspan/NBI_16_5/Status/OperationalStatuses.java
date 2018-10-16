
package Netspan.NBI_16_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalStatuses.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalStatuses"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Up"/&gt;
 *     &lt;enumeration value="Down"/&gt;
 *     &lt;enumeration value="Testing"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Dormant"/&gt;
 *     &lt;enumeration value="NotPresent"/&gt;
 *     &lt;enumeration value="LowerLayerDown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationalStatuses")
@XmlEnum
public enum OperationalStatuses {

    @XmlEnumValue("Up")
    UP("Up"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Testing")
    TESTING("Testing"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Dormant")
    DORMANT("Dormant"),
    @XmlEnumValue("NotPresent")
    NOT_PRESENT("NotPresent"),
    @XmlEnumValue("LowerLayerDown")
    LOWER_LAYER_DOWN("LowerLayerDown");
    private final String value;

    OperationalStatuses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationalStatuses fromValue(String v) {
        for (OperationalStatuses c: OperationalStatuses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
