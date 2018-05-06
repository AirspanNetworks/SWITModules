
package Netspan.NBI_15_5.Status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpStatusValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpStatusValuesWs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Idle"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
