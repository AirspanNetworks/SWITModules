
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsonMroWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsonMroWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoReportEvaluationTimer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoKpiReportInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsonMroWs", propOrder = {
    "hoReportEvaluationTimer",
    "hoKpiReportInterval"
})
public class EsonMroWs {

    @XmlElement(name = "HoReportEvaluationTimer")
    protected int hoReportEvaluationTimer;
    @XmlElement(name = "HoKpiReportInterval")
    protected int hoKpiReportInterval;

    /**
     * Gets the value of the hoReportEvaluationTimer property.
     * 
     */
    public int getHoReportEvaluationTimer() {
        return hoReportEvaluationTimer;
    }

    /**
     * Sets the value of the hoReportEvaluationTimer property.
     * 
     */
    public void setHoReportEvaluationTimer(int value) {
        this.hoReportEvaluationTimer = value;
    }

    /**
     * Gets the value of the hoKpiReportInterval property.
     * 
     */
    public int getHoKpiReportInterval() {
        return hoKpiReportInterval;
    }

    /**
     * Sets the value of the hoKpiReportInterval property.
     * 
     */
    public void setHoKpiReportInterval(int value) {
        this.hoKpiReportInterval = value;
    }

}
