
package Netspan.NBI_15_5.Software;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwImageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="SoftwareImageResult" type="{http://Airspan.Netspan.WebServices}SwImageResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwImageResponse", propOrder = {
    "softwareImageResult"
})
public class SwImageResponse
    extends WsResponse
{

    @XmlElement(name = "SoftwareImageResult")
    protected List<SwImageResult> softwareImageResult;

    /**
     * Gets the value of the softwareImageResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareImageResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareImageResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwImageResult }
     * 
     * 
     */
    public List<SwImageResult> getSoftwareImageResult() {
        if (softwareImageResult == null) {
            softwareImageResult = new ArrayList<SwImageResult>();
        }
        return this.softwareImageResult;
    }

}
