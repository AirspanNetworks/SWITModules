
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DicicReportIntervalTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DicicReportIntervalTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ms120"/&gt;
 *     &lt;enumeration value="ms240"/&gt;
 *     &lt;enumeration value="ms480"/&gt;
 *     &lt;enumeration value="ms640"/&gt;
 *     &lt;enumeration value="ms1024"/&gt;
 *     &lt;enumeration value="ms2048"/&gt;
 *     &lt;enumeration value="ms5120"/&gt;
 *     &lt;enumeration value="ms10240"/&gt;
 *     &lt;enumeration value="min1"/&gt;
 *     &lt;enumeration value="min6"/&gt;
 *     &lt;enumeration value="min12"/&gt;
 *     &lt;enumeration value="min30"/&gt;
 *     &lt;enumeration value="min60"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DicicReportIntervalTypes")
@XmlEnum
public enum DicicReportIntervalTypes {

    @XmlEnumValue("ms120")
    MS_120("ms120"),
    @XmlEnumValue("ms240")
    MS_240("ms240"),
    @XmlEnumValue("ms480")
    MS_480("ms480"),
    @XmlEnumValue("ms640")
    MS_640("ms640"),
    @XmlEnumValue("ms1024")
    MS_1024("ms1024"),
    @XmlEnumValue("ms2048")
    MS_2048("ms2048"),
    @XmlEnumValue("ms5120")
    MS_5120("ms5120"),
    @XmlEnumValue("ms10240")
    MS_10240("ms10240"),
    @XmlEnumValue("min1")
    MIN_1("min1"),
    @XmlEnumValue("min6")
    MIN_6("min6"),
    @XmlEnumValue("min12")
    MIN_12("min12"),
    @XmlEnumValue("min30")
    MIN_30("min30"),
    @XmlEnumValue("min60")
    MIN_60("min60");
    private final String value;

    DicicReportIntervalTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DicicReportIntervalTypes fromValue(String v) {
        for (DicicReportIntervalTypes c: DicicReportIntervalTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
