
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSources.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockSources"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GNSS"/&gt;
 *     &lt;enumeration value="IEEE1588"/&gt;
 *     &lt;enumeration value="NLM"/&gt;
 *     &lt;enumeration value="GPON"/&gt;
 *     &lt;enumeration value="Relay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClockSources")
@XmlEnum
public enum ClockSources {

    GNSS("GNSS"),
    @XmlEnumValue("IEEE1588")
    IEEE_1588("IEEE1588"),
    NLM("NLM"),
    GPON("GPON"),
    @XmlEnumValue("Relay")
    RELAY("Relay");
    private final String value;

    ClockSources(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockSources fromValue(String v) {
        for (ClockSources c: ClockSources.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
