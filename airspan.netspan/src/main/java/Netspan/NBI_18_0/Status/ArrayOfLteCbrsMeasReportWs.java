
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLteCbrsMeasReportWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLteCbrsMeasReportWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LteCbrsMeasReportWs" type="{http://Airspan.Netspan.WebServices}LteCbrsMeasReportWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLteCbrsMeasReportWs", propOrder = {
    "lteCbrsMeasReportWs"
})
public class ArrayOfLteCbrsMeasReportWs {

    @XmlElement(name = "LteCbrsMeasReportWs", nillable = true)
    protected List<LteCbrsMeasReportWs> lteCbrsMeasReportWs;

    /**
     * Gets the value of the lteCbrsMeasReportWs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lteCbrsMeasReportWs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLteCbrsMeasReportWs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteCbrsMeasReportWs }
     * 
     * 
     */
    public List<LteCbrsMeasReportWs> getLteCbrsMeasReportWs() {
        if (lteCbrsMeasReportWs == null) {
            lteCbrsMeasReportWs = new ArrayList<LteCbrsMeasReportWs>();
        }
        return this.lteCbrsMeasReportWs;
    }

}
