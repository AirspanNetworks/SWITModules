
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeDlMimoModesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridgeDlMimoModesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dynamic"/&gt;
 *     &lt;enumeration value="MatrixA"/&gt;
 *     &lt;enumeration value="MatrixB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridgeDlMimoModesWs")
@XmlEnum
public enum IBridgeDlMimoModesWs {

    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic"),
    @XmlEnumValue("MatrixA")
    MATRIX_A("MatrixA"),
    @XmlEnumValue("MatrixB")
    MATRIX_B("MatrixB");
    private final String value;

    IBridgeDlMimoModesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridgeDlMimoModesWs fromValue(String v) {
        for (IBridgeDlMimoModesWs c: IBridgeDlMimoModesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
