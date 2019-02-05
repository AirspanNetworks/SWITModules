
package Netspan.NBI_15_2.Lte;

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
 *         &lt;element name="CellAdvancedProfile" type="{http://Airspan.Netspan.WebServices}EnbCellAdvancedProfile" minOccurs="0"/&gt;
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
    "cellAdvancedProfile"
})
@XmlRootElement(name = "CellAdvancedConfigProfileUpdate")
public class CellAdvancedConfigProfileUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CellAdvancedProfile")
    protected EnbCellAdvancedProfile cellAdvancedProfile;

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
     * Gets the value of the cellAdvancedProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbCellAdvancedProfile }
     *     
     */
    public EnbCellAdvancedProfile getCellAdvancedProfile() {
        return cellAdvancedProfile;
    }

    /**
     * Sets the value of the cellAdvancedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbCellAdvancedProfile }
     *     
     */
    public void setCellAdvancedProfile(EnbCellAdvancedProfile value) {
        this.cellAdvancedProfile = value;
    }

}
