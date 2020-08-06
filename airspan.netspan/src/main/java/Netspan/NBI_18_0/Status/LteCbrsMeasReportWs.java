
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCbrsMeasReportWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCbrsMeasReportWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeasFrequencyHz" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="MeasRcvdPowerdBm" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCbrsMeasReportWs", propOrder = {
    "measFrequencyHz",
    "measRcvdPowerdBm"
})
public class LteCbrsMeasReportWs {

    @XmlElement(name = "MeasFrequencyHz")
    protected long measFrequencyHz;
    @XmlElement(name = "MeasRcvdPowerdBm")
    protected long measRcvdPowerdBm;

    /**
     * Gets the value of the measFrequencyHz property.
     * 
     */
    public long getMeasFrequencyHz() {
        return measFrequencyHz;
    }

    /**
     * Sets the value of the measFrequencyHz property.
     * 
     */
    public void setMeasFrequencyHz(long value) {
        this.measFrequencyHz = value;
    }

    /**
     * Gets the value of the measRcvdPowerdBm property.
     * 
     */
    public long getMeasRcvdPowerdBm() {
        return measRcvdPowerdBm;
    }

    /**
     * Sets the value of the measRcvdPowerdBm property.
     * 
     */
    public void setMeasRcvdPowerdBm(long value) {
        this.measRcvdPowerdBm = value;
    }

}
