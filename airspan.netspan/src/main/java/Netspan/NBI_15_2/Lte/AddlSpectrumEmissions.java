
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddlSpectrumEmissions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddlSpectrumEmissions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NS 01"/>
 *     &lt;enumeration value="NS 04"/>
 *     &lt;enumeration value="NS 12"/>
 *     &lt;enumeration value="NS 13"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddlSpectrumEmissions")
@XmlEnum
public enum AddlSpectrumEmissions {

    @XmlEnumValue("NS 01")
    NS_01("NS 01"),
    @XmlEnumValue("NS 04")
    NS_04("NS 04"),
    @XmlEnumValue("NS 12")
    NS_12("NS 12"),
    @XmlEnumValue("NS 13")
    NS_13("NS 13");
    private final String value;

    AddlSpectrumEmissions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddlSpectrumEmissions fromValue(String v) {
        for (AddlSpectrumEmissions c: AddlSpectrumEmissions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
