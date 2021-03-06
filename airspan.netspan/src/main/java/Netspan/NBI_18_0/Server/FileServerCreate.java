
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
 *         &lt;element name="FileServer" type="{http://Airspan.Netspan.WebServices}FileServerWs" minOccurs="0"/&gt;
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
    "fileServer"
})
@XmlRootElement(name = "FileServerCreate")
public class FileServerCreate {

    @XmlElement(name = "FileServer")
    protected FileServerWs fileServer;

    /**
     * Gets the value of the fileServer property.
     * 
     * @return
     *     possible object is
     *     {@link FileServerWs }
     *     
     */
    public FileServerWs getFileServer() {
        return fileServer;
    }

    /**
     * Sets the value of the fileServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileServerWs }
     *     
     */
    public void setFileServer(FileServerWs value) {
        this.fileServer = value;
    }

}
