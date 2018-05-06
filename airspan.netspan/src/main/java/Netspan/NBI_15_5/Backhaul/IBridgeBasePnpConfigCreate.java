
package Netspan.NBI_15_5.Backhaul;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}iBridgeBasePnpDetailWs" minOccurs="0"/>
 *         &lt;element name="iBridgeBaseDetail" type="{http://Airspan.Netspan.WebServices}IbBaseDetailsPnp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pnpDetail",
    "iBridgeBaseDetail"
})
@XmlRootElement(name = "IBridgeBasePnpConfigCreate")
public class IBridgeBasePnpConfigCreate {

    @XmlElement(name = "PnpDetail")
    protected IBridgeBasePnpDetailWs pnpDetail;
    protected IbBaseDetailsPnp iBridgeBaseDetail;

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
