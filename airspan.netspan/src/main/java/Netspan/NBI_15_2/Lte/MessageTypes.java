
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RFC"/&gt;
 *     &lt;enumeration value="IR"/&gt;
 *     &lt;enumeration value="KUR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
