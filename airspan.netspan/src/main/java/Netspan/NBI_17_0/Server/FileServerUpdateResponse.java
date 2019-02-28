
package Netspan.NBI_17_0.Server;

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
 *         &lt;element name="FileServerUpdateResult" type="{http://Airspan.Netspan.WebServices}FileServerResponse" minOccurs="0"/&gt;
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
    "fileServerUpdateResult"
})
@XmlRootElement(name = "FileServerUpdateResponse")
public class FileServerUpdateResponse {

    @XmlElement(name = "FileServerUpdateResult")
    protected FileServerResponse fileServerUpdateResult;

    /**
     * Gets the value of the fileServerUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link FileServerResponse }
     *     
     */
    public FileServerResponse getFileServerUpdateResult() {
        return fileServerUpdateResult;
    }

    /**
     * Sets the value of the fileServerUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileServerResponse }
     *     
     */
    public void setFileServerUpdateResult(FileServerResponse value) {
        this.fileServerUpdateResult = value;
    }

}
