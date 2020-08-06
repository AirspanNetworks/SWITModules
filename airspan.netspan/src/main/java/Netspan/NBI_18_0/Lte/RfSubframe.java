
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RfSubframe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RfSubframe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubFrame0" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame1" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame2" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame3" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame4" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame5" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame6" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame7" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame8" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SubFrame9" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    protected JAXBElement<EnabledDisabledStates> subFrame0;
    @XmlElementRef(name = "SubFrame1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame1;
    @XmlElementRef(name = "SubFrame2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame2;
    @XmlElementRef(name = "SubFrame3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame3;
    @XmlElementRef(name = "SubFrame4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame4;
    @XmlElementRef(name = "SubFrame5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame5;
    @XmlElementRef(name = "SubFrame6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame6;
    @XmlElementRef(name = "SubFrame7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame7;
    @XmlElementRef(name = "SubFrame8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame8;
    @XmlElementRef(name = "SubFrame9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> subFrame9;

    /**
     * Gets the value of the subFrame0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame0() {
        return subFrame0;
    }

    /**
     * Sets the value of the subFrame0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame0(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame0 = value;
    }

    /**
     * Gets the value of the subFrame1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame1() {
        return subFrame1;
    }

    /**
     * Sets the value of the subFrame1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame1(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame1 = value;
    }

    /**
     * Gets the value of the subFrame2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame2() {
        return subFrame2;
    }

    /**
     * Sets the value of the subFrame2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame2(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame2 = value;
    }

    /**
     * Gets the value of the subFrame3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame3() {
        return subFrame3;
    }

    /**
     * Sets the value of the subFrame3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame3(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame3 = value;
    }

    /**
     * Gets the value of the subFrame4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame4() {
        return subFrame4;
    }

    /**
     * Sets the value of the subFrame4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame4(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame4 = value;
    }

    /**
     * Gets the value of the subFrame5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame5() {
        return subFrame5;
    }

    /**
     * Sets the value of the subFrame5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame5(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame5 = value;
    }

    /**
     * Gets the value of the subFrame6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame6() {
        return subFrame6;
    }

    /**
     * Sets the value of the subFrame6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame6(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame6 = value;
    }

    /**
     * Gets the value of the subFrame7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame7() {
        return subFrame7;
    }

    /**
     * Sets the value of the subFrame7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame7(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame7 = value;
    }

    /**
     * Gets the value of the subFrame8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame8() {
        return subFrame8;
    }

    /**
     * Sets the value of the subFrame8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame8(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame8 = value;
    }

    /**
     * Gets the value of the subFrame9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSubFrame9() {
        return subFrame9;
    }

    /**
     * Sets the value of the subFrame9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSubFrame9(JAXBElement<EnabledDisabledStates> value) {
        this.subFrame9 = value;
    }

}
