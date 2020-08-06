
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicAcBarringPropertiesLevelTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DynamicAcBarringPropertiesLevelTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Medium"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DynamicAcBarringPropertiesLevelTypes")
@XmlEnum
public enum DynamicAcBarringPropertiesLevelTypes {

    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    DynamicAcBarringPropertiesLevelTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicAcBarringPropertiesLevelTypes fromValue(String v) {
        for (DynamicAcBarringPropertiesLevelTypes c: DynamicAcBarringPropertiesLevelTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
