
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for InterRatMobilityPerPlmnGroupWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterRatMobilityPerPlmnGroupWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlmnList" type="{http://Airspan.Netspan.WebServices}PlmnsContainer" minOccurs="0"/&gt;
 *         &lt;element name="CsfbToUtran" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="UtranCsfbPriority" type="{http://Airspan.Netspan.WebServices}CsfbPriority" minOccurs="0"/&gt;
 *         &lt;element name="CsfbToGeran" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="GeranCsfbPriority" type="{http://Airspan.Netspan.WebServices}CsfbPriority" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryGeranBand" type="{http://Airspan.Netspan.WebServices}Bands" minOccurs="0"/&gt;
 *         &lt;element name="UtranPriorityList" type="{http://Airspan.Netspan.WebServices}PerPlmnUtranPriorityListContainer" minOccurs="0"/&gt;
 *         &lt;element name="GeranPriorityList" type="{http://Airspan.Netspan.WebServices}PerPlmnGeranPriorityListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterRatMobilityPerPlmnGroupWs", propOrder = {
    "plmnList",
    "csfbToUtran",
    "utranCsfbPriority",
    "csfbToGeran",
    "geranCsfbPriority",
    "primaryGeranBand",
    "utranPriorityList",
    "geranPriorityList"
})
public class InterRatMobilityPerPlmnGroupWs {

    @XmlElement(name = "PlmnList")
    protected PlmnsContainer plmnList;
    @XmlElementRef(name = "CsfbToUtran", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbToUtran;
    @XmlElementRef(name = "UtranCsfbPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> utranCsfbPriority;
    @XmlElementRef(name = "CsfbToGeran", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbToGeran;
    @XmlElementRef(name = "GeranCsfbPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geranCsfbPriority;
    @XmlElementRef(name = "PrimaryGeranBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Bands> primaryGeranBand;
    @XmlElement(name = "UtranPriorityList")
    protected PerPlmnUtranPriorityListContainer utranPriorityList;
    @XmlElement(name = "GeranPriorityList")
    protected PerPlmnGeranPriorityListContainer geranPriorityList;

    /**
     * Gets the value of the plmnList property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnsContainer }
     *     
     */
    public PlmnsContainer getPlmnList() {
        return plmnList;
    }

    /**
     * Sets the value of the plmnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnsContainer }
     *     
     */
    public void setPlmnList(PlmnsContainer value) {
        this.plmnList = value;
    }

    /**
     * Gets the value of the csfbToUtran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCsfbToUtran() {
        return csfbToUtran;
    }

    /**
     * Sets the value of the csfbToUtran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCsfbToUtran(JAXBElement<EnabledStates> value) {
        this.csfbToUtran = value;
    }

    /**
     * Gets the value of the utranCsfbPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUtranCsfbPriority() {
        return utranCsfbPriority;
    }

    /**
     * Sets the value of the utranCsfbPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUtranCsfbPriority(JAXBElement<String> value) {
        this.utranCsfbPriority = value;
    }

    /**
     * Gets the value of the csfbToGeran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCsfbToGeran() {
        return csfbToGeran;
    }

    /**
     * Sets the value of the csfbToGeran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCsfbToGeran(JAXBElement<EnabledStates> value) {
        this.csfbToGeran = value;
    }

    /**
     * Gets the value of the geranCsfbPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeranCsfbPriority() {
        return geranCsfbPriority;
    }

    /**
     * Sets the value of the geranCsfbPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeranCsfbPriority(JAXBElement<String> value) {
        this.geranCsfbPriority = value;
    }

    /**
     * Gets the value of the primaryGeranBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Bands }{@code >}
     *     
     */
    public JAXBElement<Bands> getPrimaryGeranBand() {
        return primaryGeranBand;
    }

    /**
     * Sets the value of the primaryGeranBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Bands }{@code >}
     *     
     */
    public void setPrimaryGeranBand(JAXBElement<Bands> value) {
        this.primaryGeranBand = value;
    }

    /**
     * Gets the value of the utranPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link PerPlmnUtranPriorityListContainer }
     *     
     */
    public PerPlmnUtranPriorityListContainer getUtranPriorityList() {
        return utranPriorityList;
    }

    /**
     * Sets the value of the utranPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerPlmnUtranPriorityListContainer }
     *     
     */
    public void setUtranPriorityList(PerPlmnUtranPriorityListContainer value) {
        this.utranPriorityList = value;
    }

    /**
     * Gets the value of the geranPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link PerPlmnGeranPriorityListContainer }
     *     
     */
    public PerPlmnGeranPriorityListContainer getGeranPriorityList() {
        return geranPriorityList;
    }

    /**
     * Sets the value of the geranPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerPlmnGeranPriorityListContainer }
     *     
     */
    public void setGeranPriorityList(PerPlmnGeranPriorityListContainer value) {
        this.geranPriorityList = value;
    }

}
