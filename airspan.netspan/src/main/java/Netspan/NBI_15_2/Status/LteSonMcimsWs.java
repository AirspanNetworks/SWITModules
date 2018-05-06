
package Netspan.NBI_15_2.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteSonMcimsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSonMcimsWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="McimEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="MroEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="MlbEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="DlTxEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates"/>
 *         &lt;element name="DlTxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSonMcimsWs", propOrder = {
    "cellId",
    "mcimEnabled",
    "mroEnabled",
    "mlbEnabled",
    "dlTxEnabled",
    "dlTxPower"
})
public class LteSonMcimsWs {

    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElementRef(name = "McimEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> mcimEnabled;
    @XmlElementRef(name = "MroEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> mroEnabled;
    @XmlElementRef(name = "MlbEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> mlbEnabled;
    @XmlElement(name = "DlTxEnabled", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledStates dlTxEnabled;
    @XmlElementRef(name = "DlTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlTxPower;

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellId(Integer value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the mcimEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMcimEnabled() {
        return mcimEnabled;
    }

    /**
     * Sets the value of the mcimEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMcimEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.mcimEnabled = value;
    }

    /**
     * Gets the value of the mroEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMroEnabled() {
        return mroEnabled;
    }

    /**
     * Sets the value of the mroEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMroEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.mroEnabled = value;
    }

    /**
     * Gets the value of the mlbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMlbEnabled() {
        return mlbEnabled;
    }

    /**
     * Sets the value of the mlbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMlbEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.mlbEnabled = value;
    }

    /**
     * Gets the value of the dlTxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledStates }
     *     
     */
    public EnabledDisabledStates getDlTxEnabled() {
        return dlTxEnabled;
    }

    /**
     * Sets the value of the dlTxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledStates }
     *     
     */
    public void setDlTxEnabled(EnabledDisabledStates value) {
        this.dlTxEnabled = value;
    }

    /**
     * Gets the value of the dlTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlTxPower() {
        return dlTxPower;
    }

    /**
     * Sets the value of the dlTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlTxPower(JAXBElement<Integer> value) {
        this.dlTxPower = value;
    }

}
