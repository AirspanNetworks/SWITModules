
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FtClockSourceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FtClockSourceTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReceivedChannel"/&gt;
 *     &lt;enumeration value="Gps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FtClockSourceTypes")
@XmlEnum
public enum FtClockSourceTypes {

    @XmlEnumValue("ReceivedChannel")
    RECEIVED_CHANNEL("ReceivedChannel"),
    @XmlEnumValue("Gps")
    GPS("Gps");
    private final String value;

    FtClockSourceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FtClockSourceTypes fromValue(String v) {
        for (FtClockSourceTypes c: FtClockSourceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
