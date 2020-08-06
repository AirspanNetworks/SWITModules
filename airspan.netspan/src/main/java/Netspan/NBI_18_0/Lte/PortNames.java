
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ETH"/&gt;
 *     &lt;enumeration value="ETH1"/&gt;
 *     &lt;enumeration value="ETH2"/&gt;
 *     &lt;enumeration value="OPT"/&gt;
 *     &lt;enumeration value="OPT1"/&gt;
 *     &lt;enumeration value="OPT2"/&gt;
 *     &lt;enumeration value="SFP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PortNames")
@XmlEnum
public enum PortNames {

    ETH("ETH"),
    @XmlEnumValue("ETH1")
    ETH_1("ETH1"),
    @XmlEnumValue("ETH2")
    ETH_2("ETH2"),
    OPT("OPT"),
    @XmlEnumValue("OPT1")
    OPT_1("OPT1"),
    @XmlEnumValue("OPT2")
    OPT_2("OPT2"),
    SFP("SFP");
    private final String value;

    PortNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PortNames fromValue(String v) {
        for (PortNames c: PortNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
