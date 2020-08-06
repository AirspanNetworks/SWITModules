
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLocationLockFingerPrintWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLocationLockFingerPrintWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationLockFingerPrintWs" type="{http://Airspan.Netspan.WebServices}LocationLockFingerPrintWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationLockFingerPrintWs", propOrder = {
    "locationLockFingerPrintWs"
})
public class ArrayOfLocationLockFingerPrintWs {

    @XmlElement(name = "LocationLockFingerPrintWs", nillable = true)
    protected List<LocationLockFingerPrintWs> locationLockFingerPrintWs;

    /**
     * Gets the value of the locationLockFingerPrintWs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationLockFingerPrintWs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationLockFingerPrintWs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationLockFingerPrintWs }
     * 
     * 
     */
    public List<LocationLockFingerPrintWs> getLocationLockFingerPrintWs() {
        if (locationLockFingerPrintWs == null) {
            locationLockFingerPrintWs = new ArrayList<LocationLockFingerPrintWs>();
        }
        return this.locationLockFingerPrintWs;
    }

}
