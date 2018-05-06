
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RrcTimersWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RrcTimersWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultPagingCycle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T300" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T301" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T310" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="N310" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="N311" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T311" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T304" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T320" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RrcTimersWs", propOrder = {
    "defaultPagingCycle",
    "nb",
    "t300",
    "t301",
    "t310",
    "n310",
    "n311",
    "t311",
    "t304",
    "t320"
})
public class RrcTimersWs {

    @XmlElement(name = "DefaultPagingCycle")
    protected int defaultPagingCycle;
    @XmlElement(name = "Nb")
    protected int nb;
    @XmlElement(name = "T300")
    protected int t300;
    @XmlElement(name = "T301")
    protected int t301;
    @XmlElement(name = "T310")
    protected int t310;
    @XmlElement(name = "N310")
    protected int n310;
    @XmlElement(name = "N311")
    protected int n311;
    @XmlElement(name = "T311")
    protected int t311;
    @XmlElement(name = "T304")
    protected int t304;
    @XmlElement(name = "T320")
    protected int t320;

    /**
     * Gets the value of the defaultPagingCycle property.
     * 
     */
    public int getDefaultPagingCycle() {
        return defaultPagingCycle;
    }

    /**
     * Sets the value of the defaultPagingCycle property.
     * 
     */
    public void setDefaultPagingCycle(int value) {
        this.defaultPagingCycle = value;
    }

    /**
     * Gets the value of the nb property.
     * 
     */
    public int getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     */
    public void setNb(int value) {
        this.nb = value;
    }

    /**
     * Gets the value of the t300 property.
     * 
     */
    public int getT300() {
        return t300;
    }

    /**
     * Sets the value of the t300 property.
     * 
     */
    public void setT300(int value) {
        this.t300 = value;
    }

    /**
     * Gets the value of the t301 property.
     * 
     */
    public int getT301() {
        return t301;
    }

    /**
     * Sets the value of the t301 property.
     * 
     */
    public void setT301(int value) {
        this.t301 = value;
    }

    /**
     * Gets the value of the t310 property.
     * 
     */
    public int getT310() {
        return t310;
    }

    /**
     * Sets the value of the t310 property.
     * 
     */
    public void setT310(int value) {
        this.t310 = value;
    }

    /**
     * Gets the value of the n310 property.
     * 
     */
    public int getN310() {
        return n310;
    }

    /**
     * Sets the value of the n310 property.
     * 
     */
    public void setN310(int value) {
        this.n310 = value;
    }

    /**
     * Gets the value of the n311 property.
     * 
     */
    public int getN311() {
        return n311;
    }

    /**
     * Sets the value of the n311 property.
     * 
     */
    public void setN311(int value) {
        this.n311 = value;
    }

    /**
     * Gets the value of the t311 property.
     * 
     */
    public int getT311() {
        return t311;
    }

    /**
     * Sets the value of the t311 property.
     * 
     */
    public void setT311(int value) {
        this.t311 = value;
    }

    /**
     * Gets the value of the t304 property.
     * 
     */
    public int getT304() {
        return t304;
    }

    /**
     * Sets the value of the t304 property.
     * 
     */
    public void setT304(int value) {
        this.t304 = value;
    }

    /**
     * Gets the value of the t320 property.
     * 
     */
    public int getT320() {
        return t320;
    }

    /**
     * Sets the value of the t320 property.
     * 
     */
    public void setT320(int value) {
        this.t320 = value;
    }

}
