
package Netspan.NBI_18_0.Backhaul;

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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlarmProfile" type="{http://Airspan.Netspan.WebServices}IBridge2AlarmProfile" minOccurs="0"/&gt;
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
    "name",
    "alarmProfile"
})
@XmlRootElement(name = "IBridge2AlarmProfileUpdate")
public class IBridge2AlarmProfileUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AlarmProfile")
    protected IBridge2AlarmProfile alarmProfile;

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
     * Gets the value of the alarmProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2AlarmProfile }
     *     
     */
    public IBridge2AlarmProfile getAlarmProfile() {
        return alarmProfile;
    }

    /**
     * Sets the value of the alarmProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2AlarmProfile }
     *     
     */
    public void setAlarmProfile(IBridge2AlarmProfile value) {
        this.alarmProfile = value;
    }

}
