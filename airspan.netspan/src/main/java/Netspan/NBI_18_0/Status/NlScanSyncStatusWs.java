
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NlScanSyncStatusWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NlScanSyncStatusWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Synchronous"/&gt;
 *     &lt;enumeration value="Asynchronous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NlScanSyncStatusWs")
@XmlEnum
public enum NlScanSyncStatusWs {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Synchronous")
    SYNCHRONOUS("Synchronous"),
    @XmlEnumValue("Asynchronous")
    ASYNCHRONOUS("Asynchronous");
    private final String value;

    NlScanSyncStatusWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NlScanSyncStatusWs fromValue(String v) {
        for (NlScanSyncStatusWs c: NlScanSyncStatusWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
