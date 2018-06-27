package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="iBridge 400/450"/>
 *     &lt;enumeration value="iBridge 440"/>
 *     &lt;enumeration value="iBridge 460"/>
 *     &lt;enumeration value="Relay"/>
 *     &lt;enumeration value="LTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageType")
@XmlEnum
public enum ImageType {

    @XmlEnumValue("iBridge 400/450")
    I_BRIDGE_400_450("iBridge 400/450"),
    @XmlEnumValue("iBridge 440")
    I_BRIDGE_440("iBridge 440"),
    @XmlEnumValue("iBridge 460")
    I_BRIDGE_460("iBridge 460"),
    @XmlEnumValue("Relay")
    RELAY("Relay"),
    LTE("LTE"),
    AirDensity("AirDensity"),
    COMBINED_LTE_RELAY("CombinedLteRelay");
    private final String value;

    ImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageType fromValue(String v) {
        for (ImageType c: ImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

