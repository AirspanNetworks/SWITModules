
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanStartStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScanStartStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Started"/>
 *     &lt;enumeration value="Completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScanStartStatus")
@XmlEnum
public enum ScanStartStatus {

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
