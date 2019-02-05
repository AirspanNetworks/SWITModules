
package Netspan.NBI_15_2.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteRsiStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRsiStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RsiStatus" type="{http://Airspan.Netspan.WebServices}ManualAutomaticValues"/&gt;
 *         &lt;element name="CurrentRsiValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AvailableRsiRanges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRsiStatusWs", propOrder = {
    "cellId",
    "rsiStatus",
    "currentRsiValue",
    "availableRsiRanges"
})
public class LteRsiStatusWs {

    @XmlElement(name = "CellId")
    protected String cellId;
    @XmlElement(name = "RsiStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ManualAutomaticValues rsiStatus;
    @XmlElementRef(name = "CurrentRsiValue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> currentRsiValue;
    @XmlElement(name = "AvailableRsiRanges")
    protected String availableRsiRanges;

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellId(String value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the rsiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManualAutomaticValues }
     *     
     */
    public ManualAutomaticValues getRsiStatus() {
        return rsiStatus;
    }

    /**
     * Sets the value of the rsiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualAutomaticValues }
     *     
     */
    public void setRsiStatus(ManualAutomaticValues value) {
        this.rsiStatus = value;
    }

    /**
     * Gets the value of the currentRsiValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCurrentRsiValue() {
        return currentRsiValue;
    }

    /**
     * Sets the value of the currentRsiValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCurrentRsiValue(JAXBElement<Integer> value) {
        this.currentRsiValue = value;
    }

    /**
     * Gets the value of the availableRsiRanges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableRsiRanges() {
        return availableRsiRanges;
    }

    /**
     * Sets the value of the availableRsiRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableRsiRanges(String value) {
        this.availableRsiRanges = value;
    }

}
