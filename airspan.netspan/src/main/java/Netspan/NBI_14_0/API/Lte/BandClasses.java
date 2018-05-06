
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BandClasses.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BandClasses">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bc0"/>
 *     &lt;enumeration value="Bc1"/>
 *     &lt;enumeration value="Bc2"/>
 *     &lt;enumeration value="Bc3"/>
 *     &lt;enumeration value="Bc4"/>
 *     &lt;enumeration value="Bc5"/>
 *     &lt;enumeration value="Bc6"/>
 *     &lt;enumeration value="Bc7"/>
 *     &lt;enumeration value="Bc8"/>
 *     &lt;enumeration value="Bc9"/>
 *     &lt;enumeration value="Bc10"/>
 *     &lt;enumeration value="Bc11"/>
 *     &lt;enumeration value="Bc12"/>
 *     &lt;enumeration value="Bc13"/>
 *     &lt;enumeration value="Bc14"/>
 *     &lt;enumeration value="Bc15"/>
 *     &lt;enumeration value="Bc16"/>
 *     &lt;enumeration value="Bc17"/>
 *     &lt;enumeration value="Bc18"/>
 *     &lt;enumeration value="Bc19"/>
 *     &lt;enumeration value="Bc20"/>
 *     &lt;enumeration value="Bc21"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BandClasses")
@XmlEnum
public enum BandClasses {

    @XmlEnumValue("Bc0")
    BC_0("Bc0"),
    @XmlEnumValue("Bc1")
    BC_1("Bc1"),
    @XmlEnumValue("Bc2")
    BC_2("Bc2"),
    @XmlEnumValue("Bc3")
    BC_3("Bc3"),
    @XmlEnumValue("Bc4")
    BC_4("Bc4"),
    @XmlEnumValue("Bc5")
    BC_5("Bc5"),
    @XmlEnumValue("Bc6")
    BC_6("Bc6"),
    @XmlEnumValue("Bc7")
    BC_7("Bc7"),
    @XmlEnumValue("Bc8")
    BC_8("Bc8"),
    @XmlEnumValue("Bc9")
    BC_9("Bc9"),
    @XmlEnumValue("Bc10")
    BC_10("Bc10"),
    @XmlEnumValue("Bc11")
    BC_11("Bc11"),
    @XmlEnumValue("Bc12")
    BC_12("Bc12"),
    @XmlEnumValue("Bc13")
    BC_13("Bc13"),
    @XmlEnumValue("Bc14")
    BC_14("Bc14"),
    @XmlEnumValue("Bc15")
    BC_15("Bc15"),
    @XmlEnumValue("Bc16")
    BC_16("Bc16"),
    @XmlEnumValue("Bc17")
    BC_17("Bc17"),
    @XmlEnumValue("Bc18")
    BC_18("Bc18"),
    @XmlEnumValue("Bc19")
    BC_19("Bc19"),
    @XmlEnumValue("Bc20")
    BC_20("Bc20"),
    @XmlEnumValue("Bc21")
    BC_21("Bc21");
    private final String value;

    BandClasses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BandClasses fromValue(String v) {
        for (BandClasses c: BandClasses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
