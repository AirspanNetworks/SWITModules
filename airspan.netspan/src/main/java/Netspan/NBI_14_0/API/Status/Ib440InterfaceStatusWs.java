
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440InterfaceStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440InterfaceStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterfaceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdminStatus" type="{http://Airspan.Netspan.WebServices}AdminStatuses"/>
 *         &lt;element name="OperationalStatus" type="{http://Airspan.Netspan.WebServices}OperationalStatuses"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440InterfaceStatusWs", propOrder = {
    "index",
    "interfaceDescription",
    "adminStatus",
    "operationalStatus"
})
public class Ib440InterfaceStatusWs {

    @XmlElement(name = "Index")
    protected String index;
    @XmlElement(name = "InterfaceDescription")
    protected String interfaceDescription;
    @XmlElement(name = "AdminStatus", required = true)
    @XmlSchemaType(name = "string")
    protected AdminStatuses adminStatus;
    @XmlElement(name = "OperationalStatus", required = true)
    @XmlSchemaType(name = "string")
    protected OperationalStatuses operationalStatus;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the interfaceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceDescription() {
        return interfaceDescription;
    }

    /**
     * Sets the value of the interfaceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceDescription(String value) {
        this.interfaceDescription = value;
    }

    /**
     * Gets the value of the adminStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdminStatuses }
     *     
     */
    public AdminStatuses getAdminStatus() {
        return adminStatus;
    }

    /**
     * Sets the value of the adminStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminStatuses }
     *     
     */
    public void setAdminStatus(AdminStatuses value) {
        this.adminStatus = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalStatuses }
     *     
     */
    public OperationalStatuses getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalStatuses }
     *     
     */
    public void setOperationalStatus(OperationalStatuses value) {
        this.operationalStatus = value;
    }

}
