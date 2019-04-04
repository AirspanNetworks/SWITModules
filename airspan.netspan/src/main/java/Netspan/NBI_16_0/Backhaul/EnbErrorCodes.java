
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbErrorCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnbErrorCodes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSet"/&gt;
 *     &lt;enumeration value="NoValidFrequency"/&gt;
 *     &lt;enumeration value="NoValidCsfb"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnbErrorCodes")
@XmlEnum
public enum EnbErrorCodes {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("NoValidFrequency")
    NO_VALID_FREQUENCY("NoValidFrequency"),
    @XmlEnumValue("NoValidCsfb")
    NO_VALID_CSFB("NoValidCsfb");
    private final String value;

    EnbErrorCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnbErrorCodes fromValue(String v) {
        for (EnbErrorCodes c: EnbErrorCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
