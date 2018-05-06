
package Netspan.NBI_14_50.API.Backhaul;

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
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}iBridgeBasePnpDetailWs" minOccurs="0"/>
 *         &lt;element name="iBridgeBaseDetail" type="{http://Airspan.Netspan.WebServices}IbBaseDetails" minOccurs="0"/>
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
    "nodeName",
    "pnpDetail",
    "iBridgeBaseDetail"
})
@XmlRootElement(name = "IBridgeBasePnpConfigUpdate")
public class IBridgeBasePnpConfigUpdate {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "PnpDetail")
    protected IBridgeBasePnpDetailWs pnpDetail;
    protected IbBaseDetails iBridgeBaseDetail;

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
     * Gets the value of the iBridgeBaseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link IbBaseDetails }
     *     
     */
    public IbBaseDetails getIBridgeBaseDetail() {
        return iBridgeBaseDetail;
    }

    /**
     * Sets the value of the iBridgeBaseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbBaseDetails }
     *     
     */
    public void setIBridgeBaseDetail(IbBaseDetails value) {
        this.iBridgeBaseDetail = value;
    }

}
