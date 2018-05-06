
package Netspan.NBI_15_1.Software;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServerProtocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FTP"/>
 *     &lt;enumeration value="TFTP"/>
 *     &lt;enumeration value="SFTP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
