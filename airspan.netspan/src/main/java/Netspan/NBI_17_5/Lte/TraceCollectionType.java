
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraceCollectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TraceCollectionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="File"/&gt;
 *     &lt;enumeration value="Stream"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TraceCollectionType")
@XmlEnum
public enum TraceCollectionType {

    @XmlEnumValue("File")
    FILE("File"),
    @XmlEnumValue("Stream")
    STREAM("Stream");
    private final String value;

    TraceCollectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraceCollectionType fromValue(String v) {
        for (TraceCollectionType c: TraceCollectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
