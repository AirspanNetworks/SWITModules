
package Netspan.NBI_16_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpStatusValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpStatusValuesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Idle"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpStatusValuesWs")
@XmlEnum
public enum OpStatusValuesWs {

    @XmlEnumValue("Idle")
    IDLE("Idle"),
    OK("OK"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    OpStatusValuesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpStatusValuesWs fromValue(String v) {
        for (OpStatusValuesWs c: OpStatusValuesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
