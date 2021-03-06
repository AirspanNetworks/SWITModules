
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NrtHoTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NrtHoTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BlockHo"/&gt;
 *     &lt;enumeration value="X2Preferred"/&gt;
 *     &lt;enumeration value="S1Only"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NrtHoTypes")
@XmlEnum
public enum NrtHoTypes {

    @XmlEnumValue("BlockHo")
    BLOCK_HO("BlockHo"),
    @XmlEnumValue("X2Preferred")
    X_2_PREFERRED("X2Preferred"),
    @XmlEnumValue("S1Only")
    S_1_ONLY("S1Only");
    private final String value;

    NrtHoTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NrtHoTypes fromValue(String v) {
        for (NrtHoTypes c: NrtHoTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
