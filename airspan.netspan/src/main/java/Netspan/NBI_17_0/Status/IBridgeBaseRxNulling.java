
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeBaseRxNulling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeBaseRxNulling"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NullingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NullingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferencePatternId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferencePatternIdDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OptimalPatternId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NullingQi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeBaseRxNulling", propOrder = {
    "nullingMode",
    "nullingStatus",
    "referencePatternId",
    "referencePatternIdDefault",
    "optimalPatternId",
    "nullingQi"
})
public class IBridgeBaseRxNulling {

    @XmlElement(name = "NullingMode")
    protected String nullingMode;
    @XmlElement(name = "NullingStatus")
    protected String nullingStatus;
    @XmlElement(name = "ReferencePatternId")
    protected String referencePatternId;
    @XmlElement(name = "ReferencePatternIdDefault")
    protected String referencePatternIdDefault;
    @XmlElement(name = "OptimalPatternId")
    protected String optimalPatternId;
    @XmlElement(name = "NullingQi")
    protected String nullingQi;

    /**
     * Gets the value of the nullingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullingMode() {
        return nullingMode;
    }

    /**
     * Sets the value of the nullingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullingMode(String value) {
        this.nullingMode = value;
    }

    /**
     * Gets the value of the nullingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullingStatus() {
        return nullingStatus;
    }

    /**
     * Sets the value of the nullingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullingStatus(String value) {
        this.nullingStatus = value;
    }

    /**
     * Gets the value of the referencePatternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePatternId() {
        return referencePatternId;
    }

    /**
     * Sets the value of the referencePatternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePatternId(String value) {
        this.referencePatternId = value;
    }

    /**
     * Gets the value of the referencePatternIdDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePatternIdDefault() {
        return referencePatternIdDefault;
    }

    /**
     * Sets the value of the referencePatternIdDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePatternIdDefault(String value) {
        this.referencePatternIdDefault = value;
    }

    /**
     * Gets the value of the optimalPatternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptimalPatternId() {
        return optimalPatternId;
    }

    /**
     * Sets the value of the optimalPatternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptimalPatternId(String value) {
        this.optimalPatternId = value;
    }

    /**
     * Gets the value of the nullingQi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullingQi() {
        return nullingQi;
    }

    /**
     * Sets the value of the nullingQi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullingQi(String value) {
        this.nullingQi = value;
    }

}
