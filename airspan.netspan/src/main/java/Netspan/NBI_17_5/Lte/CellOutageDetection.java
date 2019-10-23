
package Netspan.NBI_17_5.Lte;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Ecgi" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AlarmStatus" type="{http://Airspan.Netspan.WebServices}NetspanAlarmStatus"/&gt;
 *         &lt;element name="AlarmStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nodeId",
    "ecgi",
    "alarmStatus",
    "alarmStatusInfo"
})
@XmlRootElement(name = "CellOutageDetection")
public class CellOutageDetection {

    @XmlElement(name = "NodeName")
    protected List<String> nodeName;
    @XmlElement(name = "NodeId")
    protected List<String> nodeId;
    @XmlElement(name = "Ecgi")
    @XmlSchemaType(name = "unsignedLong")
    protected List<BigInteger> ecgi;
    @XmlElement(name = "AlarmStatus", required = true)
    @XmlSchemaType(name = "string")
    protected NetspanAlarmStatus alarmStatus;
    @XmlElement(name = "AlarmStatusInfo")
    protected String alarmStatusInfo;

    /**
     * Gets the value of the nodeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNodeName() {
        if (nodeName == null) {
            nodeName = new ArrayList<String>();
        }
        return this.nodeName;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNodeId() {
        if (nodeId == null) {
            nodeId = new ArrayList<String>();
        }
        return this.nodeId;
    }

    /**
     * Gets the value of the ecgi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecgi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcgi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getEcgi() {
        if (ecgi == null) {
            ecgi = new ArrayList<BigInteger>();
        }
        return this.ecgi;
    }

    /**
     * Gets the value of the alarmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NetspanAlarmStatus }
     *     
     */
    public NetspanAlarmStatus getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * Sets the value of the alarmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetspanAlarmStatus }
     *     
     */
    public void setAlarmStatus(NetspanAlarmStatus value) {
        this.alarmStatus = value;
    }

    /**
     * Gets the value of the alarmStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmStatusInfo() {
        return alarmStatusInfo;
    }

    /**
     * Sets the value of the alarmStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmStatusInfo(String value) {
        this.alarmStatusInfo = value;
    }

}
