
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApnShareModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApnShareModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoSharing"/&gt;
 *     &lt;enumeration value="SingleApn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApnShareModesWs")
@XmlEnum
public enum ApnShareModesWs {

    @XmlEnumValue("NoSharing")
    NO_SHARING("NoSharing"),
    @XmlEnumValue("SingleApn")
    SINGLE_APN("SingleApn");
    private final String value;

    ApnShareModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApnShareModesWs fromValue(String v) {
        for (ApnShareModesWs c: ApnShareModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
