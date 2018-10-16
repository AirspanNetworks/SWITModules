
package Netspan.NBI_16_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNlmScanStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNlmScanStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NlmScanStatus" type="{http://Airspan.Netspan.WebServices}NlmScanStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNlmScanStatus", propOrder = {
    "nlmScanStatus"
})
public class ArrayOfNlmScanStatus {

    @XmlElement(name = "NlmScanStatus", nillable = true)
    protected List<NlmScanStatus> nlmScanStatus;

    /**
     * Gets the value of the nlmScanStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nlmScanStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNlmScanStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NlmScanStatus }
     * 
     * 
     */
    public List<NlmScanStatus> getNlmScanStatus() {
        if (nlmScanStatus == null) {
            nlmScanStatus = new ArrayList<NlmScanStatus>();
        }
        return this.nlmScanStatus;
    }

}
