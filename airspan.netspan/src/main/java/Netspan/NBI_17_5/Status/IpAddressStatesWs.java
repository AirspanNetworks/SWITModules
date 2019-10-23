
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IpAddressStatesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IpAddressStatesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="New"/&gt;
 *     &lt;enumeration value="Fail"/&gt;
 *     &lt;enumeration value="Good"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IpAddressStatesWs")
@XmlEnum
public enum IpAddressStatesWs {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("Good")
    GOOD("Good");
    private final String value;

    IpAddressStatesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IpAddressStatesWs fromValue(String v) {
        for (IpAddressStatesWs c: IpAddressStatesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
