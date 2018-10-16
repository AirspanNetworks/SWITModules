
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SonAnrEnbPciModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SonAnrEnbPciModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FullRangeMacro"/&gt;
 *     &lt;enumeration value="FullRangeHome"/&gt;
 *     &lt;enumeration value="ConfigureMacroPci"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SonAnrEnbPciModes")
@XmlEnum
public enum SonAnrEnbPciModes {

    @XmlEnumValue("FullRangeMacro")
    FULL_RANGE_MACRO("FullRangeMacro"),
    @XmlEnumValue("FullRangeHome")
    FULL_RANGE_HOME("FullRangeHome"),
    @XmlEnumValue("ConfigureMacroPci")
    CONFIGURE_MACRO_PCI("ConfigureMacroPci");
    private final String value;

    SonAnrEnbPciModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SonAnrEnbPciModes fromValue(String v) {
        for (SonAnrEnbPciModes c: SonAnrEnbPciModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
