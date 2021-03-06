
package Netspan.API.Enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandoverType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HandoverType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S1Only"/&gt;
 *     &lt;enumeration value="TriggerX2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HandoverType")
@XmlEnum
public enum HandoverType {

    @XmlEnumValue("S1Only")
    S_1_ONLY("S1Only"),
    @XmlEnumValue("TriggerX2")
    TRIGGER_X_2("TriggerX2");
    private final String value;

    HandoverType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HandoverType fromValue(String v) {
        for (HandoverType c: HandoverType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
    public String convertEnum(){
    	if (value == "TriggerX2")
    		return "1";
    	if(value == "S1Only")
    		return "0";
    	
    	return "0"; //default
    }

}
