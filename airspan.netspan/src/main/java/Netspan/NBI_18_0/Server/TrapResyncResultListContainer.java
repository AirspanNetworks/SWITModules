
package Netspan.NBI_18_0.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrapResyncResultListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrapResyncResultListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrapResyncResult" type="{http://Airspan.Netspan.WebServices}TrapResyncResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrapResyncResultListContainer", propOrder = {
    "trapResyncResult"
})
public class TrapResyncResultListContainer {

    @XmlElement(name = "TrapResyncResult")
    protected List<TrapResyncResult> trapResyncResult;

    /**
     * Gets the value of the trapResyncResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trapResyncResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrapResyncResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrapResyncResult }
     * 
     * 
     */
    public List<TrapResyncResult> getTrapResyncResult() {
        if (trapResyncResult == null) {
            trapResyncResult = new ArrayList<TrapResyncResult>();
        }
        return this.trapResyncResult;
    }

}
