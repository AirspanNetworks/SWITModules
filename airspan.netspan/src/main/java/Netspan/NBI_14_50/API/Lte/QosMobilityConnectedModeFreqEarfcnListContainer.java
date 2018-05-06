
package Netspan.NBI_14_50.API.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QosMobilityConnectedModeFreqEarfcnListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QosMobilityConnectedModeFreqEarfcnListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QosMobilityConnectedModeFreqEarfcn" type="{http://Airspan.Netspan.WebServices}QosEarfcn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QosMobilityConnectedModeFreqEarfcnListContainer", propOrder = {
    "qosMobilityConnectedModeFreqEarfcn"
})
public class QosMobilityConnectedModeFreqEarfcnListContainer {

    @XmlElement(name = "QosMobilityConnectedModeFreqEarfcn")
    protected List<QosEarfcn> qosMobilityConnectedModeFreqEarfcn;

    /**
     * Gets the value of the qosMobilityConnectedModeFreqEarfcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qosMobilityConnectedModeFreqEarfcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQosMobilityConnectedModeFreqEarfcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QosEarfcn }
     * 
     * 
     */
    public List<QosEarfcn> getQosMobilityConnectedModeFreqEarfcn() {
        if (qosMobilityConnectedModeFreqEarfcn == null) {
            qosMobilityConnectedModeFreqEarfcn = new ArrayList<QosEarfcn>();
        }
        return this.qosMobilityConnectedModeFreqEarfcn;
    }

}
