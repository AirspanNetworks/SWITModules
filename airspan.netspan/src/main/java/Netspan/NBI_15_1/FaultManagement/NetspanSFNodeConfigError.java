
package Netspan.NBI_15_1.FaultManagement;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AlarmStatus" type="{http://Airspan.Netspan.WebServices}NetspanAlarmStatus"/>
 *         &lt;element name="AlarmStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nodeName",
    "alarmStatus",
    "alarmStatusInfo"
})
@XmlRootElement(name = "NetspanSFNodeConfigError")
public class NetspanSFNodeConfigError {

    @XmlElement(name = "NodeName")
    protected List<String> nodeName;
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
