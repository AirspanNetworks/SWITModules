
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoLTEPeriodicity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoLTEPeriodicity"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="P10"/&gt;
 *     &lt;enumeration value="P20"/&gt;
 *     &lt;enumeration value="P30"/&gt;
 *     &lt;enumeration value="P40"/&gt;
 *     &lt;enumeration value="P50"/&gt;
 *     &lt;enumeration value="P60"/&gt;
 *     &lt;enumeration value="P70"/&gt;
 *     &lt;enumeration value="P80"/&gt;
 *     &lt;enumeration value="P90"/&gt;
 *     &lt;enumeration value="P100"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoLTEPeriodicity")
@XmlEnum
public enum VoLTEPeriodicity {

    @XmlEnumValue("P10")
    P_10("P10"),
    @XmlEnumValue("P20")
    P_20("P20"),
    @XmlEnumValue("P30")
    P_30("P30"),
    @XmlEnumValue("P40")
    P_40("P40"),
    @XmlEnumValue("P50")
    P_50("P50"),
    @XmlEnumValue("P60")
    P_60("P60"),
    @XmlEnumValue("P70")
    P_70("P70"),
    @XmlEnumValue("P80")
    P_80("P80"),
    @XmlEnumValue("P90")
    P_90("P90"),
    @XmlEnumValue("P100")
    P_100("P100");
    private final String value;

    VoLTEPeriodicity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoLTEPeriodicity fromValue(String v) {
        for (VoLTEPeriodicity c: VoLTEPeriodicity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
