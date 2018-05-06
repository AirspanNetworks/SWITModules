
package Netspan.NBI_15_1.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowedBandWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowedBandWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Band" type="{http://Airspan.Netspan.WebServices}BandValuesWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowedBandWs", propOrder = {
    "band"
})
public class AllowedBandWs {

    @XmlElement(name = "Band")
    @XmlSchemaType(name = "string")
    protected List<BandValuesWs> band;

    /**
     * Gets the value of the band property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the band property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BandValuesWs }
     * 
     * 
     */
    public List<BandValuesWs> getBand() {
        if (band == null) {
            band = new ArrayList<BandValuesWs>();
        }
        return this.band;
    }

}
