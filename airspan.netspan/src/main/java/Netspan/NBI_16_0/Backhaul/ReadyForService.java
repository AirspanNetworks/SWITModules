
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadyForService.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReadyForService"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Not Commissioned"/&gt;
 *     &lt;enumeration value="Ready For Service"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReadyForService")
@XmlEnum
public enum ReadyForService {

    @XmlEnumValue("Not Commissioned")
    NOT_COMMISSIONED("Not Commissioned"),
    @XmlEnumValue("Ready For Service")
    READY_FOR_SERVICE("Ready For Service");
    private final String value;

    ReadyForService(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadyForService fromValue(String v) {
        for (ReadyForService c: ReadyForService.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
