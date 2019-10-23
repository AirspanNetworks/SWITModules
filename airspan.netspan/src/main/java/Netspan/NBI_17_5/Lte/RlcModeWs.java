
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for RlcModeWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RlcModeWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Qci1IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci1" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci1PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci1PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci1RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci1RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci1PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci1PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci2IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci2" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci2PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci2PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci2RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci2RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci2PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci2PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci3IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci3" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci3PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci3PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci3RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci3RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci3PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci3PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci4IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci4" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci4PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci4PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci4RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci4RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci4PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci4PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci5IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci5" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci5PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci5PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci5RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci5RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci5PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci5PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci6IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci6" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci6PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci6PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci6RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci6RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci6PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci6PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci7IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci7" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci7PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci7PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci7RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci7RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci7PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci7PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci8IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci8" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci8PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci8PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci8RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci8RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci8PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci8PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci9IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci9" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci9PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci9PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci9RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci9RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci9PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci9PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="SrbIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Srb" type="{http://Airspan.Netspan.WebServices}AckModeOnly" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RlcModeWs", propOrder = {
    "qci1IsDefault",
    "qci1",
    "qci1PdcpStatusReportEnableIsDefault",
    "qci1PdcpStatusReportEnable",
    "qci1RlcSnLengthIsDefault",
    "qci1RlcSnLength",
    "qci1PdcpSnLengthIsDefault",
    "qci1PdcpSnLength",
    "qci2IsDefault",
    "qci2",
    "qci2PdcpStatusReportEnableIsDefault",
    "qci2PdcpStatusReportEnable",
    "qci2RlcSnLengthIsDefault",
    "qci2RlcSnLength",
    "qci2PdcpSnLengthIsDefault",
    "qci2PdcpSnLength",
    "qci3IsDefault",
    "qci3",
    "qci3PdcpStatusReportEnableIsDefault",
    "qci3PdcpStatusReportEnable",
    "qci3RlcSnLengthIsDefault",
    "qci3RlcSnLength",
    "qci3PdcpSnLengthIsDefault",
    "qci3PdcpSnLength",
    "qci4IsDefault",
    "qci4",
    "qci4PdcpStatusReportEnableIsDefault",
    "qci4PdcpStatusReportEnable",
    "qci4RlcSnLengthIsDefault",
    "qci4RlcSnLength",
    "qci4PdcpSnLengthIsDefault",
    "qci4PdcpSnLength",
    "qci5IsDefault",
    "qci5",
    "qci5PdcpStatusReportEnableIsDefault",
    "qci5PdcpStatusReportEnable",
    "qci5RlcSnLengthIsDefault",
    "qci5RlcSnLength",
    "qci5PdcpSnLengthIsDefault",
    "qci5PdcpSnLength",
    "qci6IsDefault",
    "qci6",
    "qci6PdcpStatusReportEnableIsDefault",
    "qci6PdcpStatusReportEnable",
    "qci6RlcSnLengthIsDefault",
    "qci6RlcSnLength",
    "qci6PdcpSnLengthIsDefault",
    "qci6PdcpSnLength",
    "qci7IsDefault",
    "qci7",
    "qci7PdcpStatusReportEnableIsDefault",
    "qci7PdcpStatusReportEnable",
    "qci7RlcSnLengthIsDefault",
    "qci7RlcSnLength",
    "qci7PdcpSnLengthIsDefault",
    "qci7PdcpSnLength",
    "qci8IsDefault",
    "qci8",
    "qci8PdcpStatusReportEnableIsDefault",
    "qci8PdcpStatusReportEnable",
    "qci8RlcSnLengthIsDefault",
    "qci8RlcSnLength",
    "qci8PdcpSnLengthIsDefault",
    "qci8PdcpSnLength",
    "qci9IsDefault",
    "qci9",
    "qci9PdcpStatusReportEnableIsDefault",
    "qci9PdcpStatusReportEnable",
    "qci9RlcSnLengthIsDefault",
    "qci9RlcSnLength",
    "qci9PdcpSnLengthIsDefault",
    "qci9PdcpSnLength",
    "srbIsDefault",
    "srb"
})
public class RlcModeWs {

