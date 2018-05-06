
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsonMlbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsonMlbWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapacitySampleInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CapacityReportInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PrbLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RrcLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CpuLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsonMlbWs", propOrder = {
    "capacitySampleInterval",
    "capacityReportInterval",
    "prbLoadWeight",
    "rrcLoadWeight",
    "cpuLoadWeight"
})
public class EsonMlbWs {

    @XmlElement(name = "CapacitySampleInterval")
    protected int capacitySampleInterval;
    @XmlElement(name = "CapacityReportInterval")
    protected int capacityReportInterval;
    @XmlElement(name = "PrbLoadWeight")
    protected int prbLoadWeight;
    @XmlElement(name = "RrcLoadWeight")
    protected int rrcLoadWeight;
    @XmlElement(name = "CpuLoadWeight")
    protected int cpuLoadWeight;

    /**
     * Gets the value of the capacitySampleInterval property.
     * 
     */
    public int getCapacitySampleInterval() {
        return capacitySampleInterval;
    }

    /**
     * Sets the value of the capacitySampleInterval property.
     * 
     */
    public void setCapacitySampleInterval(int value) {
        this.capacitySampleInterval = value;
    }

    /**
     * Gets the value of the capacityReportInterval property.
     * 
     */
    public int getCapacityReportInterval() {
        return capacityReportInterval;
    }

    /**
     * Sets the value of the capacityReportInterval property.
     * 
     */
    public void setCapacityReportInterval(int value) {
        this.capacityReportInterval = value;
    }

    /**
     * Gets the value of the prbLoadWeight property.
     * 
     */
    public int getPrbLoadWeight() {
        return prbLoadWeight;
    }

    /**
     * Sets the value of the prbLoadWeight property.
     * 
     */
    public void setPrbLoadWeight(int value) {
        this.prbLoadWeight = value;
    }

    /**
     * Gets the value of the rrcLoadWeight property.
     * 
     */
    public int getRrcLoadWeight() {
        return rrcLoadWeight;
    }

    /**
     * Sets the value of the rrcLoadWeight property.
     * 
     */
    public void setRrcLoadWeight(int value) {
        this.rrcLoadWeight = value;
    }

    /**
     * Gets the value of the cpuLoadWeight property.
     * 
     */
    public int getCpuLoadWeight() {
        return cpuLoadWeight;
    }

    /**
     * Sets the value of the cpuLoadWeight property.
     * 
     */
    public void setCpuLoadWeight(int value) {
        this.cpuLoadWeight = value;
    }

}
