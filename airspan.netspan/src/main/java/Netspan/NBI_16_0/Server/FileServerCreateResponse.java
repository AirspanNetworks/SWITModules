
package Netspan.NBI_16_0.Server;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileServerCreateResult" type="{http://Airspan.Netspan.WebServices}FileServerResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileServerCreateResult"
})
@XmlRootElement(name = "FileServerCreateResponse")
public class FileServerCreateResponse {

    @XmlElement(name = "FileServerCreateResult")
    protected FileServerResponse fileServerCreateResult;

    /**
     * Gets the value of the fileServerCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link FileServerResponse }
     *     
     */
    public FileServerResponse getFileServerCreateResult() {
        return fileServerCreateResult;
    }

    /**
     * Sets the value of the fileServerCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileServerResponse }
     *     
     */
    public void setFileServerCreateResult(FileServerResponse value) {
        this.fileServerCreateResult = value;
    }

}
