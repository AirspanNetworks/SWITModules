
package Netspan.NBI_18_0.Software;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwConfigSetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwConfigSetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://Airspan.Netspan.WebServices}RequestType" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareScheduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSwScheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SwSchedule" type="{http://Airspan.Netspan.WebServices}SwWindowScheduleWs" minOccurs="0"/&gt;
 *         &lt;element name="IsDownloadOnlySwScheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DownloadOnlySwSchedule" type="{http://Airspan.Netspan.WebServices}SwWindowScheduleWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwConfigSetWs", propOrder = {
    "request",
    "softwareImage",
    "softwareScheduleName",
    "isSwScheduled",
    "swSchedule",
    "isDownloadOnlySwScheduled",
    "downloadOnlySwSchedule"
})
public class SwConfigSetWs {

    @XmlElementRef(name = "Request", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestType> request;
    @XmlElement(name = "SoftwareImage")
    protected String softwareImage;
    @XmlElement(name = "SoftwareScheduleName")
    protected String softwareScheduleName;
    @XmlElementRef(name = "IsSwScheduled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSwScheduled;
    @XmlElement(name = "SwSchedule")
    protected SwWindowScheduleWs swSchedule;
    @XmlElementRef(name = "IsDownloadOnlySwScheduled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDownloadOnlySwScheduled;
    @XmlElement(name = "DownloadOnlySwSchedule")
    protected SwWindowScheduleWs downloadOnlySwSchedule;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     *     
     */
    public JAXBElement<RequestType> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     *     
     */
    public void setRequest(JAXBElement<RequestType> value) {
        this.request = value;
    }

    /**
     * Gets the value of the softwareImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareImage() {
        return softwareImage;
    }

    /**
     * Sets the value of the softwareImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareImage(String value) {
        this.softwareImage = value;
    }

    /**
     * Gets the value of the softwareScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareScheduleName() {
        return softwareScheduleName;
    }

    /**
     * Sets the value of the softwareScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareScheduleName(String value) {
        this.softwareScheduleName = value;
    }

    /**
     * Gets the value of the isSwScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSwScheduled() {
        return isSwScheduled;
    }

    /**
     * Sets the value of the isSwScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSwScheduled(JAXBElement<Boolean> value) {
        this.isSwScheduled = value;
    }

    /**
     * Gets the value of the swSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowScheduleWs }
     *     
     */
    public SwWindowScheduleWs getSwSchedule() {
        return swSchedule;
    }

    /**
     * Sets the value of the swSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowScheduleWs }
     *     
     */
    public void setSwSchedule(SwWindowScheduleWs value) {
        this.swSchedule = value;
    }

    /**
     * Gets the value of the isDownloadOnlySwScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDownloadOnlySwScheduled() {
        return isDownloadOnlySwScheduled;
    }

    /**
     * Sets the value of the isDownloadOnlySwScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDownloadOnlySwScheduled(JAXBElement<Boolean> value) {
        this.isDownloadOnlySwScheduled = value;
    }

    /**
     * Gets the value of the downloadOnlySwSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowScheduleWs }
     *     
     */
    public SwWindowScheduleWs getDownloadOnlySwSchedule() {
        return downloadOnlySwSchedule;
    }

    /**
     * Sets the value of the downloadOnlySwSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowScheduleWs }
     *     
     */
    public void setDownloadOnlySwSchedule(SwWindowScheduleWs value) {
        this.downloadOnlySwSchedule = value;
    }

}
