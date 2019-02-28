
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CongestionLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CongestionLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Medium"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CongestionLevel")
@XmlEnum
public enum CongestionLevel {

    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    CongestionLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CongestionLevel fromValue(String v) {
        for (CongestionLevel c: CongestionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
