
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityConnectedModeQciPriority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeQciPriority"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Qci" type="{http://Airspan.Netspan.WebServices}PriorityQciValues"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeQciPriority", propOrder = {
    "qci",
    "priority"
})
public class MobilityConnectedModeQciPriority {

    @XmlElement(name = "Qci", required = true)
    @XmlSchemaType(name = "string")
    protected PriorityQciValues qci;
    @XmlElement(name = "Priority")
    protected int priority;

    /**
     * Gets the value of the qci property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityQciValues }
     *     
     */
    public PriorityQciValues getQci() {
        return qci;
    }

    /**
     * Sets the value of the qci property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityQciValues }
     *     
     */
    public void setQci(PriorityQciValues value) {
        this.qci = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

}
