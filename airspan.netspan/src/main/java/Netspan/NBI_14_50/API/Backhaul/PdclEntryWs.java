
package Netspan.NBI_14_50.API.Backhaul;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdclEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PdclEntryWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ecgi" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PdclEntryWs", propOrder = {
    "earfcn",
    "ecgi"
})
public class PdclEntryWs {

    @XmlElement(name = "Earfcn")
    protected int earfcn;
    @XmlElement(name = "Ecgi", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ecgi;

    /**
     * Gets the value of the earfcn property.
     * 
     */
    public int getEarfcn() {
        return earfcn;
    }

    /**
     * Sets the value of the earfcn property.
     * 
     */
    public void setEarfcn(int value) {
        this.earfcn = value;
    }

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