    @XmlElementRef(name = "Qci1IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci1IsDefault;
    @XmlElementRef(name = "Qci1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci1;
    @XmlElementRef(name = "Qci1PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci1PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci1PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci1PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci1RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci1RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci1RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci1RlcSnLength;
    @XmlElementRef(name = "Qci1PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci1PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci1PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci1PdcpSnLength;
    @XmlElementRef(name = "Qci2IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci2IsDefault;
    @XmlElementRef(name = "Qci2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci2;
    @XmlElementRef(name = "Qci2PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci2PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci2PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci2PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci2RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci2RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci2RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci2RlcSnLength;
    @XmlElementRef(name = "Qci2PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci2PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci2PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci2PdcpSnLength;
    @XmlElementRef(name = "Qci3IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci3IsDefault;
    @XmlElementRef(name = "Qci3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci3;
    @XmlElementRef(name = "Qci3PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci3PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci3PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci3PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci3RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci3RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci3RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci3RlcSnLength;
    @XmlElementRef(name = "Qci3PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci3PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci3PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci3PdcpSnLength;
    @XmlElementRef(name = "Qci4IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci4IsDefault;
    @XmlElementRef(name = "Qci4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci4;
    @XmlElementRef(name = "Qci4PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci4PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci4PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci4PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci4RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci4RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci4RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci4RlcSnLength;
    @XmlElementRef(name = "Qci4PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci4PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci4PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci4PdcpSnLength;
    @XmlElementRef(name = "Qci5IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci5IsDefault;
    @XmlElementRef(name = "Qci5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci5;
    @XmlElementRef(name = "Qci5PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci5PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci5PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci5PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci5RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci5RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci5RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci5RlcSnLength;
    @XmlElementRef(name = "Qci5PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci5PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci5PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci5PdcpSnLength;
    @XmlElementRef(name = "Qci6IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci6IsDefault;
    @XmlElementRef(name = "Qci6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci6;
    @XmlElementRef(name = "Qci6PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci6PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci6PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci6PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci6RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci6RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci6RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci6RlcSnLength;
    @XmlElementRef(name = "Qci6PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci6PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci6PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci6PdcpSnLength;
    @XmlElementRef(name = "Qci7IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci7IsDefault;
    @XmlElementRef(name = "Qci7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci7;
    @XmlElementRef(name = "Qci7PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci7PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci7PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci7PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci7RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci7RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci7RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci7RlcSnLength;
    @XmlElementRef(name = "Qci7PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci7PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci7PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci7PdcpSnLength;
    @XmlElementRef(name = "Qci8IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci8IsDefault;
    @XmlElementRef(name = "Qci8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci8;
    @XmlElementRef(name = "Qci8PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci8PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci8PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci8PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci8RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci8RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci8RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci8RlcSnLength;
    @XmlElementRef(name = "Qci8PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci8PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci8PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci8PdcpSnLength;
    @XmlElementRef(name = "Qci9IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci9IsDefault;
    @XmlElementRef(name = "Qci9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci9;
    @XmlElementRef(name = "Qci9PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci9PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci9PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci9PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci9RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci9RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci9RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci9RlcSnLength;
    @XmlElementRef(name = "Qci9PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci9PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci9PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci9PdcpSnLength;
    @XmlElementRef(name = "SrbIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> srbIsDefault;
    @XmlElementRef(name = "Srb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckModeOnly> srb;

    /**
     * Gets the value of the qci1IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci1IsDefault() {
        return qci1IsDefault;
    }

    /**
     * Sets the value of the qci1IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci1IsDefault(JAXBElement<Boolean> value) {
        this.qci1IsDefault = value;
    }

    /**
     * Gets the value of the qci1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci1() {
        return qci1;
    }

    /**
     * Sets the value of the qci1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci1(JAXBElement<AckMode> value) {
        this.qci1 = value;
    }

    /**
     * Gets the value of the qci1PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci1PdcpStatusReportEnableIsDefault() {
        return qci1PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci1PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci1PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci1PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci1PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci1PdcpStatusReportEnable() {
        return qci1PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci1PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci1PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci1PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci1RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci1RlcSnLengthIsDefault() {
        return qci1RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci1RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci1RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci1RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci1RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci1RlcSnLength() {
        return qci1RlcSnLength;
    }

    /**
     * Sets the value of the qci1RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci1RlcSnLength(JAXBElement<String> value) {
        this.qci1RlcSnLength = value;
    }

    /**
     * Gets the value of the qci1PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci1PdcpSnLengthIsDefault() {
        return qci1PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci1PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci1PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci1PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci1PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci1PdcpSnLength() {
        return qci1PdcpSnLength;
    }

    /**
     * Sets the value of the qci1PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci1PdcpSnLength(JAXBElement<String> value) {
        this.qci1PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci2IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci2IsDefault() {
        return qci2IsDefault;
    }

    /**
     * Sets the value of the qci2IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci2IsDefault(JAXBElement<Boolean> value) {
        this.qci2IsDefault = value;
    }

    /**
     * Gets the value of the qci2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci2() {
        return qci2;
    }

    /**
     * Sets the value of the qci2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci2(JAXBElement<AckMode> value) {
        this.qci2 = value;
    }

    /**
     * Gets the value of the qci2PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci2PdcpStatusReportEnableIsDefault() {
        return qci2PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci2PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci2PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci2PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci2PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci2PdcpStatusReportEnable() {
        return qci2PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci2PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci2PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci2PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci2RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci2RlcSnLengthIsDefault() {
        return qci2RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci2RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci2RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci2RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci2RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci2RlcSnLength() {
        return qci2RlcSnLength;
    }

    /**
     * Sets the value of the qci2RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci2RlcSnLength(JAXBElement<String> value) {
        this.qci2RlcSnLength = value;
    }

    /**
     * Gets the value of the qci2PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci2PdcpSnLengthIsDefault() {
        return qci2PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci2PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci2PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci2PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci2PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci2PdcpSnLength() {
        return qci2PdcpSnLength;
    }

    /**
     * Sets the value of the qci2PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci2PdcpSnLength(JAXBElement<String> value) {
        this.qci2PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci3IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci3IsDefault() {
        return qci3IsDefault;
    }

    /**
     * Sets the value of the qci3IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci3IsDefault(JAXBElement<Boolean> value) {
        this.qci3IsDefault = value;
    }

    /**
     * Gets the value of the qci3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci3() {
        return qci3;
    }

    /**
     * Sets the value of the qci3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci3(JAXBElement<AckMode> value) {
        this.qci3 = value;
    }

    /**
     * Gets the value of the qci3PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci3PdcpStatusReportEnableIsDefault() {
        return qci3PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci3PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci3PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci3PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci3PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci3PdcpStatusReportEnable() {
        return qci3PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci3PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci3PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci3PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci3RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci3RlcSnLengthIsDefault() {
        return qci3RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci3RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci3RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci3RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci3RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci3RlcSnLength() {
        return qci3RlcSnLength;
    }

    /**
     * Sets the value of the qci3RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci3RlcSnLength(JAXBElement<String> value) {
        this.qci3RlcSnLength = value;
    }

    /**
     * Gets the value of the qci3PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci3PdcpSnLengthIsDefault() {
        return qci3PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci3PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci3PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci3PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci3PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci3PdcpSnLength() {
        return qci3PdcpSnLength;
    }

    /**
     * Sets the value of the qci3PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci3PdcpSnLength(JAXBElement<String> value) {
        this.qci3PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci4IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci4IsDefault() {
        return qci4IsDefault;
    }

    /**
     * Sets the value of the qci4IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci4IsDefault(JAXBElement<Boolean> value) {
        this.qci4IsDefault = value;
    }

    /**
     * Gets the value of the qci4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci4() {
        return qci4;
    }

    /**
     * Sets the value of the qci4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci4(JAXBElement<AckMode> value) {
        this.qci4 = value;
    }

    /**
     * Gets the value of the qci4PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci4PdcpStatusReportEnableIsDefault() {
        return qci4PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci4PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci4PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci4PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci4PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci4PdcpStatusReportEnable() {
        return qci4PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci4PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci4PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci4PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci4RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci4RlcSnLengthIsDefault() {
        return qci4RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci4RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci4RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci4RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci4RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci4RlcSnLength() {
        return qci4RlcSnLength;
    }

    /**
     * Sets the value of the qci4RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci4RlcSnLength(JAXBElement<String> value) {
        this.qci4RlcSnLength = value;
    }

    /**
     * Gets the value of the qci4PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci4PdcpSnLengthIsDefault() {
        return qci4PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci4PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci4PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci4PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci4PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci4PdcpSnLength() {
        return qci4PdcpSnLength;
    }

    /**
     * Sets the value of the qci4PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci4PdcpSnLength(JAXBElement<String> value) {
        this.qci4PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci5IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci5IsDefault() {
        return qci5IsDefault;
    }

    /**
     * Sets the value of the qci5IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci5IsDefault(JAXBElement<Boolean> value) {
        this.qci5IsDefault = value;
    }

    /**
     * Gets the value of the qci5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci5() {
        return qci5;
    }

    /**
     * Sets the value of the qci5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci5(JAXBElement<AckMode> value) {
        this.qci5 = value;
    }

    /**
     * Gets the value of the qci5PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci5PdcpStatusReportEnableIsDefault() {
        return qci5PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci5PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci5PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci5PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci5PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci5PdcpStatusReportEnable() {
        return qci5PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci5PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci5PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci5PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci5RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci5RlcSnLengthIsDefault() {
        return qci5RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci5RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci5RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci5RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci5RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci5RlcSnLength() {
        return qci5RlcSnLength;
    }

    /**
     * Sets the value of the qci5RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci5RlcSnLength(JAXBElement<String> value) {
        this.qci5RlcSnLength = value;
    }

    /**
     * Gets the value of the qci5PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci5PdcpSnLengthIsDefault() {
        return qci5PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci5PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci5PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci5PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci5PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci5PdcpSnLength() {
        return qci5PdcpSnLength;
    }

    /**
     * Sets the value of the qci5PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci5PdcpSnLength(JAXBElement<String> value) {
        this.qci5PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci6IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci6IsDefault() {
        return qci6IsDefault;
    }

    /**
     * Sets the value of the qci6IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci6IsDefault(JAXBElement<Boolean> value) {
        this.qci6IsDefault = value;
    }

    /**
     * Gets the value of the qci6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci6() {
        return qci6;
    }

    /**
     * Sets the value of the qci6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci6(JAXBElement<AckMode> value) {
        this.qci6 = value;
    }

    /**
     * Gets the value of the qci6PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci6PdcpStatusReportEnableIsDefault() {
        return qci6PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci6PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci6PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci6PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci6PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci6PdcpStatusReportEnable() {
        return qci6PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci6PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci6PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci6PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci6RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci6RlcSnLengthIsDefault() {
        return qci6RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci6RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci6RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci6RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci6RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci6RlcSnLength() {
        return qci6RlcSnLength;
    }

    /**
     * Sets the value of the qci6RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci6RlcSnLength(JAXBElement<String> value) {
        this.qci6RlcSnLength = value;
    }

    /**
     * Gets the value of the qci6PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci6PdcpSnLengthIsDefault() {
        return qci6PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci6PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci6PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci6PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci6PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci6PdcpSnLength() {
        return qci6PdcpSnLength;
    }

    /**
     * Sets the value of the qci6PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci6PdcpSnLength(JAXBElement<String> value) {
        this.qci6PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci7IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci7IsDefault() {
        return qci7IsDefault;
    }

    /**
     * Sets the value of the qci7IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci7IsDefault(JAXBElement<Boolean> value) {
        this.qci7IsDefault = value;
    }

    /**
     * Gets the value of the qci7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci7() {
        return qci7;
    }

    /**
     * Sets the value of the qci7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci7(JAXBElement<AckMode> value) {
        this.qci7 = value;
    }

    /**
     * Gets the value of the qci7PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci7PdcpStatusReportEnableIsDefault() {
        return qci7PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci7PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci7PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci7PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci7PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci7PdcpStatusReportEnable() {
        return qci7PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci7PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci7PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci7PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci7RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci7RlcSnLengthIsDefault() {
        return qci7RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci7RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci7RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci7RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci7RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci7RlcSnLength() {
        return qci7RlcSnLength;
    }

    /**
     * Sets the value of the qci7RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci7RlcSnLength(JAXBElement<String> value) {
        this.qci7RlcSnLength = value;
    }

    /**
     * Gets the value of the qci7PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci7PdcpSnLengthIsDefault() {
        return qci7PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci7PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci7PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci7PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci7PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci7PdcpSnLength() {
        return qci7PdcpSnLength;
    }

    /**
     * Sets the value of the qci7PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci7PdcpSnLength(JAXBElement<String> value) {
        this.qci7PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci8IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci8IsDefault() {
        return qci8IsDefault;
    }

    /**
     * Sets the value of the qci8IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci8IsDefault(JAXBElement<Boolean> value) {
        this.qci8IsDefault = value;
    }

    /**
     * Gets the value of the qci8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci8() {
        return qci8;
    }

    /**
     * Sets the value of the qci8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci8(JAXBElement<AckMode> value) {
        this.qci8 = value;
    }

    /**
     * Gets the value of the qci8PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci8PdcpStatusReportEnableIsDefault() {
        return qci8PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci8PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci8PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci8PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci8PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci8PdcpStatusReportEnable() {
        return qci8PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci8PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci8PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci8PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci8RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci8RlcSnLengthIsDefault() {
        return qci8RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci8RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci8RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci8RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci8RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci8RlcSnLength() {
        return qci8RlcSnLength;
    }

    /**
     * Sets the value of the qci8RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci8RlcSnLength(JAXBElement<String> value) {
        this.qci8RlcSnLength = value;
    }

    /**
     * Gets the value of the qci8PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci8PdcpSnLengthIsDefault() {
        return qci8PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci8PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci8PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci8PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci8PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci8PdcpSnLength() {
        return qci8PdcpSnLength;
    }

    /**
     * Sets the value of the qci8PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci8PdcpSnLength(JAXBElement<String> value) {
        this.qci8PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci9IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci9IsDefault() {
        return qci9IsDefault;
    }

    /**
     * Sets the value of the qci9IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci9IsDefault(JAXBElement<Boolean> value) {
        this.qci9IsDefault = value;
    }

    /**
     * Gets the value of the qci9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci9() {
        return qci9;
    }

    /**
     * Sets the value of the qci9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci9(JAXBElement<AckMode> value) {
        this.qci9 = value;
    }

    /**
     * Gets the value of the qci9PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci9PdcpStatusReportEnableIsDefault() {
        return qci9PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci9PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci9PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci9PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci9PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci9PdcpStatusReportEnable() {
        return qci9PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci9PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci9PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci9PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci9RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci9RlcSnLengthIsDefault() {
        return qci9RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci9RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci9RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci9RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci9RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci9RlcSnLength() {
        return qci9RlcSnLength;
    }

    /**
     * Sets the value of the qci9RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci9RlcSnLength(JAXBElement<String> value) {
        this.qci9RlcSnLength = value;
    }

    /**
     * Gets the value of the qci9PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci9PdcpSnLengthIsDefault() {
        return qci9PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci9PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci9PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci9PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci9PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci9PdcpSnLength() {
        return qci9PdcpSnLength;
    }

    /**
     * Sets the value of the qci9PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci9PdcpSnLength(JAXBElement<String> value) {
        this.qci9PdcpSnLength = value;
    }

    /**
     * Gets the value of the srbIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSrbIsDefault() {
        return srbIsDefault;
    }

    /**
     * Sets the value of the srbIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSrbIsDefault(JAXBElement<Boolean> value) {
        this.srbIsDefault = value;
    }

    /**
     * Gets the value of the srb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckModeOnly }{@code >}
     *     
     */
    public JAXBElement<AckModeOnly> getSrb() {
        return srb;
    }

    /**
     * Sets the value of the srb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckModeOnly }{@code >}
     *     
     */
    public void setSrb(JAXBElement<AckModeOnly> value) {
        this.srb = value;
    }

}
