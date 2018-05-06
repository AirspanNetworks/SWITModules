
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalStatuses.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalStatuses">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Up"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Testing"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Dormant"/>
 *     &lt;enumeration value="NotPresent"/>
 *     &lt;enumeration value="LowerLayerDown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
