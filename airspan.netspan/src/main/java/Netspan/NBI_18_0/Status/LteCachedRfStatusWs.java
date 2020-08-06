
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCachedRfStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCachedRfStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualTxPowerDbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasuredVswr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCachedRfStatusWs", propOrder = {
    "rfNumber",
    "actualTxPowerDbm",
    "measuredVswr"
})
public class LteCachedRfStatusWs {

    @XmlElement(name = "RfNumber")
    protected String rfNumber;
    @XmlElement(name = "ActualTxPowerDbm")
    protected String actualTxPowerDbm;
    @XmlElement(name = "MeasuredVswr")
    protected String measuredVswr;

    /**
     * Gets the value of the rfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfNumber() {
        return rfNumber;
    }

    /**
     * Sets the value of the rfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfNumber(String value) {
        this.rfNumber = value;
    }

    /**
     * Gets the value of the actualTxPowerDbm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTxPowerDbm() {
        return actualTxPowerDbm;
    }

    /**
     * Sets the value of the actualTxPowerDbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTxPowerDbm(String value) {
        this.actualTxPowerDbm = value;
    }

    /**
     * Gets the value of the measuredVswr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuredVswr() {
        return measuredVswr;
    }

    /**
     * Sets the value of the measuredVswr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuredVswr(String value) {
        this.measuredVswr = value;
    }

}
