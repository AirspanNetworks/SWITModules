
package Netspan.NBI_17_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmbmsStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmbmsStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmbmsStatusWs" type="{http://Airspan.Netspan.WebServices}EmbmsStatusWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmbmsStatusWs", propOrder = {
    "embmsStatusWs"
})
public class ArrayOfEmbmsStatusWs {

    @XmlElement(name = "EmbmsStatusWs", nillable = true)
    protected List<EmbmsStatusWs> embmsStatusWs;

    /**
     * Gets the value of the embmsStatusWs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embmsStatusWs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbmsStatusWs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmbmsStatusWs }
     * 
     * 
     */
    public List<EmbmsStatusWs> getEmbmsStatusWs() {
        if (embmsStatusWs == null) {
            embmsStatusWs = new ArrayList<EmbmsStatusWs>();
        }
        return this.embmsStatusWs;
    }

}
