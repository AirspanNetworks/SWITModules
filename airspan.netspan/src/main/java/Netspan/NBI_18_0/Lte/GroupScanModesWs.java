
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupScanModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupScanModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SingleGroupBand"/&gt;
 *     &lt;enumeration value="AllBands"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupScanModesWs")
@XmlEnum
public enum GroupScanModesWs {

    @XmlEnumValue("SingleGroupBand")
    SINGLE_GROUP_BAND("SingleGroupBand"),
    @XmlEnumValue("AllBands")
    ALL_BANDS("AllBands");
    private final String value;

    GroupScanModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupScanModesWs fromValue(String v) {
        for (GroupScanModesWs c: GroupScanModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
