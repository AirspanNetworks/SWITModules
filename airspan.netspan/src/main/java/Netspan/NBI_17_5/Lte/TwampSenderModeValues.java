
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TwampSenderModeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TwampSenderModeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Light"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TwampSenderModeValues")
@XmlEnum
public enum TwampSenderModeValues {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Light")
    LIGHT("Light");
    private final String value;

    TwampSenderModeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TwampSenderModeValues fromValue(String v) {
        for (TwampSenderModeValues c: TwampSenderModeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
