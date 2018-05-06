
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RsiRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RsiRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RsiStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RsiStep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RsiListSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsiRange", propOrder = {
    "rsiStart",
    "rsiStep",
    "rsiListSize"
})
public class RsiRange {

    @XmlElement(name = "RsiStart", required = true, type = Integer.class, nillable = true)
    protected Integer rsiStart;
    @XmlElement(name = "RsiStep", required = true, type = Integer.class, nillable = true)
    protected Integer rsiStep;
    @XmlElement(name = "RsiListSize", required = true, type = Integer.class, nillable = true)
    protected Integer rsiListSize;

    /**
     * Gets the value of the rsiStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsiStart() {
        return rsiStart;
    }

    /**
     * Sets the value of the rsiStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsiStart(Integer value) {
        this.rsiStart = value;
    }

    /**
     * Gets the value of the rsiStep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsiStep() {
        return rsiStep;
    }

    /**
     * Sets the value of the rsiStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsiStep(Integer value) {
        this.rsiStep = value;
    }

    /**
     * Gets the value of the rsiListSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsiListSize() {
        return rsiListSize;
    }

    /**
     * Sets the value of the rsiListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsiListSize(Integer value) {
        this.rsiListSize = value;
    }

}
