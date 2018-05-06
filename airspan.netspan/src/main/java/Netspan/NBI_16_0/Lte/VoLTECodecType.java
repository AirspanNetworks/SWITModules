
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoLTECodecType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoLTECodecType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMR"/>
 *     &lt;enumeration value="AMRWB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
