
package Netspan.NBI_18_0.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileServerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileServerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileServerResult" type="{http://Airspan.Netspan.WebServices}FileServerResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileServerResponse", propOrder = {
    "fileServerResult"
})
public class FileServerResponse
    extends WsResponse
{

    @XmlElement(name = "FileServerResult")
    protected List<FileServerResult> fileServerResult;

    /**
     * Gets the value of the fileServerResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileServerResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileServerResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileServerResult }
     * 
     * 
     */
    public List<FileServerResult> getFileServerResult() {
        if (fileServerResult == null) {
            fileServerResult = new ArrayList<FileServerResult>();
        }
        return this.fileServerResult;
    }

}
