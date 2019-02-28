
package Netspan.NBI_17_0.Lte;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MultiCellProfile" type="{http://Airspan.Netspan.WebServices}EnbMultiCellProfile" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "multiCellProfile"
})
@XmlRootElement(name = "MultiCellProfileUpdate")
public class MultiCellProfileUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "MultiCellProfile")
    protected EnbMultiCellProfile multiCellProfile;

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
     * Gets the value of the multiCellProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbMultiCellProfile }
     *     
     */
    public EnbMultiCellProfile getMultiCellProfile() {
        return multiCellProfile;
    }

    /**
     * Sets the value of the multiCellProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbMultiCellProfile }
     *     
     */
    public void setMultiCellProfile(EnbMultiCellProfile value) {
        this.multiCellProfile = value;
    }

}
