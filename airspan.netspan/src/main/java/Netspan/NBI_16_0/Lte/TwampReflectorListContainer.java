
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TwampReflectorListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TwampReflectorListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TwampReflector" type="{http://Airspan.Netspan.WebServices}LteTwampReflectorEntryWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwampReflectorListContainer", propOrder = {
    "twampReflector"
})
public class TwampReflectorListContainer {

    @XmlElement(name = "TwampReflector")
    protected List<LteTwampReflectorEntryWs> twampReflector;

    /**
     * Gets the value of the twampReflector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twampReflector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTwampReflector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteTwampReflectorEntryWs }
     * 
     * 
     */
    public List<LteTwampReflectorEntryWs> getTwampReflector() {
        if (twampReflector == null) {
            twampReflector = new ArrayList<LteTwampReflectorEntryWs>();
        }
        return this.twampReflector;
    }

}
