
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QciValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QciValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QciAll"/&gt;
 *     &lt;enumeration value="Qci1"/&gt;
 *     &lt;enumeration value="Qci2"/&gt;
 *     &lt;enumeration value="Qci3"/&gt;
 *     &lt;enumeration value="Qci4"/&gt;
 *     &lt;enumeration value="Qci5"/&gt;
 *     &lt;enumeration value="Qci6"/&gt;
 *     &lt;enumeration value="Qci7"/&gt;
 *     &lt;enumeration value="Qci8"/&gt;
 *     &lt;enumeration value="Qci9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QciValues")
@XmlEnum
public enum QciValues {

    @XmlEnumValue("QciAll")
    QCI_ALL("QciAll"),
    @XmlEnumValue("Qci1")
    QCI_1("Qci1"),
    @XmlEnumValue("Qci2")
    QCI_2("Qci2"),
    @XmlEnumValue("Qci3")
    QCI_3("Qci3"),
    @XmlEnumValue("Qci4")
    QCI_4("Qci4"),
    @XmlEnumValue("Qci5")
    QCI_5("Qci5"),
    @XmlEnumValue("Qci6")
    QCI_6("Qci6"),
    @XmlEnumValue("Qci7")
    QCI_7("Qci7"),
    @XmlEnumValue("Qci8")
    QCI_8("Qci8"),
    @XmlEnumValue("Qci9")
    QCI_9("Qci9");
    private final String value;

    QciValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QciValues fromValue(String v) {
        for (QciValues c: QciValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
