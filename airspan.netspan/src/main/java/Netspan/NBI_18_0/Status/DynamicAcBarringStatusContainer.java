
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicAcBarringStatusContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicAcBarringStatusContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DynamicAcBarring" type="{http://Airspan.Netspan.WebServices}DynamicAcBarringStatusWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicAcBarringStatusContainer", propOrder = {
    "dynamicAcBarring"
})
public class DynamicAcBarringStatusContainer {

    @XmlElement(name = "DynamicAcBarring")
    protected List<DynamicAcBarringStatusWs> dynamicAcBarring;

    /**
     * Gets the value of the dynamicAcBarring property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicAcBarring property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicAcBarring().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicAcBarringStatusWs }
     * 
     * 
     */
    public List<DynamicAcBarringStatusWs> getDynamicAcBarring() {
        if (dynamicAcBarring == null) {
            dynamicAcBarring = new ArrayList<DynamicAcBarringStatusWs>();
        }
        return this.dynamicAcBarring;
    }

}
