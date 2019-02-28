
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbSyncStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnbSyncStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Init"/&gt;
 *     &lt;enumeration value="Locked"/&gt;
 *     &lt;enumeration value="Holdover"/&gt;
 *     &lt;enumeration value="HoldoverExpired"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnbSyncStatus")
@XmlEnum
public enum EnbSyncStatus {

    @XmlEnumValue("Init")
    INIT("Init"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Holdover")
    HOLDOVER("Holdover"),
    @XmlEnumValue("HoldoverExpired")
    HOLDOVER_EXPIRED("HoldoverExpired"),
    NA("NA");
    private final String value;

    EnbSyncStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnbSyncStatus fromValue(String v) {
        for (EnbSyncStatus c: EnbSyncStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
