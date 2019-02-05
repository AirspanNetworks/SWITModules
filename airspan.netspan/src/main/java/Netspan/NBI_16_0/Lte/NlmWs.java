
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for NlmWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NlmWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkListeningModuleIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NetworkListeningModule" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="RSRPThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RSRPThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSync" type="{http://Airspan.Netspan.WebServices}NlSyncWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NlmWs", propOrder = {
    "networkListeningModuleIsDefault",
    "networkListeningModule",
    "rsrpThresholdIsDefault",
    "rsrpThreshold",
    "nlSync"
})
public class NlmWs {

    @XmlElementRef(name = "NetworkListeningModuleIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> networkListeningModuleIsDefault;
    @XmlElementRef(name = "NetworkListeningModule", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> networkListeningModule;
    @XmlElementRef(name = "RSRPThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rsrpThresholdIsDefault;
    @XmlElementRef(name = "RSRPThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpThreshold;
    @XmlElement(name = "NlSync")
    protected NlSyncWs nlSync;

    /**
     * Gets the value of the networkListeningModuleIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNetworkListeningModuleIsDefault() {
        return networkListeningModuleIsDefault;
    }

    /**
     * Sets the value of the networkListeningModuleIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNetworkListeningModuleIsDefault(JAXBElement<Boolean> value) {
        this.networkListeningModuleIsDefault = value;
    }

    /**
     * Gets the value of the networkListeningModule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNetworkListeningModule() {
        return networkListeningModule;
    }

    /**
     * Sets the value of the networkListeningModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNetworkListeningModule(JAXBElement<EnabledStates> value) {
        this.networkListeningModule = value;
    }

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
