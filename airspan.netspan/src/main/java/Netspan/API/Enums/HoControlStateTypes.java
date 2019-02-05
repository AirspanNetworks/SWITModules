
package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoControlStateTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HoControlStateTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Allowed"/&gt;
 *     &lt;enumeration value="Prohibited"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HoControlStateTypes")
@XmlEnum
public enum HoControlStateTypes {

    @XmlEnumValue("Allowed")
    ALLOWED("Allowed"),
    @XmlEnumValue("Prohibited")
    PROHIBITED("Prohibited");
    private final String value;

    HoControlStateTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoControlStateTypes fromValue(String v) {
        for (HoControlStateTypes c: HoControlStateTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
    public String convertEnum(){
    	if(value == "Allowed")
    		return "1"; 
    	if (value == "Prohibited")
    		return "0";
    	return "0"; //default
    }

}
