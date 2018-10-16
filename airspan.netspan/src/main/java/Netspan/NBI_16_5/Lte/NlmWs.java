
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NlmWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NlmWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RSRPThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RSRPThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NlSync" type="{http://Airspan.Netspan.WebServices}NlSyncWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NlmWs", propOrder = {
    "rsrpThresholdIsDefault",
    "rsrpThreshold",
    "nlSync"
})
public class NlmWs {

    @XmlElementRef(name = "RSRPThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rsrpThresholdIsDefault;
    @XmlElementRef(name = "RSRPThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpThreshold;
    @XmlElement(name = "NlSync")
    protected NlSyncWs nlSync;

    /**
     * Gets the value of the rsrpThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRSRPThresholdIsDefault() {
        return rsrpThresholdIsDefault;
    }

    /**
     * Sets the value of the rsrpThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRSRPThresholdIsDefault(JAXBElement<Boolean> value) {
        this.rsrpThresholdIsDefault = value;
    }

    /**
     * Gets the value of the rsrpThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRSRPThreshold() {
        return rsrpThreshold;
    }

    /**
     * Sets the value of the rsrpThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRSRPThreshold(JAXBElement<Integer> value) {
        this.rsrpThreshold = value;
    }

    /**
     * Gets the value of the nlSync property.
     * 
     * @return
     *     possible object is
     *     {@link NlSyncWs }
     *     
     */
    public NlSyncWs getNlSync() {
        return nlSync;
    }

    /**
     * Sets the value of the nlSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link NlSyncWs }
     *     
     */
    public void setNlSync(NlSyncWs value) {
        this.nlSync = value;
    }

}
