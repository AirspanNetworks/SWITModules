
package Netspan.NBI_16_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FineAlignShmResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FineAlignShmResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MotorAzimuth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShmStatus" type="{http://Airspan.Netspan.WebServices}CalculationStatusValues"/>
 *         &lt;element name="Shm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FineAlignShmResult", propOrder = {
    "id",
    "motorAzimuth",
    "shmStatus",
    "shm"
})
public class FineAlignShmResult {

    @XmlElement(name = "Id", required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(name = "MotorAzimuth", required = true, type = Integer.class, nillable = true)
    protected Integer motorAzimuth;
    @XmlElement(name = "ShmStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CalculationStatusValues shmStatus;
    @XmlElement(name = "Shm", required = true, type = Integer.class, nillable = true)
    protected Integer shm;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the motorAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotorAzimuth() {
        return motorAzimuth;
    }

    /**
     * Sets the value of the motorAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotorAzimuth(Integer value) {
        this.motorAzimuth = value;
    }

    /**
     * Gets the value of the shmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationStatusValues }
     *     
     */
    public CalculationStatusValues getShmStatus() {
        return shmStatus;
    }

    /**
     * Sets the value of the shmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationStatusValues }
     *     
     */
    public void setShmStatus(CalculationStatusValues value) {
        this.shmStatus = value;
    }

    /**
     * Gets the value of the shm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShm() {
        return shm;
    }

    /**
     * Sets the value of the shm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShm(Integer value) {
        this.shm = value;
    }

}
