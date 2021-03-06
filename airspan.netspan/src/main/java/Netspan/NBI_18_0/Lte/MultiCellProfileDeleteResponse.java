
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="MultiCellProfileDeleteResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "multiCellProfileDeleteResult"
})
@XmlRootElement(name = "MultiCellProfileDeleteResponse")
public class MultiCellProfileDeleteResponse {

    @XmlElement(name = "MultiCellProfileDeleteResult")
    protected ProfileResponse multiCellProfileDeleteResult;

    /**
     * Gets the value of the multiCellProfileDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getMultiCellProfileDeleteResult() {
        return multiCellProfileDeleteResult;
    }

    /**
     * Sets the value of the multiCellProfileDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setMultiCellProfileDeleteResult(ProfileResponse value) {
        this.multiCellProfileDeleteResult = value;
    }

}
