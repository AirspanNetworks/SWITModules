
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityConnectedModeInterFreq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeInterFreq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreq">
 *       &lt;sequence>
 *         &lt;element name="AllowX2NrtUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeInterFreq", propOrder = {
    "allowX2NrtUpdate"
})
public class MobilityConnectedModeInterFreq
    extends MobilityConnectedModeFreq
{

    @XmlElementRef(name = "AllowX2NrtUpdate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowX2NrtUpdate;

    /**
     * Gets the value of the allowX2NrtUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowX2NrtUpdate() {
        return allowX2NrtUpdate;
    }

    /**
     * Sets the value of the allowX2NrtUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowX2NrtUpdate(JAXBElement<Boolean> value) {
        this.allowX2NrtUpdate = value;
    }

}
