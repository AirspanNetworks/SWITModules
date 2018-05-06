
package Netspan.NBI_15_1.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkElementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EPC"/>
 *     &lt;enumeration value="Third Party Servers"/>
 *     &lt;enumeration value="eMBMS"/>
 *     &lt;enumeration value="IPsec"/>
 *     &lt;enumeration value="Neighbours"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkElementType")
@XmlEnum
public enum NetworkElementType {

    EPC("EPC"),
    @XmlEnumValue("Third Party Servers")
    THIRD_PARTY_SERVERS("Third Party Servers"),
    @XmlEnumValue("eMBMS")
    E_MBMS("eMBMS"),
    @XmlEnumValue("IPsec")
    I_PSEC("IPsec"),
    @XmlEnumValue("Neighbours")
    NEIGHBOURS("Neighbours");
    private final String value;

    NetworkElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkElementType fromValue(String v) {
        for (NetworkElementType c: NetworkElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
