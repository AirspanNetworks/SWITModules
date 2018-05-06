
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EthernetRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EthernetRateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Rate10Mb"/>
 *     &lt;enumeration value="Rate100Mb"/>
 *     &lt;enumeration value="Rate1000Mb"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EthernetRateType")
@XmlEnum
public enum EthernetRateType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Rate10Mb")
    RATE_10_MB("Rate10Mb"),
    @XmlEnumValue("Rate100Mb")
    RATE_100_MB("Rate100Mb"),
    @XmlEnumValue("Rate1000Mb")
    RATE_1000_MB("Rate1000Mb");
    private final String value;

    EthernetRateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EthernetRateType fromValue(String v) {
        for (EthernetRateType c: EthernetRateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
