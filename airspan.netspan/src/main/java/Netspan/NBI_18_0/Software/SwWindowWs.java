
package Netspan.NBI_18_0.Software;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwWindowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwWindowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://Airspan.Netspan.WebServices}MaintWindowType" minOccurs="0"/&gt;
 *         &lt;element name="SwSchedule" type="{http://Airspan.Netspan.WebServices}SwWindowScheduleWs" minOccurs="0"/&gt;
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
@XmlType(name = "SwWindowWs", propOrder = {
    "name",
    "type",
    "swSchedule",
    "downloadOnlySwSchedule"
})
public class SwWindowWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "Type", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MaintWindowType> type;
    @XmlElement(name = "SwSchedule")
    protected SwWindowScheduleWs swSchedule;
    @XmlElement(name = "DownloadOnlySwSchedule")
    protected SwWindowScheduleWs downloadOnlySwSchedule;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaintWindowType }{@code >}
     *     
     */
    public JAXBElement<MaintWindowType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaintWindowType }{@code >}
     *     
     */
    public void setType(JAXBElement<MaintWindowType> value) {
        this.type = value;
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
