
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayDetailsPnp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayDetailsPnp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}RelayDetailsParams"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NbifEventAlarmForwarding" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="PnpHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayDetailsPnp", propOrder = {
    "name",
    "description",
    "region",
    "site",
    "nbifEventAlarmForwarding",
    "pnpHardwareId"
})
@XmlSeeAlso({
    RelayDetails.class
})
public class RelayDetailsPnp
    extends RelayDetailsParams
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElementRef(name = "NbifEventAlarmForwarding", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> nbifEventAlarmForwarding;
    @XmlElement(name = "PnpHardwareId")
    protected String pnpHardwareId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the nbifEventAlarmForwarding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNbifEventAlarmForwarding() {
        return nbifEventAlarmForwarding;
    }

    /**
     * Sets the value of the nbifEventAlarmForwarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNbifEventAlarmForwarding(JAXBElement<EnabledDisabledStates> value) {
        this.nbifEventAlarmForwarding = value;
    }

    /**
     * Gets the value of the pnpHardwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpHardwareId() {
        return pnpHardwareId;
    }

    /**
     * Sets the value of the pnpHardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpHardwareId(String value) {
        this.pnpHardwareId = value;
    }

}
