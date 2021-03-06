
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UplinkLinkAdaptationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UplinkLinkAdaptationWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UplinkEfficiencyModeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UplinkEfficiencyMode" type="{http://Airspan.Netspan.WebServices}EfficiencyType" minOccurs="0"/>
 *         &lt;element name="TargetMcsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TargetMcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CellEfficiencyFactorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CellEfficiencyFactor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UplinkLinkAdaptationWs", propOrder = {
    "uplinkEfficiencyModeIsDefault",
    "uplinkEfficiencyMode",
    "targetMcsIsDefault",
    "targetMcs",
    "cellEfficiencyFactorIsDefault",
    "cellEfficiencyFactor"
})
public class UplinkLinkAdaptationWs {

    @XmlElementRef(name = "UplinkEfficiencyModeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplinkEfficiencyModeIsDefault;
    @XmlElementRef(name = "UplinkEfficiencyMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EfficiencyType> uplinkEfficiencyMode;
    @XmlElementRef(name = "TargetMcsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> targetMcsIsDefault;
    @XmlElementRef(name = "TargetMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetMcs;
    @XmlElementRef(name = "CellEfficiencyFactorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cellEfficiencyFactorIsDefault;
    @XmlElementRef(name = "CellEfficiencyFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellEfficiencyFactor;

    /**
     * Gets the value of the uplinkEfficiencyModeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplinkEfficiencyModeIsDefault() {
        return uplinkEfficiencyModeIsDefault;
    }

    /**
     * Sets the value of the uplinkEfficiencyModeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplinkEfficiencyModeIsDefault(JAXBElement<Boolean> value) {
        this.uplinkEfficiencyModeIsDefault = value;
    }

    /**
     * Gets the value of the uplinkEfficiencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EfficiencyType }{@code >}
     *     
     */
    public JAXBElement<EfficiencyType> getUplinkEfficiencyMode() {
        return uplinkEfficiencyMode;
    }

    /**
     * Sets the value of the uplinkEfficiencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EfficiencyType }{@code >}
     *     
     */
    public void setUplinkEfficiencyMode(JAXBElement<EfficiencyType> value) {
        this.uplinkEfficiencyMode = value;
    }

    /**
     * Gets the value of the targetMcsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTargetMcsIsDefault() {
        return targetMcsIsDefault;
    }

    /**
     * Sets the value of the targetMcsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTargetMcsIsDefault(JAXBElement<Boolean> value) {
        this.targetMcsIsDefault = value;
    }

    /**
     * Gets the value of the targetMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetMcs() {
        return targetMcs;
    }

    /**
     * Sets the value of the targetMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetMcs(JAXBElement<Integer> value) {
        this.targetMcs = value;
    }

    /**
     * Gets the value of the cellEfficiencyFactorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCellEfficiencyFactorIsDefault() {
        return cellEfficiencyFactorIsDefault;
    }

    /**
     * Sets the value of the cellEfficiencyFactorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCellEfficiencyFactorIsDefault(JAXBElement<Boolean> value) {
        this.cellEfficiencyFactorIsDefault = value;
    }

    /**
     * Gets the value of the cellEfficiencyFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellEfficiencyFactor() {
        return cellEfficiencyFactor;
    }

    /**
     * Sets the value of the cellEfficiencyFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellEfficiencyFactor(JAXBElement<Integer> value) {
        this.cellEfficiencyFactor = value;
    }

}
