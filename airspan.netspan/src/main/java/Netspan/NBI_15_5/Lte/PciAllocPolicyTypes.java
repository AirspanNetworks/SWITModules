
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PciAllocPolicyTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PciAllocPolicyTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ULDmrs"/>
 *     &lt;enumeration value="DLCollidingRs"/>
 *     &lt;enumeration value="DLNonCollidingRs"/>
 *     &lt;enumeration value="ULDmrsAndDLCollidingRs"/>
 *     &lt;enumeration value="NoAllocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PciAllocPolicyTypes")
@XmlEnum
public enum PciAllocPolicyTypes {

    @XmlEnumValue("ULDmrs")
    UL_DMRS("ULDmrs"),
    @XmlEnumValue("DLCollidingRs")
    DL_COLLIDING_RS("DLCollidingRs"),
    @XmlEnumValue("DLNonCollidingRs")
    DL_NON_COLLIDING_RS("DLNonCollidingRs"),
    @XmlEnumValue("ULDmrsAndDLCollidingRs")
    UL_DMRS_AND_DL_COLLIDING_RS("ULDmrsAndDLCollidingRs"),
    @XmlEnumValue("NoAllocation")
    NO_ALLOCATION("NoAllocation");
    private final String value;

    PciAllocPolicyTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PciAllocPolicyTypes fromValue(String v) {
        for (PciAllocPolicyTypes c: PciAllocPolicyTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
