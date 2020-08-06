
package Netspan.NBI_18_0.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapResyncSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrapResyncSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrapType" type="{http://Airspan.Netspan.WebServices}TrapType"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrapResyncSet", propOrder = {
    "trapType",
    "sequenceNumber"
})
public class TrapResyncSet {

    @XmlElement(name = "TrapType", required = true)
    @XmlSchemaType(name = "string")
    protected TrapType trapType;
    @XmlElement(name = "SequenceNumber")
    protected long sequenceNumber;

    /**
     * Gets the value of the trapType property.
     * 
     * @return
     *     possible object is
     *     {@link TrapType }
     *     
     */
    public TrapType getTrapType() {
        return trapType;
    }

    /**
     * Sets the value of the trapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapType }
     *     
     */
    public void setTrapType(TrapType value) {
        this.trapType = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(long value) {
        this.sequenceNumber = value;
    }

}
