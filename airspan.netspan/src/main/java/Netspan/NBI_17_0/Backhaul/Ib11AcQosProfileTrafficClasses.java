
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib11acQosProfileTrafficClasses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib11acQosProfileTrafficClasses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VlanPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DscpList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UlCir" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlCirUnit" type="{http://Airspan.Netspan.WebServices}Unit" minOccurs="0"/&gt;
 *         &lt;element name="UlMir" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMirUnit" type="{http://Airspan.Netspan.WebServices}Unit" minOccurs="0"/&gt;
 *         &lt;element name="DlCir" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlCirUnit" type="{http://Airspan.Netspan.WebServices}Unit" minOccurs="0"/&gt;
 *         &lt;element name="DlMir" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMirUnit" type="{http://Airspan.Netspan.WebServices}Unit" minOccurs="0"/&gt;
 *         &lt;element name="QosPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib11acQosProfileTrafficClasses", propOrder = {
    "priority",
    "vlanPriority",
    "dscpList",
    "ulCir",
    "ulCirUnit",
    "ulMir",
    "ulMirUnit",
    "dlCir",
    "dlCirUnit",
    "dlMir",
    "dlMirUnit",
    "qosPriority"
})
public class Ib11AcQosProfileTrafficClasses {

    @XmlElement(name = "Priority")
    protected int priority;
    @XmlElementRef(name = "VlanPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> vlanPriority;
    @XmlElement(name = "DscpList")
    protected String dscpList;
    @XmlElementRef(name = "UlCir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulCir;
    @XmlElementRef(name = "UlCirUnit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Unit> ulCirUnit;
    @XmlElementRef(name = "UlMir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMir;
    @XmlElementRef(name = "UlMirUnit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Unit> ulMirUnit;
    @XmlElementRef(name = "DlCir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlCir;
    @XmlElementRef(name = "DlCirUnit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Unit> dlCirUnit;
    @XmlElementRef(name = "DlMir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMir;
    @XmlElementRef(name = "DlMirUnit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Unit> dlMirUnit;
    @XmlElement(name = "QosPriority")
    protected String qosPriority;

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the vlanPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVlanPriority() {
        return vlanPriority;
    }

    /**
     * Sets the value of the vlanPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVlanPriority(JAXBElement<Boolean> value) {
        this.vlanPriority = value;
    }

    /**
     * Gets the value of the dscpList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscpList() {
        return dscpList;
    }

    /**
     * Sets the value of the dscpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscpList(String value) {
        this.dscpList = value;
    }

    /**
     * Gets the value of the ulCir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlCir() {
        return ulCir;
    }

    /**
     * Sets the value of the ulCir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlCir(JAXBElement<Double> value) {
        this.ulCir = value;
    }

    /**
     * Gets the value of the ulCirUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public JAXBElement<Unit> getUlCirUnit() {
        return ulCirUnit;
    }

    /**
     * Sets the value of the ulCirUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public void setUlCirUnit(JAXBElement<Unit> value) {
        this.ulCirUnit = value;
    }

    /**
     * Gets the value of the ulMir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMir() {
        return ulMir;
    }

    /**
     * Sets the value of the ulMir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMir(JAXBElement<Double> value) {
        this.ulMir = value;
    }

    /**
     * Gets the value of the ulMirUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public JAXBElement<Unit> getUlMirUnit() {
        return ulMirUnit;
    }

    /**
     * Sets the value of the ulMirUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public void setUlMirUnit(JAXBElement<Unit> value) {
        this.ulMirUnit = value;
    }

    /**
     * Gets the value of the dlCir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlCir() {
        return dlCir;
    }

    /**
     * Sets the value of the dlCir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlCir(JAXBElement<Double> value) {
        this.dlCir = value;
    }

    /**
     * Gets the value of the dlCirUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public JAXBElement<Unit> getDlCirUnit() {
        return dlCirUnit;
    }

    /**
     * Sets the value of the dlCirUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public void setDlCirUnit(JAXBElement<Unit> value) {
        this.dlCirUnit = value;
    }

    /**
     * Gets the value of the dlMir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMir() {
        return dlMir;
    }

    /**
     * Sets the value of the dlMir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMir(JAXBElement<Double> value) {
        this.dlMir = value;
    }

    /**
     * Gets the value of the dlMirUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public JAXBElement<Unit> getDlMirUnit() {
        return dlMirUnit;
    }

    /**
     * Sets the value of the dlMirUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Unit }{@code >}
     *     
     */
    public void setDlMirUnit(JAXBElement<Unit> value) {
        this.dlMirUnit = value;
    }

    /**
     * Gets the value of the qosPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosPriority() {
        return qosPriority;
    }

    /**
     * Sets the value of the qosPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosPriority(String value) {
        this.qosPriority = value;
    }

}
