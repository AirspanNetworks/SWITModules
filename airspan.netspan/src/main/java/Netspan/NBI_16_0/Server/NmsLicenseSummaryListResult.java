
package Netspan.NBI_16_0.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NmsLicenseSummaryListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsLicenseSummaryListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="License" type="{http://Airspan.Netspan.WebServices}NmsLicenseSummaryWs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LicensedNodes" type="{http://Airspan.Netspan.WebServices}NmsLicensedNodesWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsLicenseSummaryListResult", propOrder = {
    "license",
    "licensedNodes"
})
public class NmsLicenseSummaryListResult
    extends WsResponse
{

    @XmlElement(name = "License")
    protected List<NmsLicenseSummaryWs> license;
    @XmlElement(name = "LicensedNodes")
    protected NmsLicensedNodesWs licensedNodes;

    /**
     * Gets the value of the license property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NmsLicenseSummaryWs }
     * 
     * 
     */
    public List<NmsLicenseSummaryWs> getLicense() {
        if (license == null) {
            license = new ArrayList<NmsLicenseSummaryWs>();
        }
        return this.license;
    }

    /**
     * Gets the value of the licensedNodes property.
     * 
     * @return
     *     possible object is
     *     {@link NmsLicensedNodesWs }
     *     
     */
    public NmsLicensedNodesWs getLicensedNodes() {
        return licensedNodes;
    }

    /**
     * Sets the value of the licensedNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NmsLicensedNodesWs }
     *     
     */
    public void setLicensedNodes(NmsLicensedNodesWs value) {
        this.licensedNodes = value;
    }

}
