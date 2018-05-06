
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NlmIntraFreqScanListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NlmIntraFreqScanListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NlmIntraFreqScan" type="{http://Airspan.Netspan.WebServices}NlmIntraFreqScan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NlmIntraFreqScanListContainer", propOrder = {
    "nlmIntraFreqScan"
})
public class NlmIntraFreqScanListContainer {

    @XmlElement(name = "NlmIntraFreqScan")
    protected List<NlmIntraFreqScan> nlmIntraFreqScan;

    /**
     * Gets the value of the nlmIntraFreqScan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nlmIntraFreqScan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNlmIntraFreqScan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NlmIntraFreqScan }
     * 
     * 
     */
    public List<NlmIntraFreqScan> getNlmIntraFreqScan() {
        if (nlmIntraFreqScan == null) {
            nlmIntraFreqScan = new ArrayList<NlmIntraFreqScan>();
        }
        return this.nlmIntraFreqScan;
    }

}
