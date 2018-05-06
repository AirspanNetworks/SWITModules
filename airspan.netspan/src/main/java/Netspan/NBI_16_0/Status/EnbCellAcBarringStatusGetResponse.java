
package Netspan.NBI_16_0.Status;

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
 *         &lt;element name="EnbCellAcBarringStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteCellAcBarringGetResult" minOccurs="0"/>
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
    "enbCellAcBarringStatusGetResult"
})
@XmlRootElement(name = "EnbCellAcBarringStatusGetResponse")
public class EnbCellAcBarringStatusGetResponse {

    @XmlElement(name = "EnbCellAcBarringStatusGetResult")
    protected LteCellAcBarringGetResult enbCellAcBarringStatusGetResult;

    /**
     * Gets the value of the enbCellAcBarringStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteCellAcBarringGetResult }
     *     
     */
    public LteCellAcBarringGetResult getEnbCellAcBarringStatusGetResult() {
        return enbCellAcBarringStatusGetResult;
    }

    /**
     * Sets the value of the enbCellAcBarringStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCellAcBarringGetResult }
     *     
     */
    public void setEnbCellAcBarringStatusGetResult(LteCellAcBarringGetResult value) {
        this.enbCellAcBarringStatusGetResult = value;
    }

}
