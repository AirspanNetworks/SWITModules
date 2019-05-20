
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellBarringPolicies.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CellBarringPolicies"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UseDeNBPolicy"/&gt;
 *     &lt;enumeration value="NotBarred"/&gt;
 *     &lt;enumeration value="CellBarred"/&gt;
 *     &lt;enumeration value="ACBarring"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CellBarringPolicies")
@XmlEnum
public enum CellBarringPolicies {

    @XmlEnumValue("UseDeNBPolicy")
    USE_DE_NB_POLICY("UseDeNBPolicy"),
    @XmlEnumValue("NotBarred")
    NOT_BARRED("NotBarred"),
    @XmlEnumValue("CellBarred")
    CELL_BARRED("CellBarred"),
    @XmlEnumValue("ACBarring")
    AC_BARRING("ACBarring");
    private final String value;

    CellBarringPolicies(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CellBarringPolicies fromValue(String v) {
        for (CellBarringPolicies c: CellBarringPolicies.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
