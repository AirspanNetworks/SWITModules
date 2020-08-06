
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceTypeWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceTypeWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Designated"/&gt;
 *     &lt;enumeration value="GPS"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SourceTypeWs")
@XmlEnum
public enum SourceTypeWs {

    @XmlEnumValue("Designated")
    DESIGNATED("Designated"),
    GPS("GPS"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    SourceTypeWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceTypeWs fromValue(String v) {
        for (SourceTypeWs c: SourceTypeWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
