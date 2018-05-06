
package Netspan.NBI_15_5.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmbmsStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmbmsStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="M1MulticastIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmbmsStatusWs", propOrder = {
    "teId",
    "m1MulticastIpAddress"
})
public class EmbmsStatusWs {

    @XmlElement(name = "TeId")
    @XmlSchemaType(name = "unsignedInt")
    protected long teId;
    @XmlElement(name = "M1MulticastIpAddress")
    protected String m1MulticastIpAddress;

    /**
     * Gets the value of the teId property.
     * 
     */
    public long getTeId() {
        return teId;
    }

    /**
     * Sets the value of the teId property.
     * 
     */
    public void setTeId(long value) {
        this.teId = value;
    }

    /**
     * Gets the value of the m1MulticastIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM1MulticastIpAddress() {
        return m1MulticastIpAddress;
    }

    /**
     * Sets the value of the m1MulticastIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM1MulticastIpAddress(String value) {
        this.m1MulticastIpAddress = value;
    }

}
