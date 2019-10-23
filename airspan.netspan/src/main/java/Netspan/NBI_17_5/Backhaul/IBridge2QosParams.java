
package Netspan.NBI_17_5.Backhaul;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2QosParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2QosParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QosEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BandwidthLimitEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BandwidthLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoQueueLength" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QosPrecedence" type="{http://Airspan.Netspan.WebServices}IBridge2QosPrecedenceOptions" minOccurs="0"/&gt;
 *         &lt;element name="Queue1Mode" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueueMode" minOccurs="0"/&gt;
 *         &lt;element name="Queue1Weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue1Cir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Queue1Mir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Queue1Mbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue1Size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue2Mode" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueueMode" minOccurs="0"/&gt;
 *         &lt;element name="Queue2Weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue2Cir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Queue2Mir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Queue2Mbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue2Size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue3Mode" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueueMode" minOccurs="0"/&gt;
 *         &lt;element name="Queue3Weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue3Cir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Queue3Mir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Queue3Mbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue3Size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue4Mode" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueueMode" minOccurs="0"/&gt;
 *         &lt;element name="Queue4Weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue4Cir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Queue4Mir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Queue4Mbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Queue4Size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cos0Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Cos1Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Cos2Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Cos3Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Cos4Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Cos5Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Cos6Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Cos7Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp0Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp1Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp2Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp3Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp4Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp5Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp6Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp7Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp8Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp9Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp10Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp11Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp12Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp13Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp14Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp15Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp16Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp17Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp18Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp19Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp20Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp21Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp22Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp23Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp24Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp25Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp26Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp27Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp28Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp29Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp30Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp31Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp32Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp33Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp34Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp35Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp36Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp37Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp38Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp39Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp40Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp41Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp42Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp43Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp44Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp45Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp46Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp47Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp48Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp49Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp50Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp51Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp52Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp53Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp54Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp55Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp56Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp57Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp58Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp59Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp60Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp61Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp62Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *         &lt;element name="Dscp63Queue" type="{http://Airspan.Netspan.WebServices}IBridge2QosQueue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2QosParams", propOrder = {
    "qosEnabled",
    "bandwidthLimitEnabled",
    "bandwidthLimit",
    "autoQueueLength",
    "qosPrecedence",
    "queue1Mode",
    "queue1Weight",
    "queue1Cir",
    "queue1Mir",
    "queue1Mbs",
    "queue1Size",
    "queue2Mode",
    "queue2Weight",
    "queue2Cir",
    "queue2Mir",
    "queue2Mbs",
    "queue2Size",
    "queue3Mode",
    "queue3Weight",
    "queue3Cir",
    "queue3Mir",
    "queue3Mbs",
    "queue3Size",
    "queue4Mode",
    "queue4Weight",
    "queue4Cir",
    "queue4Mir",
    "queue4Mbs",
    "queue4Size",
    "cos0Queue",
    "cos1Queue",
    "cos2Queue",
    "cos3Queue",
    "cos4Queue",
    "cos5Queue",
    "cos6Queue",
    "cos7Queue",
    "dscp0Queue",
    "dscp1Queue",
    "dscp2Queue",
    "dscp3Queue",
    "dscp4Queue",
    "dscp5Queue",
    "dscp6Queue",
    "dscp7Queue",
    "dscp8Queue",
    "dscp9Queue",
    "dscp10Queue",
    "dscp11Queue",
    "dscp12Queue",
    "dscp13Queue",
    "dscp14Queue",
    "dscp15Queue",
    "dscp16Queue",
    "dscp17Queue",
    "dscp18Queue",
    "dscp19Queue",
    "dscp20Queue",
    "dscp21Queue",
    "dscp22Queue",
    "dscp23Queue",
    "dscp24Queue",
    "dscp25Queue",
    "dscp26Queue",
    "dscp27Queue",
    "dscp28Queue",
    "dscp29Queue",
    "dscp30Queue",
    "dscp31Queue",
    "dscp32Queue",
    "dscp33Queue",
    "dscp34Queue",
    "dscp35Queue",
    "dscp36Queue",
    "dscp37Queue",
    "dscp38Queue",
    "dscp39Queue",
    "dscp40Queue",
    "dscp41Queue",
    "dscp42Queue",
    "dscp43Queue",
    "dscp44Queue",
    "dscp45Queue",
    "dscp46Queue",
    "dscp47Queue",
    "dscp48Queue",
    "dscp49Queue",
    "dscp50Queue",
    "dscp51Queue",
    "dscp52Queue",
    "dscp53Queue",
    "dscp54Queue",
    "dscp55Queue",
    "dscp56Queue",
    "dscp57Queue",
    "dscp58Queue",
    "dscp59Queue",
    "dscp60Queue",
    "dscp61Queue",
    "dscp62Queue",
    "dscp63Queue"
})
@XmlSeeAlso({
    IBridge2QosProfile.class
})
public class IBridge2QosParams {

