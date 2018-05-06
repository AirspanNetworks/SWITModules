
package Netspan.NBI_16_0.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileServerProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileServerProtocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FTP"/>
 *     &lt;enumeration value="TFTP"/>
 *     &lt;enumeration value="SFTP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileServerProtocolType")
@XmlEnum
public enum FileServerProtocolType {

    FTP,
    TFTP,
    SFTP;

    public String value() {
        return name();
    }

    public static FileServerProtocolType fromValue(String v) {
        return valueOf(v);
    }

}
