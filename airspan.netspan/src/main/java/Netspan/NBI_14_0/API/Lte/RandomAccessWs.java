
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RandomAccessWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RandomAccessWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrachConfigIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfRaPreambles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SizeOfRaPreamblesGroupA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MessageSizeGroupA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MessagePowerOffsetGroupB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PreambleInitialReceivedTargetPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PowerRampingStep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PreambleTransMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RaResponseWindowSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MacContentionResolutionTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RandomAccessWs", propOrder = {
    "prachConfigIndex",
    "numberOfRaPreambles",
    "sizeOfRaPreamblesGroupA",
    "messageSizeGroupA",
    "messagePowerOffsetGroupB",
    "preambleInitialReceivedTargetPower",
    "powerRampingStep",
    "preambleTransMax",
    "raResponseWindowSize",
    "macContentionResolutionTimer"
})
public class RandomAccessWs {

    @XmlElement(name = "PrachConfigIndex")
    protected int prachConfigIndex;
    @XmlElement(name = "NumberOfRaPreambles")
    protected int numberOfRaPreambles;
    @XmlElement(name = "SizeOfRaPreamblesGroupA")
    protected int sizeOfRaPreamblesGroupA;
    @XmlElement(name = "MessageSizeGroupA")
    protected int messageSizeGroupA;
    @XmlElement(name = "MessagePowerOffsetGroupB")
    protected int messagePowerOffsetGroupB;
    @XmlElement(name = "PreambleInitialReceivedTargetPower")
    protected int preambleInitialReceivedTargetPower;
    @XmlElement(name = "PowerRampingStep")
    protected int powerRampingStep;
    @XmlElement(name = "PreambleTransMax")
    protected int preambleTransMax;
    @XmlElement(name = "RaResponseWindowSize")
    protected int raResponseWindowSize;
    @XmlElement(name = "MacContentionResolutionTimer")
    protected int macContentionResolutionTimer;

    /**
     * Gets the value of the prachConfigIndex property.
     * 
     */
    public int getPrachConfigIndex() {
        return prachConfigIndex;
    }

    /**
     * Sets the value of the prachConfigIndex property.
     * 
     */
    public void setPrachConfigIndex(int value) {
        this.prachConfigIndex = value;
    }

    /**
     * Gets the value of the numberOfRaPreambles property.
     * 
     */
    public int getNumberOfRaPreambles() {
        return numberOfRaPreambles;
    }

    /**
     * Sets the value of the numberOfRaPreambles property.
     * 
     */
    public void setNumberOfRaPreambles(int value) {
        this.numberOfRaPreambles = value;
    }

    /**
     * Gets the value of the sizeOfRaPreamblesGroupA property.
     * 
     */
    public int getSizeOfRaPreamblesGroupA() {
        return sizeOfRaPreamblesGroupA;
    }

    /**
     * Sets the value of the sizeOfRaPreamblesGroupA property.
     * 
     */
    public void setSizeOfRaPreamblesGroupA(int value) {
        this.sizeOfRaPreamblesGroupA = value;
    }

    /**
     * Gets the value of the messageSizeGroupA property.
     * 
     */
    public int getMessageSizeGroupA() {
        return messageSizeGroupA;
    }

    /**
     * Sets the value of the messageSizeGroupA property.
     * 
     */
    public void setMessageSizeGroupA(int value) {
        this.messageSizeGroupA = value;
    }

    /**
     * Gets the value of the messagePowerOffsetGroupB property.
     * 
     */
    public int getMessagePowerOffsetGroupB() {
        return messagePowerOffsetGroupB;
    }

    /**
     * Sets the value of the messagePowerOffsetGroupB property.
     * 
     */
    public void setMessagePowerOffsetGroupB(int value) {
        this.messagePowerOffsetGroupB = value;
    }

    /**
     * Gets the value of the preambleInitialReceivedTargetPower property.
     * 
     */
    public int getPreambleInitialReceivedTargetPower() {
        return preambleInitialReceivedTargetPower;
    }

    /**
     * Sets the value of the preambleInitialReceivedTargetPower property.
     * 
     */
    public void setPreambleInitialReceivedTargetPower(int value) {
        this.preambleInitialReceivedTargetPower = value;
    }

    /**
     * Gets the value of the powerRampingStep property.
     * 
     */
    public int getPowerRampingStep() {
        return powerRampingStep;
    }

    /**
     * Sets the value of the powerRampingStep property.
     * 
     */
    public void setPowerRampingStep(int value) {
        this.powerRampingStep = value;
    }

    /**
     * Gets the value of the preambleTransMax property.
     * 
     */
    public int getPreambleTransMax() {
        return preambleTransMax;
    }

    /**
     * Sets the value of the preambleTransMax property.
     * 
     */
    public void setPreambleTransMax(int value) {
        this.preambleTransMax = value;
    }

    /**
     * Gets the value of the raResponseWindowSize property.
     * 
     */
    public int getRaResponseWindowSize() {
        return raResponseWindowSize;
    }

    /**
     * Sets the value of the raResponseWindowSize property.
     * 
     */
    public void setRaResponseWindowSize(int value) {
        this.raResponseWindowSize = value;
    }

    /**
     * Gets the value of the macContentionResolutionTimer property.
     * 
     */
    public int getMacContentionResolutionTimer() {
        return macContentionResolutionTimer;
    }

    /**
     * Sets the value of the macContentionResolutionTimer property.
     * 
     */
    public void setMacContentionResolutionTimer(int value) {
        this.macContentionResolutionTimer = value;
    }

}
