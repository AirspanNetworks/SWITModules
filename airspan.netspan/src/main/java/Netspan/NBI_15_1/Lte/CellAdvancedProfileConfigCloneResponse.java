
package Netspan.NBI_15_1.Lte;

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
 *         &lt;element name="CellAdvancedProfileConfigCloneResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/>
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
    "cellAdvancedProfileConfigCloneResult"
})
@XmlRootElement(name = "CellAdvancedProfileConfigCloneResponse")
public class CellAdvancedProfileConfigCloneResponse {

    @XmlElement(name = "CellAdvancedProfileConfigCloneResult")
    protected ProfileResponse cellAdvancedProfileConfigCloneResult;

    /**
     * Gets the value of the cellAdvancedProfileConfigCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getCellAdvancedProfileConfigCloneResult() {
        return cellAdvancedProfileConfigCloneResult;
    }

    /**
     * Sets the value of the cellAdvancedProfileConfigCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setCellAdvancedProfileConfigCloneResult(ProfileResponse value) {
        this.cellAdvancedProfileConfigCloneResult = value;
    }

}
