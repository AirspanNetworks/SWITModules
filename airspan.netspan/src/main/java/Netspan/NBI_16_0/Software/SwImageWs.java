
package Netspan.NBI_16_0.Software;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwImageWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwImageWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}HardwareCategory"/>
 *         &lt;element name="SoftwareServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareFileInfo" type="{http://Airspan.Netspan.WebServices}SwFileInfoWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected HardwareCategory hardwareCategory;
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
     *     {@link HardwareCategory }
     *     
     */
    public HardwareCategory getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link HardwareCategory }
     *     
     */
    public void setHardwareCategory(HardwareCategory value) {
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
