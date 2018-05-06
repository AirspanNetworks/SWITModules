
package Netspan.NBI_14_50.API.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChannelProfileEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChannelProfileEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelProfileEntry" type="{http://Airspan.Netspan.WebServices}ChannelProfileEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChannelProfileEntry", propOrder = {
    "channelProfileEntry"
})
public class ArrayOfChannelProfileEntry {

    @XmlElement(name = "ChannelProfileEntry", nillable = true)
    protected List<ChannelProfileEntry> channelProfileEntry;

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
     * {@link ChannelProfileEntry }
     * 
     * 
     */
    public List<ChannelProfileEntry> getChannelProfileEntry() {
        if (channelProfileEntry == null) {
            channelProfileEntry = new ArrayList<ChannelProfileEntry>();
        }
        return this.channelProfileEntry;
    }

}
