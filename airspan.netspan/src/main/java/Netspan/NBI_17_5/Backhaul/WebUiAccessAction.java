
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebUiAccessAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebUiAccessAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enable"/&gt;
 *     &lt;enumeration value="EnableWithTimeout"/&gt;
 *     &lt;enumeration value="Disable"/&gt;
 *     &lt;enumeration value="GeneratePassword"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WebUiAccessAction")
@XmlEnum
public enum WebUiAccessAction {

    @XmlEnumValue("Enable")
    ENABLE("Enable"),
    @XmlEnumValue("EnableWithTimeout")
    ENABLE_WITH_TIMEOUT("EnableWithTimeout"),
    @XmlEnumValue("Disable")
    DISABLE("Disable"),
    @XmlEnumValue("GeneratePassword")
    GENERATE_PASSWORD("GeneratePassword");
    private final String value;

    WebUiAccessAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebUiAccessAction fromValue(String v) {
        for (WebUiAccessAction c: WebUiAccessAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
