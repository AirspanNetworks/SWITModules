
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrapType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ConfigChange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrapType")
@XmlEnum
public enum TrapType {

    @XmlEnumValue("ConfigChange")
    CONFIG_CHANGE("ConfigChange");
    private final String value;

    TrapType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrapType fromValue(String v) {
        for (TrapType c: TrapType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
