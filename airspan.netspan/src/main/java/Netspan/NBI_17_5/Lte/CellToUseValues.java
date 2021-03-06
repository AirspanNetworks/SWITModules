
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellToUseValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CellToUseValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LiteComp"/&gt;
 *     &lt;enumeration value="Indoor"/&gt;
 *     &lt;enumeration value="Outdoor"/&gt;
 *     &lt;enumeration value="MultiCell"/&gt;
 *     &lt;enumeration value="Sector1"/&gt;
 *     &lt;enumeration value="Sector2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
    OUTDOOR("Outdoor"),
    @XmlEnumValue("MultiCell")
    MULTI_CELL("MultiCell"),
    @XmlEnumValue("Sector1")
    SECTOR_1("Sector1"),
    @XmlEnumValue("Sector2")
    SECTOR_2("Sector2");
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
