
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnpConfigWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnpConfigWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/>
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LtePnpConfig" type="{http://Airspan.Netspan.WebServices}PnpDetailWs" minOccurs="0"/>
 *         &lt;element name="LteEnbConfig" type="{http://Airspan.Netspan.WebServices}LteEnbDetailsGetWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnpConfigWs", propOrder = {
    "nodeResultCode",
    "nodeResultString",
    "ltePnpConfig",
    "lteEnbConfig"
})
public class PnpConfigWs {

    @XmlElement(name = "NodeResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues nodeResultCode;
    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "LtePnpConfig")
    protected PnpDetailWs ltePnpConfig;
    @XmlElement(name = "LteEnbConfig")
    protected LteEnbDetailsGetWs lteEnbConfig;

    /**
     * Gets the value of the nodeResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeResultValues }
     *     
     */
    public NodeResultValues getNodeResultCode() {
        return nodeResultCode;
    }

    /**
     * Sets the value of the nodeResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeResultValues }
     *     
     */
    public void setNodeResultCode(NodeResultValues value) {
        this.nodeResultCode = value;
    }

    /**
     * Gets the value of the nodeResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeResultString() {
        return nodeResultString;
    }

    /**
     * Sets the value of the nodeResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeResultString(String value) {
        this.nodeResultString = value;
    }

    /**
     * Gets the value of the ltePnpConfig property.
     * 
     * @return
     *     possible object is
     *     {@link PnpDetailWs }
     *     
     */
    public PnpDetailWs getLtePnpConfig() {
        return ltePnpConfig;
    }

    /**
     * Sets the value of the ltePnpConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnpDetailWs }
     *     
     */
    public void setLtePnpConfig(PnpDetailWs value) {
        this.ltePnpConfig = value;
    }

    /**
     * Gets the value of the lteEnbConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LteEnbDetailsGetWs }
     *     
     */
    public LteEnbDetailsGetWs getLteEnbConfig() {
        return lteEnbConfig;
    }

    /**
     * Sets the value of the lteEnbConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteEnbDetailsGetWs }
     *     
     */
    public void setLteEnbConfig(LteEnbDetailsGetWs value) {
        this.lteEnbConfig = value;
    }

}
