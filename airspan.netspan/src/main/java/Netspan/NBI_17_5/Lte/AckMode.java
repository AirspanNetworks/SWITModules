
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AckMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AckMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnacknowledgeMode"/&gt;
 *     &lt;enumeration value="AcknowledgeMode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
