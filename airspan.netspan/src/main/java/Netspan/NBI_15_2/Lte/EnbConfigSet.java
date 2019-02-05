
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnbDetails" type="{http://Airspan.Netspan.WebServices}LteEnbDetailsSetWs" minOccurs="0"/&gt;
 *         &lt;element name="EnbSnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailSetWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeName",
    "enbDetails",
    "enbSnmpDetail"
})
@XmlRootElement(name = "EnbConfigSet")
public class EnbConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "EnbDetails")
    protected LteEnbDetailsSetWs enbDetails;
    @XmlElement(name = "EnbSnmpDetail")
    protected SnmpDetailSetWs enbSnmpDetail;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the enbDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LteEnbDetailsSetWs }
     *     
     */
    public LteEnbDetailsSetWs getEnbDetails() {
        return enbDetails;
    }

    /**
     * Sets the value of the enbDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteEnbDetailsSetWs }
     *     
     */
    public void setEnbDetails(LteEnbDetailsSetWs value) {
        this.enbDetails = value;
    }

    /**
     * Gets the value of the enbSnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public SnmpDetailSetWs getEnbSnmpDetail() {
        return enbSnmpDetail;
    }

    /**
     * Sets the value of the enbSnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public void setEnbSnmpDetail(SnmpDetailSetWs value) {
        this.enbSnmpDetail = value;
    }

}
