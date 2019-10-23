
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QdclGroupModeValuesWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QdclGroupModeValuesWs"&gt;
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
@XmlType(name = "QdclGroupModeValuesWs")
@XmlEnum
public enum QdclGroupModeValuesWs {

    @XmlEnumValue("Ecgi")
    ECGI("Ecgi"),
    @XmlEnumValue("Earfcn")
    EARFCN("Earfcn"),
    @XmlEnumValue("Pci")
    PCI("Pci"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    QdclGroupModeValuesWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QdclGroupModeValuesWs fromValue(String v) {
        for (QdclGroupModeValuesWs c: QdclGroupModeValuesWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
