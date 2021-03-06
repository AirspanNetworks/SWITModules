
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedDeviceVciToTypeEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedDeviceVciToTypeEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://Airspan.Netspan.WebServices}AccessDeviceTypesWs"/&gt;
 *         &lt;element name="VendorClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyAccessDevice" type="{http://Airspan.Netspan.WebServices}ThirdPartyAccessDevicesWs"/&gt;
 *         &lt;element name="ProductClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedDeviceVciToTypeEntryWs", propOrder = {
    "type",
    "vendorClassIdentifier",
    "thirdPartyAccessDevice",
    "productClassIdentifier"
})
public class ConnectedDeviceVciToTypeEntryWs {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected AccessDeviceTypesWs type;
    @XmlElement(name = "VendorClassIdentifier")
    protected String vendorClassIdentifier;
    @XmlElement(name = "ThirdPartyAccessDevice", required = true)
    @XmlSchemaType(name = "string")
    protected ThirdPartyAccessDevicesWs thirdPartyAccessDevice;
    @XmlElement(name = "ProductClassIdentifier")
    protected String productClassIdentifier;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AccessDeviceTypesWs }
     *     
     */
    public AccessDeviceTypesWs getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessDeviceTypesWs }
     *     
     */
    public void setType(AccessDeviceTypesWs value) {
        this.type = value;
    }

    /**
     * Gets the value of the vendorClassIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorClassIdentifier() {
        return vendorClassIdentifier;
    }

    /**
     * Sets the value of the vendorClassIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorClassIdentifier(String value) {
        this.vendorClassIdentifier = value;
    }

    /**
     * Gets the value of the thirdPartyAccessDevice property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyAccessDevicesWs }
     *     
     */
    public ThirdPartyAccessDevicesWs getThirdPartyAccessDevice() {
        return thirdPartyAccessDevice;
    }

    /**
     * Sets the value of the thirdPartyAccessDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyAccessDevicesWs }
     *     
     */
    public void setThirdPartyAccessDevice(ThirdPartyAccessDevicesWs value) {
        this.thirdPartyAccessDevice = value;
    }

    /**
     * Gets the value of the productClassIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassIdentifier() {
        return productClassIdentifier;
    }

    /**
     * Sets the value of the productClassIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassIdentifier(String value) {
        this.productClassIdentifier = value;
    }

}
