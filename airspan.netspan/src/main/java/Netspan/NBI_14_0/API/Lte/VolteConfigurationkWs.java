
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolteConfigurationkWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolteConfigurationkWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivateVolteDataInactivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DlaForceVolteTd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LowUlBlerForVolte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AllowDlDcchDtch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EnableVolteFixedAllocations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DlaVolteItbsMargin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalBitsForFixedAllocations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VolteHeaderOverhead" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberofVoltePackets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolteConfigurationkWs", propOrder = {
    "activateVolteDataInactivity",
    "dlaForceVolteTd",
    "lowUlBlerForVolte",
    "allowDlDcchDtch",
    "enableVolteFixedAllocations",
    "dlaVolteItbsMargin",
    "additionalBitsForFixedAllocations",
    "volteHeaderOverhead",
    "numberofVoltePackets"
})
public class VolteConfigurationkWs {

    @XmlElement(name = "ActivateVolteDataInactivity")
    protected int activateVolteDataInactivity;
    @XmlElement(name = "DlaForceVolteTd")
    protected int dlaForceVolteTd;
    @XmlElement(name = "LowUlBlerForVolte")
    protected int lowUlBlerForVolte;
    @XmlElement(name = "AllowDlDcchDtch")
    protected int allowDlDcchDtch;
    @XmlElement(name = "EnableVolteFixedAllocations")
    protected int enableVolteFixedAllocations;
    @XmlElement(name = "DlaVolteItbsMargin")
    protected int dlaVolteItbsMargin;
    @XmlElement(name = "AdditionalBitsForFixedAllocations")
    protected int additionalBitsForFixedAllocations;
    @XmlElement(name = "VolteHeaderOverhead")
    protected int volteHeaderOverhead;
    @XmlElement(name = "NumberofVoltePackets")
    protected int numberofVoltePackets;

    /**
     * Gets the value of the activateVolteDataInactivity property.
     * 
     */
    public int getActivateVolteDataInactivity() {
        return activateVolteDataInactivity;
    }

    /**
     * Sets the value of the activateVolteDataInactivity property.
     * 
     */
    public void setActivateVolteDataInactivity(int value) {
        this.activateVolteDataInactivity = value;
    }

    /**
     * Gets the value of the dlaForceVolteTd property.
     * 
     */
    public int getDlaForceVolteTd() {
        return dlaForceVolteTd;
    }

    /**
     * Sets the value of the dlaForceVolteTd property.
     * 
     */
    public void setDlaForceVolteTd(int value) {
        this.dlaForceVolteTd = value;
    }

    /**
     * Gets the value of the lowUlBlerForVolte property.
     * 
     */
    public int getLowUlBlerForVolte() {
        return lowUlBlerForVolte;
    }

    /**
     * Sets the value of the lowUlBlerForVolte property.
     * 
     */
    public void setLowUlBlerForVolte(int value) {
        this.lowUlBlerForVolte = value;
    }

    /**
     * Gets the value of the allowDlDcchDtch property.
     * 
     */
    public int getAllowDlDcchDtch() {
        return allowDlDcchDtch;
    }

    /**
     * Sets the value of the allowDlDcchDtch property.
     * 
     */
    public void setAllowDlDcchDtch(int value) {
        this.allowDlDcchDtch = value;
    }

    /**
     * Gets the value of the enableVolteFixedAllocations property.
     * 
     */
    public int getEnableVolteFixedAllocations() {
        return enableVolteFixedAllocations;
    }

    /**
     * Sets the value of the enableVolteFixedAllocations property.
     * 
     */
    public void setEnableVolteFixedAllocations(int value) {
        this.enableVolteFixedAllocations = value;
    }

    /**
     * Gets the value of the dlaVolteItbsMargin property.
     * 
     */
    public int getDlaVolteItbsMargin() {
        return dlaVolteItbsMargin;
    }

    /**
     * Sets the value of the dlaVolteItbsMargin property.
     * 
     */
    public void setDlaVolteItbsMargin(int value) {
        this.dlaVolteItbsMargin = value;
    }

    /**
     * Gets the value of the additionalBitsForFixedAllocations property.
     * 
     */
    public int getAdditionalBitsForFixedAllocations() {
        return additionalBitsForFixedAllocations;
    }

    /**
     * Sets the value of the additionalBitsForFixedAllocations property.
     * 
     */
    public void setAdditionalBitsForFixedAllocations(int value) {
        this.additionalBitsForFixedAllocations = value;
    }

    /**
     * Gets the value of the volteHeaderOverhead property.
     * 
     */
    public int getVolteHeaderOverhead() {
        return volteHeaderOverhead;
    }

    /**
     * Sets the value of the volteHeaderOverhead property.
     * 
     */
    public void setVolteHeaderOverhead(int value) {
        this.volteHeaderOverhead = value;
    }

    /**
     * Gets the value of the numberofVoltePackets property.
     * 
     */
    public int getNumberofVoltePackets() {
        return numberofVoltePackets;
    }

    /**
     * Sets the value of the numberofVoltePackets property.
     * 
     */
    public void setNumberofVoltePackets(int value) {
        this.numberofVoltePackets = value;
    }

}
