
package Netspan.NBI_17_5.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2OverviewMimoStreamStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2OverviewMimoStreamStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StreamId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TxMcs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxWidthMhz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxPhyMbps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RxMcs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RxWidthMhz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RxPhyMbps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RxSnrDb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2OverviewMimoStreamStatusWs", propOrder = {
    "streamId",
    "txMcs",
    "txWidthMhz",
    "txPhyMbps",
    "rxMcs",
    "rxWidthMhz",
    "rxPhyMbps",
    "rxSnrDb"
})
public class IBridge2OverviewMimoStreamStatusWs {

    @XmlElement(name = "StreamId")
    protected int streamId;
    @XmlElement(name = "TxMcs")
    protected String txMcs;
    @XmlElement(name = "TxWidthMhz")
    protected String txWidthMhz;
    @XmlElement(name = "TxPhyMbps")
    protected String txPhyMbps;
    @XmlElement(name = "RxMcs")
    protected String rxMcs;
    @XmlElement(name = "RxWidthMhz")
    protected String rxWidthMhz;
    @XmlElement(name = "RxPhyMbps")
    protected String rxPhyMbps;
    @XmlElement(name = "RxSnrDb")
    protected String rxSnrDb;

    /**
     * Gets the value of the streamId property.
     * 
     */
    public int getStreamId() {
        return streamId;
    }

    /**
     * Sets the value of the streamId property.
     * 
     */
    public void setStreamId(int value) {
        this.streamId = value;
    }

    /**
     * Gets the value of the txMcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxMcs() {
        return txMcs;
    }

    /**
     * Sets the value of the txMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxMcs(String value) {
        this.txMcs = value;
    }

    /**
     * Gets the value of the txWidthMhz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxWidthMhz() {
        return txWidthMhz;
    }

    /**
     * Sets the value of the txWidthMhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxWidthMhz(String value) {
        this.txWidthMhz = value;
    }

    /**
     * Gets the value of the txPhyMbps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxPhyMbps() {
        return txPhyMbps;
    }

    /**
     * Sets the value of the txPhyMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxPhyMbps(String value) {
        this.txPhyMbps = value;
    }

    /**
     * Gets the value of the rxMcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxMcs() {
        return rxMcs;
    }

    /**
     * Sets the value of the rxMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxMcs(String value) {
        this.rxMcs = value;
    }

    /**
     * Gets the value of the rxWidthMhz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxWidthMhz() {
        return rxWidthMhz;
    }

    /**
     * Sets the value of the rxWidthMhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxWidthMhz(String value) {
        this.rxWidthMhz = value;
    }

    /**
     * Gets the value of the rxPhyMbps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxPhyMbps() {
        return rxPhyMbps;
    }

    /**
     * Sets the value of the rxPhyMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxPhyMbps(String value) {
        this.rxPhyMbps = value;
    }

    /**
     * Gets the value of the rxSnrDb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxSnrDb() {
        return rxSnrDb;
    }

    /**
     * Sets the value of the rxSnrDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxSnrDb(String value) {
        this.rxSnrDb = value;
    }

}
