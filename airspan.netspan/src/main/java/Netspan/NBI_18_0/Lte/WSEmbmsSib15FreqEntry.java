
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSEmbmsSib15FreqEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSEmbmsSib15FreqEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAreaId" type="{http://Airspan.Netspan.WebServices}WSEmbmsId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSEmbmsSib15FreqEntry", propOrder = {
    "earfcn",
    "serviceAreaId"
})
public class WSEmbmsSib15FreqEntry {

    @XmlElementRef(name = "Earfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> earfcn;
    @XmlElement(name = "ServiceAreaId")
    protected WSEmbmsId serviceAreaId;

    /**
     * Gets the value of the earfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEarfcn() {
        return earfcn;
    }

    /**
     * Sets the value of the earfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEarfcn(JAXBElement<Integer> value) {
        this.earfcn = value;
    }

    /**
     * Gets the value of the serviceAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link WSEmbmsId }
     *     
     */
    public WSEmbmsId getServiceAreaId() {
        return serviceAreaId;
    }

    /**
     * Sets the value of the serviceAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSEmbmsId }
     *     
     */
    public void setServiceAreaId(WSEmbmsId value) {
        this.serviceAreaId = value;
    }

}
