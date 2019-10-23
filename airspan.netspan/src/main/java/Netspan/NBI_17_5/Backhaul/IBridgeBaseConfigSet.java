
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="IBridgeBaseDetails" type="{http://Airspan.Netspan.WebServices}IbBaseDetails" minOccurs="0"/&gt;
 *         &lt;element name="IBridgeBaseSnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailSetWs" minOccurs="0"/&gt;
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
    "nodeDetail",
    "iBridgeBaseDetails",
    "iBridgeBaseSnmpDetail"
})
@XmlRootElement(name = "IBridgeBaseConfigSet")
public class IBridgeBaseConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    @XmlElement(name = "IBridgeBaseDetails")
    protected IbBaseDetails iBridgeBaseDetails;
    @XmlElement(name = "IBridgeBaseSnmpDetail")
    protected SnmpDetailSetWs iBridgeBaseSnmpDetail;

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
     * Gets the value of the nodeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NodeProperty }
     *     
     */
    public NodeProperty getNodeDetail() {
        return nodeDetail;
    }

    /**
     * Sets the value of the nodeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeProperty }
     *     
     */
    public void setNodeDetail(NodeProperty value) {
        this.nodeDetail = value;
    }

    /**
     * Gets the value of the iBridgeBaseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IbBaseDetails }
     *     
     */
    public IbBaseDetails getIBridgeBaseDetails() {
        return iBridgeBaseDetails;
    }

    /**
     * Sets the value of the iBridgeBaseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbBaseDetails }
     *     
     */
    public void setIBridgeBaseDetails(IbBaseDetails value) {
        this.iBridgeBaseDetails = value;
    }

    /**
     * Gets the value of the iBridgeBaseSnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public SnmpDetailSetWs getIBridgeBaseSnmpDetail() {
        return iBridgeBaseSnmpDetail;
    }

    /**
     * Sets the value of the iBridgeBaseSnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public void setIBridgeBaseSnmpDetail(SnmpDetailSetWs value) {
        this.iBridgeBaseSnmpDetail = value;
    }

}
