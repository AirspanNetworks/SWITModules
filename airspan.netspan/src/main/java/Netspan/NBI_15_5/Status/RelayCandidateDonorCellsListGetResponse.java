
package Netspan.NBI_15_5.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelayCandidateDonorCellsListGetResult" type="{http://Airspan.Netspan.WebServices}RelayDonorCellListGetResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "relayCandidateDonorCellsListGetResult"
})
@XmlRootElement(name = "RelayCandidateDonorCellsListGetResponse")
public class RelayCandidateDonorCellsListGetResponse {

    @XmlElement(name = "RelayCandidateDonorCellsListGetResult")
    protected RelayDonorCellListGetResult relayCandidateDonorCellsListGetResult;

    /**
     * Gets the value of the relayCandidateDonorCellsListGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayDonorCellListGetResult }
     *     
     */
    public RelayDonorCellListGetResult getRelayCandidateDonorCellsListGetResult() {
        return relayCandidateDonorCellsListGetResult;
    }

    /**
     * Sets the value of the relayCandidateDonorCellsListGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayDonorCellListGetResult }
     *     
     */
    public void setRelayCandidateDonorCellsListGetResult(RelayDonorCellListGetResult value) {
        this.relayCandidateDonorCellsListGetResult = value;
    }

}
