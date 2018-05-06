
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncProfileGnssModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncProfileGnssModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GPSOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SyncProfileGnssModes")
@XmlEnum
public enum SyncProfileGnssModes {

    @XmlEnumValue("GPSOnly")
    GPS_ONLY("GPSOnly");
    private final String value;

    SyncProfileGnssModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SyncProfileGnssModes fromValue(String v) {
        for (SyncProfileGnssModes c: SyncProfileGnssModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
