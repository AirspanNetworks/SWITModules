
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivationModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Signaling"/&gt;
 *     &lt;enumeration value="Management"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActivationModesWs")
@XmlEnum
public enum ActivationModesWs {

    @XmlEnumValue("Signaling")
    SIGNALING("Signaling"),
    @XmlEnumValue("Management")
    MANAGEMENT("Management");
    private final String value;

    ActivationModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivationModesWs fromValue(String v) {
        for (ActivationModesWs c: ActivationModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
