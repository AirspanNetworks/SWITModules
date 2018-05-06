
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteUlPktDataPriorityEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteUlPktDataPriorityEntryWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrafficType" type="{http://Airspan.Netspan.WebServices}LteNetworkProfileUlPktDataPriority"/>
 *         &lt;element name="Dscp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteUlPktDataPriorityEntryWs", propOrder = {
    "trafficType",
    "dscp"
})
public class LteUlPktDataPriorityEntryWs {

    @XmlElement(name = "TrafficType", required = true)
    @XmlSchemaType(name = "string")
    protected LteNetworkProfileUlPktDataPriority trafficType;
    @XmlElement(name = "Dscp", required = true, type = Integer.class, nillable = true)
    protected Integer dscp;

    /**
     * Gets the value of the trafficType property.
     * 
     * @return
     *     possible object is
     *     {@link LteNetworkProfileUlPktDataPriority }
     *     
     */
    public LteNetworkProfileUlPktDataPriority getTrafficType() {
        return trafficType;
    }

    /**
     * Sets the value of the trafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteNetworkProfileUlPktDataPriority }
     *     
     */
    public void setTrafficType(LteNetworkProfileUlPktDataPriority value) {
        this.trafficType = value;
    }

    /**
     * Gets the value of the dscp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDscp() {
        return dscp;
    }

    /**
     * Sets the value of the dscp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDscp(Integer value) {
        this.dscp = value;
    }

}
