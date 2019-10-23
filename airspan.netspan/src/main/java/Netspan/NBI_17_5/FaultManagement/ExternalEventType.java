
package Netspan.NBI_17_5.FaultManagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HardwareSwapExternal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalEventType")
@XmlEnum
public enum ExternalEventType {

    @XmlEnumValue("HardwareSwapExternal")
    HARDWARE_SWAP_EXTERNAL("HardwareSwapExternal");
    private final String value;

    ExternalEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalEventType fromValue(String v) {
        for (ExternalEventType c: ExternalEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
