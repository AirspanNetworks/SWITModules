
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoPciWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoPciWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PciCollisionResolutionTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PciCollisionResolutionTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UeCollisionResolutionThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UeCollisionResolutionThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CollisionResolutionDelayfactorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CollisionResolutionDelayfactor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PciAllocPolicyIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PciAllocPolicy" type="{http://Airspan.Netspan.WebServices}PciAllocPolicyTypes" minOccurs="0"/>
 *         &lt;element name="PciConfusionAllowedIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PciConfusionAllowed" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="InitialPciListSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InitialPciListSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoPciWs", propOrder = {
    "pciCollisionResolutionTimerIsDefault",
    "pciCollisionResolutionTimer",
    "ueCollisionResolutionThresholdIsDefault",
    "ueCollisionResolutionThreshold",
    "collisionResolutionDelayfactorIsDefault",
    "collisionResolutionDelayfactor",
    "pciAllocPolicyIsDefault",
    "pciAllocPolicy",
    "pciConfusionAllowedIsDefault",
    "pciConfusionAllowed",
    "initialPciListSizeIsDefault",
    "initialPciListSize"
})
public class AutoPciWs {

    @XmlElementRef(name = "PciCollisionResolutionTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciCollisionResolutionTimerIsDefault;
    @XmlElementRef(name = "PciCollisionResolutionTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pciCollisionResolutionTimer;
    @XmlElementRef(name = "UeCollisionResolutionThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ueCollisionResolutionThresholdIsDefault;
    @XmlElementRef(name = "UeCollisionResolutionThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueCollisionResolutionThreshold;
    @XmlElementRef(name = "CollisionResolutionDelayfactorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> collisionResolutionDelayfactorIsDefault;
    @XmlElementRef(name = "CollisionResolutionDelayfactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> collisionResolutionDelayfactor;
    @XmlElementRef(name = "PciAllocPolicyIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciAllocPolicyIsDefault;
    @XmlElementRef(name = "PciAllocPolicy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PciAllocPolicyTypes> pciAllocPolicy;
    @XmlElementRef(name = "PciConfusionAllowedIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciConfusionAllowedIsDefault;
    @XmlElementRef(name = "PciConfusionAllowed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> pciConfusionAllowed;
    @XmlElementRef(name = "InitialPciListSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> initialPciListSizeIsDefault;
    @XmlElementRef(name = "InitialPciListSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialPciListSize;

    /**
     * Gets the value of the pciCollisionResolutionTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciCollisionResolutionTimerIsDefault() {
        return pciCollisionResolutionTimerIsDefault;
    }

    /**
     * Sets the value of the pciCollisionResolutionTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciCollisionResolutionTimerIsDefault(JAXBElement<Boolean> value) {
        this.pciCollisionResolutionTimerIsDefault = value;
    }

    /**
     * Gets the value of the pciCollisionResolutionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPciCollisionResolutionTimer() {
        return pciCollisionResolutionTimer;
    }

    /**
     * Sets the value of the pciCollisionResolutionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPciCollisionResolutionTimer(JAXBElement<Integer> value) {
        this.pciCollisionResolutionTimer = value;
    }

    /**
     * Gets the value of the ueCollisionResolutionThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUeCollisionResolutionThresholdIsDefault() {
        return ueCollisionResolutionThresholdIsDefault;
    }

    /**
     * Sets the value of the ueCollisionResolutionThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUeCollisionResolutionThresholdIsDefault(JAXBElement<Boolean> value) {
        this.ueCollisionResolutionThresholdIsDefault = value;
    }

    /**
     * Gets the value of the ueCollisionResolutionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeCollisionResolutionThreshold() {
        return ueCollisionResolutionThreshold;
    }

    /**
     * Sets the value of the ueCollisionResolutionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeCollisionResolutionThreshold(JAXBElement<Integer> value) {
        this.ueCollisionResolutionThreshold = value;
    }

    /**
     * Gets the value of the collisionResolutionDelayfactorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCollisionResolutionDelayfactorIsDefault() {
        return collisionResolutionDelayfactorIsDefault;
    }

    /**
     * Sets the value of the collisionResolutionDelayfactorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCollisionResolutionDelayfactorIsDefault(JAXBElement<Boolean> value) {
        this.collisionResolutionDelayfactorIsDefault = value;
    }

    /**
     * Gets the value of the collisionResolutionDelayfactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCollisionResolutionDelayfactor() {
        return collisionResolutionDelayfactor;
    }

    /**
     * Sets the value of the collisionResolutionDelayfactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCollisionResolutionDelayfactor(JAXBElement<Integer> value) {
        this.collisionResolutionDelayfactor = value;
    }

    /**
     * Gets the value of the pciAllocPolicyIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciAllocPolicyIsDefault() {
        return pciAllocPolicyIsDefault;
    }

    /**
     * Sets the value of the pciAllocPolicyIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciAllocPolicyIsDefault(JAXBElement<Boolean> value) {
        this.pciAllocPolicyIsDefault = value;
    }

    /**
     * Gets the value of the pciAllocPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PciAllocPolicyTypes }{@code >}
     *     
     */
    public JAXBElement<PciAllocPolicyTypes> getPciAllocPolicy() {
        return pciAllocPolicy;
    }

    /**
     * Sets the value of the pciAllocPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PciAllocPolicyTypes }{@code >}
     *     
     */
    public void setPciAllocPolicy(JAXBElement<PciAllocPolicyTypes> value) {
        this.pciAllocPolicy = value;
    }

    /**
     * Gets the value of the pciConfusionAllowedIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciConfusionAllowedIsDefault() {
        return pciConfusionAllowedIsDefault;
    }

    /**
     * Sets the value of the pciConfusionAllowedIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciConfusionAllowedIsDefault(JAXBElement<Boolean> value) {
        this.pciConfusionAllowedIsDefault = value;
    }

    /**
     * Gets the value of the pciConfusionAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getPciConfusionAllowed() {
        return pciConfusionAllowed;
    }

    /**
     * Sets the value of the pciConfusionAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setPciConfusionAllowed(JAXBElement<EnabledDisabledValues> value) {
        this.pciConfusionAllowed = value;
    }

    /**
     * Gets the value of the initialPciListSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInitialPciListSizeIsDefault() {
        return initialPciListSizeIsDefault;
    }

    /**
     * Sets the value of the initialPciListSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInitialPciListSizeIsDefault(JAXBElement<Boolean> value) {
        this.initialPciListSizeIsDefault = value;
    }

    /**
     * Gets the value of the initialPciListSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialPciListSize() {
        return initialPciListSize;
    }

    /**
     * Sets the value of the initialPciListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialPciListSize(JAXBElement<Integer> value) {
        this.initialPciListSize = value;
    }

}
