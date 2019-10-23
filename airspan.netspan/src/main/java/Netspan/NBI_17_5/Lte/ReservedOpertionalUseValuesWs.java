
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservedOpertionalUseValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservedOpertionalUseValuesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="NotReserved"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservedOpertionalUseValuesWs")
@XmlEnum
public enum ReservedOpertionalUseValuesWs {

    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("NotReserved")
    NOT_RESERVED("NotReserved");
    private final String value;

    ReservedOpertionalUseValuesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservedOpertionalUseValuesWs fromValue(String v) {
        for (ReservedOpertionalUseValuesWs c: ReservedOpertionalUseValuesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
