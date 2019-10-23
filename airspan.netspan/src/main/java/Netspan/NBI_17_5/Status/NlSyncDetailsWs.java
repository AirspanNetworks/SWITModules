
package Netspan.NBI_17_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NlSyncDetailsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NlSyncDetailsWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnavailableReason" type="{http://Airspan.Netspan.WebServices}UnavailReasonTypesWs" minOccurs="0"/&gt;
 *         &lt;element name="LockedPci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LockedEcgi" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NlScanStatusList" type="{http://Airspan.Netspan.WebServices}NlScanStatusItemWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NlSyncDetailsWs", propOrder = {
    "unavailableReason",
    "lockedPci",
    "lockedEcgi",
    "nlScanStatusList"
})
public class NlSyncDetailsWs {

    @XmlElementRef(name = "UnavailableReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<UnavailReasonTypesWs> unavailableReason;
    @XmlElementRef(name = "LockedPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lockedPci;
    @XmlElementRef(name = "LockedEcgi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lockedEcgi;
    @XmlElement(name = "NlScanStatusList")
    protected List<NlScanStatusItemWs> nlScanStatusList;

    /**
     * Gets the value of the unavailableReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnavailReasonTypesWs }{@code >}
     *     
     */
    public JAXBElement<UnavailReasonTypesWs> getUnavailableReason() {
        return unavailableReason;
    }

    /**
     * Sets the value of the unavailableReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnavailReasonTypesWs }{@code >}
     *     
     */
    public void setUnavailableReason(JAXBElement<UnavailReasonTypesWs> value) {
        this.unavailableReason = value;
    }

    /**
     * Gets the value of the lockedPci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLockedPci() {
        return lockedPci;
    }

    /**
     * Sets the value of the lockedPci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLockedPci(JAXBElement<Integer> value) {
        this.lockedPci = value;
    }

    /**
     * Gets the value of the lockedEcgi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLockedEcgi() {
        return lockedEcgi;
    }

    /**
     * Sets the value of the lockedEcgi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLockedEcgi(JAXBElement<Long> value) {
        this.lockedEcgi = value;
    }

    /**
     * Gets the value of the nlScanStatusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nlScanStatusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNlScanStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NlScanStatusItemWs }
     * 
     * 
     */
    public List<NlScanStatusItemWs> getNlScanStatusList() {
        if (nlScanStatusList == null) {
            nlScanStatusList = new ArrayList<NlScanStatusItemWs>();
        }
        return this.nlScanStatusList;
    }

}
