
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmergencyCallWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmergencyCallWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreemptionCapability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PreemptionVulnerability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HighestArp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RrcConnectedTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmergencyCallWs", propOrder = {
    "preemptionCapability",
    "preemptionVulnerability",
    "highestArp",
    "rrcConnectedTime"
})
public class EmergencyCallWs {

    @XmlElement(name = "PreemptionCapability")
    protected boolean preemptionCapability;
    @XmlElement(name = "PreemptionVulnerability")
    protected boolean preemptionVulnerability;
    @XmlElement(name = "HighestArp")
    protected int highestArp;
    @XmlElement(name = "RrcConnectedTime")
    protected int rrcConnectedTime;

    /**
     * Gets the value of the preemptionCapability property.
     * 
     */
    public boolean isPreemptionCapability() {
        return preemptionCapability;
    }

    /**
     * Sets the value of the preemptionCapability property.
     * 
     */
    public void setPreemptionCapability(boolean value) {
        this.preemptionCapability = value;
    }

    /**
     * Gets the value of the preemptionVulnerability property.
     * 
     */
    public boolean isPreemptionVulnerability() {
        return preemptionVulnerability;
    }

    /**
     * Sets the value of the preemptionVulnerability property.
     * 
     */
    public void setPreemptionVulnerability(boolean value) {
        this.preemptionVulnerability = value;
    }

    /**
     * Gets the value of the highestArp property.
     * 
     */
    public int getHighestArp() {
        return highestArp;
    }

    /**
     * Sets the value of the highestArp property.
     * 
     */
    public void setHighestArp(int value) {
        this.highestArp = value;
    }

    /**
     * Gets the value of the rrcConnectedTime property.
     * 
     */
    public int getRrcConnectedTime() {
        return rrcConnectedTime;
    }

    /**
     * Sets the value of the rrcConnectedTime property.
     * 
     */
    public void setRrcConnectedTime(int value) {
        this.rrcConnectedTime = value;
    }

}
