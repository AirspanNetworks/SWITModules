
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventHandlingModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventHandlingModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventHandlingModes")
@XmlEnum
public enum EventHandlingModes {

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    EventHandlingModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventHandlingModes fromValue(String v) {
        for (EventHandlingModes c: EventHandlingModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
