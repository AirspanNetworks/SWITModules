
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteNetworkProfileUlPktDataPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LteNetworkProfileUlPktDataPriority"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QCI1"/&gt;
 *     &lt;enumeration value="QCI2"/&gt;
 *     &lt;enumeration value="QCI3"/&gt;
 *     &lt;enumeration value="QCI4"/&gt;
 *     &lt;enumeration value="QCI5"/&gt;
 *     &lt;enumeration value="QCI6"/&gt;
 *     &lt;enumeration value="QCI7"/&gt;
 *     &lt;enumeration value="QCI8"/&gt;
 *     &lt;enumeration value="QCI9"/&gt;
 *     &lt;enumeration value="ControlPlane"/&gt;
 *     &lt;enumeration value="Management"/&gt;
 *     &lt;enumeration value="PTPIEEE1588"/&gt;
 *     &lt;enumeration value="CSON"/&gt;
 *     &lt;enumeration value="M2Mce"/&gt;
 *     &lt;enumeration value="CallTrace"/&gt;
 *     &lt;enumeration value="TwampSender"/&gt;
 *     &lt;enumeration value="GtpSignalling"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
    @XmlEnumValue("Management")
    MANAGEMENT("Management"),
    @XmlEnumValue("PTPIEEE1588")
    PTPIEEE_1588("PTPIEEE1588"),
    CSON("CSON"),
    @XmlEnumValue("M2Mce")
    M_2_MCE("M2Mce"),
    @XmlEnumValue("CallTrace")
    CALL_TRACE("CallTrace"),
    @XmlEnumValue("TwampSender")
    TWAMP_SENDER("TwampSender"),
    @XmlEnumValue("GtpSignalling")
    GTP_SIGNALLING("GtpSignalling");
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
