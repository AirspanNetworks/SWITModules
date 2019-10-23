
package Netspan.NBI_17_5.Statistics;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeStatusResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeStatusResultValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="NodeNotFound"/&gt;
 *     &lt;enumeration value="NodeNoResults"/&gt;
 *     &lt;enumeration value="NodeNotContactable"/&gt;
 *     &lt;enumeration value="InternalError"/&gt;
 *     &lt;enumeration value="FeatureNotSupported"/&gt;
 *     &lt;enumeration value="UnableToLoadFromEquipment"/&gt;
 *     &lt;enumeration value="PartialLoadFromEquipment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeStatusResultValues")
@XmlEnum
public enum NodeStatusResultValues {

    OK("OK"),
    @XmlEnumValue("NodeNotFound")
    NODE_NOT_FOUND("NodeNotFound"),
    @XmlEnumValue("NodeNoResults")
    NODE_NO_RESULTS("NodeNoResults"),
    @XmlEnumValue("NodeNotContactable")
    NODE_NOT_CONTACTABLE("NodeNotContactable"),
    @XmlEnumValue("InternalError")
    INTERNAL_ERROR("InternalError"),
    @XmlEnumValue("FeatureNotSupported")
    FEATURE_NOT_SUPPORTED("FeatureNotSupported"),
    @XmlEnumValue("UnableToLoadFromEquipment")
    UNABLE_TO_LOAD_FROM_EQUIPMENT("UnableToLoadFromEquipment"),
    @XmlEnumValue("PartialLoadFromEquipment")
    PARTIAL_LOAD_FROM_EQUIPMENT("PartialLoadFromEquipment");
    private final String value;

    NodeStatusResultValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeStatusResultValues fromValue(String v) {
        for (NodeStatusResultValues c: NodeStatusResultValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
