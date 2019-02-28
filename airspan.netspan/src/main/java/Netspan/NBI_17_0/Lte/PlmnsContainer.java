
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlmnsContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlmnsContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Plmn" type="{http://Airspan.Netspan.WebServices}PlmnWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlmnsContainer", propOrder = {
    "plmn"
})
public class PlmnsContainer {

    @XmlElement(name = "Plmn")
    protected List<PlmnWs> plmn;

    /**
     * Gets the value of the plmn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plmn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlmn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlmnWs }
     * 
     * 
     */
    public List<PlmnWs> getPlmn() {
        if (plmn == null) {
            plmn = new ArrayList<PlmnWs>();
        }
        return this.plmn;
    }

}
