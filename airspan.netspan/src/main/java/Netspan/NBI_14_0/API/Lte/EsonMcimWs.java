
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsonMcimWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsonMcimWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AperiodicCqiGuardTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AperiodicCqiMinMcs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsonMcimWs", propOrder = {
    "aperiodicCqiGuardTimer",
    "aperiodicCqiMinMcs"
})
public class EsonMcimWs {

    @XmlElement(name = "AperiodicCqiGuardTimer")
    protected int aperiodicCqiGuardTimer;
    @XmlElement(name = "AperiodicCqiMinMcs")
    protected int aperiodicCqiMinMcs;

    /**
     * Gets the value of the aperiodicCqiGuardTimer property.
     * 
     */
    public int getAperiodicCqiGuardTimer() {
        return aperiodicCqiGuardTimer;
    }

    /**
     * Sets the value of the aperiodicCqiGuardTimer property.
     * 
     */
    public void setAperiodicCqiGuardTimer(int value) {
        this.aperiodicCqiGuardTimer = value;
    }

    /**
     * Gets the value of the aperiodicCqiMinMcs property.
     * 
     */
    public int getAperiodicCqiMinMcs() {
        return aperiodicCqiMinMcs;
    }

    /**
     * Sets the value of the aperiodicCqiMinMcs property.
     * 
     */
    public void setAperiodicCqiMinMcs(int value) {
        this.aperiodicCqiMinMcs = value;
    }

}
