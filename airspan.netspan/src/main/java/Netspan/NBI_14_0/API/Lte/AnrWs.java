
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnrWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnrWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NrtSteadyThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnrWs", propOrder = {
    "nrtSteadyThreshold"
})
public class AnrWs {

    @XmlElement(name = "NrtSteadyThreshold")
    protected int nrtSteadyThreshold;

    /**
     * Gets the value of the nrtSteadyThreshold property.
     * 
     */
    public int getNrtSteadyThreshold() {
        return nrtSteadyThreshold;
    }

    /**
     * Sets the value of the nrtSteadyThreshold property.
     * 
     */
    public void setNrtSteadyThreshold(int value) {
        this.nrtSteadyThreshold = value;
    }

}
