
package Netspan.NBI_17_0.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Protocols.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Protocols"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="http"/&gt;
 *     &lt;enumeration value="https"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Protocols")
@XmlEnum
public enum Protocols {

    @XmlEnumValue("http")
    HTTP("http"),
    @XmlEnumValue("https")
    HTTPS("https");
    private final String value;

    Protocols(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Protocols fromValue(String v) {
        for (Protocols c: Protocols.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
