
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenbTxModes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DenbTxModes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Tm1"/&gt;
 *     &lt;enumeration value="Tm2"/&gt;
 *     &lt;enumeration value="Tm3"/&gt;
 *     &lt;enumeration value="Tm4"/&gt;
 *     &lt;enumeration value="Tm5"/&gt;
 *     &lt;enumeration value="Tm6"/&gt;
 *     &lt;enumeration value="Tm7"/&gt;
 *     &lt;enumeration value="Tm8"/&gt;
 *     &lt;enumeration value="Tm9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DenbTxModes")
@XmlEnum
public enum DenbTxModes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Tm1")
    TM_1("Tm1"),
    @XmlEnumValue("Tm2")
    TM_2("Tm2"),
    @XmlEnumValue("Tm3")
    TM_3("Tm3"),
    @XmlEnumValue("Tm4")
    TM_4("Tm4"),
    @XmlEnumValue("Tm5")
    TM_5("Tm5"),
    @XmlEnumValue("Tm6")
    TM_6("Tm6"),
    @XmlEnumValue("Tm7")
    TM_7("Tm7"),
    @XmlEnumValue("Tm8")
    TM_8("Tm8"),
    @XmlEnumValue("Tm9")
    TM_9("Tm9");
    private final String value;

    DenbTxModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenbTxModes fromValue(String v) {
        for (DenbTxModes c: DenbTxModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
