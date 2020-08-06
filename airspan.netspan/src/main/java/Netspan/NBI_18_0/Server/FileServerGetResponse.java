
package Netspan.NBI_18_0.Server;

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
 *         &lt;element name="FileServerGetResult" type="{http://Airspan.Netspan.WebServices}FileServerResponse" minOccurs="0"/&gt;
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
    "fileServerGetResult"
})
@XmlRootElement(name = "FileServerGetResponse")
public class FileServerGetResponse {

    @XmlElement(name = "FileServerGetResult")
    protected FileServerResponse fileServerGetResult;

    /**
     * Gets the value of the fileServerGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link FileServerResponse }
     *     
     */
    public FileServerResponse getFileServerGetResult() {
        return fileServerGetResult;
    }

    /**
     * Sets the value of the fileServerGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileServerResponse }
     *     
     */
    public void setFileServerGetResult(FileServerResponse value) {
        this.fileServerGetResult = value;
    }

}
