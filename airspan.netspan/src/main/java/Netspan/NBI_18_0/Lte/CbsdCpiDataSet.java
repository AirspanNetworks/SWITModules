
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="CpiDetail" type="{http://Airspan.Netspan.WebServices}CpiDetails" minOccurs="0"/&gt;
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
    "cpiDetail"
})
@XmlRootElement(name = "CbsdCpiDataSet")
public class CbsdCpiDataSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "CpiDetail")
    protected CpiDetails cpiDetail;

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
     * Gets the value of the cpiDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CpiDetails }
     *     
     */
    public CpiDetails getCpiDetail() {
        return cpiDetail;
    }

    /**
     * Sets the value of the cpiDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpiDetails }
     *     
     */
    public void setCpiDetail(CpiDetails value) {
        this.cpiDetail = value;
    }

}
