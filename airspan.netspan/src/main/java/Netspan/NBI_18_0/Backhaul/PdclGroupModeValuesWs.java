
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdclGroupModeValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PdclGroupModeValuesWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ecgi"/&gt;
 *     &lt;enumeration value="Earfcn"/&gt;
 *     &lt;enumeration value="Pci"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PdclGroupModeValuesWs")
@XmlEnum
public enum PdclGroupModeValuesWs {

    @XmlEnumValue("Ecgi")
    ECGI("Ecgi"),
    @XmlEnumValue("Earfcn")
    EARFCN("Earfcn"),
    @XmlEnumValue("Pci")
    PCI("Pci"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    PdclGroupModeValuesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PdclGroupModeValuesWs fromValue(String v) {
        for (PdclGroupModeValuesWs c: PdclGroupModeValuesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
