
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicAcBarringPropertiesListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicAcBarringPropertiesListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DynamicAcBarringProperty" type="{http://Airspan.Netspan.WebServices}DynamicAcBarringPropertiesWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicAcBarringPropertiesListContainer", propOrder = {
    "dynamicAcBarringProperty"
})
public class DynamicAcBarringPropertiesListContainer {

    @XmlElement(name = "DynamicAcBarringProperty")
    protected List<DynamicAcBarringPropertiesWs> dynamicAcBarringProperty;

    /**
     * Gets the value of the dynamicAcBarringProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicAcBarringProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicAcBarringProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicAcBarringPropertiesWs }
     * 
     * 
     */
    public List<DynamicAcBarringPropertiesWs> getDynamicAcBarringProperty() {
        if (dynamicAcBarringProperty == null) {
            dynamicAcBarringProperty = new ArrayList<DynamicAcBarringPropertiesWs>();
        }
        return this.dynamicAcBarringProperty;
    }

}
