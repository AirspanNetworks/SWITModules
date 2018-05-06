
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FiltercoefficientRsrp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FiltercoefficientRsrq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxReportCells" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReportInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReportAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityWs", propOrder = {
    "reportQuantity",
    "filtercoefficientRsrp",
    "filtercoefficientRsrq",
    "maxReportCells",
    "reportInterval",
    "reportAmount"
})
public class MobilityWs {

    @XmlElement(name = "ReportQuantity")
    protected int reportQuantity;
    @XmlElement(name = "FiltercoefficientRsrp")
    protected int filtercoefficientRsrp;
    @XmlElement(name = "FiltercoefficientRsrq")
    protected int filtercoefficientRsrq;
    @XmlElement(name = "MaxReportCells")
    protected int maxReportCells;
    @XmlElement(name = "ReportInterval")
    protected int reportInterval;
    @XmlElement(name = "ReportAmount")
    protected int reportAmount;

    /**
     * Gets the value of the reportQuantity property.
     * 
     */
    public int getReportQuantity() {
        return reportQuantity;
    }

    /**
     * Sets the value of the reportQuantity property.
     * 
     */
    public void setReportQuantity(int value) {
        this.reportQuantity = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrp property.
     * 
     */
    public int getFiltercoefficientRsrp() {
        return filtercoefficientRsrp;
    }

    /**
     * Sets the value of the filtercoefficientRsrp property.
     * 
     */
    public void setFiltercoefficientRsrp(int value) {
        this.filtercoefficientRsrp = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrq property.
     * 
     */
    public int getFiltercoefficientRsrq() {
        return filtercoefficientRsrq;
    }

    /**
     * Sets the value of the filtercoefficientRsrq property.
     * 
     */
    public void setFiltercoefficientRsrq(int value) {
        this.filtercoefficientRsrq = value;
    }

    /**
     * Gets the value of the maxReportCells property.
     * 
     */
    public int getMaxReportCells() {
        return maxReportCells;
    }

    /**
     * Sets the value of the maxReportCells property.
     * 
     */
    public void setMaxReportCells(int value) {
        this.maxReportCells = value;
    }

    /**
     * Gets the value of the reportInterval property.
     * 
     */
    public int getReportInterval() {
        return reportInterval;
    }

    /**
     * Sets the value of the reportInterval property.
     * 
     */
    public void setReportInterval(int value) {
        this.reportInterval = value;
    }

    /**
     * Gets the value of the reportAmount property.
     * 
     */
    public int getReportAmount() {
        return reportAmount;
    }

    /**
     * Sets the value of the reportAmount property.
     * 
     */
    public void setReportAmount(int value) {
        this.reportAmount = value;
    }

}
