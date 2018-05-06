
package Netspan.NBI_16_0.Server;

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
    "nmsUser"
})
@XmlRootElement(name = "NmsUserCreate")
public class NmsUserCreate {

    @XmlElement(name = "NmsUser")
    protected NmsUserSetWs nmsUser;

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
