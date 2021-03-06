
package Netspan.NBI_17_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClockContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClockSource" type="{http://Airspan.Netspan.WebServices}ClockSource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClockContainer", propOrder = {
    "clockSource"
})
public class ClockContainer {

    @XmlElement(name = "ClockSource")
    protected List<ClockSource> clockSource;

    /**
     * Gets the value of the clockSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clockSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClockSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClockSource }
     * 
     * 
     */
    public List<ClockSource> getClockSource() {
        if (clockSource == null) {
            clockSource = new ArrayList<ClockSource>();
        }
        return this.clockSource;
    }

}
