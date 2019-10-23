
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanSyncStatusWS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScanSyncStatusWS"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Synchronous"/&gt;
 *     &lt;enumeration value="Asynchronous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScanSyncStatusWS")
@XmlEnum
public enum ScanSyncStatusWS {

    @XmlEnumValue("Synchronous")
    SYNCHRONOUS("Synchronous"),
    @XmlEnumValue("Asynchronous")
    ASYNCHRONOUS("Asynchronous");
    private final String value;

    ScanSyncStatusWS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScanSyncStatusWS fromValue(String v) {
        for (ScanSyncStatusWS c: ScanSyncStatusWS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
