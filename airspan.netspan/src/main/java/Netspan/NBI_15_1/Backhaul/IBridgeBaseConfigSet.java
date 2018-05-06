
package Netspan.NBI_15_1.Backhaul;

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
 *         &lt;element name="IBridgeBaseDetails" type="{http://Airspan.Netspan.WebServices}IbBaseDetails" minOccurs="0"/>
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
    "iBridgeBaseDetails"
})
@XmlRootElement(name = "IBridgeBaseConfigSet")
public class IBridgeBaseConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "IBridgeBaseDetails")
    protected IbBaseDetails iBridgeBaseDetails;

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

}
