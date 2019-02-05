
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P1CdclUsed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="P1CdclUsed"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="DonorNotP1InCdcl"/&gt;
 *     &lt;enumeration value="DonorIsP1InCdcl"/&gt;
 *     &lt;enumeration value="DonorNotConfigured"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "P1CdclUsed")
@XmlEnum
public enum P1CdclUsed {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DonorNotP1InCdcl")
    DONOR_NOT_P_1_IN_CDCL("DonorNotP1InCdcl"),
    @XmlEnumValue("DonorIsP1InCdcl")
    DONOR_IS_P_1_IN_CDCL("DonorIsP1InCdcl"),
    @XmlEnumValue("DonorNotConfigured")
    DONOR_NOT_CONFIGURED("DonorNotConfigured");
    private final String value;

    P1CdclUsed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static P1CdclUsed fromValue(String v) {
        for (P1CdclUsed c: P1CdclUsed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
