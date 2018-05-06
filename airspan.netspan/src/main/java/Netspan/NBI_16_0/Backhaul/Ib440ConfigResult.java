
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440ConfigResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440ConfigResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/>
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/>
 *         &lt;element name="Ib440Config" type="{http://Airspan.Netspan.WebServices}Ib440DetailsGet" minOccurs="0"/>
 *         &lt;element name="Ib400SnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440ConfigResult", propOrder = {
    "nodeResultCode",
    "nodeResultString",
    "nodeName",
    "nodeDetail",
    "ib440Config",
    "ib400SnmpDetail"
})
public class Ib440ConfigResult {

    @XmlElement(name = "NodeResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues nodeResultCode;
    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    @XmlElement(name = "Ib440Config")
    protected Ib440DetailsGet ib440Config;
    @XmlElement(name = "Ib400SnmpDetail")
    protected SnmpDetailWs ib400SnmpDetail;

    /**
     * Gets the value of the nodeResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeResultValues }
     *     
     */
    public NodeResultValues getNodeResultCode() {
        return nodeResultCode;
    }

    /**
     * Sets the value of the nodeResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeResultValues }
     *     
     */
    public void setNodeResultCode(NodeResultValues value) {
        this.nodeResultCode = value;
    }

    /**
     * Gets the value of the nodeResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeResultString() {
        return nodeResultString;
    }

    /**
     * Sets the value of the nodeResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeResultString(String value) {
        this.nodeResultString = value;
    }

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
     * Gets the value of the nodeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NodeProperty }
     *     
     */
    public NodeProperty getNodeDetail() {
        return nodeDetail;
    }

    /**
     * Sets the value of the nodeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeProperty }
     *     
     */
    public void setNodeDetail(NodeProperty value) {
        this.nodeDetail = value;
    }

    /**
     * Gets the value of the ib440Config property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440DetailsGet }
     *     
     */
    public Ib440DetailsGet getIb440Config() {
        return ib440Config;
    }

    /**
     * Sets the value of the ib440Config property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440DetailsGet }
     *     
     */
    public void setIb440Config(Ib440DetailsGet value) {
        this.ib440Config = value;
    }

    /**
     * Gets the value of the ib400SnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailWs }
     *     
     */
    public SnmpDetailWs getIb400SnmpDetail() {
        return ib400SnmpDetail;
    }

    /**
     * Sets the value of the ib400SnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailWs }
     *     
     */
    public void setIb400SnmpDetail(SnmpDetailWs value) {
        this.ib400SnmpDetail = value;
    }

}
