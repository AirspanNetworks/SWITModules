
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferProtocalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferProtocalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FTP"/&gt;
 *     &lt;enumeration value="TFTP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferProtocalType")
@XmlEnum
public enum TransferProtocalType {

    FTP,
    TFTP;

    public String value() {
        return name();
    }

    public static TransferProtocalType fromValue(String v) {
        return valueOf(v);
    }

}
