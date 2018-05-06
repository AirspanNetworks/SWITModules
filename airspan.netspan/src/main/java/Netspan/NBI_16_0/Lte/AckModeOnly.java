
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AckModeOnly.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AckModeOnly">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AcknowledgeMode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AckModeOnly")
@XmlEnum
public enum AckModeOnly {

    @XmlEnumValue("AcknowledgeMode")
    ACKNOWLEDGE_MODE("AcknowledgeMode");
    private final String value;

    AckModeOnly(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckModeOnly fromValue(String v) {
        for (AckModeOnly c: AckModeOnly.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
