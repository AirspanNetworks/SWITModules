
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RrcNb.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RrcNb">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Four T"/>
 *     &lt;enumeration value="Two T"/>
 *     &lt;enumeration value="One T"/>
 *     &lt;enumeration value="Half T"/>
 *     &lt;enumeration value="Quarter T"/>
 *     &lt;enumeration value="OneEighth T"/>
 *     &lt;enumeration value="OneSixteenth T"/>
 *     &lt;enumeration value="OneThirtySecond T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RrcNb")
@XmlEnum
public enum RrcNb {

    @XmlEnumValue("Four T")
    FOUR_T("Four T"),
    @XmlEnumValue("Two T")
    TWO_T("Two T"),
    @XmlEnumValue("One T")
    ONE_T("One T"),
    @XmlEnumValue("Half T")
    HALF_T("Half T"),
    @XmlEnumValue("Quarter T")
    QUARTER_T("Quarter T"),
    @XmlEnumValue("OneEighth T")
    ONE_EIGHTH_T("OneEighth T"),
    @XmlEnumValue("OneSixteenth T")
    ONE_SIXTEENTH_T("OneSixteenth T"),
    @XmlEnumValue("OneThirtySecond T")
    ONE_THIRTY_SECOND_T("OneThirtySecond T");
    private final String value;

    RrcNb(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RrcNb fromValue(String v) {
        for (RrcNb c: RrcNb.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
