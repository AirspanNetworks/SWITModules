
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sib15FrequencyListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sib15FrequencyListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sib15Freq" type="{http://Airspan.Netspan.WebServices}WSEmbmsSib15FreqEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sib15FrequencyListContainer", propOrder = {
    "sib15Freq"
})
public class Sib15FrequencyListContainer {

    @XmlElement(name = "Sib15Freq")
    protected List<WSEmbmsSib15FreqEntry> sib15Freq;

    /**
     * Gets the value of the sib15Freq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sib15Freq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSib15Freq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSEmbmsSib15FreqEntry }
     * 
     * 
     */
    public List<WSEmbmsSib15FreqEntry> getSib15Freq() {
        if (sib15Freq == null) {
            sib15Freq = new ArrayList<WSEmbmsSib15FreqEntry>();
        }
        return this.sib15Freq;
    }

}
