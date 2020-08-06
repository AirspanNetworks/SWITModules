
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileUploadDestinationsWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileUploadDestinationsWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LocalServer"/&gt;
 *     &lt;enumeration value="FileServer"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileUploadDestinationsWs")
@XmlEnum
public enum FileUploadDestinationsWs {

    @XmlEnumValue("LocalServer")
    LOCAL_SERVER("LocalServer"),
    @XmlEnumValue("FileServer")
    FILE_SERVER("FileServer"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    FileUploadDestinationsWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileUploadDestinationsWs fromValue(String v) {
        for (FileUploadDestinationsWs c: FileUploadDestinationsWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
