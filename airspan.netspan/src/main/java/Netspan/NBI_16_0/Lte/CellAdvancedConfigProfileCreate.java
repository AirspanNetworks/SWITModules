
package Netspan.NBI_16_0.Lte;

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
 *         &lt;element name="CellAdvancedProfile" type="{http://Airspan.Netspan.WebServices}EnbCellAdvancedProfile" minOccurs="0"/>
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
    "cellAdvancedProfile"
})
@XmlRootElement(name = "CellAdvancedConfigProfileCreate")
public class CellAdvancedConfigProfileCreate {

    @XmlElement(name = "CellAdvancedProfile")
    protected EnbCellAdvancedProfile cellAdvancedProfile;

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
