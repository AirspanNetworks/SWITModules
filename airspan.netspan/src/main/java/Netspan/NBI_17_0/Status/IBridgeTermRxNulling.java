
package Netspan.NBI_17_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermRxNulling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermRxNulling"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NullingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NullingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NullingQi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NullingCurrentPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NullingCurrentReferencePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RxNullingStatus" type="{http://Airspan.Netspan.WebServices}IBridgeTermRxNullingStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermRxNulling", propOrder = {
    "nullingMode",
    "nullingState",
    "nullingQi",
    "nullingCurrentPattern",
    "nullingCurrentReferencePattern",
    "rxNullingStatus"
})
public class IBridgeTermRxNulling {

    @XmlElement(name = "NullingMode")
    protected String nullingMode;
    @XmlElement(name = "NullingState")
    protected String nullingState;
    @XmlElement(name = "NullingQi")
    protected String nullingQi;
    @XmlElement(name = "NullingCurrentPattern")
    protected String nullingCurrentPattern;
    @XmlElement(name = "NullingCurrentReferencePattern")
    protected String nullingCurrentReferencePattern;
    @XmlElement(name = "RxNullingStatus")
    protected List<IBridgeTermRxNullingStatus> rxNullingStatus;

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
     * Gets the value of the nullingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullingState() {
        return nullingState;
    }

    /**
     * Sets the value of the nullingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullingState(String value) {
        this.nullingState = value;
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

    /**
     * Gets the value of the nullingCurrentPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullingCurrentPattern() {
        return nullingCurrentPattern;
    }

    /**
     * Sets the value of the nullingCurrentPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullingCurrentPattern(String value) {
        this.nullingCurrentPattern = value;
    }

    /**
     * Gets the value of the nullingCurrentReferencePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullingCurrentReferencePattern() {
        return nullingCurrentReferencePattern;
    }

    /**
     * Sets the value of the nullingCurrentReferencePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullingCurrentReferencePattern(String value) {
        this.nullingCurrentReferencePattern = value;
    }

    /**
     * Gets the value of the rxNullingStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rxNullingStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRxNullingStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeTermRxNullingStatus }
     * 
     * 
     */
    public List<IBridgeTermRxNullingStatus> getRxNullingStatus() {
        if (rxNullingStatus == null) {
            rxNullingStatus = new ArrayList<IBridgeTermRxNullingStatus>();
        }
        return this.rxNullingStatus;
    }

}
