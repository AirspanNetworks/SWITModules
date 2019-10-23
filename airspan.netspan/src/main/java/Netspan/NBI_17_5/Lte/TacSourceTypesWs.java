
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TacSourceTypesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TacSourceTypesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="InheritedFromDonor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TacSourceTypesWs")
@XmlEnum
public enum TacSourceTypesWs {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("InheritedFromDonor")
    INHERITED_FROM_DONOR("InheritedFromDonor");
    private final String value;

    TacSourceTypesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TacSourceTypesWs fromValue(String v) {
        for (TacSourceTypesWs c: TacSourceTypesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
