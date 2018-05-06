
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronisationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronisationWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WimaxCoexistenceFrameShift" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronisationWs", propOrder = {
    "wimaxCoexistenceFrameShift"
})
public class SynchronisationWs {

    @XmlElement(name = "WimaxCoexistenceFrameShift")
    protected int wimaxCoexistenceFrameShift;

    /**
     * Gets the value of the wimaxCoexistenceFrameShift property.
     * 
     */
    public int getWimaxCoexistenceFrameShift() {
        return wimaxCoexistenceFrameShift;
    }

    /**
     * Sets the value of the wimaxCoexistenceFrameShift property.
     * 
     */
    public void setWimaxCoexistenceFrameShift(int value) {
        this.wimaxCoexistenceFrameShift = value;
    }

}
