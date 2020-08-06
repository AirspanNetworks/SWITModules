
package Netspan.NBI_18_0.Statistics;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServerTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NMSServer"/&gt;
 *     &lt;enumeration value="SQLServer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServerTypes")
@XmlEnum
public enum ServerTypes {

    @XmlEnumValue("NMSServer")
    NMS_SERVER("NMSServer"),
    @XmlEnumValue("SQLServer")
    SQL_SERVER("SQLServer");
    private final String value;

    ServerTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServerTypes fromValue(String v) {
        for (ServerTypes c: ServerTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
