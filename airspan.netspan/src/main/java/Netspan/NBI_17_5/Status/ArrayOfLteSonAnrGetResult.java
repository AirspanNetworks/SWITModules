
package Netspan.NBI_17_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLteSonAnrGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLteSonAnrGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LteSonAnrGetResult" type="{http://Airspan.Netspan.WebServices}LteSonAnrGetResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLteSonAnrGetResult", propOrder = {
    "lteSonAnrGetResult"
})
public class ArrayOfLteSonAnrGetResult {

    @XmlElement(name = "LteSonAnrGetResult", nillable = true)
    protected List<LteSonAnrGetResult> lteSonAnrGetResult;

    /**
     * Gets the value of the lteSonAnrGetResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lteSonAnrGetResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLteSonAnrGetResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteSonAnrGetResult }
     * 
     * 
     */
    public List<LteSonAnrGetResult> getLteSonAnrGetResult() {
        if (lteSonAnrGetResult == null) {
            lteSonAnrGetResult = new ArrayList<LteSonAnrGetResult>();
        }
        return this.lteSonAnrGetResult;
    }

}
