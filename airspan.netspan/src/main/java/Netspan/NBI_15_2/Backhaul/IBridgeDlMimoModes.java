
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeDlMimoModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridgeDlMimoModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dynamic"/&gt;
 *     &lt;enumeration value="Matrix A"/&gt;
 *     &lt;enumeration value="Matrix B"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridgeDlMimoModes")
@XmlEnum
public enum IBridgeDlMimoModes {

    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic"),
    @XmlEnumValue("Matrix A")
    MATRIX_A("Matrix A"),
    @XmlEnumValue("Matrix B")
    MATRIX_B("Matrix B");
    private final String value;

    IBridgeDlMimoModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridgeDlMimoModes fromValue(String v) {
        for (IBridgeDlMimoModes c: IBridgeDlMimoModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
