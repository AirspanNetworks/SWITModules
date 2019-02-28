
package Netspan.NBI_17_0.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileServerProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileServerProtocolType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FTP"/&gt;
 *     &lt;enumeration value="TFTP"/&gt;
 *     &lt;enumeration value="SFTP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
