
package Netspan.NBI_17_0.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServerProtocolType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FTP"/&gt;
 *     &lt;enumeration value="TFTP"/&gt;
 *     &lt;enumeration value="SFTP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServerProtocolType")
@XmlEnum
public enum ServerProtocolType {

    FTP,
    TFTP,
    SFTP;

    public String value() {
        return name();
    }

    public static ServerProtocolType fromValue(String v) {
        return valueOf(v);
    }

}
