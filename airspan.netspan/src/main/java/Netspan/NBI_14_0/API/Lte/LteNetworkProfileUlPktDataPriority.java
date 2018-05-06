
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteNetworkProfileUlPktDataPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LteNetworkProfileUlPktDataPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QCI1"/>
 *     &lt;enumeration value="QCI2"/>
 *     &lt;enumeration value="QCI3"/>
 *     &lt;enumeration value="QCI4"/>
 *     &lt;enumeration value="QCI5"/>
 *     &lt;enumeration value="QCI6"/>
 *     &lt;enumeration value="QCI7"/>
 *     &lt;enumeration value="QCI8"/>
 *     &lt;enumeration value="QCI9"/>
 *     &lt;enumeration value="ControlPlane"/>
 *     &lt;enumeration value="PTPIEEE1588"/>
 *     &lt;enumeration value="CSON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LteNetworkProfileUlPktDataPriority")
@XmlEnum
public enum LteNetworkProfileUlPktDataPriority {

    @XmlEnumValue("QCI1")
    QCI_1("QCI1"),
    @XmlEnumValue("QCI2")
    QCI_2("QCI2"),
    @XmlEnumValue("QCI3")
    QCI_3("QCI3"),
    @XmlEnumValue("QCI4")
    QCI_4("QCI4"),
    @XmlEnumValue("QCI5")
    QCI_5("QCI5"),
    @XmlEnumValue("QCI6")
    QCI_6("QCI6"),
    @XmlEnumValue("QCI7")
    QCI_7("QCI7"),
    @XmlEnumValue("QCI8")
    QCI_8("QCI8"),
    @XmlEnumValue("QCI9")
    QCI_9("QCI9"),
    @XmlEnumValue("ControlPlane")
    CONTROL_PLANE("ControlPlane"),
    @XmlEnumValue("PTPIEEE1588")
    PTPIEEE_1588("PTPIEEE1588"),
    CSON("CSON");
    private final String value;

    LteNetworkProfileUlPktDataPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LteNetworkProfileUlPktDataPriority fromValue(String v) {
        for (LteNetworkProfileUlPktDataPriority c: LteNetworkProfileUlPktDataPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
