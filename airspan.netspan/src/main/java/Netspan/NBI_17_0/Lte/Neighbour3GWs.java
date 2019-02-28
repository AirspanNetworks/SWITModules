
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Neighbour3gWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Neighbour3gWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NeighbourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UtraPci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UtraArfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UtraHoCtrlState" type="{http://Airspan.Netspan.WebServices}Ho3gControlStateTypes" minOccurs="0"/&gt;
 *         &lt;element name="DuplexMode" type="{http://Airspan.Netspan.WebServices}Ng3gDuplex" minOccurs="0"/&gt;
 *         &lt;element name="CsfbDefault" type="{http://Airspan.Netspan.WebServices}Ng3gCsfbDefault" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Neighbour3gWs", propOrder = {
    "cellNumber",
    "neighbourName",
    "mcc",
    "mnc",
    "cellIdentity",
    "utraPci",
    "utraArfcn",
    "utraHoCtrlState",
    "duplexMode",
    "csfbDefault"
})
public class Neighbour3GWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElement(name = "NeighbourName")
    protected String neighbourName;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElementRef(name = "CellIdentity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdentity;
    @XmlElementRef(name = "UtraPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utraPci;
    @XmlElementRef(name = "UtraArfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utraArfcn;
    @XmlElementRef(name = "UtraHoCtrlState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Ho3GControlStateTypes> utraHoCtrlState;
    @XmlElementRef(name = "DuplexMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Ng3GDuplex> duplexMode;
    @XmlElementRef(name = "CsfbDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Ng3GCsfbDefault> csfbDefault;

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
     * Gets the value of the neighbourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighbourName() {
        return neighbourName;
    }

    /**
     * Sets the value of the neighbourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighbourName(String value) {
        this.neighbourName = value;
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
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdentity() {
        return cellIdentity;
    }

    /**
     * Sets the value of the cellIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdentity(JAXBElement<Integer> value) {
        this.cellIdentity = value;
    }

    /**
     * Gets the value of the utraPci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtraPci() {
        return utraPci;
    }

    /**
     * Sets the value of the utraPci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtraPci(JAXBElement<Integer> value) {
        this.utraPci = value;
    }

    /**
     * Gets the value of the utraArfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtraArfcn() {
        return utraArfcn;
    }

    /**
     * Sets the value of the utraArfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtraArfcn(JAXBElement<Integer> value) {
        this.utraArfcn = value;
    }

    /**
     * Gets the value of the utraHoCtrlState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Ho3GControlStateTypes }{@code >}
     *     
     */
    public JAXBElement<Ho3GControlStateTypes> getUtraHoCtrlState() {
        return utraHoCtrlState;
    }

    /**
     * Sets the value of the utraHoCtrlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Ho3GControlStateTypes }{@code >}
     *     
     */
    public void setUtraHoCtrlState(JAXBElement<Ho3GControlStateTypes> value) {
        this.utraHoCtrlState = value;
    }

    /**
     * Gets the value of the duplexMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Ng3GDuplex }{@code >}
     *     
     */
    public JAXBElement<Ng3GDuplex> getDuplexMode() {
        return duplexMode;
    }

    /**
     * Sets the value of the duplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Ng3GDuplex }{@code >}
     *     
     */
    public void setDuplexMode(JAXBElement<Ng3GDuplex> value) {
        this.duplexMode = value;
    }

    /**
     * Gets the value of the csfbDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Ng3GCsfbDefault }{@code >}
     *     
     */
    public JAXBElement<Ng3GCsfbDefault> getCsfbDefault() {
        return csfbDefault;
    }

    /**
     * Sets the value of the csfbDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Ng3GCsfbDefault }{@code >}
     *     
     */
    public void setCsfbDefault(JAXBElement<Ng3GCsfbDefault> value) {
        this.csfbDefault = value;
    }

}
