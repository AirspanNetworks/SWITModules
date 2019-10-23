
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EfficiencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EfficiencyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SpectralEfficiency"/&gt;
 *     &lt;enumeration value="UeEfficiency"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EfficiencyType")
@XmlEnum
public enum EfficiencyType {

    @XmlEnumValue("SpectralEfficiency")
    SPECTRAL_EFFICIENCY("SpectralEfficiency"),
    @XmlEnumValue("UeEfficiency")
    UE_EFFICIENCY("UeEfficiency");
    private final String value;

    EfficiencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EfficiencyType fromValue(String v) {
        for (EfficiencyType c: EfficiencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
