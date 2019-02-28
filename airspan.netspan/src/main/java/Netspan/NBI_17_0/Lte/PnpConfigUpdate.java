
package Netspan.NBI_17_0.Lte;

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
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}PnpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="eNBDetail" type="{http://Airspan.Netspan.WebServices}LteEnbDetailsSetWsPnp" minOccurs="0"/&gt;
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
    "pnpDetail",
    "enbDetail"
})
@XmlRootElement(name = "PnpConfigUpdate")
public class PnpConfigUpdate {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    @XmlElement(name = "PnpDetail")
    protected PnpDetailWs pnpDetail;
    @XmlElement(name = "eNBDetail")
    protected LteEnbDetailsSetWsPnp enbDetail;

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
     * Gets the value of the pnpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PnpDetailWs }
     *     
     */
    public PnpDetailWs getPnpDetail() {
        return pnpDetail;
    }

    /**
     * Sets the value of the pnpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnpDetailWs }
     *     
     */
    public void setPnpDetail(PnpDetailWs value) {
        this.pnpDetail = value;
    }

    /**
     * Gets the value of the enbDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LteEnbDetailsSetWsPnp }
     *     
     */
    public LteEnbDetailsSetWsPnp getENBDetail() {
        return enbDetail;
    }

    /**
     * Sets the value of the enbDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteEnbDetailsSetWsPnp }
     *     
     */
    public void setENBDetail(LteEnbDetailsSetWsPnp value) {
        this.enbDetail = value;
    }

}
