
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NrtHoTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NrtHoTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BlockHo"/>
 *     &lt;enumeration value="X2Preferred"/>
 *     &lt;enumeration value="S1Only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
