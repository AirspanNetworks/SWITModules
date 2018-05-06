
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourUtraPciWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourUtraPciWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PscStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PscEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighbourUtraPciWs", propOrder = {
    "pscStart",
    "pscEnd"
})
public class NeighbourUtraPciWs {

    @XmlElement(name = "PscStart", required = true, type = Integer.class, nillable = true)
    protected Integer pscStart;
    @XmlElement(name = "PscEnd", required = true, type = Integer.class, nillable = true)
    protected Integer pscEnd;

    /**
     * Gets the value of the pscStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPscStart() {
        return pscStart;
    }

    /**
     * Sets the value of the pscStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPscStart(Integer value) {
        this.pscStart = value;
    }

    /**
     * Gets the value of the pscEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPscEnd() {
        return pscEnd;
    }

    /**
     * Sets the value of the pscEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPscEnd(Integer value) {
        this.pscEnd = value;
    }

}
