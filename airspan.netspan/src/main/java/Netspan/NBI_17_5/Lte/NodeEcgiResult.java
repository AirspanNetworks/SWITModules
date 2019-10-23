
package Netspan.NBI_17_5.Lte;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeEcgiResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeEcgiResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}NodeSimple"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ecgi" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeEcgiResult", propOrder = {
    "ecgi"
})
public class NodeEcgiResult
    extends NodeSimple
{

    @XmlElement(name = "Ecgi", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ecgi;

    /**
     * Gets the value of the ecgi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEcgi() {
        return ecgi;
    }

    /**
     * Sets the value of the ecgi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEcgi(BigInteger value) {
        this.ecgi = value;
    }

}
