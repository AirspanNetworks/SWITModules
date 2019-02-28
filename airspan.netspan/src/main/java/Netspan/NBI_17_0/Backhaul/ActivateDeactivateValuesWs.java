
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivateDeactivateValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivateDeactivateValuesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Deactivate"/&gt;
 *     &lt;enumeration value="Activate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActivateDeactivateValuesWs")
@XmlEnum
public enum ActivateDeactivateValuesWs {

    @XmlEnumValue("Deactivate")
    DEACTIVATE("Deactivate"),
    @XmlEnumValue("Activate")
    ACTIVATE("Activate");
    private final String value;

    ActivateDeactivateValuesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivateDeactivateValuesWs fromValue(String v) {
        for (ActivateDeactivateValuesWs c: ActivateDeactivateValuesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
