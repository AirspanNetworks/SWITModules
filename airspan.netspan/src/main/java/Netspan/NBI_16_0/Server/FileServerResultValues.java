
package Netspan.NBI_16_0.Server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileServerResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileServerResultValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="FileServerNotFound"/>
 *     &lt;enumeration value="FileServerError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileServerResultValues")
@XmlEnum
public enum FileServerResultValues {

    OK("OK"),
    @XmlEnumValue("FileServerNotFound")
    FILE_SERVER_NOT_FOUND("FileServerNotFound"),
    @XmlEnumValue("FileServerError")
    FILE_SERVER_ERROR("FileServerError");
    private final String value;

    FileServerResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileServerResultValues fromValue(String v) {
        for (FileServerResultValues c: FileServerResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
