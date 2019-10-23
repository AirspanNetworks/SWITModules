
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanStatesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScanStatesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LockedPCI"/&gt;
 *     &lt;enumeration value="ValidPCI"/&gt;
 *     &lt;enumeration value="CriteriaMatchFailed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScanStatesWs")
@XmlEnum
public enum ScanStatesWs {

    @XmlEnumValue("LockedPCI")
    LOCKED_PCI("LockedPCI"),
    @XmlEnumValue("ValidPCI")
    VALID_PCI("ValidPCI"),
    @XmlEnumValue("CriteriaMatchFailed")
    CRITERIA_MATCH_FAILED("CriteriaMatchFailed");
    private final String value;

    ScanStatesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScanStatesWs fromValue(String v) {
        for (ScanStatesWs c: ScanStatesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
