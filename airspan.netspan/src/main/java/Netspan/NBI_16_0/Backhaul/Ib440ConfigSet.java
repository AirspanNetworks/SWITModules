
package Netspan.NBI_16_0.Backhaul;

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
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="Ib440Details" type="{http://Airspan.Netspan.WebServices}Ib440DetailsSetWs" minOccurs="0"/&gt;
 *         &lt;element name="Ib440SnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailSetWs" minOccurs="0"/&gt;
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
    "nodeDetail",
    "ib440Details",
    "ib440SnmpDetail"
})
@XmlRootElement(name = "Ib440ConfigSet")
public class Ib440ConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    @XmlElement(name = "Ib440Details")
    protected Ib440DetailsSetWs ib440Details;
    @XmlElement(name = "Ib440SnmpDetail")
    protected SnmpDetailSetWs ib440SnmpDetail;

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
     * Gets the value of the ib440Details property.
     * 
     * @return
     *     possible object is
     *     {@link Ib440DetailsSetWs }
     *     
     */
    public Ib440DetailsSetWs getIb440Details() {
        return ib440Details;
    }

    /**
     * Sets the value of the ib440Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ib440DetailsSetWs }
     *     
     */
    public void setIb440Details(Ib440DetailsSetWs value) {
        this.ib440Details = value;
    }

    /**
     * Gets the value of the ib440SnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public SnmpDetailSetWs getIb440SnmpDetail() {
        return ib440SnmpDetail;
    }

    /**
     * Sets the value of the ib440SnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public void setIb440SnmpDetail(SnmpDetailSetWs value) {
        this.ib440SnmpDetail = value;
    }

}
