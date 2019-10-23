
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P1PdclUsed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="P1PdclUsed"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="DonorNotP1InPdcl"/&gt;
 *     &lt;enumeration value="DonorIsP1InPdcl"/&gt;
 *     &lt;enumeration value="PdclNotConfigured"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "P1PdclUsed")
@XmlEnum
public enum P1PdclUsed {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DonorNotP1InPdcl")
    DONOR_NOT_P_1_IN_PDCL("DonorNotP1InPdcl"),
    @XmlEnumValue("DonorIsP1InPdcl")
    DONOR_IS_P_1_IN_PDCL("DonorIsP1InPdcl"),
    @XmlEnumValue("PdclNotConfigured")
    PDCL_NOT_CONFIGURED("PdclNotConfigured");
    private final String value;

    P1PdclUsed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static P1PdclUsed fromValue(String v) {
        for (P1PdclUsed c: P1PdclUsed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
