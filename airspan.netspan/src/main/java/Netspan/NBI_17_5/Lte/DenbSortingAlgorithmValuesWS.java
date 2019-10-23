
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenbSortingAlgorithmValuesWS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DenbSortingAlgorithmValuesWS"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DrmOnly"/&gt;
 *     &lt;enumeration value="DrmThenRsrpForGroupedDrm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DenbSortingAlgorithmValuesWS")
@XmlEnum
public enum DenbSortingAlgorithmValuesWS {

    @XmlEnumValue("DrmOnly")
    DRM_ONLY("DrmOnly"),
    @XmlEnumValue("DrmThenRsrpForGroupedDrm")
    DRM_THEN_RSRP_FOR_GROUPED_DRM("DrmThenRsrpForGroupedDrm");
    private final String value;

    DenbSortingAlgorithmValuesWS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenbSortingAlgorithmValuesWS fromValue(String v) {
        for (DenbSortingAlgorithmValuesWS c: DenbSortingAlgorithmValuesWS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
