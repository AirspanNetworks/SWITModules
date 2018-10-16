
package Netspan.NBI_16_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelProfileListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelProfileListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChannelProfileEntry" type="{http://Airspan.Netspan.WebServices}IbTermChannelProfileEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelProfileListContainer", propOrder = {
    "channelProfileEntry"
})
public class ChannelProfileListContainer {

    @XmlElement(name = "ChannelProfileEntry")
    protected List<IbTermChannelProfileEntry> channelProfileEntry;

    /**
     * Gets the value of the channelProfileEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelProfileEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelProfileEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IbTermChannelProfileEntry }
     * 
     * 
     */
    public List<IbTermChannelProfileEntry> getChannelProfileEntry() {
        if (channelProfileEntry == null) {
            channelProfileEntry = new ArrayList<IbTermChannelProfileEntry>();
        }
        return this.channelProfileEntry;
    }

}
