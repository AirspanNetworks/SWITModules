
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellToUseValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CellToUseValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LiteComp"/>
 *     &lt;enumeration value="Indoor"/>
 *     &lt;enumeration value="Outdoor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CellToUseValues")
@XmlEnum
public enum CellToUseValues {

    @XmlEnumValue("LiteComp")
    LITE_COMP("LiteComp"),
    @XmlEnumValue("Indoor")
    INDOOR("Indoor"),
    @XmlEnumValue("Outdoor")
    OUTDOOR("Outdoor");
    private final String value;

    CellToUseValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CellToUseValues fromValue(String v) {
        for (CellToUseValues c: CellToUseValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
