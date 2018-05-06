
package Netspan.NBI_14_0.API.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440ConfigGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440ConfigGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="ProfileResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/>
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ib440Config" type="{http://Airspan.Netspan.WebServices}Ib440DetailsGetWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440ConfigGetResult", propOrder = {
    "profileResultCode",
    "nodeResultString",
    "ib440Config"
})
public class Ib440ConfigGetResult
    extends WsResponse
{

    @XmlElement(name = "ProfileResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues profileResultCode;
    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "Ib440Config")
    protected Ib440DetailsGetWs ib440Config;

    /**
     * Gets the value of the profileResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeResultValues }
     *     
     */
    public NodeResultValues getProfileResultCode() {
        return profileResultCode;
    }

    /**
     * Sets the value of the profileResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeResultValues }
     *     
     */
    public void setProfileResultCode(NodeResultValues value) {
        this.profileResultCode = value;
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
     * Gets the value of the ib440Config property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440DetailsGetWs }
     *     
     */
    public Ib440DetailsGetWs getIb440Config() {
        return ib440Config;
    }

    /**
     * Sets the value of the ib440Config property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440DetailsGetWs }
     *     
     */
    public void setIb440Config(Ib440DetailsGetWs value) {
        this.ib440Config = value;
    }

}
