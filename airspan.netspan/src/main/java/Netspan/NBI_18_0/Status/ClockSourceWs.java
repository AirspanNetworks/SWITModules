
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSourceWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockSourceWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
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
@XmlType(name = "ClockSourceWs")
@XmlEnum
public enum ClockSourceWs {

    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    GNSS("GNSS"),
    @XmlEnumValue("IEEE1588")
    IEEE_1588("IEEE1588"),
    NLM("NLM"),
    GPON("GPON"),
    @XmlEnumValue("Relay")
    RELAY("Relay");
    private final String value;

    ClockSourceWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockSourceWs fromValue(String v) {
        for (ClockSourceWs c: ClockSourceWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
