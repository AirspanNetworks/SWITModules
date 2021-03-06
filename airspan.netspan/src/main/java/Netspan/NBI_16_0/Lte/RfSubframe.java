
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for RfSubframe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RfSubframe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubFrame0" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame1" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame2" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame3" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame4" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame5" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame6" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame7" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame8" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SubFrame9" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfSubframe", propOrder = {
    "subFrame0",
    "subFrame1",
    "subFrame2",
    "subFrame3",
    "subFrame4",
    "subFrame5",
    "subFrame6",
    "subFrame7",
    "subFrame8",
    "subFrame9"
})
public class RfSubframe {

    @XmlElementRef(name = "SubFrame0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame0;
    @XmlElementRef(name = "SubFrame1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame1;
    @XmlElementRef(name = "SubFrame2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame2;
    @XmlElementRef(name = "SubFrame3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame3;
    @XmlElementRef(name = "SubFrame4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame4;
    @XmlElementRef(name = "SubFrame5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame5;
    @XmlElementRef(name = "SubFrame6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame6;
    @XmlElementRef(name = "SubFrame7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame7;
    @XmlElementRef(name = "SubFrame8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame8;
    @XmlElementRef(name = "SubFrame9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> subFrame9;

    /**
     * Gets the value of the subFrame0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame0() {
        return subFrame0;
    }

    /**
     * Sets the value of the subFrame0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame0(JAXBElement<EnabledStates> value) {
        this.subFrame0 = value;
    }

    /**
     * Gets the value of the subFrame1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame1() {
        return subFrame1;
    }

    /**
     * Sets the value of the subFrame1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame1(JAXBElement<EnabledStates> value) {
        this.subFrame1 = value;
    }

    /**
     * Gets the value of the subFrame2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame2() {
        return subFrame2;
    }

    /**
     * Sets the value of the subFrame2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame2(JAXBElement<EnabledStates> value) {
        this.subFrame2 = value;
    }

    /**
     * Gets the value of the subFrame3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame3() {
        return subFrame3;
    }

    /**
     * Sets the value of the subFrame3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame3(JAXBElement<EnabledStates> value) {
        this.subFrame3 = value;
    }

    /**
     * Gets the value of the subFrame4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame4() {
        return subFrame4;
    }

    /**
     * Sets the value of the subFrame4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame4(JAXBElement<EnabledStates> value) {
        this.subFrame4 = value;
    }

    /**
     * Gets the value of the subFrame5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame5() {
        return subFrame5;
    }

    /**
     * Sets the value of the subFrame5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame5(JAXBElement<EnabledStates> value) {
        this.subFrame5 = value;
    }

    /**
     * Gets the value of the subFrame6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame6() {
        return subFrame6;
    }

    /**
     * Sets the value of the subFrame6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame6(JAXBElement<EnabledStates> value) {
        this.subFrame6 = value;
    }

    /**
     * Gets the value of the subFrame7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame7() {
        return subFrame7;
    }

    /**
     * Sets the value of the subFrame7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame7(JAXBElement<EnabledStates> value) {
        this.subFrame7 = value;
    }

    /**
     * Gets the value of the subFrame8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame8() {
        return subFrame8;
    }

    /**
     * Sets the value of the subFrame8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame8(JAXBElement<EnabledStates> value) {
        this.subFrame8 = value;
    }

    /**
     * Gets the value of the subFrame9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSubFrame9() {
        return subFrame9;
    }

    /**
     * Sets the value of the subFrame9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSubFrame9(JAXBElement<EnabledStates> value) {
        this.subFrame9 = value;
    }

}
