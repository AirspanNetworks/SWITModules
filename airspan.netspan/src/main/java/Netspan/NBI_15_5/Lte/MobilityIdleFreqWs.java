
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for MobilityIdleFreqWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityIdleFreqWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PresenceAntennaPort1IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PresenceAntennaPort1" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="NeighCellConfigIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NeighCellConfig" type="{http://Airspan.Netspan.WebServices}NeighbourCellConfig" minOccurs="0"/>
 *         &lt;element name="TreselectionEutraSfMediumIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TreselectionEutraSfMedium" type="{http://Airspan.Netspan.WebServices}TreselectionEutra" minOccurs="0"/>
 *         &lt;element name="TreselectionEutraSfHighIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TreselectionEutraSfHigh" type="{http://Airspan.Netspan.WebServices}TreselectionEutra" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityIdleFreqWs", propOrder = {
    "presenceAntennaPort1IsDefault",
    "presenceAntennaPort1",
    "neighCellConfigIsDefault",
    "neighCellConfig",
    "treselectionEutraSfMediumIsDefault",
    "treselectionEutraSfMedium",
    "treselectionEutraSfHighIsDefault",
    "treselectionEutraSfHigh"
})
@XmlSeeAlso({
    MobilityIdleIntraFreqWs.class,
    MobilityIdleInterFreqWs.class
})
public class MobilityIdleFreqWs {

    @XmlElementRef(name = "PresenceAntennaPort1IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> presenceAntennaPort1IsDefault;
    @XmlElementRef(name = "PresenceAntennaPort1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> presenceAntennaPort1;
    @XmlElementRef(name = "NeighCellConfigIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> neighCellConfigIsDefault;
    @XmlElementRef(name = "NeighCellConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> neighCellConfig;
    @XmlElementRef(name = "TreselectionEutraSfMediumIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> treselectionEutraSfMediumIsDefault;
    @XmlElementRef(name = "TreselectionEutraSfMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> treselectionEutraSfMedium;
    @XmlElementRef(name = "TreselectionEutraSfHighIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> treselectionEutraSfHighIsDefault;
    @XmlElementRef(name = "TreselectionEutraSfHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> treselectionEutraSfHigh;

    /**
     * Gets the value of the presenceAntennaPort1IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPresenceAntennaPort1IsDefault() {
        return presenceAntennaPort1IsDefault;
    }

    /**
     * Sets the value of the presenceAntennaPort1IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPresenceAntennaPort1IsDefault(JAXBElement<Boolean> value) {
        this.presenceAntennaPort1IsDefault = value;
    }

    /**
     * Gets the value of the presenceAntennaPort1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getPresenceAntennaPort1() {
        return presenceAntennaPort1;
    }

    /**
     * Sets the value of the presenceAntennaPort1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setPresenceAntennaPort1(JAXBElement<EnabledStates> value) {
        this.presenceAntennaPort1 = value;
    }

    /**
     * Gets the value of the neighCellConfigIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNeighCellConfigIsDefault() {
        return neighCellConfigIsDefault;
    }

    /**
     * Sets the value of the neighCellConfigIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNeighCellConfigIsDefault(JAXBElement<Boolean> value) {
        this.neighCellConfigIsDefault = value;
    }

    /**
     * Gets the value of the neighCellConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeighCellConfig() {
        return neighCellConfig;
    }

    /**
     * Sets the value of the neighCellConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeighCellConfig(JAXBElement<String> value) {
        this.neighCellConfig = value;
    }

    /**
     * Gets the value of the treselectionEutraSfMediumIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTreselectionEutraSfMediumIsDefault() {
        return treselectionEutraSfMediumIsDefault;
    }

    /**
     * Sets the value of the treselectionEutraSfMediumIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTreselectionEutraSfMediumIsDefault(JAXBElement<Boolean> value) {
        this.treselectionEutraSfMediumIsDefault = value;
    }

    /**
     * Gets the value of the treselectionEutraSfMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTreselectionEutraSfMedium() {
        return treselectionEutraSfMedium;
    }

    /**
     * Sets the value of the treselectionEutraSfMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTreselectionEutraSfMedium(JAXBElement<String> value) {
        this.treselectionEutraSfMedium = value;
    }

    /**
     * Gets the value of the treselectionEutraSfHighIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTreselectionEutraSfHighIsDefault() {
        return treselectionEutraSfHighIsDefault;
    }

    /**
     * Sets the value of the treselectionEutraSfHighIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTreselectionEutraSfHighIsDefault(JAXBElement<Boolean> value) {
        this.treselectionEutraSfHighIsDefault = value;
    }

    /**
     * Gets the value of the treselectionEutraSfHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTreselectionEutraSfHigh() {
        return treselectionEutraSfHigh;
    }

    /**
     * Sets the value of the treselectionEutraSfHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTreselectionEutraSfHigh(JAXBElement<String> value) {
        this.treselectionEutraSfHigh = value;
    }

}