    @XmlElementRef(name = "QosEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qosEnabled;
    @XmlElementRef(name = "BandwidthLimitEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bandwidthLimitEnabled;
    @XmlElementRef(name = "BandwidthLimit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bandwidthLimit;
    @XmlElementRef(name = "AutoQueueLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> autoQueueLength;
    @XmlElementRef(name = "QosPrecedence", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosPrecedenceOptions> qosPrecedence;
    @XmlElementRef(name = "Queue1Mode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueueMode> queue1Mode;
    @XmlElementRef(name = "Queue1Weight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue1Weight;
    @XmlElementRef(name = "Queue1Cir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> queue1Cir;
    @XmlElementRef(name = "Queue1Mir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> queue1Mir;
    @XmlElementRef(name = "Queue1Mbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue1Mbs;
    @XmlElementRef(name = "Queue1Size", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue1Size;
    @XmlElementRef(name = "Queue2Mode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueueMode> queue2Mode;
    @XmlElementRef(name = "Queue2Weight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue2Weight;
    @XmlElementRef(name = "Queue2Cir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> queue2Cir;
    @XmlElementRef(name = "Queue2Mir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> queue2Mir;
    @XmlElementRef(name = "Queue2Mbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue2Mbs;
    @XmlElementRef(name = "Queue2Size", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue2Size;
    @XmlElementRef(name = "Queue3Mode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueueMode> queue3Mode;
    @XmlElementRef(name = "Queue3Weight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue3Weight;
    @XmlElementRef(name = "Queue3Cir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> queue3Cir;
    @XmlElementRef(name = "Queue3Mir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> queue3Mir;
    @XmlElementRef(name = "Queue3Mbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue3Mbs;
    @XmlElementRef(name = "Queue3Size", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue3Size;
    @XmlElementRef(name = "Queue4Mode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueueMode> queue4Mode;
    @XmlElementRef(name = "Queue4Weight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue4Weight;
    @XmlElementRef(name = "Queue4Cir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> queue4Cir;
    @XmlElementRef(name = "Queue4Mir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> queue4Mir;
    @XmlElementRef(name = "Queue4Mbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue4Mbs;
    @XmlElementRef(name = "Queue4Size", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> queue4Size;
    @XmlElementRef(name = "Cos0Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> cos0Queue;
    @XmlElementRef(name = "Cos1Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> cos1Queue;
    @XmlElementRef(name = "Cos2Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> cos2Queue;
    @XmlElementRef(name = "Cos3Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> cos3Queue;
    @XmlElementRef(name = "Cos4Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> cos4Queue;
    @XmlElementRef(name = "Cos5Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> cos5Queue;
    @XmlElementRef(name = "Cos6Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> cos6Queue;
    @XmlElementRef(name = "Cos7Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> cos7Queue;
    @XmlElementRef(name = "Dscp0Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp0Queue;
    @XmlElementRef(name = "Dscp1Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp1Queue;
    @XmlElementRef(name = "Dscp2Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp2Queue;
    @XmlElementRef(name = "Dscp3Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp3Queue;
    @XmlElementRef(name = "Dscp4Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp4Queue;
    @XmlElementRef(name = "Dscp5Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp5Queue;
    @XmlElementRef(name = "Dscp6Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp6Queue;
    @XmlElementRef(name = "Dscp7Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp7Queue;
    @XmlElementRef(name = "Dscp8Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp8Queue;
    @XmlElementRef(name = "Dscp9Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp9Queue;
    @XmlElementRef(name = "Dscp10Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp10Queue;
    @XmlElementRef(name = "Dscp11Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp11Queue;
    @XmlElementRef(name = "Dscp12Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp12Queue;
    @XmlElementRef(name = "Dscp13Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp13Queue;
    @XmlElementRef(name = "Dscp14Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp14Queue;
    @XmlElementRef(name = "Dscp15Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp15Queue;
    @XmlElementRef(name = "Dscp16Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp16Queue;
    @XmlElementRef(name = "Dscp17Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp17Queue;
    @XmlElementRef(name = "Dscp18Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp18Queue;
    @XmlElementRef(name = "Dscp19Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp19Queue;
    @XmlElementRef(name = "Dscp20Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp20Queue;
    @XmlElementRef(name = "Dscp21Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp21Queue;
    @XmlElementRef(name = "Dscp22Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp22Queue;
    @XmlElementRef(name = "Dscp23Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp23Queue;
    @XmlElementRef(name = "Dscp24Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp24Queue;
    @XmlElementRef(name = "Dscp25Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp25Queue;
    @XmlElementRef(name = "Dscp26Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp26Queue;
    @XmlElementRef(name = "Dscp27Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp27Queue;
    @XmlElementRef(name = "Dscp28Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp28Queue;
    @XmlElementRef(name = "Dscp29Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp29Queue;
    @XmlElementRef(name = "Dscp30Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp30Queue;
    @XmlElementRef(name = "Dscp31Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp31Queue;
    @XmlElementRef(name = "Dscp32Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp32Queue;
    @XmlElementRef(name = "Dscp33Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp33Queue;
    @XmlElementRef(name = "Dscp34Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp34Queue;
    @XmlElementRef(name = "Dscp35Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp35Queue;
    @XmlElementRef(name = "Dscp36Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp36Queue;
    @XmlElementRef(name = "Dscp37Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp37Queue;
    @XmlElementRef(name = "Dscp38Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp38Queue;
    @XmlElementRef(name = "Dscp39Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp39Queue;
    @XmlElementRef(name = "Dscp40Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp40Queue;
    @XmlElementRef(name = "Dscp41Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp41Queue;
    @XmlElementRef(name = "Dscp42Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp42Queue;
    @XmlElementRef(name = "Dscp43Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp43Queue;
    @XmlElementRef(name = "Dscp44Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp44Queue;
    @XmlElementRef(name = "Dscp45Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp45Queue;
    @XmlElementRef(name = "Dscp46Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp46Queue;
    @XmlElementRef(name = "Dscp47Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp47Queue;
    @XmlElementRef(name = "Dscp48Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp48Queue;
    @XmlElementRef(name = "Dscp49Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp49Queue;
    @XmlElementRef(name = "Dscp50Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp50Queue;
    @XmlElementRef(name = "Dscp51Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp51Queue;
    @XmlElementRef(name = "Dscp52Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp52Queue;
    @XmlElementRef(name = "Dscp53Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp53Queue;
    @XmlElementRef(name = "Dscp54Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp54Queue;
    @XmlElementRef(name = "Dscp55Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp55Queue;
    @XmlElementRef(name = "Dscp56Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp56Queue;
    @XmlElementRef(name = "Dscp57Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp57Queue;
    @XmlElementRef(name = "Dscp58Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp58Queue;
    @XmlElementRef(name = "Dscp59Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp59Queue;
    @XmlElementRef(name = "Dscp60Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp60Queue;
    @XmlElementRef(name = "Dscp61Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp61Queue;
    @XmlElementRef(name = "Dscp62Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp62Queue;
    @XmlElementRef(name = "Dscp63Queue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridge2QosQueue> dscp63Queue;

    /**
     * Gets the value of the qosEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQosEnabled() {
        return qosEnabled;
    }

    /**
     * Sets the value of the qosEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQosEnabled(JAXBElement<Boolean> value) {
        this.qosEnabled = value;
    }

    /**
     * Gets the value of the bandwidthLimitEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBandwidthLimitEnabled() {
        return bandwidthLimitEnabled;
    }

    /**
     * Sets the value of the bandwidthLimitEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBandwidthLimitEnabled(JAXBElement<Boolean> value) {
        this.bandwidthLimitEnabled = value;
    }

    /**
     * Gets the value of the bandwidthLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBandwidthLimit() {
        return bandwidthLimit;
    }

    /**
     * Sets the value of the bandwidthLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBandwidthLimit(JAXBElement<Integer> value) {
        this.bandwidthLimit = value;
    }

    /**
     * Gets the value of the autoQueueLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoQueueLength() {
        return autoQueueLength;
    }

    /**
     * Sets the value of the autoQueueLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoQueueLength(JAXBElement<Boolean> value) {
        this.autoQueueLength = value;
    }

    /**
     * Gets the value of the qosPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosPrecedenceOptions }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosPrecedenceOptions> getQosPrecedence() {
        return qosPrecedence;
    }

    /**
     * Sets the value of the qosPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosPrecedenceOptions }{@code >}
     *     
     */
    public void setQosPrecedence(JAXBElement<IBridge2QosPrecedenceOptions> value) {
        this.qosPrecedence = value;
    }

    /**
     * Gets the value of the queue1Mode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueueMode> getQueue1Mode() {
        return queue1Mode;
    }

    /**
     * Sets the value of the queue1Mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}
     *     
     */
    public void setQueue1Mode(JAXBElement<IBridge2QosQueueMode> value) {
        this.queue1Mode = value;
    }

    /**
     * Gets the value of the queue1Weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue1Weight() {
        return queue1Weight;
    }

    /**
     * Sets the value of the queue1Weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue1Weight(JAXBElement<Integer> value) {
        this.queue1Weight = value;
    }

    /**
     * Gets the value of the queue1Cir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQueue1Cir() {
        return queue1Cir;
    }

    /**
     * Sets the value of the queue1Cir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQueue1Cir(JAXBElement<BigDecimal> value) {
        this.queue1Cir = value;
    }

    /**
     * Gets the value of the queue1Mir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQueue1Mir() {
        return queue1Mir;
    }

    /**
     * Sets the value of the queue1Mir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQueue1Mir(JAXBElement<BigDecimal> value) {
        this.queue1Mir = value;
    }

    /**
     * Gets the value of the queue1Mbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue1Mbs() {
        return queue1Mbs;
    }

    /**
     * Sets the value of the queue1Mbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue1Mbs(JAXBElement<Integer> value) {
        this.queue1Mbs = value;
    }

    /**
     * Gets the value of the queue1Size property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue1Size() {
        return queue1Size;
    }

    /**
     * Sets the value of the queue1Size property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue1Size(JAXBElement<Integer> value) {
        this.queue1Size = value;
    }

    /**
     * Gets the value of the queue2Mode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueueMode> getQueue2Mode() {
        return queue2Mode;
    }

    /**
     * Sets the value of the queue2Mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}
     *     
     */
    public void setQueue2Mode(JAXBElement<IBridge2QosQueueMode> value) {
        this.queue2Mode = value;
    }

    /**
     * Gets the value of the queue2Weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue2Weight() {
        return queue2Weight;
    }

    /**
     * Sets the value of the queue2Weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue2Weight(JAXBElement<Integer> value) {
        this.queue2Weight = value;
    }

    /**
     * Gets the value of the queue2Cir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQueue2Cir() {
        return queue2Cir;
    }

    /**
     * Sets the value of the queue2Cir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQueue2Cir(JAXBElement<BigDecimal> value) {
        this.queue2Cir = value;
    }

    /**
     * Gets the value of the queue2Mir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQueue2Mir() {
        return queue2Mir;
    }

    /**
     * Sets the value of the queue2Mir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQueue2Mir(JAXBElement<BigDecimal> value) {
        this.queue2Mir = value;
    }

    /**
     * Gets the value of the queue2Mbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue2Mbs() {
        return queue2Mbs;
    }

    /**
     * Sets the value of the queue2Mbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue2Mbs(JAXBElement<Integer> value) {
        this.queue2Mbs = value;
    }

    /**
     * Gets the value of the queue2Size property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue2Size() {
        return queue2Size;
    }

    /**
     * Sets the value of the queue2Size property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue2Size(JAXBElement<Integer> value) {
        this.queue2Size = value;
    }

    /**
     * Gets the value of the queue3Mode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueueMode> getQueue3Mode() {
        return queue3Mode;
    }

    /**
     * Sets the value of the queue3Mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}
     *     
     */
    public void setQueue3Mode(JAXBElement<IBridge2QosQueueMode> value) {
        this.queue3Mode = value;
    }

    /**
     * Gets the value of the queue3Weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue3Weight() {
        return queue3Weight;
    }

    /**
     * Sets the value of the queue3Weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue3Weight(JAXBElement<Integer> value) {
        this.queue3Weight = value;
    }

    /**
     * Gets the value of the queue3Cir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQueue3Cir() {
        return queue3Cir;
    }

    /**
     * Sets the value of the queue3Cir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQueue3Cir(JAXBElement<BigDecimal> value) {
        this.queue3Cir = value;
    }

    /**
     * Gets the value of the queue3Mir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQueue3Mir() {
        return queue3Mir;
    }

    /**
     * Sets the value of the queue3Mir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQueue3Mir(JAXBElement<BigDecimal> value) {
        this.queue3Mir = value;
    }

    /**
     * Gets the value of the queue3Mbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue3Mbs() {
        return queue3Mbs;
    }

    /**
     * Sets the value of the queue3Mbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue3Mbs(JAXBElement<Integer> value) {
        this.queue3Mbs = value;
    }

    /**
     * Gets the value of the queue3Size property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue3Size() {
        return queue3Size;
    }

    /**
     * Sets the value of the queue3Size property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue3Size(JAXBElement<Integer> value) {
        this.queue3Size = value;
    }

    /**
     * Gets the value of the queue4Mode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueueMode> getQueue4Mode() {
        return queue4Mode;
    }

    /**
     * Sets the value of the queue4Mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}
     *     
     */
    public void setQueue4Mode(JAXBElement<IBridge2QosQueueMode> value) {
        this.queue4Mode = value;
    }

    /**
     * Gets the value of the queue4Weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue4Weight() {
        return queue4Weight;
    }

    /**
     * Sets the value of the queue4Weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue4Weight(JAXBElement<Integer> value) {
        this.queue4Weight = value;
    }

    /**
     * Gets the value of the queue4Cir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQueue4Cir() {
        return queue4Cir;
    }

    /**
     * Sets the value of the queue4Cir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQueue4Cir(JAXBElement<BigDecimal> value) {
        this.queue4Cir = value;
    }

    /**
     * Gets the value of the queue4Mir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQueue4Mir() {
        return queue4Mir;
    }

    /**
     * Sets the value of the queue4Mir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQueue4Mir(JAXBElement<BigDecimal> value) {
        this.queue4Mir = value;
    }

    /**
     * Gets the value of the queue4Mbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue4Mbs() {
        return queue4Mbs;
    }

    /**
     * Sets the value of the queue4Mbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue4Mbs(JAXBElement<Integer> value) {
        this.queue4Mbs = value;
    }

    /**
     * Gets the value of the queue4Size property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQueue4Size() {
        return queue4Size;
    }

    /**
     * Sets the value of the queue4Size property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQueue4Size(JAXBElement<Integer> value) {
        this.queue4Size = value;
    }

    /**
     * Gets the value of the cos0Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getCos0Queue() {
        return cos0Queue;
    }

    /**
     * Sets the value of the cos0Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setCos0Queue(JAXBElement<IBridge2QosQueue> value) {
        this.cos0Queue = value;
    }

    /**
     * Gets the value of the cos1Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getCos1Queue() {
        return cos1Queue;
    }

    /**
     * Sets the value of the cos1Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setCos1Queue(JAXBElement<IBridge2QosQueue> value) {
        this.cos1Queue = value;
    }

    /**
     * Gets the value of the cos2Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getCos2Queue() {
        return cos2Queue;
    }

    /**
     * Sets the value of the cos2Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setCos2Queue(JAXBElement<IBridge2QosQueue> value) {
        this.cos2Queue = value;
    }

    /**
     * Gets the value of the cos3Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getCos3Queue() {
        return cos3Queue;
    }

    /**
     * Sets the value of the cos3Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setCos3Queue(JAXBElement<IBridge2QosQueue> value) {
        this.cos3Queue = value;
    }

    /**
     * Gets the value of the cos4Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getCos4Queue() {
        return cos4Queue;
    }

    /**
     * Sets the value of the cos4Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setCos4Queue(JAXBElement<IBridge2QosQueue> value) {
        this.cos4Queue = value;
    }

    /**
     * Gets the value of the cos5Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getCos5Queue() {
        return cos5Queue;
    }

    /**
     * Sets the value of the cos5Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setCos5Queue(JAXBElement<IBridge2QosQueue> value) {
        this.cos5Queue = value;
    }

    /**
     * Gets the value of the cos6Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getCos6Queue() {
        return cos6Queue;
    }

    /**
     * Sets the value of the cos6Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setCos6Queue(JAXBElement<IBridge2QosQueue> value) {
        this.cos6Queue = value;
    }

    /**
     * Gets the value of the cos7Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getCos7Queue() {
        return cos7Queue;
    }

    /**
     * Sets the value of the cos7Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setCos7Queue(JAXBElement<IBridge2QosQueue> value) {
        this.cos7Queue = value;
    }

    /**
     * Gets the value of the dscp0Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp0Queue() {
        return dscp0Queue;
    }

    /**
     * Sets the value of the dscp0Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp0Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp0Queue = value;
    }

    /**
     * Gets the value of the dscp1Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp1Queue() {
        return dscp1Queue;
    }

    /**
     * Sets the value of the dscp1Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp1Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp1Queue = value;
    }

    /**
     * Gets the value of the dscp2Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp2Queue() {
        return dscp2Queue;
    }

    /**
     * Sets the value of the dscp2Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp2Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp2Queue = value;
    }

    /**
     * Gets the value of the dscp3Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp3Queue() {
        return dscp3Queue;
    }

    /**
     * Sets the value of the dscp3Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp3Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp3Queue = value;
    }

    /**
     * Gets the value of the dscp4Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp4Queue() {
        return dscp4Queue;
    }

    /**
     * Sets the value of the dscp4Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp4Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp4Queue = value;
    }

    /**
     * Gets the value of the dscp5Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp5Queue() {
        return dscp5Queue;
    }

    /**
     * Sets the value of the dscp5Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp5Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp5Queue = value;
    }

    /**
     * Gets the value of the dscp6Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp6Queue() {
        return dscp6Queue;
    }

    /**
     * Sets the value of the dscp6Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp6Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp6Queue = value;
    }

    /**
     * Gets the value of the dscp7Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp7Queue() {
        return dscp7Queue;
    }

    /**
     * Sets the value of the dscp7Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp7Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp7Queue = value;
    }

    /**
     * Gets the value of the dscp8Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp8Queue() {
        return dscp8Queue;
    }

    /**
     * Sets the value of the dscp8Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp8Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp8Queue = value;
    }

    /**
     * Gets the value of the dscp9Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp9Queue() {
        return dscp9Queue;
    }

    /**
     * Sets the value of the dscp9Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp9Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp9Queue = value;
    }

    /**
     * Gets the value of the dscp10Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp10Queue() {
        return dscp10Queue;
    }

    /**
     * Sets the value of the dscp10Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp10Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp10Queue = value;
    }

    /**
     * Gets the value of the dscp11Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp11Queue() {
        return dscp11Queue;
    }

    /**
     * Sets the value of the dscp11Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp11Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp11Queue = value;
    }

    /**
     * Gets the value of the dscp12Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp12Queue() {
        return dscp12Queue;
    }

    /**
     * Sets the value of the dscp12Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp12Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp12Queue = value;
    }

    /**
     * Gets the value of the dscp13Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp13Queue() {
        return dscp13Queue;
    }

    /**
     * Sets the value of the dscp13Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp13Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp13Queue = value;
    }

    /**
     * Gets the value of the dscp14Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp14Queue() {
        return dscp14Queue;
    }

    /**
     * Sets the value of the dscp14Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp14Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp14Queue = value;
    }

    /**
     * Gets the value of the dscp15Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp15Queue() {
        return dscp15Queue;
    }

    /**
     * Sets the value of the dscp15Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp15Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp15Queue = value;
    }

    /**
     * Gets the value of the dscp16Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp16Queue() {
        return dscp16Queue;
    }

    /**
     * Sets the value of the dscp16Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp16Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp16Queue = value;
    }

    /**
     * Gets the value of the dscp17Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp17Queue() {
        return dscp17Queue;
    }

    /**
     * Sets the value of the dscp17Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp17Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp17Queue = value;
    }

    /**
     * Gets the value of the dscp18Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp18Queue() {
        return dscp18Queue;
    }

    /**
     * Sets the value of the dscp18Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp18Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp18Queue = value;
    }

    /**
     * Gets the value of the dscp19Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp19Queue() {
        return dscp19Queue;
    }

    /**
     * Sets the value of the dscp19Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp19Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp19Queue = value;
    }

    /**
     * Gets the value of the dscp20Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp20Queue() {
        return dscp20Queue;
    }

    /**
     * Sets the value of the dscp20Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp20Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp20Queue = value;
    }

    /**
     * Gets the value of the dscp21Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp21Queue() {
        return dscp21Queue;
    }

    /**
     * Sets the value of the dscp21Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp21Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp21Queue = value;
    }

    /**
     * Gets the value of the dscp22Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp22Queue() {
        return dscp22Queue;
    }

    /**
     * Sets the value of the dscp22Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp22Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp22Queue = value;
    }

    /**
     * Gets the value of the dscp23Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp23Queue() {
        return dscp23Queue;
    }

    /**
     * Sets the value of the dscp23Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp23Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp23Queue = value;
    }

    /**
     * Gets the value of the dscp24Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp24Queue() {
        return dscp24Queue;
    }

    /**
     * Sets the value of the dscp24Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp24Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp24Queue = value;
    }

    /**
     * Gets the value of the dscp25Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp25Queue() {
        return dscp25Queue;
    }

    /**
     * Sets the value of the dscp25Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp25Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp25Queue = value;
    }

    /**
     * Gets the value of the dscp26Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp26Queue() {
        return dscp26Queue;
    }

    /**
     * Sets the value of the dscp26Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp26Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp26Queue = value;
    }

    /**
     * Gets the value of the dscp27Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp27Queue() {
        return dscp27Queue;
    }

    /**
     * Sets the value of the dscp27Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp27Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp27Queue = value;
    }

    /**
     * Gets the value of the dscp28Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp28Queue() {
        return dscp28Queue;
    }

    /**
     * Sets the value of the dscp28Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp28Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp28Queue = value;
    }

    /**
     * Gets the value of the dscp29Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp29Queue() {
        return dscp29Queue;
    }

    /**
     * Sets the value of the dscp29Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp29Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp29Queue = value;
    }

    /**
     * Gets the value of the dscp30Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp30Queue() {
        return dscp30Queue;
    }

    /**
     * Sets the value of the dscp30Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp30Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp30Queue = value;
    }

    /**
     * Gets the value of the dscp31Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp31Queue() {
        return dscp31Queue;
    }

    /**
     * Sets the value of the dscp31Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp31Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp31Queue = value;
    }

    /**
     * Gets the value of the dscp32Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp32Queue() {
        return dscp32Queue;
    }

    /**
     * Sets the value of the dscp32Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp32Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp32Queue = value;
    }

    /**
     * Gets the value of the dscp33Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp33Queue() {
        return dscp33Queue;
    }

    /**
     * Sets the value of the dscp33Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp33Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp33Queue = value;
    }

    /**
     * Gets the value of the dscp34Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp34Queue() {
        return dscp34Queue;
    }

    /**
     * Sets the value of the dscp34Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp34Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp34Queue = value;
    }

    /**
     * Gets the value of the dscp35Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp35Queue() {
        return dscp35Queue;
    }

    /**
     * Sets the value of the dscp35Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp35Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp35Queue = value;
    }

    /**
     * Gets the value of the dscp36Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp36Queue() {
        return dscp36Queue;
    }

    /**
     * Sets the value of the dscp36Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp36Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp36Queue = value;
    }

    /**
     * Gets the value of the dscp37Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp37Queue() {
        return dscp37Queue;
    }

    /**
     * Sets the value of the dscp37Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp37Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp37Queue = value;
    }

    /**
     * Gets the value of the dscp38Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp38Queue() {
        return dscp38Queue;
    }

    /**
     * Sets the value of the dscp38Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp38Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp38Queue = value;
    }

    /**
     * Gets the value of the dscp39Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp39Queue() {
        return dscp39Queue;
    }

    /**
     * Sets the value of the dscp39Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp39Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp39Queue = value;
    }

    /**
     * Gets the value of the dscp40Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp40Queue() {
        return dscp40Queue;
    }

    /**
     * Sets the value of the dscp40Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp40Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp40Queue = value;
    }

    /**
     * Gets the value of the dscp41Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp41Queue() {
        return dscp41Queue;
    }

    /**
     * Sets the value of the dscp41Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp41Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp41Queue = value;
    }

    /**
     * Gets the value of the dscp42Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp42Queue() {
        return dscp42Queue;
    }

    /**
     * Sets the value of the dscp42Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp42Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp42Queue = value;
    }

    /**
     * Gets the value of the dscp43Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp43Queue() {
        return dscp43Queue;
    }

    /**
     * Sets the value of the dscp43Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp43Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp43Queue = value;
    }

    /**
     * Gets the value of the dscp44Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp44Queue() {
        return dscp44Queue;
    }

    /**
     * Sets the value of the dscp44Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp44Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp44Queue = value;
    }

    /**
     * Gets the value of the dscp45Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp45Queue() {
        return dscp45Queue;
    }

    /**
     * Sets the value of the dscp45Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp45Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp45Queue = value;
    }

    /**
     * Gets the value of the dscp46Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp46Queue() {
        return dscp46Queue;
    }

    /**
     * Sets the value of the dscp46Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp46Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp46Queue = value;
    }

    /**
     * Gets the value of the dscp47Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp47Queue() {
        return dscp47Queue;
    }

    /**
     * Sets the value of the dscp47Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp47Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp47Queue = value;
    }

    /**
     * Gets the value of the dscp48Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp48Queue() {
        return dscp48Queue;
    }

    /**
     * Sets the value of the dscp48Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp48Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp48Queue = value;
    }

    /**
     * Gets the value of the dscp49Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp49Queue() {
        return dscp49Queue;
    }

    /**
     * Sets the value of the dscp49Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp49Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp49Queue = value;
    }

    /**
     * Gets the value of the dscp50Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp50Queue() {
        return dscp50Queue;
    }

    /**
     * Sets the value of the dscp50Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp50Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp50Queue = value;
    }

    /**
     * Gets the value of the dscp51Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp51Queue() {
        return dscp51Queue;
    }

    /**
     * Sets the value of the dscp51Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp51Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp51Queue = value;
    }

    /**
     * Gets the value of the dscp52Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp52Queue() {
        return dscp52Queue;
    }

    /**
     * Sets the value of the dscp52Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp52Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp52Queue = value;
    }

    /**
     * Gets the value of the dscp53Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp53Queue() {
        return dscp53Queue;
    }

    /**
     * Sets the value of the dscp53Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp53Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp53Queue = value;
    }

    /**
     * Gets the value of the dscp54Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp54Queue() {
        return dscp54Queue;
    }

    /**
     * Sets the value of the dscp54Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp54Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp54Queue = value;
    }

    /**
     * Gets the value of the dscp55Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp55Queue() {
        return dscp55Queue;
    }

    /**
     * Sets the value of the dscp55Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp55Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp55Queue = value;
    }

    /**
     * Gets the value of the dscp56Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp56Queue() {
        return dscp56Queue;
    }

    /**
     * Sets the value of the dscp56Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp56Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp56Queue = value;
    }

    /**
     * Gets the value of the dscp57Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp57Queue() {
        return dscp57Queue;
    }

    /**
     * Sets the value of the dscp57Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp57Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp57Queue = value;
    }

    /**
     * Gets the value of the dscp58Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp58Queue() {
        return dscp58Queue;
    }

    /**
     * Sets the value of the dscp58Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp58Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp58Queue = value;
    }

    /**
     * Gets the value of the dscp59Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp59Queue() {
        return dscp59Queue;
    }

    /**
     * Sets the value of the dscp59Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp59Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp59Queue = value;
    }

    /**
     * Gets the value of the dscp60Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp60Queue() {
        return dscp60Queue;
    }

    /**
     * Sets the value of the dscp60Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp60Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp60Queue = value;
    }

    /**
     * Gets the value of the dscp61Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp61Queue() {
        return dscp61Queue;
    }

    /**
     * Sets the value of the dscp61Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp61Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp61Queue = value;
    }

    /**
     * Gets the value of the dscp62Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp62Queue() {
        return dscp62Queue;
    }

    /**
     * Sets the value of the dscp62Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp62Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp62Queue = value;
    }

    /**
     * Gets the value of the dscp63Queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public JAXBElement<IBridge2QosQueue> getDscp63Queue() {
        return dscp63Queue;
    }

    /**
     * Sets the value of the dscp63Queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}
     *     
     */
    public void setDscp63Queue(JAXBElement<IBridge2QosQueue> value) {
        this.dscp63Queue = value;
    }

}
