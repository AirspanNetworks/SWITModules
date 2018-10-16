
package Netspan.NBI_16_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanStartStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScanStartStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Started"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScanStartStatus")
@XmlEnum
public enum ScanStartStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Started")
    STARTED("Started"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    ScanStartStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScanStartStatus fromValue(String v) {
        for (ScanStartStatus c: ScanStartStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
