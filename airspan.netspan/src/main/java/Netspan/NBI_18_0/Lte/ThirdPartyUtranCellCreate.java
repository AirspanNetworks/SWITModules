
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UtranCell" type="{http://Airspan.Netspan.WebServices}UtranCell" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "utranCell"
})
@XmlRootElement(name = "ThirdPartyUtranCellCreate")
public class ThirdPartyUtranCellCreate {

    @XmlElement(name = "UtranCell")
    protected UtranCell utranCell;

    /**
     * Gets the value of the utranCell property.
     * 
     * @return
     *     possible object is
     *     {@link UtranCell }
     *     
     */
    public UtranCell getUtranCell() {
        return utranCell;
    }

    /**
     * Sets the value of the utranCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtranCell }
     *     
     */
    public void setUtranCell(UtranCell value) {
        this.utranCell = value;
    }

}
