
package Netspan.NBI_17_5.Software;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.HardwareCategory;


/**
 * <p>Java class for SwImageWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwImageWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}HardwareCategory" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareFileInfo" type="{http://Airspan.Netspan.WebServices}SwFileInfoWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwImageWs", propOrder = {
    "name",
    "hardwareCategory",
    "softwareServer",
    "softwareFileInfo"
})
public class SwImageWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<HardwareCategory> hardwareCategory;
    @XmlElement(name = "SoftwareServer")
    protected String softwareServer;
    @XmlElement(name = "SoftwareFileInfo")
    protected List<SwFileInfoWs> softwareFileInfo;

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
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HardwareCategory }{@code >}
     *     
     */
    public JAXBElement<HardwareCategory> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HardwareCategory }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<HardwareCategory> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the softwareServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareServer() {
        return softwareServer;
    }

    /**
     * Sets the value of the softwareServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareServer(String value) {
        this.softwareServer = value;
    }

    /**
     * Gets the value of the softwareFileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareFileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareFileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwFileInfoWs }
     * 
     * 
     */
    public List<SwFileInfoWs> getSoftwareFileInfo() {
        if (softwareFileInfo == null) {
            softwareFileInfo = new ArrayList<SwFileInfoWs>();
        }
        return this.softwareFileInfo;
    }

}
