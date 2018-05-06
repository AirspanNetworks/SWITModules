
package Netspan.NBI_15_2.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuPnpDetailWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuPnpDetailWs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}AuDetailsWs">
 *       &lt;sequence>
 *         &lt;element name="PnpHardwareId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnpLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PnpLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PnpLatLongRadius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PnpSwImageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSwScheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SwSchedule" type="{http://Airspan.Netspan.WebServices}AuPnpSwSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuPnpDetailWs", propOrder = {
    "pnpHardwareId",
    "pnpLatitude",
    "pnpLongitude",
    "pnpLatLongRadius",
    "pnpSwImageName",
    "isSwScheduled",
    "swSchedule"
})
public class AuPnpDetailWs
    extends AuDetailsWs
{

    @XmlElement(name = "PnpHardwareId")
    protected String pnpHardwareId;
    @XmlElementRef(name = "PnpLatitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnpLatitude;
    @XmlElementRef(name = "PnpLongitude", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnpLongitude;
    @XmlElementRef(name = "PnpLatLongRadius", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pnpLatLongRadius;
    @XmlElement(name = "PnpSwImageName")
    protected String pnpSwImageName;
    @XmlElementRef(name = "IsSwScheduled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSwScheduled;
    @XmlElement(name = "SwSchedule")
    protected AuPnpSwSchedule swSchedule;

    /**
     * Gets the value of the pnpHardwareId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpHardwareId() {
        return pnpHardwareId;
    }

    /**
     * Sets the value of the pnpHardwareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpHardwareId(String value) {
        this.pnpHardwareId = value;
    }

    /**
     * Gets the value of the pnpLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPnpLatitude() {
        return pnpLatitude;
    }

    /**
     * Sets the value of the pnpLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPnpLatitude(JAXBElement<BigDecimal> value) {
        this.pnpLatitude = value;
    }

    /**
     * Gets the value of the pnpLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPnpLongitude() {
        return pnpLongitude;
    }

    /**
     * Sets the value of the pnpLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPnpLongitude(JAXBElement<BigDecimal> value) {
        this.pnpLongitude = value;
    }

    /**
     * Gets the value of the pnpLatLongRadius property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPnpLatLongRadius() {
        return pnpLatLongRadius;
    }

    /**
     * Sets the value of the pnpLatLongRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPnpLatLongRadius(JAXBElement<Integer> value) {
        this.pnpLatLongRadius = value;
    }

    /**
     * Gets the value of the pnpSwImageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnpSwImageName() {
        return pnpSwImageName;
    }

    /**
     * Sets the value of the pnpSwImageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnpSwImageName(String value) {
        this.pnpSwImageName = value;
    }

    /**
     * Gets the value of the isSwScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSwScheduled() {
        return isSwScheduled;
    }

    /**
     * Sets the value of the isSwScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSwScheduled(JAXBElement<Boolean> value) {
        this.isSwScheduled = value;
    }

    /**
     * Gets the value of the swSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link AuPnpSwSchedule }
     *     
     */
    public AuPnpSwSchedule getSwSchedule() {
        return swSchedule;
    }

    /**
     * Sets the value of the swSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuPnpSwSchedule }
     *     
     */
    public void setSwSchedule(AuPnpSwSchedule value) {
        this.swSchedule = value;
    }

}
