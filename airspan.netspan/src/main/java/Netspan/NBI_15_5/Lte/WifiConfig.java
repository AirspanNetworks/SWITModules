
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WifiConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WifiConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Radio2dot4Ghz" type="{http://Airspan.Netspan.WebServices}WifiEnableDisableValues"/>
 *         &lt;element name="Radio5Ghz" type="{http://Airspan.Netspan.WebServices}WifiEnableDisableValues"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WifiConfig", propOrder = {
    "radio2Dot4Ghz",
    "radio5Ghz"
})
public class WifiConfig {

    @XmlElement(name = "Radio2dot4Ghz", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected WifiEnableDisableValues radio2Dot4Ghz;
    @XmlElement(name = "Radio5Ghz", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected WifiEnableDisableValues radio5Ghz;

    /**
     * Gets the value of the radio2Dot4Ghz property.
     * 
     * @return
     *     possible object is
     *     {@link WifiEnableDisableValues }
     *     
     */
    public WifiEnableDisableValues getRadio2Dot4Ghz() {
        return radio2Dot4Ghz;
    }

    /**
     * Sets the value of the radio2Dot4Ghz property.
     * 
     * @param value
     *     allowed object is
     *     {@link WifiEnableDisableValues }
     *     
     */
    public void setRadio2Dot4Ghz(WifiEnableDisableValues value) {
        this.radio2Dot4Ghz = value;
    }

    /**
     * Gets the value of the radio5Ghz property.
     * 
     * @return
     *     possible object is
     *     {@link WifiEnableDisableValues }
     *     
     */
    public WifiEnableDisableValues getRadio5Ghz() {
        return radio5Ghz;
    }

    /**
     * Sets the value of the radio5Ghz property.
     * 
     * @param value
     *     allowed object is
     *     {@link WifiEnableDisableValues }
     *     
     */
    public void setRadio5Ghz(WifiEnableDisableValues value) {
        this.radio5Ghz = value;
    }

}
