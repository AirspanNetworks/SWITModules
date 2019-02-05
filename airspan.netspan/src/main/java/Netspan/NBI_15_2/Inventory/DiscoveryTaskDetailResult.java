
package Netspan.NBI_15_2.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryTaskDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoveryTaskDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoveryTaskResultCode" type="{http://Airspan.Netspan.WebServices}DiscoveryTaskResultValues"/&gt;
 *         &lt;element name="DiscoveryTaskResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscoveryTask" type="{http://Airspan.Netspan.WebServices}DiscoveryTask" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryTaskDetailResult", propOrder = {
    "discoveryTaskResultCode",
    "discoveryTaskResultString",
    "discoveryTask"
})
public class DiscoveryTaskDetailResult {

    @XmlElement(name = "DiscoveryTaskResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected DiscoveryTaskResultValues discoveryTaskResultCode;
    @XmlElement(name = "DiscoveryTaskResultString")
    protected String discoveryTaskResultString;
    @XmlElement(name = "DiscoveryTask")
    protected DiscoveryTask discoveryTask;

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
     * Gets the value of the discoveryTask property.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryTask }
     *     
     */
    public DiscoveryTask getDiscoveryTask() {
        return discoveryTask;
    }

    /**
     * Sets the value of the discoveryTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryTask }
     *     
     */
    public void setDiscoveryTask(DiscoveryTask value) {
        this.discoveryTask = value;
    }

}
