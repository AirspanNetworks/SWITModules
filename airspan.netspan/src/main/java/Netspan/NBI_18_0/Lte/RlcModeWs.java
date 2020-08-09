
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="Qci65IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci65" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci65PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci65PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci65RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci65RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci65PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci65PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci66IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci66" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci66PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci66PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci66RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci66RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci66PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci66PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci69IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci69" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci69PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci69PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci69RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci69RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci69PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci69PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci70IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci70" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci70PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci70PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci70RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci70RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci70PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci70PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci75IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci75" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci75PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci75PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci75RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci75RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci75PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci75PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci79IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci79" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/&gt;
 *         &lt;element name="Qci79PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci79PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Qci79RlcSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci79RlcSnLength" type="{http://Airspan.Netspan.WebServices}QciRlcSnLengthBits" minOccurs="0"/&gt;
 *         &lt;element name="Qci79PdcpSnLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Qci79PdcpSnLength" type="{http://Airspan.Netspan.WebServices}QciPdcpSnLengthBits" minOccurs="0"/&gt;
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
    "srb",
    "qci65IsDefault",
    "qci65",
    "qci65PdcpStatusReportEnableIsDefault",
    "qci65PdcpStatusReportEnable",
    "qci65RlcSnLengthIsDefault",
    "qci65RlcSnLength",
    "qci65PdcpSnLengthIsDefault",
    "qci65PdcpSnLength",
    "qci66IsDefault",
    "qci66",
    "qci66PdcpStatusReportEnableIsDefault",
    "qci66PdcpStatusReportEnable",
    "qci66RlcSnLengthIsDefault",
    "qci66RlcSnLength",
    "qci66PdcpSnLengthIsDefault",
    "qci66PdcpSnLength",
    "qci69IsDefault",
    "qci69",
    "qci69PdcpStatusReportEnableIsDefault",
    "qci69PdcpStatusReportEnable",
    "qci69RlcSnLengthIsDefault",
    "qci69RlcSnLength",
    "qci69PdcpSnLengthIsDefault",
    "qci69PdcpSnLength",
    "qci70IsDefault",
    "qci70",
    "qci70PdcpStatusReportEnableIsDefault",
    "qci70PdcpStatusReportEnable",
    "qci70RlcSnLengthIsDefault",
    "qci70RlcSnLength",
    "qci70PdcpSnLengthIsDefault",
    "qci70PdcpSnLength",
    "qci75IsDefault",
    "qci75",
    "qci75PdcpStatusReportEnableIsDefault",
    "qci75PdcpStatusReportEnable",
    "qci75RlcSnLengthIsDefault",
    "qci75RlcSnLength",
    "qci75PdcpSnLengthIsDefault",
    "qci75PdcpSnLength",
    "qci79IsDefault",
    "qci79",
    "qci79PdcpStatusReportEnableIsDefault",
    "qci79PdcpStatusReportEnable",
    "qci79RlcSnLengthIsDefault",
    "qci79RlcSnLength",
    "qci79PdcpSnLengthIsDefault",
    "qci79PdcpSnLength"
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
    @XmlElementRef(name = "Qci65IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci65IsDefault;
    @XmlElementRef(name = "Qci65", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci65;
    @XmlElementRef(name = "Qci65PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci65PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci65PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci65PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci65RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci65RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci65RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci65RlcSnLength;
    @XmlElementRef(name = "Qci65PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci65PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci65PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci65PdcpSnLength;
    @XmlElementRef(name = "Qci66IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci66IsDefault;
    @XmlElementRef(name = "Qci66", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci66;
    @XmlElementRef(name = "Qci66PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci66PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci66PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci66PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci66RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci66RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci66RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci66RlcSnLength;
    @XmlElementRef(name = "Qci66PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci66PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci66PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci66PdcpSnLength;
    @XmlElementRef(name = "Qci69IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci69IsDefault;
    @XmlElementRef(name = "Qci69", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci69;
    @XmlElementRef(name = "Qci69PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci69PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci69PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci69PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci69RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci69RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci69RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci69RlcSnLength;
    @XmlElementRef(name = "Qci69PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci69PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci69PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci69PdcpSnLength;
    @XmlElementRef(name = "Qci70IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci70IsDefault;
    @XmlElementRef(name = "Qci70", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci70;
    @XmlElementRef(name = "Qci70PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci70PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci70PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci70PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci70RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci70RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci70RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci70RlcSnLength;
    @XmlElementRef(name = "Qci70PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci70PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci70PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci70PdcpSnLength;
    @XmlElementRef(name = "Qci75IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci75IsDefault;
    @XmlElementRef(name = "Qci75", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci75;
    @XmlElementRef(name = "Qci75PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci75PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci75PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci75PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci75RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci75RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci75RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci75RlcSnLength;
    @XmlElementRef(name = "Qci75PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci75PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci75PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci75PdcpSnLength;
    @XmlElementRef(name = "Qci79IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci79IsDefault;
    @XmlElementRef(name = "Qci79", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci79;
    @XmlElementRef(name = "Qci79PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci79PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci79PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci79PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci79RlcSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci79RlcSnLengthIsDefault;
    @XmlElementRef(name = "Qci79RlcSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci79RlcSnLength;
    @XmlElementRef(name = "Qci79PdcpSnLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci79PdcpSnLengthIsDefault;
    @XmlElementRef(name = "Qci79PdcpSnLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qci79PdcpSnLength;

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

    /**
     * Gets the value of the qci65IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci65IsDefault() {
        return qci65IsDefault;
    }

    /**
     * Sets the value of the qci65IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci65IsDefault(JAXBElement<Boolean> value) {
        this.qci65IsDefault = value;
    }

    /**
     * Gets the value of the qci65 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci65() {
        return qci65;
    }

    /**
     * Sets the value of the qci65 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci65(JAXBElement<AckMode> value) {
        this.qci65 = value;
    }

    /**
     * Gets the value of the qci65PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci65PdcpStatusReportEnableIsDefault() {
        return qci65PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci65PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci65PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci65PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci65PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci65PdcpStatusReportEnable() {
        return qci65PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci65PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci65PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci65PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci65RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci65RlcSnLengthIsDefault() {
        return qci65RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci65RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci65RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci65RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci65RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci65RlcSnLength() {
        return qci65RlcSnLength;
    }

    /**
     * Sets the value of the qci65RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci65RlcSnLength(JAXBElement<String> value) {
        this.qci65RlcSnLength = value;
    }

    /**
     * Gets the value of the qci65PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci65PdcpSnLengthIsDefault() {
        return qci65PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci65PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci65PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci65PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci65PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci65PdcpSnLength() {
        return qci65PdcpSnLength;
    }

    /**
     * Sets the value of the qci65PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci65PdcpSnLength(JAXBElement<String> value) {
        this.qci65PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci66IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci66IsDefault() {
        return qci66IsDefault;
    }

    /**
     * Sets the value of the qci66IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci66IsDefault(JAXBElement<Boolean> value) {
        this.qci66IsDefault = value;
    }

    /**
     * Gets the value of the qci66 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci66() {
        return qci66;
    }

    /**
     * Sets the value of the qci66 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci66(JAXBElement<AckMode> value) {
        this.qci66 = value;
    }

    /**
     * Gets the value of the qci66PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci66PdcpStatusReportEnableIsDefault() {
        return qci66PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci66PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci66PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci66PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci66PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci66PdcpStatusReportEnable() {
        return qci66PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci66PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci66PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci66PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci66RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci66RlcSnLengthIsDefault() {
        return qci66RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci66RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci66RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci66RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci66RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci66RlcSnLength() {
        return qci66RlcSnLength;
    }

    /**
     * Sets the value of the qci66RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci66RlcSnLength(JAXBElement<String> value) {
        this.qci66RlcSnLength = value;
    }

    /**
     * Gets the value of the qci66PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci66PdcpSnLengthIsDefault() {
        return qci66PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci66PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci66PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci66PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci66PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci66PdcpSnLength() {
        return qci66PdcpSnLength;
    }

    /**
     * Sets the value of the qci66PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci66PdcpSnLength(JAXBElement<String> value) {
        this.qci66PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci69IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci69IsDefault() {
        return qci69IsDefault;
    }

    /**
     * Sets the value of the qci69IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci69IsDefault(JAXBElement<Boolean> value) {
        this.qci69IsDefault = value;
    }

    /**
     * Gets the value of the qci69 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci69() {
        return qci69;
    }

    /**
     * Sets the value of the qci69 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci69(JAXBElement<AckMode> value) {
        this.qci69 = value;
    }

    /**
     * Gets the value of the qci69PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci69PdcpStatusReportEnableIsDefault() {
        return qci69PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci69PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci69PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci69PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci69PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci69PdcpStatusReportEnable() {
        return qci69PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci69PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci69PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci69PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci69RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci69RlcSnLengthIsDefault() {
        return qci69RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci69RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci69RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci69RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci69RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci69RlcSnLength() {
        return qci69RlcSnLength;
    }

    /**
     * Sets the value of the qci69RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci69RlcSnLength(JAXBElement<String> value) {
        this.qci69RlcSnLength = value;
    }

    /**
     * Gets the value of the qci69PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci69PdcpSnLengthIsDefault() {
        return qci69PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci69PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci69PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci69PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci69PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci69PdcpSnLength() {
        return qci69PdcpSnLength;
    }

    /**
     * Sets the value of the qci69PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci69PdcpSnLength(JAXBElement<String> value) {
        this.qci69PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci70IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci70IsDefault() {
        return qci70IsDefault;
    }

    /**
     * Sets the value of the qci70IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci70IsDefault(JAXBElement<Boolean> value) {
        this.qci70IsDefault = value;
    }

    /**
     * Gets the value of the qci70 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci70() {
        return qci70;
    }

    /**
     * Sets the value of the qci70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci70(JAXBElement<AckMode> value) {
        this.qci70 = value;
    }

    /**
     * Gets the value of the qci70PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci70PdcpStatusReportEnableIsDefault() {
        return qci70PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci70PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci70PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci70PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci70PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci70PdcpStatusReportEnable() {
        return qci70PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci70PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci70PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci70PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci70RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci70RlcSnLengthIsDefault() {
        return qci70RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci70RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci70RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci70RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci70RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci70RlcSnLength() {
        return qci70RlcSnLength;
    }

    /**
     * Sets the value of the qci70RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci70RlcSnLength(JAXBElement<String> value) {
        this.qci70RlcSnLength = value;
    }

    /**
     * Gets the value of the qci70PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci70PdcpSnLengthIsDefault() {
        return qci70PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci70PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci70PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci70PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci70PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci70PdcpSnLength() {
        return qci70PdcpSnLength;
    }

    /**
     * Sets the value of the qci70PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci70PdcpSnLength(JAXBElement<String> value) {
        this.qci70PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci75IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci75IsDefault() {
        return qci75IsDefault;
    }

    /**
     * Sets the value of the qci75IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci75IsDefault(JAXBElement<Boolean> value) {
        this.qci75IsDefault = value;
    }

    /**
     * Gets the value of the qci75 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci75() {
        return qci75;
    }

    /**
     * Sets the value of the qci75 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci75(JAXBElement<AckMode> value) {
        this.qci75 = value;
    }

    /**
     * Gets the value of the qci75PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci75PdcpStatusReportEnableIsDefault() {
        return qci75PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci75PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci75PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci75PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci75PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci75PdcpStatusReportEnable() {
        return qci75PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci75PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci75PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci75PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci75RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci75RlcSnLengthIsDefault() {
        return qci75RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci75RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci75RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci75RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci75RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci75RlcSnLength() {
        return qci75RlcSnLength;
    }

    /**
     * Sets the value of the qci75RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci75RlcSnLength(JAXBElement<String> value) {
        this.qci75RlcSnLength = value;
    }

    /**
     * Gets the value of the qci75PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci75PdcpSnLengthIsDefault() {
        return qci75PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci75PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci75PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci75PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci75PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci75PdcpSnLength() {
        return qci75PdcpSnLength;
    }

    /**
     * Sets the value of the qci75PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci75PdcpSnLength(JAXBElement<String> value) {
        this.qci75PdcpSnLength = value;
    }

    /**
     * Gets the value of the qci79IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci79IsDefault() {
        return qci79IsDefault;
    }

    /**
     * Sets the value of the qci79IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci79IsDefault(JAXBElement<Boolean> value) {
        this.qci79IsDefault = value;
    }

    /**
     * Gets the value of the qci79 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci79() {
        return qci79;
    }

    /**
     * Sets the value of the qci79 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci79(JAXBElement<AckMode> value) {
        this.qci79 = value;
    }

    /**
     * Gets the value of the qci79PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci79PdcpStatusReportEnableIsDefault() {
        return qci79PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci79PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci79PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci79PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci79PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci79PdcpStatusReportEnable() {
        return qci79PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci79PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci79PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci79PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci79RlcSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci79RlcSnLengthIsDefault() {
        return qci79RlcSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci79RlcSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci79RlcSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci79RlcSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci79RlcSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci79RlcSnLength() {
        return qci79RlcSnLength;
    }

    /**
     * Sets the value of the qci79RlcSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci79RlcSnLength(JAXBElement<String> value) {
        this.qci79RlcSnLength = value;
    }

    /**
     * Gets the value of the qci79PdcpSnLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci79PdcpSnLengthIsDefault() {
        return qci79PdcpSnLengthIsDefault;
    }

    /**
     * Sets the value of the qci79PdcpSnLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci79PdcpSnLengthIsDefault(JAXBElement<Boolean> value) {
        this.qci79PdcpSnLengthIsDefault = value;
    }

    /**
     * Gets the value of the qci79PdcpSnLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQci79PdcpSnLength() {
        return qci79PdcpSnLength;
    }

    /**
     * Sets the value of the qci79PdcpSnLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQci79PdcpSnLength(JAXBElement<String> value) {
        this.qci79PdcpSnLength = value;
    }

}
