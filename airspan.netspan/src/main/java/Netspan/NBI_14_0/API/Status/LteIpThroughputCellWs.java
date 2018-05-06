
package Netspan.NBI_14_0.API.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteIpThroughputCellWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteIpThroughputCellWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QciData" type="{http://Airspan.Netspan.WebServices}LteIpThroughputQciWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteIpThroughputCellWs", propOrder = {
    "cellNumber",
    "qciData"
})
public class LteIpThroughputCellWs {

    @XmlElement(name = "CellNumber", required = true, type = Integer.class, nillable = true)
    protected Integer cellNumber;
    @XmlElement(name = "QciData")
    protected List<LteIpThroughputQciWs> qciData;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellNumber(Integer value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the qciData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qciData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQciData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteIpThroughputQciWs }
     * 
     * 
     */
    public List<LteIpThroughputQciWs> getQciData() {
        if (qciData == null) {
            qciData = new ArrayList<LteIpThroughputQciWs>();
        }
        return this.qciData;
    }

}
