
package Netspan.NBI_16_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SwStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunningVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandbyVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NmsState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastReadFromNode" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsScheduled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwStatusWs", propOrder = {
    "imageType",
    "runningVersion",
    "standbyVersion",
    "lastRequested",
    "nmsState",
    "nodeState",
    "lastReadFromNode",
    "isScheduled"
})
public class SwStatusWs {

    @XmlElement(name = "ImageType")
    protected String imageType;
    @XmlElement(name = "RunningVersion")
    protected String runningVersion;
    @XmlElement(name = "StandbyVersion")
    protected String standbyVersion;
    @XmlElement(name = "LastRequested")
    protected String lastRequested;
    @XmlElement(name = "NmsState")
    protected String nmsState;
    @XmlElement(name = "NodeState")
    protected String nodeState;
    @XmlElementRef(name = "LastReadFromNode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastReadFromNode;
    @XmlElement(name = "IsScheduled")
    protected String isScheduled;

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the runningVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunningVersion() {
        return runningVersion;
    }

    /**
     * Sets the value of the runningVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunningVersion(String value) {
        this.runningVersion = value;
    }

    /**
     * Gets the value of the standbyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyVersion() {
        return standbyVersion;
    }

    /**
     * Sets the value of the standbyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyVersion(String value) {
        this.standbyVersion = value;
    }

    /**
     * Gets the value of the lastRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRequested() {
        return lastRequested;
    }

    /**
     * Sets the value of the lastRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRequested(String value) {
        this.lastRequested = value;
    }

    /**
     * Gets the value of the nmsState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsState() {
        return nmsState;
    }

    /**
     * Sets the value of the nmsState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsState(String value) {
        this.nmsState = value;
    }

    /**
     * Gets the value of the nodeState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeState() {
        return nodeState;
    }

    /**
     * Sets the value of the nodeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeState(String value) {
        this.nodeState = value;
    }

    /**
     * Gets the value of the lastReadFromNode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastReadFromNode() {
        return lastReadFromNode;
    }

    /**
     * Sets the value of the lastReadFromNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastReadFromNode(JAXBElement<XMLGregorianCalendar> value) {
        this.lastReadFromNode = value;
    }

    /**
     * Gets the value of the isScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsScheduled() {
        return isScheduled;
    }

    /**
     * Sets the value of the isScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsScheduled(String value) {
        this.isScheduled = value;
    }

}
