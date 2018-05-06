
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteRsiStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRsiStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAutoRsiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CurrentRsiValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AvailableRsiRanges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRsiStatusWs", propOrder = {
    "cellId",
    "isAutoRsiEnabled",
    "currentRsiValue",
    "availableRsiRanges"
})
public class LteRsiStatusWs {

    @XmlElement(name = "CellId")
    protected String cellId;
    @XmlElement(name = "IsAutoRsiEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isAutoRsiEnabled;
    @XmlElement(name = "CurrentRsiValue", required = true, type = Integer.class, nillable = true)
    protected Integer currentRsiValue;
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
     * Gets the value of the isAutoRsiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutoRsiEnabled() {
        return isAutoRsiEnabled;
    }

    /**
     * Sets the value of the isAutoRsiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutoRsiEnabled(Boolean value) {
        this.isAutoRsiEnabled = value;
    }

    /**
     * Gets the value of the currentRsiValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentRsiValue() {
        return currentRsiValue;
    }

    /**
     * Sets the value of the currentRsiValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentRsiValue(Integer value) {
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
