
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimarySyncSourceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimarySyncSourceTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SyncSourceGps"/&gt;
 *     &lt;enumeration value="SyncSourceDonorEnodeB"/&gt;
 *     &lt;enumeration value="SyncSourceInternal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrimarySyncSourceTypes")
@XmlEnum
public enum PrimarySyncSourceTypes {

    @XmlEnumValue("SyncSourceGps")
    SYNC_SOURCE_GPS("SyncSourceGps"),
    @XmlEnumValue("SyncSourceDonorEnodeB")
    SYNC_SOURCE_DONOR_ENODE_B("SyncSourceDonorEnodeB"),
    @XmlEnumValue("SyncSourceInternal")
    SYNC_SOURCE_INTERNAL("SyncSourceInternal");
    private final String value;

    PrimarySyncSourceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimarySyncSourceTypes fromValue(String v) {
        for (PrimarySyncSourceTypes c: PrimarySyncSourceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
