
package Netspan.NBI_16_0.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemResultCode" type="{http://Airspan.Netspan.WebServices}ItemResultValues"/>
 *         &lt;element name="ItemResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNameOrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemResult", propOrder = {
    "itemResultCode",
    "itemResultString",
    "itemNameOrId"
})
public class ItemResult {

    @XmlElement(name = "ItemResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected ItemResultValues itemResultCode;
    @XmlElement(name = "ItemResultString")
    protected String itemResultString;
    @XmlElement(name = "ItemNameOrId")
    protected String itemNameOrId;

    /**
     * Gets the value of the itemResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link ItemResultValues }
     *     
     */
    public ItemResultValues getItemResultCode() {
        return itemResultCode;
    }

    /**
     * Sets the value of the itemResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemResultValues }
     *     
     */
    public void setItemResultCode(ItemResultValues value) {
        this.itemResultCode = value;
    }

    /**
     * Gets the value of the itemResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemResultString() {
        return itemResultString;
    }

    /**
     * Sets the value of the itemResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemResultString(String value) {
        this.itemResultString = value;
    }

    /**
     * Gets the value of the itemNameOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNameOrId() {
        return itemNameOrId;
    }

    /**
     * Sets the value of the itemNameOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNameOrId(String value) {
        this.itemNameOrId = value;
    }

}
