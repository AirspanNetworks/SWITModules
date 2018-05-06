
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UplinkPowerControlWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UplinkPowerControlWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="P0NominalPusch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Alpha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeltaPreambleMsg3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FilterCoefficient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="P0NominalPucch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeltaFPucchFormat1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeltaFPucchFormat1b" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeltaFPucchFormat2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeltaFPucchFormat2a" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeltaFPucchFormat2b" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UplinkPowerControlWs", propOrder = {
    "p0NominalPusch",
    "alpha",
    "deltaPreambleMsg3",
    "filterCoefficient",
    "p0NominalPucch",
    "deltaFPucchFormat1",
    "deltaFPucchFormat1B",
    "deltaFPucchFormat2",
    "deltaFPucchFormat2A",
    "deltaFPucchFormat2B"
})
public class UplinkPowerControlWs {

    @XmlElement(name = "P0NominalPusch")
    protected int p0NominalPusch;
    @XmlElement(name = "Alpha")
    protected int alpha;
    @XmlElement(name = "DeltaPreambleMsg3")
    protected int deltaPreambleMsg3;
    @XmlElement(name = "FilterCoefficient")
    protected int filterCoefficient;
    @XmlElement(name = "P0NominalPucch")
    protected int p0NominalPucch;
    @XmlElement(name = "DeltaFPucchFormat1")
    protected int deltaFPucchFormat1;
    @XmlElement(name = "DeltaFPucchFormat1b")
    protected int deltaFPucchFormat1B;
    @XmlElement(name = "DeltaFPucchFormat2")
    protected int deltaFPucchFormat2;
    @XmlElement(name = "DeltaFPucchFormat2a")
    protected int deltaFPucchFormat2A;
    @XmlElement(name = "DeltaFPucchFormat2b")
    protected int deltaFPucchFormat2B;

    /**
     * Gets the value of the p0NominalPusch property.
     * 
     */
    public int getP0NominalPusch() {
        return p0NominalPusch;
    }

    /**
     * Sets the value of the p0NominalPusch property.
     * 
     */
    public void setP0NominalPusch(int value) {
        this.p0NominalPusch = value;
    }

    /**
     * Gets the value of the alpha property.
     * 
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     */
    public void setAlpha(int value) {
        this.alpha = value;
    }

    /**
     * Gets the value of the deltaPreambleMsg3 property.
     * 
     */
    public int getDeltaPreambleMsg3() {
        return deltaPreambleMsg3;
    }

    /**
     * Sets the value of the deltaPreambleMsg3 property.
     * 
     */
    public void setDeltaPreambleMsg3(int value) {
        this.deltaPreambleMsg3 = value;
    }

    /**
     * Gets the value of the filterCoefficient property.
     * 
     */
    public int getFilterCoefficient() {
        return filterCoefficient;
    }

    /**
     * Sets the value of the filterCoefficient property.
     * 
     */
    public void setFilterCoefficient(int value) {
        this.filterCoefficient = value;
    }

    /**
     * Gets the value of the p0NominalPucch property.
     * 
     */
    public int getP0NominalPucch() {
        return p0NominalPucch;
    }

    /**
     * Sets the value of the p0NominalPucch property.
     * 
     */
    public void setP0NominalPucch(int value) {
        this.p0NominalPucch = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat1 property.
     * 
     */
    public int getDeltaFPucchFormat1() {
        return deltaFPucchFormat1;
    }

    /**
     * Sets the value of the deltaFPucchFormat1 property.
     * 
     */
    public void setDeltaFPucchFormat1(int value) {
        this.deltaFPucchFormat1 = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat1B property.
     * 
     */
    public int getDeltaFPucchFormat1B() {
        return deltaFPucchFormat1B;
    }

    /**
     * Sets the value of the deltaFPucchFormat1B property.
     * 
     */
    public void setDeltaFPucchFormat1B(int value) {
        this.deltaFPucchFormat1B = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2 property.
     * 
     */
    public int getDeltaFPucchFormat2() {
        return deltaFPucchFormat2;
    }

    /**
     * Sets the value of the deltaFPucchFormat2 property.
     * 
     */
    public void setDeltaFPucchFormat2(int value) {
        this.deltaFPucchFormat2 = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2A property.
     * 
     */
    public int getDeltaFPucchFormat2A() {
        return deltaFPucchFormat2A;
    }

    /**
     * Sets the value of the deltaFPucchFormat2A property.
     * 
     */
    public void setDeltaFPucchFormat2A(int value) {
        this.deltaFPucchFormat2A = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2B property.
     * 
     */
    public int getDeltaFPucchFormat2B() {
        return deltaFPucchFormat2B;
    }

    /**
     * Sets the value of the deltaFPucchFormat2B property.
     * 
     */
    public void setDeltaFPucchFormat2B(int value) {
        this.deltaFPucchFormat2B = value;
    }

}
