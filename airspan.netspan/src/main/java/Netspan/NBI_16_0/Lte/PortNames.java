
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PortNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ETH"/>
 *     &lt;enumeration value="ETH1"/>
 *     &lt;enumeration value="ETH2"/>
 *     &lt;enumeration value="OPT"/>
 *     &lt;enumeration value="OPT1"/>
 *     &lt;enumeration value="OPT2"/>
 *     &lt;enumeration value="SFP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
