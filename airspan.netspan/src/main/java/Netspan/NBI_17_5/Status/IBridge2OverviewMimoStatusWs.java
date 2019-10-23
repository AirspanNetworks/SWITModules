
package Netspan.NBI_17_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2OverviewMimoStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2OverviewMimoStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MimoChain" type="{http://Airspan.Netspan.WebServices}IBridge2OverviewMimoChainStatusWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MimoStream" type="{http://Airspan.Netspan.WebServices}IBridge2OverviewMimoStreamStatusWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2OverviewMimoStatusWs", propOrder = {
    "mimoChain",
    "mimoStream"
})
public class IBridge2OverviewMimoStatusWs {

    @XmlElement(name = "MimoChain")
    protected List<IBridge2OverviewMimoChainStatusWs> mimoChain;
    @XmlElement(name = "MimoStream")
    protected List<IBridge2OverviewMimoStreamStatusWs> mimoStream;

    /**
     * Gets the value of the mimoChain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mimoChain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMimoChain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridge2OverviewMimoChainStatusWs }
     * 
     * 
     */
    public List<IBridge2OverviewMimoChainStatusWs> getMimoChain() {
        if (mimoChain == null) {
            mimoChain = new ArrayList<IBridge2OverviewMimoChainStatusWs>();
        }
        return this.mimoChain;
    }

    /**
     * Gets the value of the mimoStream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mimoStream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMimoStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridge2OverviewMimoStreamStatusWs }
     * 
     * 
     */
    public List<IBridge2OverviewMimoStreamStatusWs> getMimoStream() {
        if (mimoStream == null) {
            mimoStream = new ArrayList<IBridge2OverviewMimoStreamStatusWs>();
        }
        return this.mimoStream;
    }

}
