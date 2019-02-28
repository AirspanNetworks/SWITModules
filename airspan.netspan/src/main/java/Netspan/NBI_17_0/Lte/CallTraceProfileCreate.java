
package Netspan.NBI_17_0.Lte;

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
 *         &lt;element name="CallTraceProfile" type="{http://Airspan.Netspan.WebServices}CallTraceProfile" minOccurs="0"/&gt;
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
    "callTraceProfile"
})
@XmlRootElement(name = "CallTraceProfileCreate")
public class CallTraceProfileCreate {

    @XmlElement(name = "CallTraceProfile")
    protected CallTraceProfile callTraceProfile;

    /**
     * Gets the value of the callTraceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CallTraceProfile }
     *     
     */
    public CallTraceProfile getCallTraceProfile() {
        return callTraceProfile;
    }

    /**
     * Sets the value of the callTraceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallTraceProfile }
     *     
     */
    public void setCallTraceProfile(CallTraceProfile value) {
        this.callTraceProfile = value;
    }

}
