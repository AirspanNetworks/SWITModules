
package Netspan.NBI_18_0.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintWindowType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaintWindowType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaintWindowType")
@XmlEnum
public enum MaintWindowType {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    MaintWindowType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaintWindowType fromValue(String v) {
        for (MaintWindowType c: MaintWindowType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
