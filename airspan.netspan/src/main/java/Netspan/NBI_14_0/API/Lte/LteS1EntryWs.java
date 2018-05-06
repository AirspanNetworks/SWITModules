
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteS1EntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteS1EntryWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MmeIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlVlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ControlPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataVlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SctpPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteS1EntryWs", propOrder = {
    "mmeIpAddress",
    "controlVlanId",
    "controlPriority",
    "dataVlanId",
    "dataPriority",
    "sctpPort"
})
public class LteS1EntryWs {

    @XmlElement(name = "MmeIpAddress")
    protected String mmeIpAddress;
    @XmlElement(name = "ControlVlanId", required = true, type = Integer.class, nillable = true)
    protected Integer controlVlanId;
    @XmlElement(name = "ControlPriority", required = true, type = Integer.class, nillable = true)
    protected Integer controlPriority;
    @XmlElement(name = "DataVlanId", required = true, type = Integer.class, nillable = true)
    protected Integer dataVlanId;
    @XmlElement(name = "DataPriority", required = true, type = Integer.class, nillable = true)
    protected Integer dataPriority;
    @XmlElement(name = "SctpPort", required = true, type = Integer.class, nillable = true)
    protected Integer sctpPort;

    /**
     * Gets the value of the mmeIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmeIpAddress() {
        return mmeIpAddress;
    }

    /**
     * Sets the value of the mmeIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmeIpAddress(String value) {
        this.mmeIpAddress = value;
    }

    /**
     * Gets the value of the controlVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getControlVlanId() {
        return controlVlanId;
    }

    /**
     * Sets the value of the controlVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setControlVlanId(Integer value) {
        this.controlVlanId = value;
    }

    /**
     * Gets the value of the controlPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getControlPriority() {
        return controlPriority;
    }

    /**
     * Sets the value of the controlPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setControlPriority(Integer value) {
        this.controlPriority = value;
    }

    /**
     * Gets the value of the dataVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataVlanId() {
        return dataVlanId;
    }

    /**
     * Sets the value of the dataVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataVlanId(Integer value) {
        this.dataVlanId = value;
    }

    /**
     * Gets the value of the dataPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataPriority() {
        return dataPriority;
    }

    /**
     * Sets the value of the dataPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataPriority(Integer value) {
        this.dataPriority = value;
    }

    /**
     * Gets the value of the sctpPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSctpPort() {
        return sctpPort;
    }

    /**
     * Sets the value of the sctpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSctpPort(Integer value) {
        this.sctpPort = value;
    }

}
