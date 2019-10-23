
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtpOverPublicInternetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PtpOverPublicInternetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RegularDeployment"/&gt;
 *     &lt;enumeration value="PublicInternetBH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PtpOverPublicInternetType")
@XmlEnum
public enum PtpOverPublicInternetType {

    @XmlEnumValue("RegularDeployment")
    REGULAR_DEPLOYMENT("RegularDeployment"),
    @XmlEnumValue("PublicInternetBH")
    PUBLIC_INTERNET_BH("PublicInternetBH");
    private final String value;

    PtpOverPublicInternetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PtpOverPublicInternetType fromValue(String v) {
        for (PtpOverPublicInternetType c: PtpOverPublicInternetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
