
package Netspan.NBI_16_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesIbBase" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "hardwareCategory"
})
@XmlRootElement(name = "IBridgeBaseSystemDefaultProfileList")
public class IBridgeBaseSystemDefaultProfileList {

    @XmlElement(name = "HardwareCategory")
    @XmlSchemaType(name = "string")
    protected List<CategoriesIbBase> hardwareCategory;

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardwareCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardwareCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoriesIbBase }
     * 
     * 
     */
    public List<CategoriesIbBase> getHardwareCategory() {
        if (hardwareCategory == null) {
            hardwareCategory = new ArrayList<CategoriesIbBase>();
        }
        return this.hardwareCategory;
    }

}
