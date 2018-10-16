
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellRadiusRanges.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CellRadiusRanges"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Short"/&gt;
 *     &lt;enumeration value="Medium"/&gt;
 *     &lt;enumeration value="Long"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CellRadiusRanges")
@XmlEnum
public enum CellRadiusRanges {

    @XmlEnumValue("Short")
    SHORT("Short"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Long")
    LONG("Long");
    private final String value;

    CellRadiusRanges(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CellRadiusRanges fromValue(String v) {
        for (CellRadiusRanges c: CellRadiusRanges.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
