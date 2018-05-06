
package Netspan.NBI_16_0.Status;

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
 * &lt;complexType name="ArrayOfLteSonAnrGetResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LteSonAnrGetResult" type="{http://Airspan.Netspan.WebServices}LteSonAnrGetResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
