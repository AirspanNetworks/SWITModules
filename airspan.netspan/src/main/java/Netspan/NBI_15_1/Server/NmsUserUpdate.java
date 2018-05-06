
package Netspan.NBI_15_1.Server;

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
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NmsUser" type="{http://Airspan.Netspan.WebServices}NmsUserSetWs" minOccurs="0"/>
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
    "userName",
    "nmsUser"
})
@XmlRootElement(name = "NmsUserUpdate")
public class NmsUserUpdate {

    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "NmsUser")
    protected NmsUserSetWs nmsUser;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the nmsUser property.
     * 
     * @return
     *     possible object is
     *     {@link NmsUserSetWs }
     *     
     */
    public NmsUserSetWs getNmsUser() {
        return nmsUser;
    }

    /**
     * Sets the value of the nmsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link NmsUserSetWs }
     *     
     */
    public void setNmsUser(NmsUserSetWs value) {
        this.nmsUser = value;
    }

}
