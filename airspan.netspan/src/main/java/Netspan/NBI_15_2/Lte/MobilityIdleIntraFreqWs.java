
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityIdleIntraFreqWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityIdleIntraFreqWs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}MobilityIdleFreqWs">
 *       &lt;sequence>
 *         &lt;element name="QhystSfMediumIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QhystSfMedium" type="{http://Airspan.Netspan.WebServices}Hyst" minOccurs="0"/>
 *         &lt;element name="QhystSfHighIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QhystSfHigh" type="{http://Airspan.Netspan.WebServices}Hyst" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityIdleIntraFreqWs", propOrder = {
    "qhystSfMediumIsDefault",
    "qhystSfMedium",
    "qhystSfHighIsDefault",
    "qhystSfHigh"
})
public class MobilityIdleIntraFreqWs
    extends MobilityIdleFreqWs
{

    @XmlElementRef(name = "QhystSfMediumIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qhystSfMediumIsDefault;
    @XmlElementRef(name = "QhystSfMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qhystSfMedium;
    @XmlElementRef(name = "QhystSfHighIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qhystSfHighIsDefault;
    @XmlElementRef(name = "QhystSfHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qhystSfHigh;

    /**
     * Gets the value of the qhystSfMediumIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQhystSfMediumIsDefault() {
        return qhystSfMediumIsDefault;
    }

    /**
     * Sets the value of the qhystSfMediumIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQhystSfMediumIsDefault(JAXBElement<Boolean> value) {
        this.qhystSfMediumIsDefault = value;
    }

    /**
     * Gets the value of the qhystSfMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQhystSfMedium() {
        return qhystSfMedium;
    }

    /**
     * Sets the value of the qhystSfMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQhystSfMedium(JAXBElement<String> value) {
        this.qhystSfMedium = value;
    }

    /**
     * Gets the value of the qhystSfHighIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQhystSfHighIsDefault() {
        return qhystSfHighIsDefault;
    }

    /**
     * Sets the value of the qhystSfHighIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQhystSfHighIsDefault(JAXBElement<Boolean> value) {
        this.qhystSfHighIsDefault = value;
    }

    /**
     * Gets the value of the qhystSfHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQhystSfHigh() {
        return qhystSfHigh;
    }

    /**
     * Sets the value of the qhystSfHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQhystSfHigh(JAXBElement<String> value) {
        this.qhystSfHigh = value;
    }

}
