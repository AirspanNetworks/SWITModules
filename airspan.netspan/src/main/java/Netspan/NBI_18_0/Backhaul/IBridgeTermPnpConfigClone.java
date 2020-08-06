
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
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}iBridgeTermPnpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="iBridgeTermDetail" type="{http://Airspan.Netspan.WebServices}IBridgeTermDetailsPnp" minOccurs="0"/&gt;
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
    "pnpDetail",
    "nodeDetail",
    "iBridgeTermDetail"
})
@XmlRootElement(name = "IBridgeTermPnpConfigClone")
public class IBridgeTermPnpConfigClone {

    @XmlElement(name = "ExistingNodeName")
    protected String existingNodeName;
    @XmlElement(name = "PnpDetail")
    protected IBridgeTermPnpDetailWs pnpDetail;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    protected IBridgeTermDetailsPnp iBridgeTermDetail;

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
     * Gets the value of the pnpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermPnpDetailWs }
     *     
     */
    public IBridgeTermPnpDetailWs getPnpDetail() {
        return pnpDetail;
    }

    /**
     * Sets the value of the pnpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermPnpDetailWs }
     *     
     */
    public void setPnpDetail(IBridgeTermPnpDetailWs value) {
        this.pnpDetail = value;
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
     * Gets the value of the iBridgeTermDetail property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermDetailsPnp }
     *     
     */
    public IBridgeTermDetailsPnp getIBridgeTermDetail() {
        return iBridgeTermDetail;
    }

    /**
     * Sets the value of the iBridgeTermDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermDetailsPnp }
     *     
     */
    public void setIBridgeTermDetail(IBridgeTermDetailsPnp value) {
        this.iBridgeTermDetail = value;
    }

}
