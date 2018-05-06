
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RFC"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="KUR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageTypes")
@XmlEnum
public enum MessageTypes {

    RFC,
    IR,
    KUR;

    public String value() {
        return name();
    }

    public static MessageTypes fromValue(String v) {
        return valueOf(v);
    }

}
