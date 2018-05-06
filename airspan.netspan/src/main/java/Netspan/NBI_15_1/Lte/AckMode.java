
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AckMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AckMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UnacknowledgeMode"/>
 *     &lt;enumeration value="AcknowledgeMode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AckMode")
@XmlEnum
public enum AckMode {

    @XmlEnumValue("UnacknowledgeMode")
    UNACKNOWLEDGE_MODE("UnacknowledgeMode"),
    @XmlEnumValue("AcknowledgeMode")
    ACKNOWLEDGE_MODE("AcknowledgeMode");
    private final String value;

    AckMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckMode fromValue(String v) {
        for (AckMode c: AckMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
