
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsfTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SsfTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SSF5"/&gt;
 *     &lt;enumeration value="SSF6"/&gt;
 *     &lt;enumeration value="SSF7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SsfTypes")
@XmlEnum
public enum SsfTypes {

    @XmlEnumValue("SSF5")
    SSF_5("SSF5"),
    @XmlEnumValue("SSF6")
    SSF_6("SSF6"),
    @XmlEnumValue("SSF7")
    SSF_7("SSF7");
    private final String value;

    SsfTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SsfTypes fromValue(String v) {
        for (SsfTypes c: SsfTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
