
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PciRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PciRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PciStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PciEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PciRange", propOrder = {
    "pciStart",
    "pciEnd"
})
public class PciRange {

    @XmlElement(name = "PciStart", required = true, type = Integer.class, nillable = true)
    protected Integer pciStart;
    @XmlElement(name = "PciEnd", required = true, type = Integer.class, nillable = true)
    protected Integer pciEnd;

    /**
     * Gets the value of the pciStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPciStart() {
        return pciStart;
    }

    /**
     * Sets the value of the pciStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPciStart(Integer value) {
        this.pciStart = value;
    }

    /**
     * Gets the value of the pciEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPciEnd() {
        return pciEnd;
    }

    /**
     * Sets the value of the pciEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPciEnd(Integer value) {
        this.pciEnd = value;
    }

}
