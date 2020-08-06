
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TunnelTearDownPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TunnelTearDownPolicy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Passive"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TunnelTearDownPolicy")
@XmlEnum
public enum TunnelTearDownPolicy {

    @XmlEnumValue("Passive")
    PASSIVE("Passive"),
    @XmlEnumValue("Active")
    ACTIVE("Active");
    private final String value;

    TunnelTearDownPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TunnelTearDownPolicy fromValue(String v) {
        for (TunnelTearDownPolicy c: TunnelTearDownPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
