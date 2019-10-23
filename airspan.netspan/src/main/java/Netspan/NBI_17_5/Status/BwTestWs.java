
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BwTestWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BwTestWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvgTxMbps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvgRxMbps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BwTestWs", propOrder = {
    "testType",
    "testDuration",
    "avgTxMbps",
    "avgRxMbps"
})
public class BwTestWs {

    @XmlElement(name = "TestType")
    protected String testType;
    @XmlElement(name = "TestDuration")
    protected String testDuration;
    @XmlElement(name = "AvgTxMbps")
    protected String avgTxMbps;
    @XmlElement(name = "AvgRxMbps")
    protected String avgRxMbps;

    /**
     * Gets the value of the testType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestType() {
        return testType;
    }

    /**
     * Sets the value of the testType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestType(String value) {
        this.testType = value;
    }

    /**
     * Gets the value of the testDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestDuration() {
        return testDuration;
    }

    /**
     * Sets the value of the testDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestDuration(String value) {
        this.testDuration = value;
    }

    /**
     * Gets the value of the avgTxMbps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgTxMbps() {
        return avgTxMbps;
    }

    /**
     * Sets the value of the avgTxMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgTxMbps(String value) {
        this.avgTxMbps = value;
    }

    /**
     * Gets the value of the avgRxMbps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgRxMbps() {
        return avgRxMbps;
    }

    /**
     * Sets the value of the avgRxMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgRxMbps(String value) {
        this.avgRxMbps = value;
    }

}
