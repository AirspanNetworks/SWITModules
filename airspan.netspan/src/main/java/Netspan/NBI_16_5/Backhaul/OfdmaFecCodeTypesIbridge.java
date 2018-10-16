
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfdmaFecCodeTypesIbridge.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfdmaFecCodeTypesIbridge"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dynamic"/&gt;
 *     &lt;enumeration value="OfdmaQpskCtc12"/&gt;
 *     &lt;enumeration value="OfdmaQpskCtc34"/&gt;
 *     &lt;enumeration value="Ofdma16qamCtc12"/&gt;
 *     &lt;enumeration value="Ofdma16qamCtc34"/&gt;
 *     &lt;enumeration value="Ofdma64qamCtc12"/&gt;
 *     &lt;enumeration value="Ofdma64qamCtc23"/&gt;
 *     &lt;enumeration value="Ofdma64qamCtc34"/&gt;
 *     &lt;enumeration value="Ofdma64qamCtc56"/&gt;
 *     &lt;enumeration value="Ofdma256qamCtc12"/&gt;
 *     &lt;enumeration value="Ofdma256qamCtc58"/&gt;
 *     &lt;enumeration value="Ofdma256qamCtc34"/&gt;
 *     &lt;enumeration value="Ofdma256qamCtc56"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfdmaFecCodeTypesIbridge")
@XmlEnum
public enum OfdmaFecCodeTypesIbridge {

    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic"),
    @XmlEnumValue("OfdmaQpskCtc12")
    OFDMA_QPSK_CTC_12("OfdmaQpskCtc12"),
    @XmlEnumValue("OfdmaQpskCtc34")
    OFDMA_QPSK_CTC_34("OfdmaQpskCtc34"),
    @XmlEnumValue("Ofdma16qamCtc12")
    OFDMA_16_QAM_CTC_12("Ofdma16qamCtc12"),
    @XmlEnumValue("Ofdma16qamCtc34")
    OFDMA_16_QAM_CTC_34("Ofdma16qamCtc34"),
    @XmlEnumValue("Ofdma64qamCtc12")
    OFDMA_64_QAM_CTC_12("Ofdma64qamCtc12"),
    @XmlEnumValue("Ofdma64qamCtc23")
    OFDMA_64_QAM_CTC_23("Ofdma64qamCtc23"),
    @XmlEnumValue("Ofdma64qamCtc34")
    OFDMA_64_QAM_CTC_34("Ofdma64qamCtc34"),
    @XmlEnumValue("Ofdma64qamCtc56")
    OFDMA_64_QAM_CTC_56("Ofdma64qamCtc56"),
    @XmlEnumValue("Ofdma256qamCtc12")
    OFDMA_256_QAM_CTC_12("Ofdma256qamCtc12"),
    @XmlEnumValue("Ofdma256qamCtc58")
    OFDMA_256_QAM_CTC_58("Ofdma256qamCtc58"),
    @XmlEnumValue("Ofdma256qamCtc34")
    OFDMA_256_QAM_CTC_34("Ofdma256qamCtc34"),
    @XmlEnumValue("Ofdma256qamCtc56")
    OFDMA_256_QAM_CTC_56("Ofdma256qamCtc56");
    private final String value;

    OfdmaFecCodeTypesIbridge(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfdmaFecCodeTypesIbridge fromValue(String v) {
        for (OfdmaFecCodeTypesIbridge c: OfdmaFecCodeTypesIbridge.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
