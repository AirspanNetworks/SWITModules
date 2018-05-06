
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCSonEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCSonEntryWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCSonConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CSonIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSonServerPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CSonVlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CSonVlanPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCSonEntryWs", propOrder = {
    "isCSonConfigured",
    "cSonIpAddress",
    "cSonServerPort",
    "cSonVlanId",
    "cSonVlanPriority"
})
public class LteCSonEntryWs {

    @XmlElement(name = "IsCSonConfigured", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCSonConfigured;
    @XmlElement(name = "CSonIpAddress")
    protected String cSonIpAddress;
    @XmlElement(name = "CSonServerPort", required = true, type = Integer.class, nillable = true)
    protected Integer cSonServerPort;
    @XmlElement(name = "CSonVlanId", required = true, type = Integer.class, nillable = true)
    protected Integer cSonVlanId;
    @XmlElement(name = "CSonVlanPriority", required = true, type = Integer.class, nillable = true)
    protected Integer cSonVlanPriority;

    /**
     * Gets the value of the isCSonConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCSonConfigured() {
        return isCSonConfigured;
    }

    /**
     * Sets the value of the isCSonConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCSonConfigured(Boolean value) {
        this.isCSonConfigured = value;
    }

    /**
     * Gets the value of the cSonIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSonIpAddress() {
        return cSonIpAddress;
    }

    /**
     * Sets the value of the cSonIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSonIpAddress(String value) {
        this.cSonIpAddress = value;
    }

    /**
     * Gets the value of the cSonServerPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSonServerPort() {
        return cSonServerPort;
    }

    /**
     * Sets the value of the cSonServerPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSonServerPort(Integer value) {
        this.cSonServerPort = value;
    }

    /**
     * Gets the value of the cSonVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSonVlanId() {
        return cSonVlanId;
    }

    /**
     * Sets the value of the cSonVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSonVlanId(Integer value) {
        this.cSonVlanId = value;
    }

    /**
     * Gets the value of the cSonVlanPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSonVlanPriority() {
        return cSonVlanPriority;
    }

    /**
     * Sets the value of the cSonVlanPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSonVlanPriority(Integer value) {
        this.cSonVlanPriority = value;
    }

}
