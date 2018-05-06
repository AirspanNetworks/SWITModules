
package Netspan.NBI_15_1.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryTaskResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoveryTaskResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscoveryTaskResultCode" type="{http://Airspan.Netspan.WebServices}DiscoveryTaskResultValues"/>
 *         &lt;element name="DiscoveryTaskResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscoveryTaskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryTaskResult", propOrder = {
    "discoveryTaskResultCode",
    "discoveryTaskResultString",
    "discoveryTaskName"
})
public class DiscoveryTaskResult {

    @XmlElement(name = "DiscoveryTaskResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected DiscoveryTaskResultValues discoveryTaskResultCode;
    @XmlElement(name = "DiscoveryTaskResultString")
    protected String discoveryTaskResultString;
    @XmlElement(name = "DiscoveryTaskName")
    protected String discoveryTaskName;

    /**
     * Gets the value of the discoveryTaskResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryTaskResultValues }
     *     
     */
    public DiscoveryTaskResultValues getDiscoveryTaskResultCode() {
        return discoveryTaskResultCode;
    }

    /**
     * Sets the value of the discoveryTaskResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryTaskResultValues }
     *     
     */
    public void setDiscoveryTaskResultCode(DiscoveryTaskResultValues value) {
        this.discoveryTaskResultCode = value;
    }

    /**
     * Gets the value of the discoveryTaskResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryTaskResultString() {
        return discoveryTaskResultString;
    }

    /**
     * Sets the value of the discoveryTaskResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryTaskResultString(String value) {
        this.discoveryTaskResultString = value;
    }

    /**
     * Gets the value of the discoveryTaskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryTaskName() {
        return discoveryTaskName;
    }

    /**
     * Sets the value of the discoveryTaskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryTaskName(String value) {
        this.discoveryTaskName = value;
    }

}
