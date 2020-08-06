
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataLogger" type="{http://Airspan.Netspan.WebServices}EnabledDisabled"/&gt;
 *         &lt;element name="DataLoggerExpirationHrs" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeName",
    "dataLogger",
    "dataLoggerExpirationHrs"
})
@XmlRootElement(name = "EnbDataLoggerActionSet")
public class EnbDataLoggerActionSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "DataLogger", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabled dataLogger;
    @XmlElement(name = "DataLoggerExpirationHrs", required = true, type = Integer.class, nillable = true)
    protected Integer dataLoggerExpirationHrs;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the dataLogger property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabled }
     *     
     */
    public EnabledDisabled getDataLogger() {
        return dataLogger;
    }

    /**
     * Sets the value of the dataLogger property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabled }
     *     
     */
    public void setDataLogger(EnabledDisabled value) {
        this.dataLogger = value;
    }

    /**
     * Gets the value of the dataLoggerExpirationHrs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataLoggerExpirationHrs() {
        return dataLoggerExpirationHrs;
    }

    /**
     * Sets the value of the dataLoggerExpirationHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataLoggerExpirationHrs(Integer value) {
        this.dataLoggerExpirationHrs = value;
    }

}
