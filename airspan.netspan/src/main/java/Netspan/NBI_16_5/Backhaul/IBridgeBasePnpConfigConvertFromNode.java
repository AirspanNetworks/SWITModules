
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}iBridgeBasePnpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="iBridgeBaseDetail" type="{http://Airspan.Netspan.WebServices}IbBaseDetailsPnp" minOccurs="0"/&gt;
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
    "pnpDetail",
    "nodeDetail",
    "iBridgeBaseDetail"
})
@XmlRootElement(name = "IBridgeBasePnpConfigConvertFromNode")
public class IBridgeBasePnpConfigConvertFromNode {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "PnpDetail")
    protected IBridgeBasePnpDetailWs pnpDetail;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    protected IbBaseDetailsPnp iBridgeBaseDetail;

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
     * Gets the value of the pnpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeBasePnpDetailWs }
     *     
     */
    public IBridgeBasePnpDetailWs getPnpDetail() {
        return pnpDetail;
    }

    /**
     * Sets the value of the pnpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeBasePnpDetailWs }
     *     
     */
    public void setPnpDetail(IBridgeBasePnpDetailWs value) {
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
     * Gets the value of the iBridgeBaseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link IbBaseDetailsPnp }
     *     
     */
    public IbBaseDetailsPnp getIBridgeBaseDetail() {
        return iBridgeBaseDetail;
    }

    /**
     * Sets the value of the iBridgeBaseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbBaseDetailsPnp }
     *     
     */
    public void setIBridgeBaseDetail(IbBaseDetailsPnp value) {
        this.iBridgeBaseDetail = value;
    }

}
