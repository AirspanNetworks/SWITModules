
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QdclListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QdclListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QdclEntry" type="{http://Airspan.Netspan.WebServices}QdclEntryWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QdclListContainer", propOrder = {
    "qdclEntry"
})
public class QdclListContainer {

    @XmlElement(name = "QdclEntry")
    protected List<QdclEntryWs> qdclEntry;

    /**
     * Gets the value of the qdclEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qdclEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQdclEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QdclEntryWs }
     * 
     * 
     */
    public List<QdclEntryWs> getQdclEntry() {
        if (qdclEntry == null) {
            qdclEntry = new ArrayList<QdclEntryWs>();
        }
        return this.qdclEntry;
    }

}
