
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPlmnUtranPriorityWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerPlmnUtranPriorityWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DuplexMode" type="{http://Airspan.Netspan.WebServices}DuplexModeTypes"/&gt;
 *         &lt;element name="CsfbRedirectPriority" type="{http://Airspan.Netspan.WebServices}CsfbRedirectPriorityUtran"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPlmnUtranPriorityWs", propOrder = {
    "arfcn",
    "duplexMode",
    "csfbRedirectPriority"
})
public class PerPlmnUtranPriorityWs {

    @XmlElement(name = "Arfcn")
    protected int arfcn;
    @XmlElement(name = "DuplexMode", required = true)
    @XmlSchemaType(name = "string")
    protected DuplexModeTypes duplexMode;
    @XmlElement(name = "CsfbRedirectPriority", required = true)
    protected String csfbRedirectPriority;

    /**
     * Gets the value of the arfcn property.
     * 
     */
    public int getArfcn() {
        return arfcn;
    }

    /**
     * Sets the value of the arfcn property.
     * 
     */
    public void setArfcn(int value) {
        this.arfcn = value;
    }

    /**
     * Gets the value of the duplexMode property.
     * 
     * @return
     *     possible object is
     *     {@link DuplexModeTypes }
     *     
     */
    public DuplexModeTypes getDuplexMode() {
        return duplexMode;
    }

    /**
     * Sets the value of the duplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplexModeTypes }
     *     
     */
    public void setDuplexMode(DuplexModeTypes value) {
        this.duplexMode = value;
    }

    /**
     * Gets the value of the csfbRedirectPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsfbRedirectPriority() {
        return csfbRedirectPriority;
    }

    /**
     * Sets the value of the csfbRedirectPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsfbRedirectPriority(String value) {
        this.csfbRedirectPriority = value;
    }

}
