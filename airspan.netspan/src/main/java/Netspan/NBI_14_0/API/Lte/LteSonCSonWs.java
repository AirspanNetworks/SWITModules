
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteSonCSonWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSonCSonWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCSonEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCSonMcimEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCSonMroEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCSonMlbEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CSonMlbCapacityClassValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CSonMlbPdschLoadThresh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CSonMlbPuschLoadThresh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CSonMlbRrcLoadThresh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CSonMlbCpuLoadThresh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSonCSonWs", propOrder = {
    "isCSonEnabled",
    "isCSonMcimEnabled",
    "isCSonMroEnabled",
    "isCSonMlbEnabled",
    "cSonMlbCapacityClassValue",
    "cSonMlbPdschLoadThresh",
    "cSonMlbPuschLoadThresh",
    "cSonMlbRrcLoadThresh",
    "cSonMlbCpuLoadThresh"
})
public class LteSonCSonWs {

    @XmlElement(name = "IsCSonEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCSonEnabled;
    @XmlElement(name = "IsCSonMcimEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCSonMcimEnabled;
    @XmlElement(name = "IsCSonMroEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCSonMroEnabled;
    @XmlElement(name = "IsCSonMlbEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCSonMlbEnabled;
    @XmlElement(name = "CSonMlbCapacityClassValue", required = true, type = Integer.class, nillable = true)
    protected Integer cSonMlbCapacityClassValue;
    @XmlElement(name = "CSonMlbPdschLoadThresh", required = true, type = Integer.class, nillable = true)
    protected Integer cSonMlbPdschLoadThresh;
    @XmlElement(name = "CSonMlbPuschLoadThresh", required = true, type = Integer.class, nillable = true)
    protected Integer cSonMlbPuschLoadThresh;
    @XmlElement(name = "CSonMlbRrcLoadThresh", required = true, type = Integer.class, nillable = true)
    protected Integer cSonMlbRrcLoadThresh;
    @XmlElement(name = "CSonMlbCpuLoadThresh", required = true, type = Integer.class, nillable = true)
    protected Integer cSonMlbCpuLoadThresh;

    /**
     * Gets the value of the isCSonEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCSonEnabled() {
        return isCSonEnabled;
    }

    /**
     * Sets the value of the isCSonEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCSonEnabled(Boolean value) {
        this.isCSonEnabled = value;
    }

    /**
     * Gets the value of the isCSonMcimEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCSonMcimEnabled() {
        return isCSonMcimEnabled;
    }

    /**
     * Sets the value of the isCSonMcimEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCSonMcimEnabled(Boolean value) {
        this.isCSonMcimEnabled = value;
    }

    /**
     * Gets the value of the isCSonMroEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCSonMroEnabled() {
        return isCSonMroEnabled;
    }

    /**
     * Sets the value of the isCSonMroEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCSonMroEnabled(Boolean value) {
        this.isCSonMroEnabled = value;
    }

    /**
     * Gets the value of the isCSonMlbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCSonMlbEnabled() {
        return isCSonMlbEnabled;
    }

    /**
     * Sets the value of the isCSonMlbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCSonMlbEnabled(Boolean value) {
        this.isCSonMlbEnabled = value;
    }

    /**
     * Gets the value of the cSonMlbCapacityClassValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSonMlbCapacityClassValue() {
        return cSonMlbCapacityClassValue;
    }

    /**
     * Sets the value of the cSonMlbCapacityClassValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSonMlbCapacityClassValue(Integer value) {
        this.cSonMlbCapacityClassValue = value;
    }

    /**
     * Gets the value of the cSonMlbPdschLoadThresh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSonMlbPdschLoadThresh() {
        return cSonMlbPdschLoadThresh;
    }

    /**
     * Sets the value of the cSonMlbPdschLoadThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSonMlbPdschLoadThresh(Integer value) {
        this.cSonMlbPdschLoadThresh = value;
    }

    /**
     * Gets the value of the cSonMlbPuschLoadThresh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSonMlbPuschLoadThresh() {
        return cSonMlbPuschLoadThresh;
    }

    /**
     * Sets the value of the cSonMlbPuschLoadThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSonMlbPuschLoadThresh(Integer value) {
        this.cSonMlbPuschLoadThresh = value;
    }

    /**
     * Gets the value of the cSonMlbRrcLoadThresh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSonMlbRrcLoadThresh() {
        return cSonMlbRrcLoadThresh;
    }

    /**
     * Sets the value of the cSonMlbRrcLoadThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSonMlbRrcLoadThresh(Integer value) {
        this.cSonMlbRrcLoadThresh = value;
    }

    /**
     * Gets the value of the cSonMlbCpuLoadThresh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSonMlbCpuLoadThresh() {
        return cSonMlbCpuLoadThresh;
    }

    /**
     * Sets the value of the cSonMlbCpuLoadThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSonMlbCpuLoadThresh(Integer value) {
        this.cSonMlbCpuLoadThresh = value;
    }

}
