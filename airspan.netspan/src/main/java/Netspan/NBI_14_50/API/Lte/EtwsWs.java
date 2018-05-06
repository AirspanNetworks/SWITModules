
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EtwsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EtwsWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sib10DurationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Sib10Duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EtwsWs", propOrder = {
    "sib10DurationIsDefault",
    "sib10Duration"
})
public class EtwsWs {

    @XmlElement(name = "Sib10DurationIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean sib10DurationIsDefault;
    @XmlElement(name = "Sib10Duration", required = true, type = Integer.class, nillable = true)
    protected Integer sib10Duration;

    /**
     * Gets the value of the sib10DurationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSib10DurationIsDefault() {
        return sib10DurationIsDefault;
    }

    /**
     * Sets the value of the sib10DurationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSib10DurationIsDefault(Boolean value) {
        this.sib10DurationIsDefault = value;
    }

    /**
     * Gets the value of the sib10Duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSib10Duration() {
        return sib10Duration;
    }

    /**
     * Sets the value of the sib10Duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSib10Duration(Integer value) {
        this.sib10Duration = value;
    }

}
