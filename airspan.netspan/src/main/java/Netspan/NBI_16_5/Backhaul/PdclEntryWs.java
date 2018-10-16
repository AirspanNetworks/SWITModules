
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdclEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdclEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Eci" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdclEntryWs", propOrder = {
    "earfcn",
    "mcc",
    "mnc",
    "eci"
})
public class PdclEntryWs {

    @XmlElement(name = "Earfcn")
    protected int earfcn;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElement(name = "Eci")
    protected int eci;

    /**
     * Gets the value of the earfcn property.
     * 
     */
    public int getEarfcn() {
        return earfcn;
    }

    /**
     * Sets the value of the earfcn property.
     * 
     */
    public void setEarfcn(int value) {
        this.earfcn = value;
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
     * Gets the value of the eci property.
     * 
     */
    public int getEci() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     */
    public void setEci(int value) {
        this.eci = value;
    }

}
