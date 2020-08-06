
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RohcQciValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RohcQciValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Qci1"/&gt;
 *     &lt;enumeration value="Qci2"/&gt;
 *     &lt;enumeration value="Qci6"/&gt;
 *     &lt;enumeration value="Qci7"/&gt;
 *     &lt;enumeration value="Qci8"/&gt;
 *     &lt;enumeration value="Qci9"/&gt;
 *     &lt;enumeration value="Qci65"/&gt;
 *     &lt;enumeration value="Qci66"/&gt;
 *     &lt;enumeration value="Qci70"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RohcQciValues")
@XmlEnum
public enum RohcQciValues {

    @XmlEnumValue("Qci1")
    QCI_1("Qci1"),
    @XmlEnumValue("Qci2")
    QCI_2("Qci2"),
    @XmlEnumValue("Qci6")
    QCI_6("Qci6"),
    @XmlEnumValue("Qci7")
    QCI_7("Qci7"),
    @XmlEnumValue("Qci8")
    QCI_8("Qci8"),
    @XmlEnumValue("Qci9")
    QCI_9("Qci9"),
    @XmlEnumValue("Qci65")
    QCI_65("Qci65"),
    @XmlEnumValue("Qci66")
    QCI_66("Qci66"),
    @XmlEnumValue("Qci70")
    QCI_70("Qci70");
    private final String value;

    RohcQciValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RohcQciValues fromValue(String v) {
        for (RohcQciValues c: RohcQciValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
