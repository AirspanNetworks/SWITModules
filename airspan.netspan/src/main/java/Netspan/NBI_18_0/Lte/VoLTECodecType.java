
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoLTECodecType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoLTECodecType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMR"/&gt;
 *     &lt;enumeration value="AMRWB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoLTECodecType")
@XmlEnum
public enum VoLTECodecType {

    AMR,
    AMRWB;

    public String value() {
        return name();
    }

    public static VoLTECodecType fromValue(String v) {
        return valueOf(v);
    }

}
