
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbsdGroupTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbsdGroupTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="InterferenceCoordination"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CbsdGroupTypes")
@XmlEnum
public enum CbsdGroupTypes {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("InterferenceCoordination")
    INTERFERENCE_COORDINATION("InterferenceCoordination");
    private final String value;

    CbsdGroupTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbsdGroupTypes fromValue(String v) {
        for (CbsdGroupTypes c: CbsdGroupTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
