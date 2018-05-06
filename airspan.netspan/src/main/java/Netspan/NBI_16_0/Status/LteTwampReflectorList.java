
package Netspan.NBI_16_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteTwampReflectorList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteTwampReflectorList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TwampReflectorEntry" type="{http://Airspan.Netspan.WebServices}LteTwampReflectorWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteTwampReflectorList", propOrder = {
    "twampReflectorEntry"
})
public class LteTwampReflectorList {

    @XmlElement(name = "TwampReflectorEntry")
    protected List<LteTwampReflectorWs> twampReflectorEntry;

    /**
     * Gets the value of the twampReflectorEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twampReflectorEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTwampReflectorEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteTwampReflectorWs }
     * 
     * 
     */
    public List<LteTwampReflectorWs> getTwampReflectorEntry() {
        if (twampReflectorEntry == null) {
            twampReflectorEntry = new ArrayList<LteTwampReflectorWs>();
        }
        return this.twampReflectorEntry;
    }

}
