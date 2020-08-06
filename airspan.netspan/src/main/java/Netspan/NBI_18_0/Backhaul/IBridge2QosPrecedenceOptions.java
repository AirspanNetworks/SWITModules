
package Netspan.NBI_18_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2QosPrecedenceOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IBridge2QosPrecedenceOptions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TrustCos"/&gt;
 *     &lt;enumeration value="TrustDscp"/&gt;
 *     &lt;enumeration value="Default"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IBridge2QosPrecedenceOptions")
@XmlEnum
public enum IBridge2QosPrecedenceOptions {

    @XmlEnumValue("TrustCos")
    TRUST_COS("TrustCos"),
    @XmlEnumValue("TrustDscp")
    TRUST_DSCP("TrustDscp"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    IBridge2QosPrecedenceOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IBridge2QosPrecedenceOptions fromValue(String v) {
        for (IBridge2QosPrecedenceOptions c: IBridge2QosPrecedenceOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
