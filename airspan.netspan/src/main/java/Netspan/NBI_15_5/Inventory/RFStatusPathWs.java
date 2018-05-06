
package Netspan.NBI_15_5.Inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RFStatusPathWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFStatusPathWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RfNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OperationalStatus" type="{http://Airspan.Netspan.WebServices}OperationalStatusValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFStatusPathWs", propOrder = {
    "rfNumber",
    "operationalStatus"
})
public class RFStatusPathWs {

    @XmlElement(name = "RfNumber")
    protected int rfNumber;
    @XmlElementRef(name = "OperationalStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<OperationalStatusValues> operationalStatus;

    /**
     * Gets the value of the rfNumber property.
     * 
     */
    public int getRfNumber() {
        return rfNumber;
    }

    /**
     * Sets the value of the rfNumber property.
     * 
     */
    public void setRfNumber(int value) {
        this.rfNumber = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}
     *     
     */
    public JAXBElement<OperationalStatusValues> getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}
     *     
     */
    public void setOperationalStatus(JAXBElement<OperationalStatusValues> value) {
        this.operationalStatus = value;
    }

}
