
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DicicReportAmountTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DicicReportAmountTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="r1"/&gt;
 *     &lt;enumeration value="r2"/&gt;
 *     &lt;enumeration value="r4"/&gt;
 *     &lt;enumeration value="r8"/&gt;
 *     &lt;enumeration value="r16"/&gt;
 *     &lt;enumeration value="r32"/&gt;
 *     &lt;enumeration value="r64"/&gt;
 *     &lt;enumeration value="inf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DicicReportAmountTypes")
@XmlEnum
public enum DicicReportAmountTypes {

    @XmlEnumValue("r1")
    R_1("r1"),
    @XmlEnumValue("r2")
    R_2("r2"),
    @XmlEnumValue("r4")
    R_4("r4"),
    @XmlEnumValue("r8")
    R_8("r8"),
    @XmlEnumValue("r16")
    R_16("r16"),
    @XmlEnumValue("r32")
    R_32("r32"),
    @XmlEnumValue("r64")
    R_64("r64"),
    @XmlEnumValue("inf")
    INF("inf");
    private final String value;

    DicicReportAmountTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DicicReportAmountTypes fromValue(String v) {
        for (DicicReportAmountTypes c: DicicReportAmountTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
