
package Netspan.NBI_17_5.Software;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Software.RequestType;


/**
 * <p>Java class for SwConfigSetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwConfigSetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://Airspan.Netspan.WebServices}RequestType" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwConfigSetWs", propOrder = {
    "request",
    "softwareImage"
})
public class SwConfigSetWs {

    @XmlElementRef(name = "Request", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestType> request;
    @XmlElement(name = "SoftwareImage")
    protected String softwareImage;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     *     
     */
    public JAXBElement<RequestType> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     *     
     */
    public void setRequest(JAXBElement<RequestType> value) {
        this.request = value;
    }

    /**
     * Gets the value of the softwareImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareImage() {
        return softwareImage;
    }

    /**
     * Sets the value of the softwareImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareImage(String value) {
        this.softwareImage = value;
    }

}
