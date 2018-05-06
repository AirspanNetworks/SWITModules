
package Netspan.NBI_15_1.Software;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import Netspan.API.Enums.ImageType;

/**
 * <p>Java class for SwFileInfoWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwFileInfoWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageType" type="{http://Airspan.Netspan.WebServices}ImageType" minOccurs="0"/>
 *         &lt;element name="FileNameWithPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwFileInfoWs", propOrder = {
    "imageType",
    "fileNameWithPath",
    "version"
})
public class SwFileInfoWs {

    @XmlElementRef(name = "ImageType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ImageType> imageType;
    @XmlElement(name = "FileNameWithPath")
    protected String fileNameWithPath;
    @XmlElement(name = "Version")
    protected String version;

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageType }{@code >}
     *     
     */
    public JAXBElement<ImageType> getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageType }{@code >}
     *     
     */
    public void setImageType(JAXBElement<ImageType> value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the fileNameWithPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNameWithPath() {
        return fileNameWithPath;
    }

    /**
     * Sets the value of the fileNameWithPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNameWithPath(String value) {
        this.fileNameWithPath = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
