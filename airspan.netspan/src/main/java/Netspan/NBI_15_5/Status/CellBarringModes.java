
package Netspan.NBI_15_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellBarringModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CellBarringModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Barred"/>
 *     &lt;enumeration value="NotBarred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CellBarringModes")
@XmlEnum
public enum CellBarringModes {

    @XmlEnumValue("Barred")
    BARRED("Barred"),
    @XmlEnumValue("NotBarred")
    NOT_BARRED("NotBarred");
    private final String value;

    CellBarringModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CellBarringModes fromValue(String v) {
        for (CellBarringModes c: CellBarringModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
