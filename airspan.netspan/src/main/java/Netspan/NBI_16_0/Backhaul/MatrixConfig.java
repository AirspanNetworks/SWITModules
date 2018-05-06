
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatrixConfig.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatrixConfig">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dynamic"/>
 *     &lt;enumeration value="PreferMatrixA"/>
 *     &lt;enumeration value="PreferMatrixB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatrixConfig")
@XmlEnum
public enum MatrixConfig {

    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic"),
    @XmlEnumValue("PreferMatrixA")
    PREFER_MATRIX_A("PreferMatrixA"),
    @XmlEnumValue("PreferMatrixB")
    PREFER_MATRIX_B("PreferMatrixB");
    private final String value;

    MatrixConfig(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatrixConfig fromValue(String v) {
        for (MatrixConfig c: MatrixConfig.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
