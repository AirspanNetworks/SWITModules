
package Netspan.NBI_15_2.Lte;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}PnpDetailWs" minOccurs="0"/>
 *         &lt;element name="eNBDetail" type="{http://Airspan.Netspan.WebServices}LteEnbDetailsSetWsPnp" minOccurs="0"/>
 *         &lt;element name="EnbSnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pnpDetail",
    "enbDetail",
    "enbSnmpDetail"
})
@XmlRootElement(name = "PnpConfigCreate")
public class PnpConfigCreate {

    @XmlElement(name = "PnpDetail")
    protected PnpDetailWs pnpDetail;
    @XmlElement(name = "eNBDetail")
    protected LteEnbDetailsSetWsPnp enbDetail;
    @XmlElement(name = "EnbSnmpDetail")
    protected SnmpDetailWs enbSnmpDetail;

    /**
     * Gets the value of the pnpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PnpDetailWs }
     *     
     */
    public PnpDetailWs getPnpDetail() {
        return pnpDetail;
    }

    /**
     * Sets the value of the pnpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnpDetailWs }
     *     
     */
    public void setPnpDetail(PnpDetailWs value) {
        this.pnpDetail = value;
    }

    /**
     * Gets the value of the enbDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LteEnbDetailsSetWsPnp }
     *     
     */
    public LteEnbDetailsSetWsPnp getENBDetail() {
        return enbDetail;
    }

    /**
     * Sets the value of the enbDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteEnbDetailsSetWsPnp }
     *     
     */
    public void setENBDetail(LteEnbDetailsSetWsPnp value) {
        this.enbDetail = value;
    }

    /**
     * Gets the value of the enbSnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailWs }
     *     
     */
    public SnmpDetailWs getEnbSnmpDetail() {
        return enbSnmpDetail;
    }

    /**
     * Sets the value of the enbSnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailWs }
     *     
     */
    public void setEnbSnmpDetail(SnmpDetailWs value) {
        this.enbSnmpDetail = value;
    }

}
