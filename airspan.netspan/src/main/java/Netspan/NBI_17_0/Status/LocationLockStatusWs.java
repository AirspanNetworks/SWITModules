
package Netspan.NBI_17_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationLockStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationLockStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FingerPrintList" type="{http://Airspan.Netspan.WebServices}ArrayOfLocationLockFingerPrintWs" minOccurs="0"/&gt;
 *         &lt;element name="FingerPrintMark" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FingerPrintLocked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EvalFingerPrintList" type="{http://Airspan.Netspan.WebServices}ArrayOfLocationLockFingerPrintWs" minOccurs="0"/&gt;
 *         &lt;element name="EvalFingerPrintMark" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationLockStatusWs", propOrder = {
    "fingerPrintList",
    "fingerPrintMark",
    "fingerPrintLocked",
    "evalFingerPrintList",
    "evalFingerPrintMark"
})
public class LocationLockStatusWs {

    @XmlElement(name = "FingerPrintList")
    protected ArrayOfLocationLockFingerPrintWs fingerPrintList;
    @XmlElementRef(name = "FingerPrintMark", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fingerPrintMark;
    @XmlElement(name = "FingerPrintLocked")
    protected String fingerPrintLocked;
    @XmlElement(name = "EvalFingerPrintList")
    protected ArrayOfLocationLockFingerPrintWs evalFingerPrintList;
    @XmlElementRef(name = "EvalFingerPrintMark", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> evalFingerPrintMark;

    /**
     * Gets the value of the fingerPrintList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationLockFingerPrintWs }
     *     
     */
    public ArrayOfLocationLockFingerPrintWs getFingerPrintList() {
        return fingerPrintList;
    }

    /**
     * Sets the value of the fingerPrintList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationLockFingerPrintWs }
     *     
     */
    public void setFingerPrintList(ArrayOfLocationLockFingerPrintWs value) {
        this.fingerPrintList = value;
    }

    /**
     * Gets the value of the fingerPrintMark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFingerPrintMark() {
        return fingerPrintMark;
    }

    /**
     * Sets the value of the fingerPrintMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFingerPrintMark(JAXBElement<Integer> value) {
        this.fingerPrintMark = value;
    }

    /**
     * Gets the value of the fingerPrintLocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFingerPrintLocked() {
        return fingerPrintLocked;
    }

    /**
     * Sets the value of the fingerPrintLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFingerPrintLocked(String value) {
        this.fingerPrintLocked = value;
    }

    /**
     * Gets the value of the evalFingerPrintList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationLockFingerPrintWs }
     *     
     */
    public ArrayOfLocationLockFingerPrintWs getEvalFingerPrintList() {
        return evalFingerPrintList;
    }

    /**
     * Sets the value of the evalFingerPrintList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationLockFingerPrintWs }
     *     
     */
    public void setEvalFingerPrintList(ArrayOfLocationLockFingerPrintWs value) {
        this.evalFingerPrintList = value;
    }

    /**
     * Gets the value of the evalFingerPrintMark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEvalFingerPrintMark() {
        return evalFingerPrintMark;
    }

    /**
     * Sets the value of the evalFingerPrintMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEvalFingerPrintMark(JAXBElement<Integer> value) {
        this.evalFingerPrintMark = value;
    }

}
