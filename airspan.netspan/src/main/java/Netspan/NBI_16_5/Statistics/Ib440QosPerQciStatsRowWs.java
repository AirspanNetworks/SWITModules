
package Netspan.NBI_16_5.Statistics;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Ib440QosPerQciStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440QosPerQciStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReadFromBS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="QciName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Packets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Bytes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="Dropped" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440QosPerQciStatsRowWs", propOrder = {
    "node",
    "readFromBS",
    "qciName",
    "packets",
    "bytes",
    "dropped"
})
public class Ib440QosPerQciStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "ReadFromBS", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readFromBS;
    @XmlElement(name = "QciName")
    protected String qciName;
    @XmlElementRef(name = "Packets", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> packets;
    @XmlElementRef(name = "Bytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> bytes;
    @XmlElementRef(name = "Dropped", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dropped;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the readFromBS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReadFromBS() {
        return readFromBS;
    }

    /**
     * Sets the value of the readFromBS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReadFromBS(XMLGregorianCalendar value) {
        this.readFromBS = value;
    }

    /**
     * Gets the value of the qciName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQciName() {
        return qciName;
    }

    /**
     * Sets the value of the qciName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQciName(String value) {
        this.qciName = value;
    }

    /**
     * Gets the value of the packets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPackets() {
        return packets;
    }

    /**
     * Sets the value of the packets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPackets(JAXBElement<Long> value) {
        this.packets = value;
    }

    /**
     * Gets the value of the bytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getBytes() {
        return bytes;
    }

    /**
     * Sets the value of the bytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setBytes(JAXBElement<BigInteger> value) {
        this.bytes = value;
    }

    /**
     * Gets the value of the dropped property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDropped() {
        return dropped;
    }

    /**
     * Sets the value of the dropped property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDropped(JAXBElement<Long> value) {
        this.dropped = value;
    }

}
