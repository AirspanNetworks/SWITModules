
package Netspan.NBI_18_0.Backhaul;

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
 *         &lt;element name="ExistingNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}IBridge2PnpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="IBridge2Detail" type="{http://Airspan.Netspan.WebServices}IBridge2DetailsPnp" minOccurs="0"/&gt;
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
    "existingNodeName",
    "nodeDetail",
    "pnpDetail",
    "iBridge2Detail"
})
@XmlRootElement(name = "IBridge2PnpConfigClone")
public class IBridge2PnpConfigClone {

    @XmlElement(name = "ExistingNodeName")
    protected String existingNodeName;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    @XmlElement(name = "PnpDetail")
    protected IBridge2PnpDetailWs pnpDetail;
    @XmlElement(name = "IBridge2Detail")
    protected IBridge2DetailsPnp iBridge2Detail;

    /**
     * Gets the value of the existingNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingNodeName() {
        return existingNodeName;
    }

    /**
     * Sets the value of the existingNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingNodeName(String value) {
        this.existingNodeName = value;
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
     * Gets the value of the pnpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2PnpDetailWs }
     *     
     */
    public IBridge2PnpDetailWs getPnpDetail() {
        return pnpDetail;
    }

    /**
     * Sets the value of the pnpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2PnpDetailWs }
     *     
     */
    public void setPnpDetail(IBridge2PnpDetailWs value) {
        this.pnpDetail = value;
    }

    /**
     * Gets the value of the iBridge2Detail property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2DetailsPnp }
     *     
     */
    public IBridge2DetailsPnp getIBridge2Detail() {
        return iBridge2Detail;
    }

    /**
     * Sets the value of the iBridge2Detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2DetailsPnp }
     *     
     */
    public void setIBridge2Detail(IBridge2DetailsPnp value) {
        this.iBridge2Detail = value;
    }

}
