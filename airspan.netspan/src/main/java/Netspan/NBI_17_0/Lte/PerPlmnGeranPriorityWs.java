
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPlmnGeranPriorityWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerPlmnGeranPriorityWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arfcn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPlmnGeranPriorityWs", propOrder = {
    "arfcn"
})
public class PerPlmnGeranPriorityWs {

    @XmlElement(name = "Arfcn")
    protected int arfcn;

    /**
     * Gets the value of the arfcn property.
     * 
     */
    public int getArfcn() {
        return arfcn;
    }

    /**
     * Sets the value of the arfcn property.
     * 
     */
    public void setArfcn(int value) {
        this.arfcn = value;
    }

}
