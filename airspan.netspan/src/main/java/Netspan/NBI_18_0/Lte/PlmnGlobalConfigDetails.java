
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlmnGlobalConfigDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlmnGlobalConfigDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}PlmnGlobalConfigMccMncDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MnoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlmnGlobalConfigDetails", propOrder = {
    "mnoName"
})
public class PlmnGlobalConfigDetails
    extends PlmnGlobalConfigMccMncDetails
{

    @XmlElement(name = "MnoName")
    protected String mnoName;

    /**
     * Gets the value of the mnoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnoName() {
        return mnoName;
    }

    /**
     * Sets the value of the mnoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnoName(String value) {
        this.mnoName = value;
    }

}
