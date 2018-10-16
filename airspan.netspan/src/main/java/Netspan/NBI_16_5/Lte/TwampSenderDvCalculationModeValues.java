
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TwampSenderDvCalculationModeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TwampSenderDvCalculationModeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Delay"/&gt;
 *     &lt;enumeration value="Rtd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TwampSenderDvCalculationModeValues")
@XmlEnum
public enum TwampSenderDvCalculationModeValues {

    @XmlEnumValue("Delay")
    DELAY("Delay"),
    @XmlEnumValue("Rtd")
    RTD("Rtd");
    private final String value;

    TwampSenderDvCalculationModeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TwampSenderDvCalculationModeValues fromValue(String v) {
        for (TwampSenderDvCalculationModeValues c: TwampSenderDvCalculationModeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
