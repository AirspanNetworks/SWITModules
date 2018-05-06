
package Netspan.NBI_16_0.Lte;

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
 *     &lt;enumeration value="NS01"/>
 *     &lt;enumeration value="NS04"/>
 *     &lt;enumeration value="NS12"/>
 *     &lt;enumeration value="NS13"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddlSpectrumEmissions")
@XmlEnum
public enum AddlSpectrumEmissions {

    @XmlEnumValue("NS01")
    NS_01("NS01"),
    @XmlEnumValue("NS04")
    NS_04("NS04"),
    @XmlEnumValue("NS12")
    NS_12("NS12"),
    @XmlEnumValue("NS13")
    NS_13("NS13");
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
