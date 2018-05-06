
package Netspan.NBI_14_0.API.Statistics;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Ib440IpStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440IpStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBytes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="InUnicastPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="InMulticastPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="InDiscards" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InErrors" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OutBytes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="OutUnicastPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="OutMulticastPackets" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="OutDiscards" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OutErrors" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440IpStatsRowWs", propOrder = {
    "node",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "name",
    "inBytes",
    "inUnicastPackets",
    "inMulticastPackets",
    "inDiscards",
    "inErrors",
    "outBytes",
    "outUnicastPackets",
    "outMulticastPackets",
    "outDiscards",
    "outErrors"
})
public class Ib440IpStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "InBytes", required = true, nillable = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger inBytes;
    @XmlElement(name = "InUnicastPackets", required = true, nillable = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger inUnicastPackets;
    @XmlElement(name = "InMulticastPackets", required = true, nillable = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger inMulticastPackets;
    @XmlElement(name = "InDiscards", required = true, type = Long.class, nillable = true)
    protected Long inDiscards;
    @XmlElement(name = "InErrors", required = true, type = Long.class, nillable = true)
    protected Long inErrors;
    @XmlElement(name = "OutBytes", required = true, nillable = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger outBytes;
    @XmlElement(name = "OutUnicastPackets", required = true, nillable = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger outUnicastPackets;
    @XmlElement(name = "OutMulticastPackets", required = true, nillable = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger outMulticastPackets;
    @XmlElement(name = "OutDiscards", required = true, type = Long.class, nillable = true)
    protected Long outDiscards;
    @XmlElement(name = "OutErrors", required = true, type = Long.class, nillable = true)
    protected Long outErrors;

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
     * Gets the value of the dateAndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeStart() {
        return dateAndTimeStart;
    }

    /**
     * Sets the value of the dateAndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeStart(XMLGregorianCalendar value) {
        this.dateAndTimeStart = value;
    }

    /**
     * Gets the value of the dateAndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeEnd() {
        return dateAndTimeEnd;
    }

    /**
     * Sets the value of the dateAndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeEnd(XMLGregorianCalendar value) {
        this.dateAndTimeEnd = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the inBytes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInBytes() {
        return inBytes;
    }

    /**
     * Sets the value of the inBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInBytes(BigInteger value) {
        this.inBytes = value;
    }

    /**
     * Gets the value of the inUnicastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInUnicastPackets() {
        return inUnicastPackets;
    }

    /**
     * Sets the value of the inUnicastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInUnicastPackets(BigInteger value) {
        this.inUnicastPackets = value;
    }

    /**
     * Gets the value of the inMulticastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInMulticastPackets() {
        return inMulticastPackets;
    }

    /**
     * Sets the value of the inMulticastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInMulticastPackets(BigInteger value) {
        this.inMulticastPackets = value;
    }

    /**
     * Gets the value of the inDiscards property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInDiscards() {
        return inDiscards;
    }

    /**
     * Sets the value of the inDiscards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInDiscards(Long value) {
        this.inDiscards = value;
    }

    /**
     * Gets the value of the inErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInErrors() {
        return inErrors;
    }

    /**
     * Sets the value of the inErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInErrors(Long value) {
        this.inErrors = value;
    }

    /**
     * Gets the value of the outBytes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutBytes() {
        return outBytes;
    }

    /**
     * Sets the value of the outBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutBytes(BigInteger value) {
        this.outBytes = value;
    }

    /**
     * Gets the value of the outUnicastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutUnicastPackets() {
        return outUnicastPackets;
    }

    /**
     * Sets the value of the outUnicastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutUnicastPackets(BigInteger value) {
        this.outUnicastPackets = value;
    }

    /**
     * Gets the value of the outMulticastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutMulticastPackets() {
        return outMulticastPackets;
    }

    /**
     * Sets the value of the outMulticastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutMulticastPackets(BigInteger value) {
        this.outMulticastPackets = value;
    }

    /**
     * Gets the value of the outDiscards property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutDiscards() {
        return outDiscards;
    }

    /**
     * Sets the value of the outDiscards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutDiscards(Long value) {
        this.outDiscards = value;
    }

    /**
     * Gets the value of the outErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutErrors() {
        return outErrors;
    }

    /**
     * Sets the value of the outErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutErrors(Long value) {
        this.outErrors = value;
    }

}
