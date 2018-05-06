
package Netspan.NBI_14_50.API.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteRadioProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRadioProfileGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="RadioProfileResult" type="{http://Airspan.Netspan.WebServices}LteRadioProfileResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRadioProfileGetResult", propOrder = {
    "radioProfileResult"
})
public class LteRadioProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "RadioProfileResult")
    protected List<LteRadioProfileResult> radioProfileResult;

    /**
     * Gets the value of the radioProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radioProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadioProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteRadioProfileResult }
     * 
     * 
     */
    public List<LteRadioProfileResult> getRadioProfileResult() {
        if (radioProfileResult == null) {
            radioProfileResult = new ArrayList<LteRadioProfileResult>();
        }
        return this.radioProfileResult;
    }

}
