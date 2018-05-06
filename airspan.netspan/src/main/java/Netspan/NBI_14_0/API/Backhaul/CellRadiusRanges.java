
package Netspan.NBI_14_0.API.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellRadiusRanges.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CellRadiusRanges">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Short"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Long"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
