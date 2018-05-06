
package Netspan.NBI_15_5.Statistics;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeStatusResultValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeStatusResultValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NodeNotFound"/>
 *     &lt;enumeration value="NodeNoResults"/>
 *     &lt;enumeration value="NodeNotContactable"/>
 *     &lt;enumeration value="InternalError"/>
 *     &lt;enumeration value="FeatureNotSupported"/>
 *     &lt;enumeration value="UnableToLoadFromEquipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
    UNABLE_TO_LOAD_FROM_EQUIPMENT("UnableToLoadFromEquipment");
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
