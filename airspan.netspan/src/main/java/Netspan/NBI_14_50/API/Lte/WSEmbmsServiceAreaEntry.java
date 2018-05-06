
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSEmbmsServiceAreaEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSEmbmsServiceAreaEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceAreaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSEmbmsServiceAreaEntry", propOrder = {
    "serviceAreaId"
})
public class WSEmbmsServiceAreaEntry {

    @XmlElement(name = "ServiceAreaId")
    protected int serviceAreaId;

    /**
     * Gets the value of the serviceAreaId property.
     * 
     */
    public int getServiceAreaId() {
        return serviceAreaId;
    }

    /**
     * Sets the value of the serviceAreaId property.
     * 
     */
    public void setServiceAreaId(int value) {
        this.serviceAreaId = value;
    }

}
