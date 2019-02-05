
package Netspan.NBI_15_2.Backhaul;

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
 *         &lt;element name="IBridgeTermDetails" type="{http://Airspan.Netspan.WebServices}IBridgeTermDetails" minOccurs="0"/&gt;
 *         &lt;element name="IBridgeTermSnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailSetWs" minOccurs="0"/&gt;
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
    "iBridgeTermDetails",
    "iBridgeTermSnmpDetail"
})
@XmlRootElement(name = "IBridgeTermConfigSet")
public class IBridgeTermConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "IBridgeTermDetails")
    protected IBridgeTermDetails iBridgeTermDetails;
    @XmlElement(name = "IBridgeTermSnmpDetail")
    protected SnmpDetailSetWs iBridgeTermSnmpDetail;

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
     * Gets the value of the iBridgeTermDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermDetails }
     *     
     */
    public IBridgeTermDetails getIBridgeTermDetails() {
        return iBridgeTermDetails;
    }

    /**
     * Sets the value of the iBridgeTermDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermDetails }
     *     
     */
    public void setIBridgeTermDetails(IBridgeTermDetails value) {
        this.iBridgeTermDetails = value;
    }

    /**
     * Gets the value of the iBridgeTermSnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public SnmpDetailSetWs getIBridgeTermSnmpDetail() {
        return iBridgeTermSnmpDetail;
    }

    /**
     * Sets the value of the iBridgeTermSnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public void setIBridgeTermSnmpDetail(SnmpDetailSetWs value) {
        this.iBridgeTermSnmpDetail = value;
    }

}
