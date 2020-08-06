
package Netspan.NBI_18_0.Statistics;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AntennaDirectionValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AntennaDirectionValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="degrees45"/&gt;
 *     &lt;enumeration value="degrees135"/&gt;
 *     &lt;enumeration value="degrees225"/&gt;
 *     &lt;enumeration value="degrees315"/&gt;
 *     &lt;enumeration value="degreesOmni"/&gt;
 *     &lt;enumeration value="degrees45And135"/&gt;
 *     &lt;enumeration value="degrees135And225"/&gt;
 *     &lt;enumeration value="degrees225And315"/&gt;
 *     &lt;enumeration value="degrees315And45"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AntennaDirectionValues")
@XmlEnum
public enum AntennaDirectionValues {

    @XmlEnumValue("degrees45")
    DEGREES_45("degrees45"),
    @XmlEnumValue("degrees135")
    DEGREES_135("degrees135"),
    @XmlEnumValue("degrees225")
    DEGREES_225("degrees225"),
    @XmlEnumValue("degrees315")
    DEGREES_315("degrees315"),
    @XmlEnumValue("degreesOmni")
    DEGREES_OMNI("degreesOmni"),
    @XmlEnumValue("degrees45And135")
    DEGREES_45_AND_135("degrees45And135"),
    @XmlEnumValue("degrees135And225")
    DEGREES_135_AND_225("degrees135And225"),
    @XmlEnumValue("degrees225And315")
    DEGREES_225_AND_315("degrees225And315"),
    @XmlEnumValue("degrees315And45")
    DEGREES_315_AND_45("degrees315And45");
    private final String value;

    AntennaDirectionValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AntennaDirectionValues fromValue(String v) {
        for (AntennaDirectionValues c: AntennaDirectionValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
