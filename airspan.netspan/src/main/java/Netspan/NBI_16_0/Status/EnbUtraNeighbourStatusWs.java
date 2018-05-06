
package Netspan.NBI_16_0.Status;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbUtraNeighbourStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbUtraNeighbourStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NbDBID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellIdentity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FrameDuplex" type="{http://Airspan.Netspan.WebServices}RfProfileDuplexModes" minOccurs="0"/>
 *         &lt;element name="ArfcnBand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RncId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Lac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Rac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Csfb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoCtrlState" type="{http://Airspan.Netspan.WebServices}HoControlStateTypes" minOccurs="0"/>
 *         &lt;element name="DiscoveredByAnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRemovable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbUtraNeighbourStatusWs", propOrder = {
    "cellNumber",
    "nbName",
    "nbDBID",
    "mcc",
    "mnc",
    "cellIdentity",
    "pci",
    "frameDuplex",
    "arfcnBand",
    "rncId",
    "lac",
    "rac",
    "arfcn",
    "csgId",
    "csfb",
    "hoCtrlState",
    "discoveredByAnr",
    "isRemovable"
})
public class EnbUtraNeighbourStatusWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElement(name = "NbName")
    protected String nbName;
    @XmlElementRef(name = "NbDBID", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> nbDBID;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElement(name = "CellIdentity")
    protected int cellIdentity;
    @XmlElementRef(name = "Pci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci;
    @XmlElementRef(name = "FrameDuplex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RfProfileDuplexModes> frameDuplex;
    @XmlElementRef(name = "ArfcnBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> arfcnBand;
    @XmlElementRef(name = "RncId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rncId;
    @XmlElementRef(name = "Lac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lac;
    @XmlElementRef(name = "Rac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rac;
    @XmlElementRef(name = "Arfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> arfcn;
    @XmlElementRef(name = "CsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csgId;
    @XmlElement(name = "Csfb")
    protected String csfb;
    @XmlElementRef(name = "HoCtrlState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<HoControlStateTypes> hoCtrlState;
    @XmlElement(name = "DiscoveredByAnr")
    protected String discoveredByAnr;
    @XmlElement(name = "IsRemovable")
    protected String isRemovable;

    /**
     * Gets the value of the cellNumber property.
     * 
     */
    public int getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     */
    public void setCellNumber(int value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the nbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbName() {
        return nbName;
    }

    /**
     * Sets the value of the nbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbName(String value) {
        this.nbName = value;
    }

    /**
     * Gets the value of the nbDBID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNbDBID() {
        return nbDBID;
    }

    /**
     * Sets the value of the nbDBID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNbDBID(JAXBElement<BigDecimal> value) {
        this.nbDBID = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcc(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnc() {
        return mnc;
    }

    /**
     * Sets the value of the mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnc(String value) {
        this.mnc = value;
    }

    /**
     * Gets the value of the cellIdentity property.
     * 
     */
    public int getCellIdentity() {
        return cellIdentity;
    }

    /**
     * Sets the value of the cellIdentity property.
     * 
     */
    public void setCellIdentity(int value) {
        this.cellIdentity = value;
    }

    /**
     * Gets the value of the pci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPci() {
        return pci;
    }

    /**
     * Sets the value of the pci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPci(JAXBElement<Integer> value) {
        this.pci = value;
    }

    /**
     * Gets the value of the frameDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}
     *     
     */
    public JAXBElement<RfProfileDuplexModes> getFrameDuplex() {
        return frameDuplex;
    }

    /**
     * Sets the value of the frameDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}
     *     
     */
    public void setFrameDuplex(JAXBElement<RfProfileDuplexModes> value) {
        this.frameDuplex = value;
    }

    /**
     * Gets the value of the arfcnBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getArfcnBand() {
        return arfcnBand;
    }

    /**
     * Sets the value of the arfcnBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setArfcnBand(JAXBElement<Integer> value) {
        this.arfcnBand = value;
    }

    /**
     * Gets the value of the rncId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRncId() {
        return rncId;
    }

    /**
     * Sets the value of the rncId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRncId(JAXBElement<Integer> value) {
        this.rncId = value;
    }

    /**
     * Gets the value of the lac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLac() {
        return lac;
    }

    /**
     * Sets the value of the lac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLac(JAXBElement<Integer> value) {
        this.lac = value;
    }

    /**
     * Gets the value of the rac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRac() {
        return rac;
    }

    /**
     * Sets the value of the rac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRac(JAXBElement<Integer> value) {
        this.rac = value;
    }

    /**
     * Gets the value of the arfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getArfcn() {
        return arfcn;
    }

    /**
     * Sets the value of the arfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setArfcn(JAXBElement<Integer> value) {
        this.arfcn = value;
    }

    /**
     * Gets the value of the csgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsgId() {
        return csgId;
    }

    /**
     * Sets the value of the csgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsgId(JAXBElement<Integer> value) {
        this.csgId = value;
    }

    /**
     * Gets the value of the csfb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsfb() {
        return csfb;
    }

    /**
     * Sets the value of the csfb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsfb(String value) {
        this.csfb = value;
    }

    /**
     * Gets the value of the hoCtrlState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}
     *     
     */
    public JAXBElement<HoControlStateTypes> getHoCtrlState() {
        return hoCtrlState;
    }

    /**
     * Sets the value of the hoCtrlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}
     *     
     */
    public void setHoCtrlState(JAXBElement<HoControlStateTypes> value) {
        this.hoCtrlState = value;
    }

    /**
     * Gets the value of the discoveredByAnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveredByAnr() {
        return discoveredByAnr;
    }

    /**
     * Sets the value of the discoveredByAnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveredByAnr(String value) {
        this.discoveredByAnr = value;
    }

    /**
     * Gets the value of the isRemovable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRemovable() {
        return isRemovable;
    }

    /**
     * Sets the value of the isRemovable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRemovable(String value) {
        this.isRemovable = value;
    }

}
