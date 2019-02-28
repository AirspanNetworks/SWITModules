
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedModeDrxWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedModeDrxWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RollbackToCdrxConfigTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RollbackToCdrxConfigTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedModeDrxWs", propOrder = {
    "rollbackToCdrxConfigTimerIsDefault",
    "rollbackToCdrxConfigTimer"
})
public class ConnectedModeDrxWs {

    @XmlElementRef(name = "RollbackToCdrxConfigTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rollbackToCdrxConfigTimerIsDefault;
    @XmlElementRef(name = "RollbackToCdrxConfigTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rollbackToCdrxConfigTimer;

    /**
     * Gets the value of the rollbackToCdrxConfigTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRollbackToCdrxConfigTimerIsDefault() {
        return rollbackToCdrxConfigTimerIsDefault;
    }

    /**
     * Sets the value of the rollbackToCdrxConfigTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRollbackToCdrxConfigTimerIsDefault(JAXBElement<Boolean> value) {
        this.rollbackToCdrxConfigTimerIsDefault = value;
    }

    /**
     * Gets the value of the rollbackToCdrxConfigTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRollbackToCdrxConfigTimer() {
        return rollbackToCdrxConfigTimer;
    }

    /**
     * Sets the value of the rollbackToCdrxConfigTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRollbackToCdrxConfigTimer(JAXBElement<Integer> value) {
        this.rollbackToCdrxConfigTimer = value;
    }

}
