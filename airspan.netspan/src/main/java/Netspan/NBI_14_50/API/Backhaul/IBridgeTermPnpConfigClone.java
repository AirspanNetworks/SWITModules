
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
 *         &lt;element name="ExistingNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}iBridgeTermPnpDetailWs" minOccurs="0"/>
 *         &lt;element name="iBridgeTermDetail" type="{http://Airspan.Netspan.WebServices}IBridgeTermDetails" minOccurs="0"/>
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
    "existingNodeName",
    "pnpDetail",
    "iBridgeTermDetail"
})
@XmlRootElement(name = "IBridgeTermPnpConfigClone")
public class IBridgeTermPnpConfigClone {

    @XmlElement(name = "ExistingNodeName")
    protected String existingNodeName;
    @XmlElement(name = "PnpDetail")
    protected IBridgeTermPnpDetailWs pnpDetail;
    protected IBridgeTermDetails iBridgeTermDetail;

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
     * Gets the value of the iBridgeTermDetail property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermDetails }
     *     
     */
    public IBridgeTermDetails getIBridgeTermDetail() {
        return iBridgeTermDetail;
    }

    /**
     * Sets the value of the iBridgeTermDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermDetails }
     *     
     */
    public void setIBridgeTermDetail(IBridgeTermDetails value) {
        this.iBridgeTermDetail = value;
    }

}
