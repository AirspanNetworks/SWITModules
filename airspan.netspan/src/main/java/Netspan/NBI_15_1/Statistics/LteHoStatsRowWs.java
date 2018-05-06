
package Netspan.NBI_15_1.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteHoStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteHoStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutAttDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutSuccDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutPrepAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutAttDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutSuccDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraFreqOutAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraFreqOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterFreqMeasGapOutAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterFreqMeasGapOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterFreqNoMeasGapOutAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterFreqNoMeasGapOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrxOutAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrxOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NonDrxOutAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NonDrxOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutAttReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutSuccReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutAttReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraEnbOutSuccReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutQosAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutQosSuccSentConnReconfig" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutQosAttSuccCSFB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutQosFailTimerExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutQosFailUECapability" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterEnbOutQosFailNoNeighbors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInAttRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInAttRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInAttRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInAttRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInAttRnlSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInAttRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInAttRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInAttRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInAttRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInAttRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInAttRnlSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInAttRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepSuccRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepSuccRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepSuccRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepSuccRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepSuccRnlSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepSuccRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepSuccRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepSuccRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepSuccRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepSuccRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepSuccRnlSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlInvalidMmeGrpId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlHandoverTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlUnknownMmeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlPartialHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlTrelocprepExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlUnknownNewEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlUnknownOldEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailRnlUnknownPairEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailTnlTransResUnAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInPrepFailUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlInvalidMmeGrpId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlHandoverTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlUnknownMmeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlPartialHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlTrelocprepExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlUnknownNewEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlUnknownOldEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailRnlUnknownPairEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailTnlTransResUnAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepFailUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompSuccRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompSuccRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompSuccRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompSuccRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompSuccRnlSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompSuccRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompSuccRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompSuccRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompSuccRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompSuccRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompSuccRnlSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompSuccRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlPartialHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlTrelocprepExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlMultipleErabIdInst" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailTlTransResUnvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailTlTransUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailProtAbsSynErrFlsContructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailProtUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailMiscCtrlProcOvld" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailMiscNoEnoughUPRAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailMisHwErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailMiscOAMInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRelocExecTmrExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailPathSwitchTmrExpr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailunknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlPartialHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlTrelocprepExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlMultipleErabIdInst" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailTlTransResUnvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailTlTransUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailProtAbstSynErrIgnorAndNotift" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailProtAbsSynErrFlsContructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailProtUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailMiscCtrlProcOvld" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailMiscNoEnoughUPRAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailMisHwErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailMiscOAMInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRelocExecTmrExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailPathSwitchTmrExpr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailunknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInPrepSuccRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInAttRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInAttRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInAttRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInAttRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInAttRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInAttRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInAttRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInAttRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInAttRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInAttRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInAttRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInAttRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInAttRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInAttRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInAttRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepSuccRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepSuccRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepSuccRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepSuccRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepSuccRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepSuccRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepSuccRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepSuccRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepSuccRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepSuccRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlFailInRadioInfProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlInvalidCsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlHOCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlFailInTgtSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlUnknownTgtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlUnknownMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlUnknownEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailRnlUnknownPairUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailTlTransResUnavail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailNasUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInPrepFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlFailInRadioInfProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlInvalidCsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlHOCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlFailInTgtSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlUnknownTgtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlUnknownMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlUnknownEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailRnlUnknownPairUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailTlTransResUnavail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailNasUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInPrepFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInCompSuccRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInCompSuccRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInCompSuccRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInCompSuccRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInCompSuccRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInCompSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInCompSuccRnlRadioRsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInCompSuccRnlTimeCrit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInCompSuccRnlResOpt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInCompSuccRnlReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInCompSuccRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInCompSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInCompFailTgtRelocTmrExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqInCompFailHOCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInCompFailTgtRelocTmrExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqInCompFailHOCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqTimeAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntraFreqTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqTimeAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1InterFreqTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqTimeAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqTimeAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlHandoverTgtNotAllowed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlHandoverTgtNotAllowed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoMroOutTooEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoMroOutTooLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoMroOutWrongCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterFrameOutAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterFrameOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoS1InterEnbOutPrepAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoX2InterEnbOutPrepAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoS1InterEnbOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoX2InterEnbOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlFailInRadioInfProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlInvalidCsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlHOCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlFailInTgtSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlUnknownTgtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlUnknownMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlUnknownEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlUnknownPairUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlTX2relocOverallExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlTS1relocOverallExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlTS1relocPrepExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlRadioConnectionWithUELost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlUENotAvlblForPSService" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlRadioResourceNotAvlbl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlFailureInRadioInterface" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlInvalidQOSCombination" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlInteractionWithOtherProcedure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlUnknownERABID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlMultipleERABIDInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlRedirectionTowards1XRTT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlNotSupportedQCIVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailTlTransResUnavail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailTlTransUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailNasUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailNasAuthenticationFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailNasCSGSubscriptionExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailProtUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailMiscCtrlProcessingOverload" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailMiscHwFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailMiscOMIntervention" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailMiscUnknownPLMN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlInvalidMmeGrpId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlHandoverTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlUnknownMmeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlPartialHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlTrelocprepExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlTX2relocOverallExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlUnknownNewEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlUnknownOldEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlUnknownPairEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlValueOutofAllowedRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlMultipleERABIDInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailRnlNotSupportedQCIVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailTnlTransResUnAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailTnlTransSyntaxError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailMiscControlProcessingOverload" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailMiscHwFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailMiscOMIntervention" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailMiscEnoughProcessingResource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlFailInRadioInfProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlInvalidCsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlHOCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlFailInTgtSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlUnknownTgtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlUnknownMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlUnknownEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlUnknownPairUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlTX2relocOverallExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlTS1relocOverallExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlTS1relocPrepExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlRadioConnectionWithUELost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlUENotAvlblForPSService" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlRadioResourceNotAvlbl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlFailureInRadioInterface" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlInvalidQOSCombination" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlInteractionWithOtherProcedure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlUnknownERABID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlMultipleERABIDInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlRedirectionTowards1XRTT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlNotSupportedQCIVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailTlTransResUnavail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailTlTransUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailNasUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailNasAuthenticationFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailNasCSGSubscriptionExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailProtUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailMiscCtrlProcessingOverload" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailMiscHwFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailMiscOMIntervention" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailMiscUnknownPLMN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlInvalidMmeGrpId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlHandoverTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlUnknownMmeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlPartialHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlTrelocprepExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlTX2relocOverallExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlUnknownNewEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlUnknownOldEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlUnknownPairEnbX2apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlValueOutofAllowedRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlMultipleERABIDInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRnlNotSupportedQCIVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailTnlTransResUnAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailMiscControlProcessingOverload" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailMiscHwFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailMiscOMIntervention" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailMiscEnoughProcessingResource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterFrameOutAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterFrameOutSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IntraFreqInterEnbOutPrepAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterFreqInterEnbOutPrepAtt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailRnlPartialHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutPrepFailCritDiag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRnlPartialHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1IntereNBOutExecFailRrcSignalHoFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailTnlTransUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailProtUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutPrepFailCritDiag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailTnlTransUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailProtUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailRrcSignalHoFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntereNBOutExecFailPathSwitchTmrExpr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteHoStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "intraEnbOutAttSum",
    "intraEnbOutAttDesForRadReasons",
    "intraEnbOutAttTimeCritical",
    "intraEnbOutAttResOptimisation",
    "intraEnbOutSuccSum",
    "intraEnbOutSuccDesForRadReasons",
    "intraEnbOutSuccTimeCritical",
    "intraEnbOutSuccResOptimisation",
    "interEnbOutPrepAtt",
    "interEnbOutAttSum",
    "interEnbOutAttDesForRadReasons",
    "interEnbOutAttTimeCritical",
    "interEnbOutAttResOptimisation",
    "interEnbOutSuccSum",
    "interEnbOutSuccDesForRadReasons",
    "interEnbOutSuccTimeCritical",
    "interEnbOutSuccResOptimisation",
    "intraFreqOutAttempts",
    "intraFreqOutSucc",
    "interFreqMeasGapOutAtt",
    "interFreqMeasGapOutSucc",
    "interFreqNoMeasGapOutAtt",
    "interFreqNoMeasGapOutSucc",
    "drxOutAtt",
    "drxOutSucc",
    "nonDrxOutAtt",
    "nonDrxOutSucc",
    "interEnbOutAttReduceLoadInServingCell",
    "interEnbOutSuccReduceLoadInServingCell",
    "intraEnbOutAttReduceLoadInServingCell",
    "intraEnbOutSuccReduceLoadInServingCell",
    "interEnbOutQosAtt",
    "interEnbOutQosSuccSentConnReconfig",
    "interEnbOutQosAttSuccCSFB",
    "interEnbOutQosFailTimerExp",
    "interEnbOutQosFailUECapability",
    "interEnbOutQosFailNoNeighbors",
    "x2IntraFreqInAttRnlRadioRsn",
    "x2IntraFreqInAttRnlTimeCrit",
    "x2IntraFreqInAttRnlResOpt",
    "x2IntraFreqInAttRnlReduceLoadInSvgCell",
    "x2IntraFreqInAttRnlSwitchOffOngoing",
    "x2IntraFreqInAttRnlUnspecified",
    "x2IntraFreqInAttUnknown",
    "x2InterFreqInAttRnlRadioRsn",
    "x2InterFreqInAttRnlTimeCrit",
    "x2InterFreqInAttRnlResOpt",
    "x2InterFreqInAttRnlReduceLoadInSvgCell",
    "x2InterFreqInAttRnlSwitchOffOngoing",
    "x2InterFreqInAttRnlUnspecified",
    "x2InterFreqInAttUnknown",
    "x2IntraFreqInPrepSuccRnlRadioRsn",
    "x2IntraFreqInPrepSuccRnlTimeCrit",
    "x2IntraFreqInPrepSuccRnlResOpt",
    "x2IntraFreqInPrepSuccRnlReduceLoadInSvgCell",
    "x2IntraFreqInPrepSuccRnlSwitchOffOngoing",
    "x2IntraFreqInPrepSuccRnlUnspecified",
    "x2IntraFreqInPrepSuccUnknown",
    "x2InterFreqInPrepSuccRnlRadioRsn",
    "x2InterFreqInPrepSuccRnlTimeCrit",
    "x2InterFreqInPrepSuccRnlResOpt",
    "x2InterFreqInPrepSuccRnlReduceLoadInSvgCell",
    "x2InterFreqInPrepSuccRnlSwitchOffOngoing",
    "x2InterFreqInPrepSuccUnknown",
    "x2IntraFreqInPrepFailRnlCellNotAvail",
    "x2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup",
    "x2IntraFreqInPrepFailRnlInvalidMmeGrpId",
    "x2IntraFreqInPrepFailRnlHandoverTgtNotAllow",
    "x2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell",
    "x2IntraFreqInPrepFailRnlUnknownMmeCode",
    "x2IntraFreqInPrepFailRnlUnspecified",
    "x2IntraFreqInPrepFailRnlPartialHO",
    "x2IntraFreqInPrepFailRnlTrelocprepExpiry",
    "x2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId",
    "x2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId",
    "x2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId",
    "x2IntraFreqInPrepFailTnlTransResUnAvail",
    "x2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg",
    "x2IntraFreqInPrepFailProtAbstSynErrRej",
    "x2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat",
    "x2IntraFreqInPrepFailProtSemanticErr",
    "x2IntraFreqInPrepFailProtTransferSynErr",
    "x2IntraFreqInPrepFailMiscUnspecified",
    "x2IntraFreqInPrepFailUnknown",
    "x2InterFreqInPrepFailRnlCellNotAvail",
    "x2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup",
    "x2InterFreqInPrepFailRnlInvalidMmeGrpId",
    "x2InterFreqInPrepFailRnlHandoverTgtNotAllow",
    "x2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell",
    "x2InterFreqInPrepFailRnlUnknownMmeCode",
    "x2InterFreqInPrepFailRnlUnspecified",
    "x2InterFreqInPrepFailRnlPartialHO",
    "x2InterFreqInPrepFailRnlTrelocprepExpiry",
    "x2InterFreqInPrepFailRnlUnknownNewEnbX2ApId",
    "x2InterFreqInPrepFailRnlUnknownOldEnbX2ApId",
    "x2InterFreqInPrepFailRnlUnknownPairEnbX2ApId",
    "x2InterFreqInPrepFailTnlTransResUnAvail",
    "x2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg",
    "x2InterFreqInPrepFailProtAbstSynErrRej",
    "x2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat",
    "x2InterFreqInPrepFailProtSemanticErr",
    "x2InterFreqInPrepFailProtTransferSynErr",
    "x2InterFreqInPrepFailMiscUnspecified",
    "x2InterFreqInPrepFailUnknown",
    "x2IntraFreqInCompSuccRnlRadioRsn",
    "x2IntraFreqInCompSuccRnlTimeCrit",
    "x2IntraFreqInCompSuccRnlResOpt",
    "x2IntraFreqInCompSuccRnlReduceLoadInSvgCell",
    "x2IntraFreqInCompSuccRnlSwitchOffOngoing",
    "x2IntraFreqInCompSuccRnlUnspecified",
    "x2IntraFreqInCompSuccUnknown",
    "x2InterFreqInCompSuccRnlRadioRsn",
    "x2InterFreqInCompSuccRnlTimeCrit",
    "x2InterFreqInCompSuccRnlResOpt",
    "x2InterFreqInCompSuccRnlReduceLoadInSvgCell",
    "x2InterFreqInCompSuccRnlSwitchOffOngoing",
    "x2InterFreqInCompSuccRnlUnspecified",
    "x2InterFreqInCompSuccUnknown",
    "x2IntraFreqInCompFailRnlPartialHO",
    "x2IntraFreqInCompFailRnlTrelocprepExpiry",
    "x2IntraFreqInCompFailRnlMultipleErabIdInst",
    "x2IntraFreqInCompFailTlTransResUnvail",
    "x2IntraFreqInCompFailTlTransUnspecified",
    "x2IntraFreqInCompFailProtTransferSynErr",
    "x2IntraFreqInCompFailProtAbstSynErrRej",
    "x2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift",
    "x2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat",
    "x2IntraFreqInCompFailProtSemanticErr",
    "x2IntraFreqInCompFailProtAbsSynErrFlsContructMsg",
    "x2IntraFreqInCompFailProtUnspecified",
    "x2IntraFreqInCompFailMiscCtrlProcOvld",
    "x2IntraFreqInCompFailMiscNoEnoughUPRAvail",
    "x2IntraFreqInCompFailMisHwErr",
    "x2IntraFreqInCompFailMiscOAMInt",
    "x2IntraFreqInCompFailMiscUnspecified",
    "x2IntraFreqInCompFailRelocExecTmrExp",
    "x2IntraFreqInCompFailPathSwitchTmrExpr",
    "x2IntraFreqInCompFailunknown",
    "x2InterFreqInCompFailRnlPartialHO",
    "x2InterFreqInCompFailRnlTrelocprepExpiry",
    "x2InterFreqInCompFailRnlMultipleErabIdInst",
    "x2InterFreqInCompFailTlTransResUnvail",
    "x2InterFreqInCompFailTlTransUnspecified",
    "x2InterFreqInCompFailProtTransferSynErr",
    "x2InterFreqInCompFailProtAbstSynErrRej",
    "x2InterFreqInCompFailProtAbstSynErrIgnorAndNotift",
    "x2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat",
    "x2InterFreqInCompFailProtSemanticErr",
    "x2InterFreqInCompFailProtAbsSynErrFlsContructMsg",
    "x2InterFreqInCompFailProtUnspecified",
    "x2InterFreqInCompFailMiscCtrlProcOvld",
    "x2InterFreqInCompFailMiscNoEnoughUPRAvail",
    "x2InterFreqInCompFailMisHwErr",
    "x2InterFreqInCompFailMiscOAMInt",
    "x2InterFreqInCompFailMiscUnspecified",
    "x2InterFreqInCompFailRelocExecTmrExp",
    "x2InterFreqInCompFailPathSwitchTmrExpr",
    "x2InterFreqInCompFailunknown",
    "x2InterFreqInPrepSuccRnlUnspecified",
    "s1IntraFreqInAttRnlRadioRsn",
    "s1IntraFreqInAttRnlTimeCrit",
    "s1IntraFreqInAttRnlResOpt",
    "s1IntraFreqInAttRnlReduceLoadInSvgCell",
    "s1IntraFreqInAttRnlUnspecified",
    "s1IntraFreqInAttUnknown",
    "s1InterFreqInAttRnlRadioRsn",
    "s1InterFreqInAttRnlTimeCrit",
    "s1InterFreqInAttRnlResOpt",
    "s1InterFreqInAttRnlReduceLoadInSvgCell",
    "s1InterFreqInAttRnlUnspecified",
    "s1InterFreqInAttUnknown",
    "s1UnknFreqInAttRnlRadioRsn",
    "s1UnknFreqInAttRnlTimeCrit",
    "s1UnknFreqInAttRnlResOpt",
    "s1UnknFreqInAttRnlReduceLoadInSvgCell",
    "s1UnknFreqInAttRnlUnspecified",
    "s1UnknFreqInAttUnknown",
    "s1IntraFreqInPrepSuccRnlRadioRsn",
    "s1IntraFreqInPrepSuccRnlTimeCrit",
    "s1IntraFreqInPrepSuccRnlResOpt",
    "s1IntraFreqInPrepSuccRnlReduceLoadInSvgCell",
    "s1IntraFreqInPrepSuccRnlUnspecified",
    "s1IntraFreqInPrepSuccUnknown",
    "s1InterFreqInPrepSuccRnlRadioRsn",
    "s1InterFreqInPrepSuccRnlTimeCrit",
    "s1InterFreqInPrepSuccRnlResOpt",
    "s1InterFreqInPrepSuccRnlReduceLoadInSvgCell",
    "s1InterFreqInPrepSuccRnlUnspecified",
    "s1InterFreqInPrepSuccUnknown",
    "s1IntraFreqInPrepFailRnlCellNotAvail",
    "s1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup",
    "s1IntraFreqInPrepFailRnlFailInRadioInfProc",
    "s1IntraFreqInPrepFailRnlTgtNotAllow",
    "s1IntraFreqInPrepFailRnlInvalidCsgId",
    "s1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell",
    "s1IntraFreqInPrepFailRnlUnspecified",
    "s1IntraFreqInPrepFailRnlHOCancelled",
    "s1IntraFreqInPrepFailRnlFailInTgtSys",
    "s1IntraFreqInPrepFailRnlUnknownTgtId",
    "s1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId",
    "s1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId",
    "s1IntraFreqInPrepFailRnlUnknownPairUeS1ApId",
    "s1IntraFreqInPrepFailTlTransResUnavail",
    "s1IntraFreqInPrepFailNasUnspecified",
    "s1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg",
    "s1IntraFreqInPrepFailProtAbstSynErrRej",
    "s1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat",
    "s1IntraFreqInPrepFailProtSemanticErr",
    "s1IntraFreqInPrepFailProtTransferSynErr",
    "s1IntraFreqInPrepFailMiscUnspecified",
    "s1InterFreqInPrepFailRnlCellNotAvail",
    "s1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup",
    "s1InterFreqInPrepFailRnlFailInRadioInfProc",
    "s1InterFreqInPrepFailRnlTgtNotAllow",
    "s1InterFreqInPrepFailRnlInvalidCsgId",
    "s1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell",
    "s1InterFreqInPrepFailRnlUnspecified",
    "s1InterFreqInPrepFailRnlHOCancelled",
    "s1InterFreqInPrepFailRnlFailInTgtSys",
    "s1InterFreqInPrepFailRnlUnknownTgtId",
    "s1InterFreqInPrepFailRnlUnknownMmeUeS1ApId",
    "s1InterFreqInPrepFailRnlUnknownEnbUeS1ApId",
    "s1InterFreqInPrepFailRnlUnknownPairUeS1ApId",
    "s1InterFreqInPrepFailTlTransResUnavail",
    "s1InterFreqInPrepFailNasUnspecified",
    "s1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg",
    "s1InterFreqInPrepFailProtAbstSynErrRej",
    "s1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat",
    "s1InterFreqInPrepFailProtSemanticErr",
    "s1InterFreqInPrepFailProtTransferSynErr",
    "s1InterFreqInPrepFailMiscUnspecified",
    "s1IntraFreqInCompSuccRnlRadioRsn",
    "s1IntraFreqInCompSuccRnlTimeCrit",
    "s1IntraFreqInCompSuccRnlResOpt",
    "s1IntraFreqInCompSuccRnlReduceLoadInSvgCell",
    "s1IntraFreqInCompSuccRnlUnspecified",
    "s1IntraFreqInCompSuccUnknown",
    "s1InterFreqInCompSuccRnlRadioRsn",
    "s1InterFreqInCompSuccRnlTimeCrit",
    "s1InterFreqInCompSuccRnlResOpt",
    "s1InterFreqInCompSuccRnlReduceLoadInSvgCell",
    "s1InterFreqInCompSuccRnlUnspecified",
    "s1InterFreqInCompSuccUnknown",
    "s1IntraFreqInCompFailTgtRelocTmrExp",
    "s1IntraFreqInCompFailHOCancelled",
    "s1InterFreqInCompFailTgtRelocTmrExp",
    "s1InterFreqInCompFailHOCancelled",
    "s1IntraFreqTimeAvg",
    "s1IntraFreqTimeMax",
    "s1InterFreqTimeAvg",
    "s1InterFreqTimeMax",
    "x2IntraFreqTimeAvg",
    "x2IntraFreqTimeMax",
    "x2InterFreqTimeAvg",
    "x2InterFreqTimeMax",
    "x2IntraFreqInCompFailRnlHandoverTgtNotAllowed",
    "x2InterFreqInCompFailRnlHandoverTgtNotAllowed",
    "hoMroOutTooEarly",
    "hoMroOutTooLate",
    "hoMroOutWrongCell",
    "hoInterFrameOutAtt",
    "hoInterFrameOutSucc",
    "hoS1InterEnbOutPrepAtt",
    "hoX2InterEnbOutPrepAtt",
    "hoS1InterEnbOutSucc",
    "hoX2InterEnbOutSucc",
    "s1IntereNBOutPrepFailRnlCellNotAvail",
    "s1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup",
    "s1IntereNBOutPrepFailRnlFailInRadioInfProc",
    "s1IntereNBOutPrepFailRnlTgtNotAllow",
    "s1IntereNBOutPrepFailRnlInvalidCsgId",
    "s1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell",
    "s1IntereNBOutPrepFailRnlUnspecified",
    "s1IntereNBOutPrepFailRnlHOCancelled",
    "s1IntereNBOutPrepFailRnlFailInTgtSys",
    "s1IntereNBOutPrepFailRnlUnknownTgtId",
    "s1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId",
    "s1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId",
    "s1IntereNBOutPrepFailRnlUnknownPairUeS1ApId",
    "s1IntereNBOutPrepFailRnlTX2RelocOverallExpiry",
    "s1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason",
    "s1IntereNBOutPrepFailRnlTS1RelocOverallExpiry",
    "s1IntereNBOutPrepFailRnlTS1RelocPrepExpiry",
    "s1IntereNBOutPrepFailRnlRadioConnectionWithUELost",
    "s1IntereNBOutPrepFailRnlUENotAvlblForPSService",
    "s1IntereNBOutPrepFailRnlRadioResourceNotAvlbl",
    "s1IntereNBOutPrepFailRnlFailureInRadioInterface",
    "s1IntereNBOutPrepFailRnlInvalidQOSCombination",
    "s1IntereNBOutPrepFailRnlInteractionWithOtherProcedure",
    "s1IntereNBOutPrepFailRnlUnknownERABID",
    "s1IntereNBOutPrepFailRnlMultipleERABIDInstances",
    "s1IntereNBOutPrepFailRnlRedirectionTowards1XRTT",
    "s1IntereNBOutPrepFailRnlNotSupportedQCIVal",
    "s1IntereNBOutPrepFailTlTransResUnavail",
    "s1IntereNBOutPrepFailTlTransUnspecified",
    "s1IntereNBOutPrepFailNasUnspecified",
    "s1IntereNBOutPrepFailNasAuthenticationFailure",
    "s1IntereNBOutPrepFailNasCSGSubscriptionExpiry",
    "s1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg",
    "s1IntereNBOutPrepFailProtAbstSynErrRej",
    "s1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat",
    "s1IntereNBOutPrepFailProtSemanticErr",
    "s1IntereNBOutPrepFailProtUnspecified",
    "s1IntereNBOutPrepFailProtTransferSynErr",
    "s1IntereNBOutPrepFailMiscUnspecified",
    "s1IntereNBOutPrepFailMiscCtrlProcessingOverload",
    "s1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc",
    "s1IntereNBOutPrepFailMiscHwFailure",
    "s1IntereNBOutPrepFailMiscOMIntervention",
    "s1IntereNBOutPrepFailMiscUnknownPLMN",
    "x2IntereNBOutPrepFailRnlCellNotAvail",
    "x2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup",
    "x2IntereNBOutPrepFailRnlInvalidMmeGrpId",
    "x2IntereNBOutPrepFailRnlHandoverTgtNotAllow",
    "x2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell",
    "x2IntereNBOutPrepFailRnlUnknownMmeCode",
    "x2IntereNBOutPrepFailRnlUnspecified",
    "x2IntereNBOutPrepFailRnlPartialHO",
    "x2IntereNBOutPrepFailRnlTrelocprepExpiry",
    "x2IntereNBOutPrepFailRnlTX2RelocOverallExpiry",
    "x2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId",
    "x2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId",
    "x2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId",
    "x2IntereNBOutPrepFailRnlSwitchOffOngoing",
    "x2IntereNBOutPrepFailRnlValueOutofAllowedRange",
    "x2IntereNBOutPrepFailRnlMultipleERABIDInstances",
    "x2IntereNBOutPrepFailRnlNotSupportedQCIVal",
    "x2IntereNBOutPrepFailTnlTransResUnAvail",
    "x2IntereNBOutPrepFailTnlTransSyntaxError",
    "x2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg",
    "x2IntereNBOutPrepFailProtAbstSynErrRej",
    "x2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat",
    "x2IntereNBOutPrepFailProtSemanticErr",
    "x2IntereNBOutPrepFailProtTransferSynErr",
    "x2IntereNBOutPrepFailMiscControlProcessingOverload",
    "x2IntereNBOutPrepFailMiscHwFailure",
    "x2IntereNBOutPrepFailMiscOMIntervention",
    "x2IntereNBOutPrepFailMiscEnoughProcessingResource",
    "x2IntereNBOutPrepFailMiscUnspecified",
    "x2IntereNBOutPrepFailUnknown",
    "s1IntereNBOutExecFailRnlCellNotAvail",
    "s1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup",
    "s1IntereNBOutExecFailRnlFailInRadioInfProc",
    "s1IntereNBOutExecFailRnlTgtNotAllow",
    "s1IntereNBOutExecFailRnlInvalidCsgId",
    "s1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell",
    "s1IntereNBOutExecFailRnlUnspecified",
    "s1IntereNBOutExecFailRnlHOCancelled",
    "s1IntereNBOutExecFailRnlFailInTgtSys",
    "s1IntereNBOutExecFailRnlUnknownTgtId",
    "s1IntereNBOutExecFailRnlUnknownMmeUeS1ApId",
    "s1IntereNBOutExecFailRnlUnknownEnbUeS1ApId",
    "s1IntereNBOutExecFailRnlUnknownPairUeS1ApId",
    "s1IntereNBOutExecFailRnlTX2RelocOverallExpiry",
    "s1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason",
    "s1IntereNBOutExecFailRnlTS1RelocOverallExpiry",
    "s1IntereNBOutExecFailRnlTS1RelocPrepExpiry",
    "s1IntereNBOutExecFailRnlRadioConnectionWithUELost",
    "s1IntereNBOutExecFailRnlUENotAvlblForPSService",
    "s1IntereNBOutExecFailRnlRadioResourceNotAvlbl",
    "s1IntereNBOutExecFailRnlFailureInRadioInterface",
    "s1IntereNBOutExecFailRnlInvalidQOSCombination",
    "s1IntereNBOutExecFailRnlInteractionWithOtherProcedure",
    "s1IntereNBOutExecFailRnlUnknownERABID",
    "s1IntereNBOutExecFailRnlMultipleERABIDInstances",
    "s1IntereNBOutExecFailRnlRedirectionTowards1XRTT",
    "s1IntereNBOutExecFailRnlNotSupportedQCIVal",
    "s1IntereNBOutExecFailTlTransResUnavail",
    "s1IntereNBOutExecFailTlTransUnspecified",
    "s1IntereNBOutExecFailNasUnspecified",
    "s1IntereNBOutExecFailNasAuthenticationFailure",
    "s1IntereNBOutExecFailNasCSGSubscriptionExpiry",
    "s1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg",
    "s1IntereNBOutExecFailProtAbstSynErrRej",
    "s1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat",
    "s1IntereNBOutExecFailProtSemanticErr",
    "s1IntereNBOutExecFailProtTransferSynErr",
    "s1IntereNBOutExecFailProtUnspecified",
    "s1IntereNBOutExecFailMiscUnspecified",
    "s1IntereNBOutExecFailMiscCtrlProcessingOverload",
    "s1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc",
    "s1IntereNBOutExecFailMiscHwFailure",
    "s1IntereNBOutExecFailMiscOMIntervention",
    "s1IntereNBOutExecFailMiscUnknownPLMN",
    "x2IntereNBOutExecFailRnlCellNotAvail",
    "x2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup",
    "x2IntereNBOutExecFailRnlInvalidMmeGrpId",
    "x2IntereNBOutExecFailRnlHandoverTgtNotAllow",
    "x2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell",
    "x2IntereNBOutExecFailRnlUnknownMmeCode",
    "x2IntereNBOutExecFailRnlUnspecified",
    "x2IntereNBOutExecFailRnlPartialHO",
    "x2IntereNBOutExecFailRnlTrelocprepExpiry",
    "x2IntereNBOutExecFailRnlTX2RelocOverallExpiry",
    "x2IntereNBOutExecFailRnlUnknownNewEnbX2ApId",
    "x2IntereNBOutExecFailRnlUnknownOldEnbX2ApId",
    "x2IntereNBOutExecFailRnlUnknownPairEnbX2ApId",
    "x2IntereNBOutExecFailRnlSwitchOffOngoing",
    "x2IntereNBOutExecFailRnlValueOutofAllowedRange",
    "x2IntereNBOutExecFailRnlMultipleERABIDInstances",
    "x2IntereNBOutExecFailRnlNotSupportedQCIVal",
    "x2IntereNBOutExecFailTnlTransResUnAvail",
    "x2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg",
    "x2IntereNBOutExecFailProtAbstSynErrRej",
    "x2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat",
    "x2IntereNBOutExecFailProtSemanticErr",
    "x2IntereNBOutExecFailProtTransferSynErr",
    "x2IntereNBOutExecFailMiscControlProcessingOverload",
    "x2IntereNBOutExecFailMiscHwFailure",
    "x2IntereNBOutExecFailMiscOMIntervention",
    "x2IntereNBOutExecFailMiscEnoughProcessingResource",
    "x2IntereNBOutExecFailMiscUnspecified",
    "x2IntereNBOutExecFailUnknown",
    "interFrameOutAtt",
    "interFrameOutSucc",
    "intraFreqInterEnbOutPrepAtt",
    "interFreqInterEnbOutPrepAtt",
    "s1IntereNBOutPrepFailRnlPartialHO",
    "s1IntereNBOutPrepFailCritDiag",
    "s1IntereNBOutExecFailRnlPartialHO",
    "s1IntereNBOutExecFailRrcSignalHoFail",
    "x2IntereNBOutPrepFailTnlTransUnspecified",
    "x2IntereNBOutPrepFailProtUnspecified",
    "x2IntereNBOutPrepFailCritDiag",
    "x2IntereNBOutExecFailTnlTransUnspecified",
    "x2IntereNBOutExecFailProtUnspecified",
    "x2IntereNBOutExecFailRrcSignalHoFail",
    "x2IntereNBOutExecFailPathSwitchTmrExpr"
})
public class LteHoStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "IntraEnbOutAttSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutAttSum;
    @XmlElementRef(name = "IntraEnbOutAttDesForRadReasons", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutAttDesForRadReasons;
    @XmlElementRef(name = "IntraEnbOutAttTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutAttTimeCritical;
    @XmlElementRef(name = "IntraEnbOutAttResOptimisation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutAttResOptimisation;
    @XmlElementRef(name = "IntraEnbOutSuccSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutSuccSum;
    @XmlElementRef(name = "IntraEnbOutSuccDesForRadReasons", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutSuccDesForRadReasons;
    @XmlElementRef(name = "IntraEnbOutSuccTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutSuccTimeCritical;
    @XmlElementRef(name = "IntraEnbOutSuccResOptimisation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutSuccResOptimisation;
    @XmlElementRef(name = "InterEnbOutPrepAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutPrepAtt;
    @XmlElementRef(name = "InterEnbOutAttSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutAttSum;
    @XmlElementRef(name = "InterEnbOutAttDesForRadReasons", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutAttDesForRadReasons;
    @XmlElementRef(name = "InterEnbOutAttTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutAttTimeCritical;
    @XmlElementRef(name = "InterEnbOutAttResOptimisation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutAttResOptimisation;
    @XmlElementRef(name = "InterEnbOutSuccSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutSuccSum;
    @XmlElementRef(name = "InterEnbOutSuccDesForRadReasons", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutSuccDesForRadReasons;
    @XmlElementRef(name = "InterEnbOutSuccTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutSuccTimeCritical;
    @XmlElementRef(name = "InterEnbOutSuccResOptimisation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutSuccResOptimisation;
    @XmlElementRef(name = "IntraFreqOutAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqOutAttempts;
    @XmlElementRef(name = "IntraFreqOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqOutSucc;
    @XmlElementRef(name = "InterFreqMeasGapOutAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqMeasGapOutAtt;
    @XmlElementRef(name = "InterFreqMeasGapOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqMeasGapOutSucc;
    @XmlElementRef(name = "InterFreqNoMeasGapOutAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqNoMeasGapOutAtt;
    @XmlElementRef(name = "InterFreqNoMeasGapOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqNoMeasGapOutSucc;
    @XmlElementRef(name = "DrxOutAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drxOutAtt;
    @XmlElementRef(name = "DrxOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drxOutSucc;
    @XmlElementRef(name = "NonDrxOutAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nonDrxOutAtt;
    @XmlElementRef(name = "NonDrxOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nonDrxOutSucc;
    @XmlElementRef(name = "InterEnbOutAttReduceLoadInServingCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutAttReduceLoadInServingCell;
    @XmlElementRef(name = "InterEnbOutSuccReduceLoadInServingCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutSuccReduceLoadInServingCell;
    @XmlElementRef(name = "IntraEnbOutAttReduceLoadInServingCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutAttReduceLoadInServingCell;
    @XmlElementRef(name = "IntraEnbOutSuccReduceLoadInServingCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraEnbOutSuccReduceLoadInServingCell;
    @XmlElementRef(name = "InterEnbOutQosAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutQosAtt;
    @XmlElementRef(name = "InterEnbOutQosSuccSentConnReconfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutQosSuccSentConnReconfig;
    @XmlElementRef(name = "InterEnbOutQosAttSuccCSFB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutQosAttSuccCSFB;
    @XmlElementRef(name = "InterEnbOutQosFailTimerExp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutQosFailTimerExp;
    @XmlElementRef(name = "InterEnbOutQosFailUECapability", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutQosFailUECapability;
    @XmlElementRef(name = "InterEnbOutQosFailNoNeighbors", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interEnbOutQosFailNoNeighbors;
    @XmlElementRef(name = "X2IntraFreqInAttRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInAttRnlRadioRsn;
    @XmlElementRef(name = "X2IntraFreqInAttRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInAttRnlTimeCrit;
    @XmlElementRef(name = "X2IntraFreqInAttRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInAttRnlResOpt;
    @XmlElementRef(name = "X2IntraFreqInAttRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInAttRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "X2IntraFreqInAttRnlSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInAttRnlSwitchOffOngoing;
    @XmlElementRef(name = "X2IntraFreqInAttRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInAttRnlUnspecified;
    @XmlElementRef(name = "X2IntraFreqInAttUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInAttUnknown;
    @XmlElementRef(name = "X2InterFreqInAttRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInAttRnlRadioRsn;
    @XmlElementRef(name = "X2InterFreqInAttRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInAttRnlTimeCrit;
    @XmlElementRef(name = "X2InterFreqInAttRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInAttRnlResOpt;
    @XmlElementRef(name = "X2InterFreqInAttRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInAttRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "X2InterFreqInAttRnlSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInAttRnlSwitchOffOngoing;
    @XmlElementRef(name = "X2InterFreqInAttRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInAttRnlUnspecified;
    @XmlElementRef(name = "X2InterFreqInAttUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInAttUnknown;
    @XmlElementRef(name = "X2IntraFreqInPrepSuccRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepSuccRnlRadioRsn;
    @XmlElementRef(name = "X2IntraFreqInPrepSuccRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepSuccRnlTimeCrit;
    @XmlElementRef(name = "X2IntraFreqInPrepSuccRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepSuccRnlResOpt;
    @XmlElementRef(name = "X2IntraFreqInPrepSuccRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepSuccRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "X2IntraFreqInPrepSuccRnlSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepSuccRnlSwitchOffOngoing;
    @XmlElementRef(name = "X2IntraFreqInPrepSuccRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepSuccRnlUnspecified;
    @XmlElementRef(name = "X2IntraFreqInPrepSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepSuccUnknown;
    @XmlElementRef(name = "X2InterFreqInPrepSuccRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepSuccRnlRadioRsn;
    @XmlElementRef(name = "X2InterFreqInPrepSuccRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepSuccRnlTimeCrit;
    @XmlElementRef(name = "X2InterFreqInPrepSuccRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepSuccRnlResOpt;
    @XmlElementRef(name = "X2InterFreqInPrepSuccRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepSuccRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "X2InterFreqInPrepSuccRnlSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepSuccRnlSwitchOffOngoing;
    @XmlElementRef(name = "X2InterFreqInPrepSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepSuccUnknown;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlCellNotAvail;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlInvalidMmeGrpId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlInvalidMmeGrpId;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlHandoverTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlHandoverTgtNotAllow;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlUnknownMmeCode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlUnknownMmeCode;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlUnspecified;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlPartialHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlPartialHO;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlTrelocprepExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlTrelocprepExpiry;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlUnknownNewEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlUnknownOldEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId;
    @XmlElementRef(name = "X2IntraFreqInPrepFailRnlUnknownPairEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId;
    @XmlElementRef(name = "X2IntraFreqInPrepFailTnlTransResUnAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailTnlTransResUnAvail;
    @XmlElementRef(name = "X2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "X2IntraFreqInPrepFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailProtAbstSynErrRej;
    @XmlElementRef(name = "X2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat;
    @XmlElementRef(name = "X2IntraFreqInPrepFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailProtSemanticErr;
    @XmlElementRef(name = "X2IntraFreqInPrepFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailProtTransferSynErr;
    @XmlElementRef(name = "X2IntraFreqInPrepFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailMiscUnspecified;
    @XmlElementRef(name = "X2IntraFreqInPrepFailUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInPrepFailUnknown;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlCellNotAvail;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlInvalidMmeGrpId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlInvalidMmeGrpId;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlHandoverTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlHandoverTgtNotAllow;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlUnknownMmeCode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlUnknownMmeCode;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlUnspecified;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlPartialHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlPartialHO;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlTrelocprepExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlTrelocprepExpiry;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlUnknownNewEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlUnknownNewEnbX2ApId;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlUnknownOldEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlUnknownOldEnbX2ApId;
    @XmlElementRef(name = "X2InterFreqInPrepFailRnlUnknownPairEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailRnlUnknownPairEnbX2ApId;
    @XmlElementRef(name = "X2InterFreqInPrepFailTnlTransResUnAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailTnlTransResUnAvail;
    @XmlElementRef(name = "X2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "X2InterFreqInPrepFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailProtAbstSynErrRej;
    @XmlElementRef(name = "X2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat;
    @XmlElementRef(name = "X2InterFreqInPrepFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailProtSemanticErr;
    @XmlElementRef(name = "X2InterFreqInPrepFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailProtTransferSynErr;
    @XmlElementRef(name = "X2InterFreqInPrepFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailMiscUnspecified;
    @XmlElementRef(name = "X2InterFreqInPrepFailUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepFailUnknown;
    @XmlElementRef(name = "X2IntraFreqInCompSuccRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompSuccRnlRadioRsn;
    @XmlElementRef(name = "X2IntraFreqInCompSuccRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompSuccRnlTimeCrit;
    @XmlElementRef(name = "X2IntraFreqInCompSuccRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompSuccRnlResOpt;
    @XmlElementRef(name = "X2IntraFreqInCompSuccRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompSuccRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "X2IntraFreqInCompSuccRnlSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompSuccRnlSwitchOffOngoing;
    @XmlElementRef(name = "X2IntraFreqInCompSuccRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompSuccRnlUnspecified;
    @XmlElementRef(name = "X2IntraFreqInCompSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompSuccUnknown;
    @XmlElementRef(name = "X2InterFreqInCompSuccRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompSuccRnlRadioRsn;
    @XmlElementRef(name = "X2InterFreqInCompSuccRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompSuccRnlTimeCrit;
    @XmlElementRef(name = "X2InterFreqInCompSuccRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompSuccRnlResOpt;
    @XmlElementRef(name = "X2InterFreqInCompSuccRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompSuccRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "X2InterFreqInCompSuccRnlSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompSuccRnlSwitchOffOngoing;
    @XmlElementRef(name = "X2InterFreqInCompSuccRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompSuccRnlUnspecified;
    @XmlElementRef(name = "X2InterFreqInCompSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompSuccUnknown;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlPartialHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlPartialHO;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlTrelocprepExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlTrelocprepExpiry;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlMultipleErabIdInst", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlMultipleErabIdInst;
    @XmlElementRef(name = "X2IntraFreqInCompFailTlTransResUnvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailTlTransResUnvail;
    @XmlElementRef(name = "X2IntraFreqInCompFailTlTransUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailTlTransUnspecified;
    @XmlElementRef(name = "X2IntraFreqInCompFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailProtTransferSynErr;
    @XmlElementRef(name = "X2IntraFreqInCompFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailProtAbstSynErrRej;
    @XmlElementRef(name = "X2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift;
    @XmlElementRef(name = "X2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat;
    @XmlElementRef(name = "X2IntraFreqInCompFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailProtSemanticErr;
    @XmlElementRef(name = "X2IntraFreqInCompFailProtAbsSynErrFlsContructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailProtAbsSynErrFlsContructMsg;
    @XmlElementRef(name = "X2IntraFreqInCompFailProtUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailProtUnspecified;
    @XmlElementRef(name = "X2IntraFreqInCompFailMiscCtrlProcOvld", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailMiscCtrlProcOvld;
    @XmlElementRef(name = "X2IntraFreqInCompFailMiscNoEnoughUPRAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailMiscNoEnoughUPRAvail;
    @XmlElementRef(name = "X2IntraFreqInCompFailMisHwErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailMisHwErr;
    @XmlElementRef(name = "X2IntraFreqInCompFailMiscOAMInt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailMiscOAMInt;
    @XmlElementRef(name = "X2IntraFreqInCompFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailMiscUnspecified;
    @XmlElementRef(name = "X2IntraFreqInCompFailRelocExecTmrExp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRelocExecTmrExp;
    @XmlElementRef(name = "X2IntraFreqInCompFailPathSwitchTmrExpr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailPathSwitchTmrExpr;
    @XmlElementRef(name = "X2IntraFreqInCompFailunknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailunknown;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlPartialHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlPartialHO;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlTrelocprepExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlTrelocprepExpiry;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlMultipleErabIdInst", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlMultipleErabIdInst;
    @XmlElementRef(name = "X2InterFreqInCompFailTlTransResUnvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailTlTransResUnvail;
    @XmlElementRef(name = "X2InterFreqInCompFailTlTransUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailTlTransUnspecified;
    @XmlElementRef(name = "X2InterFreqInCompFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailProtTransferSynErr;
    @XmlElementRef(name = "X2InterFreqInCompFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailProtAbstSynErrRej;
    @XmlElementRef(name = "X2InterFreqInCompFailProtAbstSynErrIgnorAndNotift", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailProtAbstSynErrIgnorAndNotift;
    @XmlElementRef(name = "X2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat;
    @XmlElementRef(name = "X2InterFreqInCompFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailProtSemanticErr;
    @XmlElementRef(name = "X2InterFreqInCompFailProtAbsSynErrFlsContructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailProtAbsSynErrFlsContructMsg;
    @XmlElementRef(name = "X2InterFreqInCompFailProtUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailProtUnspecified;
    @XmlElementRef(name = "X2InterFreqInCompFailMiscCtrlProcOvld", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailMiscCtrlProcOvld;
    @XmlElementRef(name = "X2InterFreqInCompFailMiscNoEnoughUPRAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailMiscNoEnoughUPRAvail;
    @XmlElementRef(name = "X2InterFreqInCompFailMisHwErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailMisHwErr;
    @XmlElementRef(name = "X2InterFreqInCompFailMiscOAMInt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailMiscOAMInt;
    @XmlElementRef(name = "X2InterFreqInCompFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailMiscUnspecified;
    @XmlElementRef(name = "X2InterFreqInCompFailRelocExecTmrExp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRelocExecTmrExp;
    @XmlElementRef(name = "X2InterFreqInCompFailPathSwitchTmrExpr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailPathSwitchTmrExpr;
    @XmlElementRef(name = "X2InterFreqInCompFailunknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailunknown;
    @XmlElementRef(name = "X2InterFreqInPrepSuccRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInPrepSuccRnlUnspecified;
    @XmlElementRef(name = "S1IntraFreqInAttRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInAttRnlRadioRsn;
    @XmlElementRef(name = "S1IntraFreqInAttRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInAttRnlTimeCrit;
    @XmlElementRef(name = "S1IntraFreqInAttRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInAttRnlResOpt;
    @XmlElementRef(name = "S1IntraFreqInAttRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInAttRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "S1IntraFreqInAttRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInAttRnlUnspecified;
    @XmlElementRef(name = "S1IntraFreqInAttUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInAttUnknown;
    @XmlElementRef(name = "S1InterFreqInAttRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInAttRnlRadioRsn;
    @XmlElementRef(name = "S1InterFreqInAttRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInAttRnlTimeCrit;
    @XmlElementRef(name = "S1InterFreqInAttRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInAttRnlResOpt;
    @XmlElementRef(name = "S1InterFreqInAttRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInAttRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "S1InterFreqInAttRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInAttRnlUnspecified;
    @XmlElementRef(name = "S1InterFreqInAttUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInAttUnknown;
    @XmlElementRef(name = "S1UnknFreqInAttRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInAttRnlRadioRsn;
    @XmlElementRef(name = "S1UnknFreqInAttRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInAttRnlTimeCrit;
    @XmlElementRef(name = "S1UnknFreqInAttRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInAttRnlResOpt;
    @XmlElementRef(name = "S1UnknFreqInAttRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInAttRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "S1UnknFreqInAttRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInAttRnlUnspecified;
    @XmlElementRef(name = "S1UnknFreqInAttUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInAttUnknown;
    @XmlElementRef(name = "S1IntraFreqInPrepSuccRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepSuccRnlRadioRsn;
    @XmlElementRef(name = "S1IntraFreqInPrepSuccRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepSuccRnlTimeCrit;
    @XmlElementRef(name = "S1IntraFreqInPrepSuccRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepSuccRnlResOpt;
    @XmlElementRef(name = "S1IntraFreqInPrepSuccRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepSuccRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "S1IntraFreqInPrepSuccRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepSuccRnlUnspecified;
    @XmlElementRef(name = "S1IntraFreqInPrepSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepSuccUnknown;
    @XmlElementRef(name = "S1InterFreqInPrepSuccRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepSuccRnlRadioRsn;
    @XmlElementRef(name = "S1InterFreqInPrepSuccRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepSuccRnlTimeCrit;
    @XmlElementRef(name = "S1InterFreqInPrepSuccRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepSuccRnlResOpt;
    @XmlElementRef(name = "S1InterFreqInPrepSuccRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepSuccRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "S1InterFreqInPrepSuccRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepSuccRnlUnspecified;
    @XmlElementRef(name = "S1InterFreqInPrepSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepSuccUnknown;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlCellNotAvail;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlFailInRadioInfProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlFailInRadioInfProc;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlTgtNotAllow;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlInvalidCsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlInvalidCsgId;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlUnspecified;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlHOCancelled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlHOCancelled;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlFailInTgtSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlFailInTgtSys;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlUnknownTgtId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlUnknownTgtId;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlUnknownMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlUnknownEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId;
    @XmlElementRef(name = "S1IntraFreqInPrepFailRnlUnknownPairUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailRnlUnknownPairUeS1ApId;
    @XmlElementRef(name = "S1IntraFreqInPrepFailTlTransResUnavail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailTlTransResUnavail;
    @XmlElementRef(name = "S1IntraFreqInPrepFailNasUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailNasUnspecified;
    @XmlElementRef(name = "S1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "S1IntraFreqInPrepFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailProtAbstSynErrRej;
    @XmlElementRef(name = "S1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat;
    @XmlElementRef(name = "S1IntraFreqInPrepFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailProtSemanticErr;
    @XmlElementRef(name = "S1IntraFreqInPrepFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailProtTransferSynErr;
    @XmlElementRef(name = "S1IntraFreqInPrepFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInPrepFailMiscUnspecified;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlCellNotAvail;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlFailInRadioInfProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlFailInRadioInfProc;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlTgtNotAllow;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlInvalidCsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlInvalidCsgId;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlUnspecified;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlHOCancelled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlHOCancelled;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlFailInTgtSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlFailInTgtSys;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlUnknownTgtId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlUnknownTgtId;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlUnknownMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlUnknownMmeUeS1ApId;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlUnknownEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlUnknownEnbUeS1ApId;
    @XmlElementRef(name = "S1InterFreqInPrepFailRnlUnknownPairUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailRnlUnknownPairUeS1ApId;
    @XmlElementRef(name = "S1InterFreqInPrepFailTlTransResUnavail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailTlTransResUnavail;
    @XmlElementRef(name = "S1InterFreqInPrepFailNasUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailNasUnspecified;
    @XmlElementRef(name = "S1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "S1InterFreqInPrepFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailProtAbstSynErrRej;
    @XmlElementRef(name = "S1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat;
    @XmlElementRef(name = "S1InterFreqInPrepFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailProtSemanticErr;
    @XmlElementRef(name = "S1InterFreqInPrepFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailProtTransferSynErr;
    @XmlElementRef(name = "S1InterFreqInPrepFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInPrepFailMiscUnspecified;
    @XmlElementRef(name = "S1IntraFreqInCompSuccRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInCompSuccRnlRadioRsn;
    @XmlElementRef(name = "S1IntraFreqInCompSuccRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInCompSuccRnlTimeCrit;
    @XmlElementRef(name = "S1IntraFreqInCompSuccRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInCompSuccRnlResOpt;
    @XmlElementRef(name = "S1IntraFreqInCompSuccRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInCompSuccRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "S1IntraFreqInCompSuccRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInCompSuccRnlUnspecified;
    @XmlElementRef(name = "S1IntraFreqInCompSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInCompSuccUnknown;
    @XmlElementRef(name = "S1InterFreqInCompSuccRnlRadioRsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInCompSuccRnlRadioRsn;
    @XmlElementRef(name = "S1InterFreqInCompSuccRnlTimeCrit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInCompSuccRnlTimeCrit;
    @XmlElementRef(name = "S1InterFreqInCompSuccRnlResOpt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInCompSuccRnlResOpt;
    @XmlElementRef(name = "S1InterFreqInCompSuccRnlReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInCompSuccRnlReduceLoadInSvgCell;
    @XmlElementRef(name = "S1InterFreqInCompSuccRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInCompSuccRnlUnspecified;
    @XmlElementRef(name = "S1InterFreqInCompSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInCompSuccUnknown;
    @XmlElementRef(name = "S1IntraFreqInCompFailTgtRelocTmrExp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInCompFailTgtRelocTmrExp;
    @XmlElementRef(name = "S1IntraFreqInCompFailHOCancelled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqInCompFailHOCancelled;
    @XmlElementRef(name = "S1InterFreqInCompFailTgtRelocTmrExp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInCompFailTgtRelocTmrExp;
    @XmlElementRef(name = "S1InterFreqInCompFailHOCancelled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqInCompFailHOCancelled;
    @XmlElementRef(name = "S1IntraFreqTimeAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqTimeAvg;
    @XmlElementRef(name = "S1IntraFreqTimeMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntraFreqTimeMax;
    @XmlElementRef(name = "S1InterFreqTimeAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqTimeAvg;
    @XmlElementRef(name = "S1InterFreqTimeMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1InterFreqTimeMax;
    @XmlElementRef(name = "X2IntraFreqTimeAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqTimeAvg;
    @XmlElementRef(name = "X2IntraFreqTimeMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqTimeMax;
    @XmlElementRef(name = "X2InterFreqTimeAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqTimeAvg;
    @XmlElementRef(name = "X2InterFreqTimeMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqTimeMax;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlHandoverTgtNotAllowed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlHandoverTgtNotAllowed;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlHandoverTgtNotAllowed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlHandoverTgtNotAllowed;
    @XmlElementRef(name = "HoMroOutTooEarly", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoMroOutTooEarly;
    @XmlElementRef(name = "HoMroOutTooLate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoMroOutTooLate;
    @XmlElementRef(name = "HoMroOutWrongCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoMroOutWrongCell;
    @XmlElementRef(name = "HoInterFrameOutAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFrameOutAtt;
    @XmlElementRef(name = "HoInterFrameOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFrameOutSucc;
    @XmlElementRef(name = "HoS1InterEnbOutPrepAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoS1InterEnbOutPrepAtt;
    @XmlElementRef(name = "HoX2InterEnbOutPrepAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoX2InterEnbOutPrepAtt;
    @XmlElementRef(name = "HoS1InterEnbOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoS1InterEnbOutSucc;
    @XmlElementRef(name = "HoX2InterEnbOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoX2InterEnbOutSucc;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlCellNotAvail;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlFailInRadioInfProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlFailInRadioInfProc;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlTgtNotAllow;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlInvalidCsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlInvalidCsgId;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlUnspecified;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlHOCancelled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlHOCancelled;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlFailInTgtSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlFailInTgtSys;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlUnknownTgtId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlUnknownTgtId;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlUnknownMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlUnknownEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlUnknownPairUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlUnknownPairUeS1ApId;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlTX2relocOverallExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlTX2RelocOverallExpiry;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlTS1relocOverallExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlTS1RelocOverallExpiry;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlTS1relocPrepExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlTS1RelocPrepExpiry;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlRadioConnectionWithUELost", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlRadioConnectionWithUELost;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlUENotAvlblForPSService", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlUENotAvlblForPSService;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlRadioResourceNotAvlbl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlRadioResourceNotAvlbl;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlFailureInRadioInterface", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlFailureInRadioInterface;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlInvalidQOSCombination", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlInvalidQOSCombination;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlInteractionWithOtherProcedure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlInteractionWithOtherProcedure;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlUnknownERABID", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlUnknownERABID;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlMultipleERABIDInstances", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlMultipleERABIDInstances;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlRedirectionTowards1XRTT", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlRedirectionTowards1XRTT;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlNotSupportedQCIVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlNotSupportedQCIVal;
    @XmlElementRef(name = "S1IntereNBOutPrepFailTlTransResUnavail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailTlTransResUnavail;
    @XmlElementRef(name = "S1IntereNBOutPrepFailTlTransUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailTlTransUnspecified;
    @XmlElementRef(name = "S1IntereNBOutPrepFailNasUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailNasUnspecified;
    @XmlElementRef(name = "S1IntereNBOutPrepFailNasAuthenticationFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailNasAuthenticationFailure;
    @XmlElementRef(name = "S1IntereNBOutPrepFailNasCSGSubscriptionExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailNasCSGSubscriptionExpiry;
    @XmlElementRef(name = "S1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "S1IntereNBOutPrepFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailProtAbstSynErrRej;
    @XmlElementRef(name = "S1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat;
    @XmlElementRef(name = "S1IntereNBOutPrepFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailProtSemanticErr;
    @XmlElementRef(name = "S1IntereNBOutPrepFailProtUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailProtUnspecified;
    @XmlElementRef(name = "S1IntereNBOutPrepFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailProtTransferSynErr;
    @XmlElementRef(name = "S1IntereNBOutPrepFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailMiscUnspecified;
    @XmlElementRef(name = "S1IntereNBOutPrepFailMiscCtrlProcessingOverload", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailMiscCtrlProcessingOverload;
    @XmlElementRef(name = "S1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc;
    @XmlElementRef(name = "S1IntereNBOutPrepFailMiscHwFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailMiscHwFailure;
    @XmlElementRef(name = "S1IntereNBOutPrepFailMiscOMIntervention", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailMiscOMIntervention;
    @XmlElementRef(name = "S1IntereNBOutPrepFailMiscUnknownPLMN", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailMiscUnknownPLMN;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlCellNotAvail;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlInvalidMmeGrpId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlInvalidMmeGrpId;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlHandoverTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlHandoverTgtNotAllow;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlUnknownMmeCode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlUnknownMmeCode;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlUnspecified;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlPartialHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlPartialHO;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlTrelocprepExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlTrelocprepExpiry;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlTX2relocOverallExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlTX2RelocOverallExpiry;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlUnknownNewEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlUnknownOldEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlUnknownPairEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlSwitchOffOngoing;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlValueOutofAllowedRange", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlValueOutofAllowedRange;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlMultipleERABIDInstances", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlMultipleERABIDInstances;
    @XmlElementRef(name = "X2IntereNBOutPrepFailRnlNotSupportedQCIVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailRnlNotSupportedQCIVal;
    @XmlElementRef(name = "X2IntereNBOutPrepFailTnlTransResUnAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailTnlTransResUnAvail;
    @XmlElementRef(name = "X2IntereNBOutPrepFailTnlTransSyntaxError", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailTnlTransSyntaxError;
    @XmlElementRef(name = "X2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "X2IntereNBOutPrepFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailProtAbstSynErrRej;
    @XmlElementRef(name = "X2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat;
    @XmlElementRef(name = "X2IntereNBOutPrepFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailProtSemanticErr;
    @XmlElementRef(name = "X2IntereNBOutPrepFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailProtTransferSynErr;
    @XmlElementRef(name = "X2IntereNBOutPrepFailMiscControlProcessingOverload", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailMiscControlProcessingOverload;
    @XmlElementRef(name = "X2IntereNBOutPrepFailMiscHwFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailMiscHwFailure;
    @XmlElementRef(name = "X2IntereNBOutPrepFailMiscOMIntervention", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailMiscOMIntervention;
    @XmlElementRef(name = "X2IntereNBOutPrepFailMiscEnoughProcessingResource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailMiscEnoughProcessingResource;
    @XmlElementRef(name = "X2IntereNBOutPrepFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailMiscUnspecified;
    @XmlElementRef(name = "X2IntereNBOutPrepFailUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailUnknown;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlCellNotAvail;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlFailInRadioInfProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlFailInRadioInfProc;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlTgtNotAllow;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlInvalidCsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlInvalidCsgId;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlUnspecified;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlHOCancelled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlHOCancelled;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlFailInTgtSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlFailInTgtSys;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlUnknownTgtId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlUnknownTgtId;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlUnknownMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlUnknownMmeUeS1ApId;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlUnknownEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlUnknownEnbUeS1ApId;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlUnknownPairUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlUnknownPairUeS1ApId;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlTX2relocOverallExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlTX2RelocOverallExpiry;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlTS1relocOverallExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlTS1RelocOverallExpiry;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlTS1relocPrepExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlTS1RelocPrepExpiry;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlRadioConnectionWithUELost", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlRadioConnectionWithUELost;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlUENotAvlblForPSService", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlUENotAvlblForPSService;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlRadioResourceNotAvlbl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlRadioResourceNotAvlbl;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlFailureInRadioInterface", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlFailureInRadioInterface;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlInvalidQOSCombination", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlInvalidQOSCombination;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlInteractionWithOtherProcedure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlInteractionWithOtherProcedure;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlUnknownERABID", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlUnknownERABID;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlMultipleERABIDInstances", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlMultipleERABIDInstances;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlRedirectionTowards1XRTT", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlRedirectionTowards1XRTT;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlNotSupportedQCIVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlNotSupportedQCIVal;
    @XmlElementRef(name = "S1IntereNBOutExecFailTlTransResUnavail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailTlTransResUnavail;
    @XmlElementRef(name = "S1IntereNBOutExecFailTlTransUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailTlTransUnspecified;
    @XmlElementRef(name = "S1IntereNBOutExecFailNasUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailNasUnspecified;
    @XmlElementRef(name = "S1IntereNBOutExecFailNasAuthenticationFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailNasAuthenticationFailure;
    @XmlElementRef(name = "S1IntereNBOutExecFailNasCSGSubscriptionExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailNasCSGSubscriptionExpiry;
    @XmlElementRef(name = "S1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "S1IntereNBOutExecFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailProtAbstSynErrRej;
    @XmlElementRef(name = "S1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat;
    @XmlElementRef(name = "S1IntereNBOutExecFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailProtSemanticErr;
    @XmlElementRef(name = "S1IntereNBOutExecFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailProtTransferSynErr;
    @XmlElementRef(name = "S1IntereNBOutExecFailProtUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailProtUnspecified;
    @XmlElementRef(name = "S1IntereNBOutExecFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailMiscUnspecified;
    @XmlElementRef(name = "S1IntereNBOutExecFailMiscCtrlProcessingOverload", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailMiscCtrlProcessingOverload;
    @XmlElementRef(name = "S1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc;
    @XmlElementRef(name = "S1IntereNBOutExecFailMiscHwFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailMiscHwFailure;
    @XmlElementRef(name = "S1IntereNBOutExecFailMiscOMIntervention", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailMiscOMIntervention;
    @XmlElementRef(name = "S1IntereNBOutExecFailMiscUnknownPLMN", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailMiscUnknownPLMN;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlCellNotAvail;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlInvalidMmeGrpId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlInvalidMmeGrpId;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlHandoverTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlHandoverTgtNotAllow;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlUnknownMmeCode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlUnknownMmeCode;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlUnspecified;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlPartialHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlPartialHO;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlTrelocprepExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlTrelocprepExpiry;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlTX2relocOverallExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlTX2RelocOverallExpiry;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlUnknownNewEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlUnknownNewEnbX2ApId;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlUnknownOldEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlUnknownOldEnbX2ApId;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlUnknownPairEnbX2apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlUnknownPairEnbX2ApId;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlSwitchOffOngoing;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlValueOutofAllowedRange", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlValueOutofAllowedRange;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlMultipleERABIDInstances", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlMultipleERABIDInstances;
    @XmlElementRef(name = "X2IntereNBOutExecFailRnlNotSupportedQCIVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRnlNotSupportedQCIVal;
    @XmlElementRef(name = "X2IntereNBOutExecFailTnlTransResUnAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailTnlTransResUnAvail;
    @XmlElementRef(name = "X2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "X2IntereNBOutExecFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailProtAbstSynErrRej;
    @XmlElementRef(name = "X2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat;
    @XmlElementRef(name = "X2IntereNBOutExecFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailProtSemanticErr;
    @XmlElementRef(name = "X2IntereNBOutExecFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailProtTransferSynErr;
    @XmlElementRef(name = "X2IntereNBOutExecFailMiscControlProcessingOverload", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailMiscControlProcessingOverload;
    @XmlElementRef(name = "X2IntereNBOutExecFailMiscHwFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailMiscHwFailure;
    @XmlElementRef(name = "X2IntereNBOutExecFailMiscOMIntervention", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailMiscOMIntervention;
    @XmlElementRef(name = "X2IntereNBOutExecFailMiscEnoughProcessingResource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailMiscEnoughProcessingResource;
    @XmlElementRef(name = "X2IntereNBOutExecFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailMiscUnspecified;
    @XmlElementRef(name = "X2IntereNBOutExecFailUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailUnknown;
    @XmlElementRef(name = "InterFrameOutAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFrameOutAtt;
    @XmlElementRef(name = "InterFrameOutSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFrameOutSucc;
    @XmlElementRef(name = "IntraFreqInterEnbOutPrepAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqInterEnbOutPrepAtt;
    @XmlElementRef(name = "InterFreqInterEnbOutPrepAtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqInterEnbOutPrepAtt;
    @XmlElementRef(name = "S1IntereNBOutPrepFailRnlPartialHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailRnlPartialHO;
    @XmlElementRef(name = "S1IntereNBOutPrepFailCritDiag", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutPrepFailCritDiag;
    @XmlElementRef(name = "S1IntereNBOutExecFailRnlPartialHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRnlPartialHO;
    @XmlElementRef(name = "S1IntereNBOutExecFailRrcSignalHoFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1IntereNBOutExecFailRrcSignalHoFail;
    @XmlElementRef(name = "X2IntereNBOutPrepFailTnlTransUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailTnlTransUnspecified;
    @XmlElementRef(name = "X2IntereNBOutPrepFailProtUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailProtUnspecified;
    @XmlElementRef(name = "X2IntereNBOutPrepFailCritDiag", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutPrepFailCritDiag;
    @XmlElementRef(name = "X2IntereNBOutExecFailTnlTransUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailTnlTransUnspecified;
    @XmlElementRef(name = "X2IntereNBOutExecFailProtUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailProtUnspecified;
    @XmlElementRef(name = "X2IntereNBOutExecFailRrcSignalHoFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailRrcSignalHoFail;
    @XmlElementRef(name = "X2IntereNBOutExecFailPathSwitchTmrExpr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntereNBOutExecFailPathSwitchTmrExpr;

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellId(JAXBElement<Integer> value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the dateAndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeStart() {
        return dateAndTimeStart;
    }

    /**
     * Sets the value of the dateAndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeStart(XMLGregorianCalendar value) {
        this.dateAndTimeStart = value;
    }

    /**
     * Gets the value of the dateAndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeEnd() {
        return dateAndTimeEnd;
    }

    /**
     * Sets the value of the dateAndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeEnd(XMLGregorianCalendar value) {
        this.dateAndTimeEnd = value;
    }

    /**
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGranularityPeriod(JAXBElement<Integer> value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the intraEnbOutAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutAttSum() {
        return intraEnbOutAttSum;
    }

    /**
     * Sets the value of the intraEnbOutAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutAttSum(JAXBElement<Integer> value) {
        this.intraEnbOutAttSum = value;
    }

    /**
     * Gets the value of the intraEnbOutAttDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutAttDesForRadReasons() {
        return intraEnbOutAttDesForRadReasons;
    }

    /**
     * Sets the value of the intraEnbOutAttDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutAttDesForRadReasons(JAXBElement<Integer> value) {
        this.intraEnbOutAttDesForRadReasons = value;
    }

    /**
     * Gets the value of the intraEnbOutAttTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutAttTimeCritical() {
        return intraEnbOutAttTimeCritical;
    }

    /**
     * Sets the value of the intraEnbOutAttTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutAttTimeCritical(JAXBElement<Integer> value) {
        this.intraEnbOutAttTimeCritical = value;
    }

    /**
     * Gets the value of the intraEnbOutAttResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutAttResOptimisation() {
        return intraEnbOutAttResOptimisation;
    }

    /**
     * Sets the value of the intraEnbOutAttResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutAttResOptimisation(JAXBElement<Integer> value) {
        this.intraEnbOutAttResOptimisation = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutSuccSum() {
        return intraEnbOutSuccSum;
    }

    /**
     * Sets the value of the intraEnbOutSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutSuccSum(JAXBElement<Integer> value) {
        this.intraEnbOutSuccSum = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutSuccDesForRadReasons() {
        return intraEnbOutSuccDesForRadReasons;
    }

    /**
     * Sets the value of the intraEnbOutSuccDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutSuccDesForRadReasons(JAXBElement<Integer> value) {
        this.intraEnbOutSuccDesForRadReasons = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutSuccTimeCritical() {
        return intraEnbOutSuccTimeCritical;
    }

    /**
     * Sets the value of the intraEnbOutSuccTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutSuccTimeCritical(JAXBElement<Integer> value) {
        this.intraEnbOutSuccTimeCritical = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutSuccResOptimisation() {
        return intraEnbOutSuccResOptimisation;
    }

    /**
     * Sets the value of the intraEnbOutSuccResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutSuccResOptimisation(JAXBElement<Integer> value) {
        this.intraEnbOutSuccResOptimisation = value;
    }

    /**
     * Gets the value of the interEnbOutPrepAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutPrepAtt() {
        return interEnbOutPrepAtt;
    }

    /**
     * Sets the value of the interEnbOutPrepAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutPrepAtt(JAXBElement<Integer> value) {
        this.interEnbOutPrepAtt = value;
    }

    /**
     * Gets the value of the interEnbOutAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutAttSum() {
        return interEnbOutAttSum;
    }

    /**
     * Sets the value of the interEnbOutAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutAttSum(JAXBElement<Integer> value) {
        this.interEnbOutAttSum = value;
    }

    /**
     * Gets the value of the interEnbOutAttDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutAttDesForRadReasons() {
        return interEnbOutAttDesForRadReasons;
    }

    /**
     * Sets the value of the interEnbOutAttDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutAttDesForRadReasons(JAXBElement<Integer> value) {
        this.interEnbOutAttDesForRadReasons = value;
    }

    /**
     * Gets the value of the interEnbOutAttTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutAttTimeCritical() {
        return interEnbOutAttTimeCritical;
    }

    /**
     * Sets the value of the interEnbOutAttTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutAttTimeCritical(JAXBElement<Integer> value) {
        this.interEnbOutAttTimeCritical = value;
    }

    /**
     * Gets the value of the interEnbOutAttResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutAttResOptimisation() {
        return interEnbOutAttResOptimisation;
    }

    /**
     * Sets the value of the interEnbOutAttResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutAttResOptimisation(JAXBElement<Integer> value) {
        this.interEnbOutAttResOptimisation = value;
    }

    /**
     * Gets the value of the interEnbOutSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutSuccSum() {
        return interEnbOutSuccSum;
    }

    /**
     * Sets the value of the interEnbOutSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutSuccSum(JAXBElement<Integer> value) {
        this.interEnbOutSuccSum = value;
    }

    /**
     * Gets the value of the interEnbOutSuccDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutSuccDesForRadReasons() {
        return interEnbOutSuccDesForRadReasons;
    }

    /**
     * Sets the value of the interEnbOutSuccDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutSuccDesForRadReasons(JAXBElement<Integer> value) {
        this.interEnbOutSuccDesForRadReasons = value;
    }

    /**
     * Gets the value of the interEnbOutSuccTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutSuccTimeCritical() {
        return interEnbOutSuccTimeCritical;
    }

    /**
     * Sets the value of the interEnbOutSuccTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutSuccTimeCritical(JAXBElement<Integer> value) {
        this.interEnbOutSuccTimeCritical = value;
    }

    /**
     * Gets the value of the interEnbOutSuccResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutSuccResOptimisation() {
        return interEnbOutSuccResOptimisation;
    }

    /**
     * Sets the value of the interEnbOutSuccResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutSuccResOptimisation(JAXBElement<Integer> value) {
        this.interEnbOutSuccResOptimisation = value;
    }

    /**
     * Gets the value of the intraFreqOutAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqOutAttempts() {
        return intraFreqOutAttempts;
    }

    /**
     * Sets the value of the intraFreqOutAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqOutAttempts(JAXBElement<Integer> value) {
        this.intraFreqOutAttempts = value;
    }

    /**
     * Gets the value of the intraFreqOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqOutSucc() {
        return intraFreqOutSucc;
    }

    /**
     * Sets the value of the intraFreqOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqOutSucc(JAXBElement<Integer> value) {
        this.intraFreqOutSucc = value;
    }

    /**
     * Gets the value of the interFreqMeasGapOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqMeasGapOutAtt() {
        return interFreqMeasGapOutAtt;
    }

    /**
     * Sets the value of the interFreqMeasGapOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqMeasGapOutAtt(JAXBElement<Integer> value) {
        this.interFreqMeasGapOutAtt = value;
    }

    /**
     * Gets the value of the interFreqMeasGapOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqMeasGapOutSucc() {
        return interFreqMeasGapOutSucc;
    }

    /**
     * Sets the value of the interFreqMeasGapOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqMeasGapOutSucc(JAXBElement<Integer> value) {
        this.interFreqMeasGapOutSucc = value;
    }

    /**
     * Gets the value of the interFreqNoMeasGapOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqNoMeasGapOutAtt() {
        return interFreqNoMeasGapOutAtt;
    }

    /**
     * Sets the value of the interFreqNoMeasGapOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqNoMeasGapOutAtt(JAXBElement<Integer> value) {
        this.interFreqNoMeasGapOutAtt = value;
    }

    /**
     * Gets the value of the interFreqNoMeasGapOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqNoMeasGapOutSucc() {
        return interFreqNoMeasGapOutSucc;
    }

    /**
     * Sets the value of the interFreqNoMeasGapOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqNoMeasGapOutSucc(JAXBElement<Integer> value) {
        this.interFreqNoMeasGapOutSucc = value;
    }

    /**
     * Gets the value of the drxOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrxOutAtt() {
        return drxOutAtt;
    }

    /**
     * Sets the value of the drxOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrxOutAtt(JAXBElement<Integer> value) {
        this.drxOutAtt = value;
    }

    /**
     * Gets the value of the drxOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrxOutSucc() {
        return drxOutSucc;
    }

    /**
     * Sets the value of the drxOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrxOutSucc(JAXBElement<Integer> value) {
        this.drxOutSucc = value;
    }

    /**
     * Gets the value of the nonDrxOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNonDrxOutAtt() {
        return nonDrxOutAtt;
    }

    /**
     * Sets the value of the nonDrxOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNonDrxOutAtt(JAXBElement<Integer> value) {
        this.nonDrxOutAtt = value;
    }

    /**
     * Gets the value of the nonDrxOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNonDrxOutSucc() {
        return nonDrxOutSucc;
    }

    /**
     * Sets the value of the nonDrxOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNonDrxOutSucc(JAXBElement<Integer> value) {
        this.nonDrxOutSucc = value;
    }

    /**
     * Gets the value of the interEnbOutAttReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutAttReduceLoadInServingCell() {
        return interEnbOutAttReduceLoadInServingCell;
    }

    /**
     * Sets the value of the interEnbOutAttReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutAttReduceLoadInServingCell(JAXBElement<Integer> value) {
        this.interEnbOutAttReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the interEnbOutSuccReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutSuccReduceLoadInServingCell() {
        return interEnbOutSuccReduceLoadInServingCell;
    }

    /**
     * Sets the value of the interEnbOutSuccReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutSuccReduceLoadInServingCell(JAXBElement<Integer> value) {
        this.interEnbOutSuccReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the intraEnbOutAttReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutAttReduceLoadInServingCell() {
        return intraEnbOutAttReduceLoadInServingCell;
    }

    /**
     * Sets the value of the intraEnbOutAttReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutAttReduceLoadInServingCell(JAXBElement<Integer> value) {
        this.intraEnbOutAttReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the intraEnbOutSuccReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraEnbOutSuccReduceLoadInServingCell() {
        return intraEnbOutSuccReduceLoadInServingCell;
    }

    /**
     * Sets the value of the intraEnbOutSuccReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraEnbOutSuccReduceLoadInServingCell(JAXBElement<Integer> value) {
        this.intraEnbOutSuccReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the interEnbOutQosAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutQosAtt() {
        return interEnbOutQosAtt;
    }

    /**
     * Sets the value of the interEnbOutQosAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutQosAtt(JAXBElement<Integer> value) {
        this.interEnbOutQosAtt = value;
    }

    /**
     * Gets the value of the interEnbOutQosSuccSentConnReconfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutQosSuccSentConnReconfig() {
        return interEnbOutQosSuccSentConnReconfig;
    }

    /**
     * Sets the value of the interEnbOutQosSuccSentConnReconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutQosSuccSentConnReconfig(JAXBElement<Integer> value) {
        this.interEnbOutQosSuccSentConnReconfig = value;
    }

    /**
     * Gets the value of the interEnbOutQosAttSuccCSFB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutQosAttSuccCSFB() {
        return interEnbOutQosAttSuccCSFB;
    }

    /**
     * Sets the value of the interEnbOutQosAttSuccCSFB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutQosAttSuccCSFB(JAXBElement<Integer> value) {
        this.interEnbOutQosAttSuccCSFB = value;
    }

    /**
     * Gets the value of the interEnbOutQosFailTimerExp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutQosFailTimerExp() {
        return interEnbOutQosFailTimerExp;
    }

    /**
     * Sets the value of the interEnbOutQosFailTimerExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutQosFailTimerExp(JAXBElement<Integer> value) {
        this.interEnbOutQosFailTimerExp = value;
    }

    /**
     * Gets the value of the interEnbOutQosFailUECapability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutQosFailUECapability() {
        return interEnbOutQosFailUECapability;
    }

    /**
     * Sets the value of the interEnbOutQosFailUECapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutQosFailUECapability(JAXBElement<Integer> value) {
        this.interEnbOutQosFailUECapability = value;
    }

    /**
     * Gets the value of the interEnbOutQosFailNoNeighbors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterEnbOutQosFailNoNeighbors() {
        return interEnbOutQosFailNoNeighbors;
    }

    /**
     * Sets the value of the interEnbOutQosFailNoNeighbors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterEnbOutQosFailNoNeighbors(JAXBElement<Integer> value) {
        this.interEnbOutQosFailNoNeighbors = value;
    }

    /**
     * Gets the value of the x2IntraFreqInAttRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInAttRnlRadioRsn() {
        return x2IntraFreqInAttRnlRadioRsn;
    }

    /**
     * Sets the value of the x2IntraFreqInAttRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInAttRnlRadioRsn(JAXBElement<Integer> value) {
        this.x2IntraFreqInAttRnlRadioRsn = value;
    }

    /**
     * Gets the value of the x2IntraFreqInAttRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInAttRnlTimeCrit() {
        return x2IntraFreqInAttRnlTimeCrit;
    }

    /**
     * Sets the value of the x2IntraFreqInAttRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInAttRnlTimeCrit(JAXBElement<Integer> value) {
        this.x2IntraFreqInAttRnlTimeCrit = value;
    }

    /**
     * Gets the value of the x2IntraFreqInAttRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInAttRnlResOpt() {
        return x2IntraFreqInAttRnlResOpt;
    }

    /**
     * Sets the value of the x2IntraFreqInAttRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInAttRnlResOpt(JAXBElement<Integer> value) {
        this.x2IntraFreqInAttRnlResOpt = value;
    }

    /**
     * Gets the value of the x2IntraFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInAttRnlReduceLoadInSvgCell() {
        return x2IntraFreqInAttRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the x2IntraFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInAttRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.x2IntraFreqInAttRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the x2IntraFreqInAttRnlSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInAttRnlSwitchOffOngoing() {
        return x2IntraFreqInAttRnlSwitchOffOngoing;
    }

    /**
     * Sets the value of the x2IntraFreqInAttRnlSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInAttRnlSwitchOffOngoing(JAXBElement<Integer> value) {
        this.x2IntraFreqInAttRnlSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the x2IntraFreqInAttRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInAttRnlUnspecified() {
        return x2IntraFreqInAttRnlUnspecified;
    }

    /**
     * Sets the value of the x2IntraFreqInAttRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInAttRnlUnspecified(JAXBElement<Integer> value) {
        this.x2IntraFreqInAttRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2IntraFreqInAttUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInAttUnknown() {
        return x2IntraFreqInAttUnknown;
    }

    /**
     * Sets the value of the x2IntraFreqInAttUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInAttUnknown(JAXBElement<Integer> value) {
        this.x2IntraFreqInAttUnknown = value;
    }

    /**
     * Gets the value of the x2InterFreqInAttRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInAttRnlRadioRsn() {
        return x2InterFreqInAttRnlRadioRsn;
    }

    /**
     * Sets the value of the x2InterFreqInAttRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInAttRnlRadioRsn(JAXBElement<Integer> value) {
        this.x2InterFreqInAttRnlRadioRsn = value;
    }

    /**
     * Gets the value of the x2InterFreqInAttRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInAttRnlTimeCrit() {
        return x2InterFreqInAttRnlTimeCrit;
    }

    /**
     * Sets the value of the x2InterFreqInAttRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInAttRnlTimeCrit(JAXBElement<Integer> value) {
        this.x2InterFreqInAttRnlTimeCrit = value;
    }

    /**
     * Gets the value of the x2InterFreqInAttRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInAttRnlResOpt() {
        return x2InterFreqInAttRnlResOpt;
    }

    /**
     * Sets the value of the x2InterFreqInAttRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInAttRnlResOpt(JAXBElement<Integer> value) {
        this.x2InterFreqInAttRnlResOpt = value;
    }

    /**
     * Gets the value of the x2InterFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInAttRnlReduceLoadInSvgCell() {
        return x2InterFreqInAttRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the x2InterFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInAttRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.x2InterFreqInAttRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the x2InterFreqInAttRnlSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInAttRnlSwitchOffOngoing() {
        return x2InterFreqInAttRnlSwitchOffOngoing;
    }

    /**
     * Sets the value of the x2InterFreqInAttRnlSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInAttRnlSwitchOffOngoing(JAXBElement<Integer> value) {
        this.x2InterFreqInAttRnlSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the x2InterFreqInAttRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInAttRnlUnspecified() {
        return x2InterFreqInAttRnlUnspecified;
    }

    /**
     * Sets the value of the x2InterFreqInAttRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInAttRnlUnspecified(JAXBElement<Integer> value) {
        this.x2InterFreqInAttRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2InterFreqInAttUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInAttUnknown() {
        return x2InterFreqInAttUnknown;
    }

    /**
     * Sets the value of the x2InterFreqInAttUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInAttUnknown(JAXBElement<Integer> value) {
        this.x2InterFreqInAttUnknown = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepSuccRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepSuccRnlRadioRsn() {
        return x2IntraFreqInPrepSuccRnlRadioRsn;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepSuccRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepSuccRnlRadioRsn(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepSuccRnlRadioRsn = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepSuccRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepSuccRnlTimeCrit() {
        return x2IntraFreqInPrepSuccRnlTimeCrit;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepSuccRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepSuccRnlTimeCrit(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepSuccRnlTimeCrit = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepSuccRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepSuccRnlResOpt() {
        return x2IntraFreqInPrepSuccRnlResOpt;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepSuccRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepSuccRnlResOpt(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepSuccRnlResOpt = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepSuccRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepSuccRnlReduceLoadInSvgCell() {
        return x2IntraFreqInPrepSuccRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepSuccRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepSuccRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepSuccRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepSuccRnlSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepSuccRnlSwitchOffOngoing() {
        return x2IntraFreqInPrepSuccRnlSwitchOffOngoing;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepSuccRnlSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepSuccRnlSwitchOffOngoing(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepSuccRnlSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepSuccRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepSuccRnlUnspecified() {
        return x2IntraFreqInPrepSuccRnlUnspecified;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepSuccRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepSuccRnlUnspecified(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepSuccRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepSuccUnknown() {
        return x2IntraFreqInPrepSuccUnknown;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepSuccUnknown(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepSuccUnknown = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepSuccRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepSuccRnlRadioRsn() {
        return x2InterFreqInPrepSuccRnlRadioRsn;
    }

    /**
     * Sets the value of the x2InterFreqInPrepSuccRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepSuccRnlRadioRsn(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepSuccRnlRadioRsn = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepSuccRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepSuccRnlTimeCrit() {
        return x2InterFreqInPrepSuccRnlTimeCrit;
    }

    /**
     * Sets the value of the x2InterFreqInPrepSuccRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepSuccRnlTimeCrit(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepSuccRnlTimeCrit = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepSuccRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepSuccRnlResOpt() {
        return x2InterFreqInPrepSuccRnlResOpt;
    }

    /**
     * Sets the value of the x2InterFreqInPrepSuccRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepSuccRnlResOpt(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepSuccRnlResOpt = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepSuccRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepSuccRnlReduceLoadInSvgCell() {
        return x2InterFreqInPrepSuccRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the x2InterFreqInPrepSuccRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepSuccRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepSuccRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepSuccRnlSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepSuccRnlSwitchOffOngoing() {
        return x2InterFreqInPrepSuccRnlSwitchOffOngoing;
    }

    /**
     * Sets the value of the x2InterFreqInPrepSuccRnlSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepSuccRnlSwitchOffOngoing(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepSuccRnlSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepSuccUnknown() {
        return x2InterFreqInPrepSuccUnknown;
    }

    /**
     * Sets the value of the x2InterFreqInPrepSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepSuccUnknown(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepSuccUnknown = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlCellNotAvail() {
        return x2IntraFreqInPrepFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup() {
        return x2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlInvalidMmeGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlInvalidMmeGrpId() {
        return x2IntraFreqInPrepFailRnlInvalidMmeGrpId;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlInvalidMmeGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlInvalidMmeGrpId(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlInvalidMmeGrpId = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlHandoverTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlHandoverTgtNotAllow() {
        return x2IntraFreqInPrepFailRnlHandoverTgtNotAllow;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlHandoverTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlHandoverTgtNotAllow(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlHandoverTgtNotAllow = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell() {
        return x2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlUnknownMmeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlUnknownMmeCode() {
        return x2IntraFreqInPrepFailRnlUnknownMmeCode;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlUnknownMmeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlUnknownMmeCode(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlUnknownMmeCode = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlUnspecified() {
        return x2IntraFreqInPrepFailRnlUnspecified;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlUnspecified(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlPartialHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlPartialHO() {
        return x2IntraFreqInPrepFailRnlPartialHO;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlPartialHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlPartialHO(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlPartialHO = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlTrelocprepExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlTrelocprepExpiry() {
        return x2IntraFreqInPrepFailRnlTrelocprepExpiry;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlTrelocprepExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlTrelocprepExpiry(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlTrelocprepExpiry = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId() {
        return x2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId() {
        return x2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId() {
        return x2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailTnlTransResUnAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailTnlTransResUnAvail() {
        return x2IntraFreqInPrepFailTnlTransResUnAvail;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailTnlTransResUnAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailTnlTransResUnAvail(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailTnlTransResUnAvail = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg() {
        return x2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailProtAbstSynErrRej() {
        return x2IntraFreqInPrepFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat() {
        return x2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailProtSemanticErr() {
        return x2IntraFreqInPrepFailProtSemanticErr;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailProtSemanticErr(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailProtTransferSynErr() {
        return x2IntraFreqInPrepFailProtTransferSynErr;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailMiscUnspecified() {
        return x2IntraFreqInPrepFailMiscUnspecified;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailMiscUnspecified(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the x2IntraFreqInPrepFailUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInPrepFailUnknown() {
        return x2IntraFreqInPrepFailUnknown;
    }

    /**
     * Sets the value of the x2IntraFreqInPrepFailUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInPrepFailUnknown(JAXBElement<Integer> value) {
        this.x2IntraFreqInPrepFailUnknown = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlCellNotAvail() {
        return x2InterFreqInPrepFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup() {
        return x2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlInvalidMmeGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlInvalidMmeGrpId() {
        return x2InterFreqInPrepFailRnlInvalidMmeGrpId;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlInvalidMmeGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlInvalidMmeGrpId(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlInvalidMmeGrpId = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlHandoverTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlHandoverTgtNotAllow() {
        return x2InterFreqInPrepFailRnlHandoverTgtNotAllow;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlHandoverTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlHandoverTgtNotAllow(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlHandoverTgtNotAllow = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell() {
        return x2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlUnknownMmeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlUnknownMmeCode() {
        return x2InterFreqInPrepFailRnlUnknownMmeCode;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlUnknownMmeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlUnknownMmeCode(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlUnknownMmeCode = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlUnspecified() {
        return x2InterFreqInPrepFailRnlUnspecified;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlUnspecified(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlPartialHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlPartialHO() {
        return x2InterFreqInPrepFailRnlPartialHO;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlPartialHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlPartialHO(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlPartialHO = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlTrelocprepExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlTrelocprepExpiry() {
        return x2InterFreqInPrepFailRnlTrelocprepExpiry;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlTrelocprepExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlTrelocprepExpiry(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlTrelocprepExpiry = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlUnknownNewEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlUnknownNewEnbX2ApId() {
        return x2InterFreqInPrepFailRnlUnknownNewEnbX2ApId;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlUnknownNewEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlUnknownNewEnbX2ApId(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlUnknownNewEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlUnknownOldEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlUnknownOldEnbX2ApId() {
        return x2InterFreqInPrepFailRnlUnknownOldEnbX2ApId;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlUnknownOldEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlUnknownOldEnbX2ApId(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlUnknownOldEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailRnlUnknownPairEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailRnlUnknownPairEnbX2ApId() {
        return x2InterFreqInPrepFailRnlUnknownPairEnbX2ApId;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailRnlUnknownPairEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailRnlUnknownPairEnbX2ApId(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailRnlUnknownPairEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailTnlTransResUnAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailTnlTransResUnAvail() {
        return x2InterFreqInPrepFailTnlTransResUnAvail;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailTnlTransResUnAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailTnlTransResUnAvail(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailTnlTransResUnAvail = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg() {
        return x2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailProtAbstSynErrRej() {
        return x2InterFreqInPrepFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat() {
        return x2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailProtSemanticErr() {
        return x2InterFreqInPrepFailProtSemanticErr;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailProtSemanticErr(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailProtTransferSynErr() {
        return x2InterFreqInPrepFailProtTransferSynErr;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailMiscUnspecified() {
        return x2InterFreqInPrepFailMiscUnspecified;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailMiscUnspecified(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepFailUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepFailUnknown() {
        return x2InterFreqInPrepFailUnknown;
    }

    /**
     * Sets the value of the x2InterFreqInPrepFailUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepFailUnknown(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepFailUnknown = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompSuccRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompSuccRnlRadioRsn() {
        return x2IntraFreqInCompSuccRnlRadioRsn;
    }

    /**
     * Sets the value of the x2IntraFreqInCompSuccRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompSuccRnlRadioRsn(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompSuccRnlRadioRsn = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompSuccRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompSuccRnlTimeCrit() {
        return x2IntraFreqInCompSuccRnlTimeCrit;
    }

    /**
     * Sets the value of the x2IntraFreqInCompSuccRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompSuccRnlTimeCrit(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompSuccRnlTimeCrit = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompSuccRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompSuccRnlResOpt() {
        return x2IntraFreqInCompSuccRnlResOpt;
    }

    /**
     * Sets the value of the x2IntraFreqInCompSuccRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompSuccRnlResOpt(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompSuccRnlResOpt = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompSuccRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompSuccRnlReduceLoadInSvgCell() {
        return x2IntraFreqInCompSuccRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the x2IntraFreqInCompSuccRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompSuccRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompSuccRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompSuccRnlSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompSuccRnlSwitchOffOngoing() {
        return x2IntraFreqInCompSuccRnlSwitchOffOngoing;
    }

    /**
     * Sets the value of the x2IntraFreqInCompSuccRnlSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompSuccRnlSwitchOffOngoing(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompSuccRnlSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompSuccRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompSuccRnlUnspecified() {
        return x2IntraFreqInCompSuccRnlUnspecified;
    }

    /**
     * Sets the value of the x2IntraFreqInCompSuccRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompSuccRnlUnspecified(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompSuccRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompSuccUnknown() {
        return x2IntraFreqInCompSuccUnknown;
    }

    /**
     * Sets the value of the x2IntraFreqInCompSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompSuccUnknown(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompSuccUnknown = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompSuccRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompSuccRnlRadioRsn() {
        return x2InterFreqInCompSuccRnlRadioRsn;
    }

    /**
     * Sets the value of the x2InterFreqInCompSuccRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompSuccRnlRadioRsn(JAXBElement<Integer> value) {
        this.x2InterFreqInCompSuccRnlRadioRsn = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompSuccRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompSuccRnlTimeCrit() {
        return x2InterFreqInCompSuccRnlTimeCrit;
    }

    /**
     * Sets the value of the x2InterFreqInCompSuccRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompSuccRnlTimeCrit(JAXBElement<Integer> value) {
        this.x2InterFreqInCompSuccRnlTimeCrit = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompSuccRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompSuccRnlResOpt() {
        return x2InterFreqInCompSuccRnlResOpt;
    }

    /**
     * Sets the value of the x2InterFreqInCompSuccRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompSuccRnlResOpt(JAXBElement<Integer> value) {
        this.x2InterFreqInCompSuccRnlResOpt = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompSuccRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompSuccRnlReduceLoadInSvgCell() {
        return x2InterFreqInCompSuccRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the x2InterFreqInCompSuccRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompSuccRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.x2InterFreqInCompSuccRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompSuccRnlSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompSuccRnlSwitchOffOngoing() {
        return x2InterFreqInCompSuccRnlSwitchOffOngoing;
    }

    /**
     * Sets the value of the x2InterFreqInCompSuccRnlSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompSuccRnlSwitchOffOngoing(JAXBElement<Integer> value) {
        this.x2InterFreqInCompSuccRnlSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompSuccRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompSuccRnlUnspecified() {
        return x2InterFreqInCompSuccRnlUnspecified;
    }

    /**
     * Sets the value of the x2InterFreqInCompSuccRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompSuccRnlUnspecified(JAXBElement<Integer> value) {
        this.x2InterFreqInCompSuccRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompSuccUnknown() {
        return x2InterFreqInCompSuccUnknown;
    }

    /**
     * Sets the value of the x2InterFreqInCompSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompSuccUnknown(JAXBElement<Integer> value) {
        this.x2InterFreqInCompSuccUnknown = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlPartialHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlPartialHO() {
        return x2IntraFreqInCompFailRnlPartialHO;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlPartialHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlPartialHO(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlPartialHO = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlTrelocprepExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlTrelocprepExpiry() {
        return x2IntraFreqInCompFailRnlTrelocprepExpiry;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlTrelocprepExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlTrelocprepExpiry(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlTrelocprepExpiry = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlMultipleErabIdInst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlMultipleErabIdInst() {
        return x2IntraFreqInCompFailRnlMultipleErabIdInst;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlMultipleErabIdInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlMultipleErabIdInst(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlMultipleErabIdInst = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailTlTransResUnvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailTlTransResUnvail() {
        return x2IntraFreqInCompFailTlTransResUnvail;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailTlTransResUnvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailTlTransResUnvail(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailTlTransResUnvail = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailTlTransUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailTlTransUnspecified() {
        return x2IntraFreqInCompFailTlTransUnspecified;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailTlTransUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailTlTransUnspecified(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailTlTransUnspecified = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailProtTransferSynErr() {
        return x2IntraFreqInCompFailProtTransferSynErr;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailProtAbstSynErrRej() {
        return x2IntraFreqInCompFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift() {
        return x2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat() {
        return x2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailProtSemanticErr() {
        return x2IntraFreqInCompFailProtSemanticErr;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailProtSemanticErr(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailProtAbsSynErrFlsContructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailProtAbsSynErrFlsContructMsg() {
        return x2IntraFreqInCompFailProtAbsSynErrFlsContructMsg;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailProtAbsSynErrFlsContructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailProtAbsSynErrFlsContructMsg(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailProtAbsSynErrFlsContructMsg = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailProtUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailProtUnspecified() {
        return x2IntraFreqInCompFailProtUnspecified;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailProtUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailProtUnspecified(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailProtUnspecified = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailMiscCtrlProcOvld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailMiscCtrlProcOvld() {
        return x2IntraFreqInCompFailMiscCtrlProcOvld;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailMiscCtrlProcOvld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailMiscCtrlProcOvld(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailMiscCtrlProcOvld = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailMiscNoEnoughUPRAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailMiscNoEnoughUPRAvail() {
        return x2IntraFreqInCompFailMiscNoEnoughUPRAvail;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailMiscNoEnoughUPRAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailMiscNoEnoughUPRAvail(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailMiscNoEnoughUPRAvail = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailMisHwErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailMisHwErr() {
        return x2IntraFreqInCompFailMisHwErr;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailMisHwErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailMisHwErr(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailMisHwErr = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailMiscOAMInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailMiscOAMInt() {
        return x2IntraFreqInCompFailMiscOAMInt;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailMiscOAMInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailMiscOAMInt(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailMiscOAMInt = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailMiscUnspecified() {
        return x2IntraFreqInCompFailMiscUnspecified;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailMiscUnspecified(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRelocExecTmrExp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRelocExecTmrExp() {
        return x2IntraFreqInCompFailRelocExecTmrExp;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRelocExecTmrExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRelocExecTmrExp(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRelocExecTmrExp = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailPathSwitchTmrExpr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailPathSwitchTmrExpr() {
        return x2IntraFreqInCompFailPathSwitchTmrExpr;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailPathSwitchTmrExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailPathSwitchTmrExpr(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailPathSwitchTmrExpr = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailunknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailunknown() {
        return x2IntraFreqInCompFailunknown;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailunknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailunknown(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailunknown = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlPartialHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlPartialHO() {
        return x2InterFreqInCompFailRnlPartialHO;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlPartialHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlPartialHO(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlPartialHO = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlTrelocprepExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlTrelocprepExpiry() {
        return x2InterFreqInCompFailRnlTrelocprepExpiry;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlTrelocprepExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlTrelocprepExpiry(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlTrelocprepExpiry = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlMultipleErabIdInst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlMultipleErabIdInst() {
        return x2InterFreqInCompFailRnlMultipleErabIdInst;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlMultipleErabIdInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlMultipleErabIdInst(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlMultipleErabIdInst = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailTlTransResUnvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailTlTransResUnvail() {
        return x2InterFreqInCompFailTlTransResUnvail;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailTlTransResUnvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailTlTransResUnvail(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailTlTransResUnvail = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailTlTransUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailTlTransUnspecified() {
        return x2InterFreqInCompFailTlTransUnspecified;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailTlTransUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailTlTransUnspecified(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailTlTransUnspecified = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailProtTransferSynErr() {
        return x2InterFreqInCompFailProtTransferSynErr;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailProtAbstSynErrRej() {
        return x2InterFreqInCompFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailProtAbstSynErrIgnorAndNotift property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailProtAbstSynErrIgnorAndNotift() {
        return x2InterFreqInCompFailProtAbstSynErrIgnorAndNotift;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailProtAbstSynErrIgnorAndNotift property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailProtAbstSynErrIgnorAndNotift(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailProtAbstSynErrIgnorAndNotift = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat() {
        return x2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailProtSemanticErr() {
        return x2InterFreqInCompFailProtSemanticErr;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailProtSemanticErr(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailProtAbsSynErrFlsContructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailProtAbsSynErrFlsContructMsg() {
        return x2InterFreqInCompFailProtAbsSynErrFlsContructMsg;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailProtAbsSynErrFlsContructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailProtAbsSynErrFlsContructMsg(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailProtAbsSynErrFlsContructMsg = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailProtUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailProtUnspecified() {
        return x2InterFreqInCompFailProtUnspecified;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailProtUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailProtUnspecified(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailProtUnspecified = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailMiscCtrlProcOvld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailMiscCtrlProcOvld() {
        return x2InterFreqInCompFailMiscCtrlProcOvld;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailMiscCtrlProcOvld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailMiscCtrlProcOvld(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailMiscCtrlProcOvld = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailMiscNoEnoughUPRAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailMiscNoEnoughUPRAvail() {
        return x2InterFreqInCompFailMiscNoEnoughUPRAvail;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailMiscNoEnoughUPRAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailMiscNoEnoughUPRAvail(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailMiscNoEnoughUPRAvail = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailMisHwErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailMisHwErr() {
        return x2InterFreqInCompFailMisHwErr;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailMisHwErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailMisHwErr(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailMisHwErr = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailMiscOAMInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailMiscOAMInt() {
        return x2InterFreqInCompFailMiscOAMInt;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailMiscOAMInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailMiscOAMInt(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailMiscOAMInt = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailMiscUnspecified() {
        return x2InterFreqInCompFailMiscUnspecified;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailMiscUnspecified(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRelocExecTmrExp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRelocExecTmrExp() {
        return x2InterFreqInCompFailRelocExecTmrExp;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRelocExecTmrExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRelocExecTmrExp(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRelocExecTmrExp = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailPathSwitchTmrExpr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailPathSwitchTmrExpr() {
        return x2InterFreqInCompFailPathSwitchTmrExpr;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailPathSwitchTmrExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailPathSwitchTmrExpr(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailPathSwitchTmrExpr = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailunknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailunknown() {
        return x2InterFreqInCompFailunknown;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailunknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailunknown(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailunknown = value;
    }

    /**
     * Gets the value of the x2InterFreqInPrepSuccRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInPrepSuccRnlUnspecified() {
        return x2InterFreqInPrepSuccRnlUnspecified;
    }

    /**
     * Sets the value of the x2InterFreqInPrepSuccRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInPrepSuccRnlUnspecified(JAXBElement<Integer> value) {
        this.x2InterFreqInPrepSuccRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1IntraFreqInAttRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInAttRnlRadioRsn() {
        return s1IntraFreqInAttRnlRadioRsn;
    }

    /**
     * Sets the value of the s1IntraFreqInAttRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInAttRnlRadioRsn(JAXBElement<Integer> value) {
        this.s1IntraFreqInAttRnlRadioRsn = value;
    }

    /**
     * Gets the value of the s1IntraFreqInAttRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInAttRnlTimeCrit() {
        return s1IntraFreqInAttRnlTimeCrit;
    }

    /**
     * Sets the value of the s1IntraFreqInAttRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInAttRnlTimeCrit(JAXBElement<Integer> value) {
        this.s1IntraFreqInAttRnlTimeCrit = value;
    }

    /**
     * Gets the value of the s1IntraFreqInAttRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInAttRnlResOpt() {
        return s1IntraFreqInAttRnlResOpt;
    }

    /**
     * Sets the value of the s1IntraFreqInAttRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInAttRnlResOpt(JAXBElement<Integer> value) {
        this.s1IntraFreqInAttRnlResOpt = value;
    }

    /**
     * Gets the value of the s1IntraFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInAttRnlReduceLoadInSvgCell() {
        return s1IntraFreqInAttRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the s1IntraFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInAttRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.s1IntraFreqInAttRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the s1IntraFreqInAttRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInAttRnlUnspecified() {
        return s1IntraFreqInAttRnlUnspecified;
    }

    /**
     * Sets the value of the s1IntraFreqInAttRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInAttRnlUnspecified(JAXBElement<Integer> value) {
        this.s1IntraFreqInAttRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1IntraFreqInAttUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInAttUnknown() {
        return s1IntraFreqInAttUnknown;
    }

    /**
     * Sets the value of the s1IntraFreqInAttUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInAttUnknown(JAXBElement<Integer> value) {
        this.s1IntraFreqInAttUnknown = value;
    }

    /**
     * Gets the value of the s1InterFreqInAttRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInAttRnlRadioRsn() {
        return s1InterFreqInAttRnlRadioRsn;
    }

    /**
     * Sets the value of the s1InterFreqInAttRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInAttRnlRadioRsn(JAXBElement<Integer> value) {
        this.s1InterFreqInAttRnlRadioRsn = value;
    }

    /**
     * Gets the value of the s1InterFreqInAttRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInAttRnlTimeCrit() {
        return s1InterFreqInAttRnlTimeCrit;
    }

    /**
     * Sets the value of the s1InterFreqInAttRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInAttRnlTimeCrit(JAXBElement<Integer> value) {
        this.s1InterFreqInAttRnlTimeCrit = value;
    }

    /**
     * Gets the value of the s1InterFreqInAttRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInAttRnlResOpt() {
        return s1InterFreqInAttRnlResOpt;
    }

    /**
     * Sets the value of the s1InterFreqInAttRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInAttRnlResOpt(JAXBElement<Integer> value) {
        this.s1InterFreqInAttRnlResOpt = value;
    }

    /**
     * Gets the value of the s1InterFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInAttRnlReduceLoadInSvgCell() {
        return s1InterFreqInAttRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the s1InterFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInAttRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.s1InterFreqInAttRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the s1InterFreqInAttRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInAttRnlUnspecified() {
        return s1InterFreqInAttRnlUnspecified;
    }

    /**
     * Sets the value of the s1InterFreqInAttRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInAttRnlUnspecified(JAXBElement<Integer> value) {
        this.s1InterFreqInAttRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1InterFreqInAttUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInAttUnknown() {
        return s1InterFreqInAttUnknown;
    }

    /**
     * Sets the value of the s1InterFreqInAttUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInAttUnknown(JAXBElement<Integer> value) {
        this.s1InterFreqInAttUnknown = value;
    }

    /**
     * Gets the value of the s1UnknFreqInAttRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInAttRnlRadioRsn() {
        return s1UnknFreqInAttRnlRadioRsn;
    }

    /**
     * Sets the value of the s1UnknFreqInAttRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInAttRnlRadioRsn(JAXBElement<Integer> value) {
        this.s1UnknFreqInAttRnlRadioRsn = value;
    }

    /**
     * Gets the value of the s1UnknFreqInAttRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInAttRnlTimeCrit() {
        return s1UnknFreqInAttRnlTimeCrit;
    }

    /**
     * Sets the value of the s1UnknFreqInAttRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInAttRnlTimeCrit(JAXBElement<Integer> value) {
        this.s1UnknFreqInAttRnlTimeCrit = value;
    }

    /**
     * Gets the value of the s1UnknFreqInAttRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInAttRnlResOpt() {
        return s1UnknFreqInAttRnlResOpt;
    }

    /**
     * Sets the value of the s1UnknFreqInAttRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInAttRnlResOpt(JAXBElement<Integer> value) {
        this.s1UnknFreqInAttRnlResOpt = value;
    }

    /**
     * Gets the value of the s1UnknFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInAttRnlReduceLoadInSvgCell() {
        return s1UnknFreqInAttRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the s1UnknFreqInAttRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInAttRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.s1UnknFreqInAttRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the s1UnknFreqInAttRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInAttRnlUnspecified() {
        return s1UnknFreqInAttRnlUnspecified;
    }

    /**
     * Sets the value of the s1UnknFreqInAttRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInAttRnlUnspecified(JAXBElement<Integer> value) {
        this.s1UnknFreqInAttRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1UnknFreqInAttUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInAttUnknown() {
        return s1UnknFreqInAttUnknown;
    }

    /**
     * Sets the value of the s1UnknFreqInAttUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInAttUnknown(JAXBElement<Integer> value) {
        this.s1UnknFreqInAttUnknown = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepSuccRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepSuccRnlRadioRsn() {
        return s1IntraFreqInPrepSuccRnlRadioRsn;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepSuccRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepSuccRnlRadioRsn(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepSuccRnlRadioRsn = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepSuccRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepSuccRnlTimeCrit() {
        return s1IntraFreqInPrepSuccRnlTimeCrit;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepSuccRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepSuccRnlTimeCrit(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepSuccRnlTimeCrit = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepSuccRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepSuccRnlResOpt() {
        return s1IntraFreqInPrepSuccRnlResOpt;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepSuccRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepSuccRnlResOpt(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepSuccRnlResOpt = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepSuccRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepSuccRnlReduceLoadInSvgCell() {
        return s1IntraFreqInPrepSuccRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepSuccRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepSuccRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepSuccRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepSuccRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepSuccRnlUnspecified() {
        return s1IntraFreqInPrepSuccRnlUnspecified;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepSuccRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepSuccRnlUnspecified(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepSuccRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepSuccUnknown() {
        return s1IntraFreqInPrepSuccUnknown;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepSuccUnknown(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepSuccUnknown = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepSuccRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepSuccRnlRadioRsn() {
        return s1InterFreqInPrepSuccRnlRadioRsn;
    }

    /**
     * Sets the value of the s1InterFreqInPrepSuccRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepSuccRnlRadioRsn(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepSuccRnlRadioRsn = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepSuccRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepSuccRnlTimeCrit() {
        return s1InterFreqInPrepSuccRnlTimeCrit;
    }

    /**
     * Sets the value of the s1InterFreqInPrepSuccRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepSuccRnlTimeCrit(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepSuccRnlTimeCrit = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepSuccRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepSuccRnlResOpt() {
        return s1InterFreqInPrepSuccRnlResOpt;
    }

    /**
     * Sets the value of the s1InterFreqInPrepSuccRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepSuccRnlResOpt(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepSuccRnlResOpt = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepSuccRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepSuccRnlReduceLoadInSvgCell() {
        return s1InterFreqInPrepSuccRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the s1InterFreqInPrepSuccRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepSuccRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepSuccRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepSuccRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepSuccRnlUnspecified() {
        return s1InterFreqInPrepSuccRnlUnspecified;
    }

    /**
     * Sets the value of the s1InterFreqInPrepSuccRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepSuccRnlUnspecified(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepSuccRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepSuccUnknown() {
        return s1InterFreqInPrepSuccUnknown;
    }

    /**
     * Sets the value of the s1InterFreqInPrepSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepSuccUnknown(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepSuccUnknown = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlCellNotAvail() {
        return s1IntraFreqInPrepFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup() {
        return s1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlFailInRadioInfProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlFailInRadioInfProc() {
        return s1IntraFreqInPrepFailRnlFailInRadioInfProc;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlFailInRadioInfProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlFailInRadioInfProc(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlFailInRadioInfProc = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlTgtNotAllow() {
        return s1IntraFreqInPrepFailRnlTgtNotAllow;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlTgtNotAllow(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlTgtNotAllow = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlInvalidCsgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlInvalidCsgId() {
        return s1IntraFreqInPrepFailRnlInvalidCsgId;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlInvalidCsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlInvalidCsgId(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlInvalidCsgId = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell() {
        return s1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlUnspecified() {
        return s1IntraFreqInPrepFailRnlUnspecified;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlUnspecified(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlHOCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlHOCancelled() {
        return s1IntraFreqInPrepFailRnlHOCancelled;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlHOCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlHOCancelled(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlHOCancelled = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlFailInTgtSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlFailInTgtSys() {
        return s1IntraFreqInPrepFailRnlFailInTgtSys;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlFailInTgtSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlFailInTgtSys(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlFailInTgtSys = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlUnknownTgtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlUnknownTgtId() {
        return s1IntraFreqInPrepFailRnlUnknownTgtId;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlUnknownTgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlUnknownTgtId(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlUnknownTgtId = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId() {
        return s1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId() {
        return s1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailRnlUnknownPairUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailRnlUnknownPairUeS1ApId() {
        return s1IntraFreqInPrepFailRnlUnknownPairUeS1ApId;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailRnlUnknownPairUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailRnlUnknownPairUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailRnlUnknownPairUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailTlTransResUnavail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailTlTransResUnavail() {
        return s1IntraFreqInPrepFailTlTransResUnavail;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailTlTransResUnavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailTlTransResUnavail(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailTlTransResUnavail = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailNasUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailNasUnspecified() {
        return s1IntraFreqInPrepFailNasUnspecified;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailNasUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailNasUnspecified(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailNasUnspecified = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg() {
        return s1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailProtAbstSynErrRej() {
        return s1IntraFreqInPrepFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat() {
        return s1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailProtSemanticErr() {
        return s1IntraFreqInPrepFailProtSemanticErr;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailProtSemanticErr(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailProtTransferSynErr() {
        return s1IntraFreqInPrepFailProtTransferSynErr;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the s1IntraFreqInPrepFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInPrepFailMiscUnspecified() {
        return s1IntraFreqInPrepFailMiscUnspecified;
    }

    /**
     * Sets the value of the s1IntraFreqInPrepFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInPrepFailMiscUnspecified(JAXBElement<Integer> value) {
        this.s1IntraFreqInPrepFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlCellNotAvail() {
        return s1InterFreqInPrepFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup() {
        return s1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlFailInRadioInfProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlFailInRadioInfProc() {
        return s1InterFreqInPrepFailRnlFailInRadioInfProc;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlFailInRadioInfProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlFailInRadioInfProc(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlFailInRadioInfProc = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlTgtNotAllow() {
        return s1InterFreqInPrepFailRnlTgtNotAllow;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlTgtNotAllow(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlTgtNotAllow = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlInvalidCsgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlInvalidCsgId() {
        return s1InterFreqInPrepFailRnlInvalidCsgId;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlInvalidCsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlInvalidCsgId(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlInvalidCsgId = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell() {
        return s1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlUnspecified() {
        return s1InterFreqInPrepFailRnlUnspecified;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlUnspecified(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlHOCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlHOCancelled() {
        return s1InterFreqInPrepFailRnlHOCancelled;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlHOCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlHOCancelled(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlHOCancelled = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlFailInTgtSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlFailInTgtSys() {
        return s1InterFreqInPrepFailRnlFailInTgtSys;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlFailInTgtSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlFailInTgtSys(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlFailInTgtSys = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlUnknownTgtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlUnknownTgtId() {
        return s1InterFreqInPrepFailRnlUnknownTgtId;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlUnknownTgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlUnknownTgtId(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlUnknownTgtId = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlUnknownMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlUnknownMmeUeS1ApId() {
        return s1InterFreqInPrepFailRnlUnknownMmeUeS1ApId;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlUnknownMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlUnknownMmeUeS1ApId(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlUnknownMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlUnknownEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlUnknownEnbUeS1ApId() {
        return s1InterFreqInPrepFailRnlUnknownEnbUeS1ApId;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlUnknownEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlUnknownEnbUeS1ApId(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlUnknownEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailRnlUnknownPairUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailRnlUnknownPairUeS1ApId() {
        return s1InterFreqInPrepFailRnlUnknownPairUeS1ApId;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailRnlUnknownPairUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailRnlUnknownPairUeS1ApId(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailRnlUnknownPairUeS1ApId = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailTlTransResUnavail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailTlTransResUnavail() {
        return s1InterFreqInPrepFailTlTransResUnavail;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailTlTransResUnavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailTlTransResUnavail(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailTlTransResUnavail = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailNasUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailNasUnspecified() {
        return s1InterFreqInPrepFailNasUnspecified;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailNasUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailNasUnspecified(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailNasUnspecified = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg() {
        return s1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailProtAbstSynErrRej() {
        return s1InterFreqInPrepFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat() {
        return s1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailProtSemanticErr() {
        return s1InterFreqInPrepFailProtSemanticErr;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailProtSemanticErr(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailProtTransferSynErr() {
        return s1InterFreqInPrepFailProtTransferSynErr;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the s1InterFreqInPrepFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInPrepFailMiscUnspecified() {
        return s1InterFreqInPrepFailMiscUnspecified;
    }

    /**
     * Sets the value of the s1InterFreqInPrepFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInPrepFailMiscUnspecified(JAXBElement<Integer> value) {
        this.s1InterFreqInPrepFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the s1IntraFreqInCompSuccRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInCompSuccRnlRadioRsn() {
        return s1IntraFreqInCompSuccRnlRadioRsn;
    }

    /**
     * Sets the value of the s1IntraFreqInCompSuccRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInCompSuccRnlRadioRsn(JAXBElement<Integer> value) {
        this.s1IntraFreqInCompSuccRnlRadioRsn = value;
    }

    /**
     * Gets the value of the s1IntraFreqInCompSuccRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInCompSuccRnlTimeCrit() {
        return s1IntraFreqInCompSuccRnlTimeCrit;
    }

    /**
     * Sets the value of the s1IntraFreqInCompSuccRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInCompSuccRnlTimeCrit(JAXBElement<Integer> value) {
        this.s1IntraFreqInCompSuccRnlTimeCrit = value;
    }

    /**
     * Gets the value of the s1IntraFreqInCompSuccRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInCompSuccRnlResOpt() {
        return s1IntraFreqInCompSuccRnlResOpt;
    }

    /**
     * Sets the value of the s1IntraFreqInCompSuccRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInCompSuccRnlResOpt(JAXBElement<Integer> value) {
        this.s1IntraFreqInCompSuccRnlResOpt = value;
    }

    /**
     * Gets the value of the s1IntraFreqInCompSuccRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInCompSuccRnlReduceLoadInSvgCell() {
        return s1IntraFreqInCompSuccRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the s1IntraFreqInCompSuccRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInCompSuccRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.s1IntraFreqInCompSuccRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the s1IntraFreqInCompSuccRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInCompSuccRnlUnspecified() {
        return s1IntraFreqInCompSuccRnlUnspecified;
    }

    /**
     * Sets the value of the s1IntraFreqInCompSuccRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInCompSuccRnlUnspecified(JAXBElement<Integer> value) {
        this.s1IntraFreqInCompSuccRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1IntraFreqInCompSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInCompSuccUnknown() {
        return s1IntraFreqInCompSuccUnknown;
    }

    /**
     * Sets the value of the s1IntraFreqInCompSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInCompSuccUnknown(JAXBElement<Integer> value) {
        this.s1IntraFreqInCompSuccUnknown = value;
    }

    /**
     * Gets the value of the s1InterFreqInCompSuccRnlRadioRsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInCompSuccRnlRadioRsn() {
        return s1InterFreqInCompSuccRnlRadioRsn;
    }

    /**
     * Sets the value of the s1InterFreqInCompSuccRnlRadioRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInCompSuccRnlRadioRsn(JAXBElement<Integer> value) {
        this.s1InterFreqInCompSuccRnlRadioRsn = value;
    }

    /**
     * Gets the value of the s1InterFreqInCompSuccRnlTimeCrit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInCompSuccRnlTimeCrit() {
        return s1InterFreqInCompSuccRnlTimeCrit;
    }

    /**
     * Sets the value of the s1InterFreqInCompSuccRnlTimeCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInCompSuccRnlTimeCrit(JAXBElement<Integer> value) {
        this.s1InterFreqInCompSuccRnlTimeCrit = value;
    }

    /**
     * Gets the value of the s1InterFreqInCompSuccRnlResOpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInCompSuccRnlResOpt() {
        return s1InterFreqInCompSuccRnlResOpt;
    }

    /**
     * Sets the value of the s1InterFreqInCompSuccRnlResOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInCompSuccRnlResOpt(JAXBElement<Integer> value) {
        this.s1InterFreqInCompSuccRnlResOpt = value;
    }

    /**
     * Gets the value of the s1InterFreqInCompSuccRnlReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInCompSuccRnlReduceLoadInSvgCell() {
        return s1InterFreqInCompSuccRnlReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the s1InterFreqInCompSuccRnlReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInCompSuccRnlReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.s1InterFreqInCompSuccRnlReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the s1InterFreqInCompSuccRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInCompSuccRnlUnspecified() {
        return s1InterFreqInCompSuccRnlUnspecified;
    }

    /**
     * Sets the value of the s1InterFreqInCompSuccRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInCompSuccRnlUnspecified(JAXBElement<Integer> value) {
        this.s1InterFreqInCompSuccRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1InterFreqInCompSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInCompSuccUnknown() {
        return s1InterFreqInCompSuccUnknown;
    }

    /**
     * Sets the value of the s1InterFreqInCompSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInCompSuccUnknown(JAXBElement<Integer> value) {
        this.s1InterFreqInCompSuccUnknown = value;
    }

    /**
     * Gets the value of the s1IntraFreqInCompFailTgtRelocTmrExp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInCompFailTgtRelocTmrExp() {
        return s1IntraFreqInCompFailTgtRelocTmrExp;
    }

    /**
     * Sets the value of the s1IntraFreqInCompFailTgtRelocTmrExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInCompFailTgtRelocTmrExp(JAXBElement<Integer> value) {
        this.s1IntraFreqInCompFailTgtRelocTmrExp = value;
    }

    /**
     * Gets the value of the s1IntraFreqInCompFailHOCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqInCompFailHOCancelled() {
        return s1IntraFreqInCompFailHOCancelled;
    }

    /**
     * Sets the value of the s1IntraFreqInCompFailHOCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqInCompFailHOCancelled(JAXBElement<Integer> value) {
        this.s1IntraFreqInCompFailHOCancelled = value;
    }

    /**
     * Gets the value of the s1InterFreqInCompFailTgtRelocTmrExp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInCompFailTgtRelocTmrExp() {
        return s1InterFreqInCompFailTgtRelocTmrExp;
    }

    /**
     * Sets the value of the s1InterFreqInCompFailTgtRelocTmrExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInCompFailTgtRelocTmrExp(JAXBElement<Integer> value) {
        this.s1InterFreqInCompFailTgtRelocTmrExp = value;
    }

    /**
     * Gets the value of the s1InterFreqInCompFailHOCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqInCompFailHOCancelled() {
        return s1InterFreqInCompFailHOCancelled;
    }

    /**
     * Sets the value of the s1InterFreqInCompFailHOCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqInCompFailHOCancelled(JAXBElement<Integer> value) {
        this.s1InterFreqInCompFailHOCancelled = value;
    }

    /**
     * Gets the value of the s1IntraFreqTimeAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqTimeAvg() {
        return s1IntraFreqTimeAvg;
    }

    /**
     * Sets the value of the s1IntraFreqTimeAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqTimeAvg(JAXBElement<Integer> value) {
        this.s1IntraFreqTimeAvg = value;
    }

    /**
     * Gets the value of the s1IntraFreqTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntraFreqTimeMax() {
        return s1IntraFreqTimeMax;
    }

    /**
     * Sets the value of the s1IntraFreqTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntraFreqTimeMax(JAXBElement<Integer> value) {
        this.s1IntraFreqTimeMax = value;
    }

    /**
     * Gets the value of the s1InterFreqTimeAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqTimeAvg() {
        return s1InterFreqTimeAvg;
    }

    /**
     * Sets the value of the s1InterFreqTimeAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqTimeAvg(JAXBElement<Integer> value) {
        this.s1InterFreqTimeAvg = value;
    }

    /**
     * Gets the value of the s1InterFreqTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1InterFreqTimeMax() {
        return s1InterFreqTimeMax;
    }

    /**
     * Sets the value of the s1InterFreqTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1InterFreqTimeMax(JAXBElement<Integer> value) {
        this.s1InterFreqTimeMax = value;
    }

    /**
     * Gets the value of the x2IntraFreqTimeAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqTimeAvg() {
        return x2IntraFreqTimeAvg;
    }

    /**
     * Sets the value of the x2IntraFreqTimeAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqTimeAvg(JAXBElement<Integer> value) {
        this.x2IntraFreqTimeAvg = value;
    }

    /**
     * Gets the value of the x2IntraFreqTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqTimeMax() {
        return x2IntraFreqTimeMax;
    }

    /**
     * Sets the value of the x2IntraFreqTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqTimeMax(JAXBElement<Integer> value) {
        this.x2IntraFreqTimeMax = value;
    }

    /**
     * Gets the value of the x2InterFreqTimeAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqTimeAvg() {
        return x2InterFreqTimeAvg;
    }

    /**
     * Sets the value of the x2InterFreqTimeAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqTimeAvg(JAXBElement<Integer> value) {
        this.x2InterFreqTimeAvg = value;
    }

    /**
     * Gets the value of the x2InterFreqTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqTimeMax() {
        return x2InterFreqTimeMax;
    }

    /**
     * Sets the value of the x2InterFreqTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqTimeMax(JAXBElement<Integer> value) {
        this.x2InterFreqTimeMax = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlHandoverTgtNotAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlHandoverTgtNotAllowed() {
        return x2IntraFreqInCompFailRnlHandoverTgtNotAllowed;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlHandoverTgtNotAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlHandoverTgtNotAllowed(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlHandoverTgtNotAllowed = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlHandoverTgtNotAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlHandoverTgtNotAllowed() {
        return x2InterFreqInCompFailRnlHandoverTgtNotAllowed;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlHandoverTgtNotAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlHandoverTgtNotAllowed(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlHandoverTgtNotAllowed = value;
    }

    /**
     * Gets the value of the hoMroOutTooEarly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoMroOutTooEarly() {
        return hoMroOutTooEarly;
    }

    /**
     * Sets the value of the hoMroOutTooEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoMroOutTooEarly(JAXBElement<Integer> value) {
        this.hoMroOutTooEarly = value;
    }

    /**
     * Gets the value of the hoMroOutTooLate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoMroOutTooLate() {
        return hoMroOutTooLate;
    }

    /**
     * Sets the value of the hoMroOutTooLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoMroOutTooLate(JAXBElement<Integer> value) {
        this.hoMroOutTooLate = value;
    }

    /**
     * Gets the value of the hoMroOutWrongCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoMroOutWrongCell() {
        return hoMroOutWrongCell;
    }

    /**
     * Sets the value of the hoMroOutWrongCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoMroOutWrongCell(JAXBElement<Integer> value) {
        this.hoMroOutWrongCell = value;
    }

    /**
     * Gets the value of the hoInterFrameOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFrameOutAtt() {
        return hoInterFrameOutAtt;
    }

    /**
     * Sets the value of the hoInterFrameOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFrameOutAtt(JAXBElement<Integer> value) {
        this.hoInterFrameOutAtt = value;
    }

    /**
     * Gets the value of the hoInterFrameOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFrameOutSucc() {
        return hoInterFrameOutSucc;
    }

    /**
     * Sets the value of the hoInterFrameOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFrameOutSucc(JAXBElement<Integer> value) {
        this.hoInterFrameOutSucc = value;
    }

    /**
     * Gets the value of the hoS1InterEnbOutPrepAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoS1InterEnbOutPrepAtt() {
        return hoS1InterEnbOutPrepAtt;
    }

    /**
     * Sets the value of the hoS1InterEnbOutPrepAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoS1InterEnbOutPrepAtt(JAXBElement<Integer> value) {
        this.hoS1InterEnbOutPrepAtt = value;
    }

    /**
     * Gets the value of the hoX2InterEnbOutPrepAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoX2InterEnbOutPrepAtt() {
        return hoX2InterEnbOutPrepAtt;
    }

    /**
     * Sets the value of the hoX2InterEnbOutPrepAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoX2InterEnbOutPrepAtt(JAXBElement<Integer> value) {
        this.hoX2InterEnbOutPrepAtt = value;
    }

    /**
     * Gets the value of the hoS1InterEnbOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoS1InterEnbOutSucc() {
        return hoS1InterEnbOutSucc;
    }

    /**
     * Sets the value of the hoS1InterEnbOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoS1InterEnbOutSucc(JAXBElement<Integer> value) {
        this.hoS1InterEnbOutSucc = value;
    }

    /**
     * Gets the value of the hoX2InterEnbOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoX2InterEnbOutSucc() {
        return hoX2InterEnbOutSucc;
    }

    /**
     * Sets the value of the hoX2InterEnbOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoX2InterEnbOutSucc(JAXBElement<Integer> value) {
        this.hoX2InterEnbOutSucc = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlCellNotAvail() {
        return s1IntereNBOutPrepFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup() {
        return s1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlFailInRadioInfProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlFailInRadioInfProc() {
        return s1IntereNBOutPrepFailRnlFailInRadioInfProc;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlFailInRadioInfProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlFailInRadioInfProc(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlFailInRadioInfProc = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlTgtNotAllow() {
        return s1IntereNBOutPrepFailRnlTgtNotAllow;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlTgtNotAllow(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlTgtNotAllow = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlInvalidCsgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlInvalidCsgId() {
        return s1IntereNBOutPrepFailRnlInvalidCsgId;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlInvalidCsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlInvalidCsgId(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlInvalidCsgId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell() {
        return s1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlUnspecified() {
        return s1IntereNBOutPrepFailRnlUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlHOCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlHOCancelled() {
        return s1IntereNBOutPrepFailRnlHOCancelled;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlHOCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlHOCancelled(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlHOCancelled = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlFailInTgtSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlFailInTgtSys() {
        return s1IntereNBOutPrepFailRnlFailInTgtSys;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlFailInTgtSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlFailInTgtSys(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlFailInTgtSys = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlUnknownTgtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlUnknownTgtId() {
        return s1IntereNBOutPrepFailRnlUnknownTgtId;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlUnknownTgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlUnknownTgtId(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlUnknownTgtId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId() {
        return s1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId() {
        return s1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlUnknownPairUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlUnknownPairUeS1ApId() {
        return s1IntereNBOutPrepFailRnlUnknownPairUeS1ApId;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlUnknownPairUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlUnknownPairUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlUnknownPairUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlTX2RelocOverallExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlTX2RelocOverallExpiry() {
        return s1IntereNBOutPrepFailRnlTX2RelocOverallExpiry;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlTX2RelocOverallExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlTX2RelocOverallExpiry(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlTX2RelocOverallExpiry = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason() {
        return s1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlTS1RelocOverallExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlTS1RelocOverallExpiry() {
        return s1IntereNBOutPrepFailRnlTS1RelocOverallExpiry;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlTS1RelocOverallExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlTS1RelocOverallExpiry(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlTS1RelocOverallExpiry = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlTS1RelocPrepExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlTS1RelocPrepExpiry() {
        return s1IntereNBOutPrepFailRnlTS1RelocPrepExpiry;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlTS1RelocPrepExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlTS1RelocPrepExpiry(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlTS1RelocPrepExpiry = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlRadioConnectionWithUELost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlRadioConnectionWithUELost() {
        return s1IntereNBOutPrepFailRnlRadioConnectionWithUELost;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlRadioConnectionWithUELost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlRadioConnectionWithUELost(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlRadioConnectionWithUELost = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlUENotAvlblForPSService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlUENotAvlblForPSService() {
        return s1IntereNBOutPrepFailRnlUENotAvlblForPSService;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlUENotAvlblForPSService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlUENotAvlblForPSService(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlUENotAvlblForPSService = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlRadioResourceNotAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlRadioResourceNotAvlbl() {
        return s1IntereNBOutPrepFailRnlRadioResourceNotAvlbl;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlRadioResourceNotAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlRadioResourceNotAvlbl(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlRadioResourceNotAvlbl = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlFailureInRadioInterface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlFailureInRadioInterface() {
        return s1IntereNBOutPrepFailRnlFailureInRadioInterface;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlFailureInRadioInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlFailureInRadioInterface(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlFailureInRadioInterface = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlInvalidQOSCombination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlInvalidQOSCombination() {
        return s1IntereNBOutPrepFailRnlInvalidQOSCombination;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlInvalidQOSCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlInvalidQOSCombination(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlInvalidQOSCombination = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlInteractionWithOtherProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlInteractionWithOtherProcedure() {
        return s1IntereNBOutPrepFailRnlInteractionWithOtherProcedure;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlInteractionWithOtherProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlInteractionWithOtherProcedure(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlInteractionWithOtherProcedure = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlUnknownERABID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlUnknownERABID() {
        return s1IntereNBOutPrepFailRnlUnknownERABID;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlUnknownERABID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlUnknownERABID(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlUnknownERABID = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlMultipleERABIDInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlMultipleERABIDInstances() {
        return s1IntereNBOutPrepFailRnlMultipleERABIDInstances;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlMultipleERABIDInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlMultipleERABIDInstances(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlMultipleERABIDInstances = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlRedirectionTowards1XRTT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlRedirectionTowards1XRTT() {
        return s1IntereNBOutPrepFailRnlRedirectionTowards1XRTT;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlRedirectionTowards1XRTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlRedirectionTowards1XRTT(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlRedirectionTowards1XRTT = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlNotSupportedQCIVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlNotSupportedQCIVal() {
        return s1IntereNBOutPrepFailRnlNotSupportedQCIVal;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlNotSupportedQCIVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlNotSupportedQCIVal(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlNotSupportedQCIVal = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailTlTransResUnavail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailTlTransResUnavail() {
        return s1IntereNBOutPrepFailTlTransResUnavail;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailTlTransResUnavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailTlTransResUnavail(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailTlTransResUnavail = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailTlTransUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailTlTransUnspecified() {
        return s1IntereNBOutPrepFailTlTransUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailTlTransUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailTlTransUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailTlTransUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailNasUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailNasUnspecified() {
        return s1IntereNBOutPrepFailNasUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailNasUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailNasUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailNasUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailNasAuthenticationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailNasAuthenticationFailure() {
        return s1IntereNBOutPrepFailNasAuthenticationFailure;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailNasAuthenticationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailNasAuthenticationFailure(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailNasAuthenticationFailure = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailNasCSGSubscriptionExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailNasCSGSubscriptionExpiry() {
        return s1IntereNBOutPrepFailNasCSGSubscriptionExpiry;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailNasCSGSubscriptionExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailNasCSGSubscriptionExpiry(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailNasCSGSubscriptionExpiry = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg() {
        return s1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailProtAbstSynErrRej() {
        return s1IntereNBOutPrepFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat() {
        return s1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailProtSemanticErr() {
        return s1IntereNBOutPrepFailProtSemanticErr;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailProtSemanticErr(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailProtUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailProtUnspecified() {
        return s1IntereNBOutPrepFailProtUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailProtUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailProtUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailProtUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailProtTransferSynErr() {
        return s1IntereNBOutPrepFailProtTransferSynErr;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailMiscUnspecified() {
        return s1IntereNBOutPrepFailMiscUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailMiscUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailMiscCtrlProcessingOverload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailMiscCtrlProcessingOverload() {
        return s1IntereNBOutPrepFailMiscCtrlProcessingOverload;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailMiscCtrlProcessingOverload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailMiscCtrlProcessingOverload(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailMiscCtrlProcessingOverload = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc() {
        return s1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailMiscHwFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailMiscHwFailure() {
        return s1IntereNBOutPrepFailMiscHwFailure;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailMiscHwFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailMiscHwFailure(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailMiscHwFailure = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailMiscOMIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailMiscOMIntervention() {
        return s1IntereNBOutPrepFailMiscOMIntervention;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailMiscOMIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailMiscOMIntervention(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailMiscOMIntervention = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailMiscUnknownPLMN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailMiscUnknownPLMN() {
        return s1IntereNBOutPrepFailMiscUnknownPLMN;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailMiscUnknownPLMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailMiscUnknownPLMN(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailMiscUnknownPLMN = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlCellNotAvail() {
        return x2IntereNBOutPrepFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup() {
        return x2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlInvalidMmeGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlInvalidMmeGrpId() {
        return x2IntereNBOutPrepFailRnlInvalidMmeGrpId;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlInvalidMmeGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlInvalidMmeGrpId(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlInvalidMmeGrpId = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlHandoverTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlHandoverTgtNotAllow() {
        return x2IntereNBOutPrepFailRnlHandoverTgtNotAllow;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlHandoverTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlHandoverTgtNotAllow(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlHandoverTgtNotAllow = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell() {
        return x2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlUnknownMmeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlUnknownMmeCode() {
        return x2IntereNBOutPrepFailRnlUnknownMmeCode;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlUnknownMmeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlUnknownMmeCode(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlUnknownMmeCode = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlUnspecified() {
        return x2IntereNBOutPrepFailRnlUnspecified;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlUnspecified(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlPartialHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlPartialHO() {
        return x2IntereNBOutPrepFailRnlPartialHO;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlPartialHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlPartialHO(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlPartialHO = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlTrelocprepExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlTrelocprepExpiry() {
        return x2IntereNBOutPrepFailRnlTrelocprepExpiry;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlTrelocprepExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlTrelocprepExpiry(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlTrelocprepExpiry = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlTX2RelocOverallExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlTX2RelocOverallExpiry() {
        return x2IntereNBOutPrepFailRnlTX2RelocOverallExpiry;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlTX2RelocOverallExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlTX2RelocOverallExpiry(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlTX2RelocOverallExpiry = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId() {
        return x2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId() {
        return x2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId() {
        return x2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlSwitchOffOngoing() {
        return x2IntereNBOutPrepFailRnlSwitchOffOngoing;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlSwitchOffOngoing(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlValueOutofAllowedRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlValueOutofAllowedRange() {
        return x2IntereNBOutPrepFailRnlValueOutofAllowedRange;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlValueOutofAllowedRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlValueOutofAllowedRange(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlValueOutofAllowedRange = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlMultipleERABIDInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlMultipleERABIDInstances() {
        return x2IntereNBOutPrepFailRnlMultipleERABIDInstances;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlMultipleERABIDInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlMultipleERABIDInstances(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlMultipleERABIDInstances = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailRnlNotSupportedQCIVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailRnlNotSupportedQCIVal() {
        return x2IntereNBOutPrepFailRnlNotSupportedQCIVal;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailRnlNotSupportedQCIVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailRnlNotSupportedQCIVal(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailRnlNotSupportedQCIVal = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailTnlTransResUnAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailTnlTransResUnAvail() {
        return x2IntereNBOutPrepFailTnlTransResUnAvail;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailTnlTransResUnAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailTnlTransResUnAvail(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailTnlTransResUnAvail = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailTnlTransSyntaxError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailTnlTransSyntaxError() {
        return x2IntereNBOutPrepFailTnlTransSyntaxError;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailTnlTransSyntaxError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailTnlTransSyntaxError(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailTnlTransSyntaxError = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg() {
        return x2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailProtAbstSynErrRej() {
        return x2IntereNBOutPrepFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat() {
        return x2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailProtSemanticErr() {
        return x2IntereNBOutPrepFailProtSemanticErr;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailProtSemanticErr(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailProtTransferSynErr() {
        return x2IntereNBOutPrepFailProtTransferSynErr;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailMiscControlProcessingOverload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailMiscControlProcessingOverload() {
        return x2IntereNBOutPrepFailMiscControlProcessingOverload;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailMiscControlProcessingOverload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailMiscControlProcessingOverload(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailMiscControlProcessingOverload = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailMiscHwFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailMiscHwFailure() {
        return x2IntereNBOutPrepFailMiscHwFailure;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailMiscHwFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailMiscHwFailure(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailMiscHwFailure = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailMiscOMIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailMiscOMIntervention() {
        return x2IntereNBOutPrepFailMiscOMIntervention;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailMiscOMIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailMiscOMIntervention(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailMiscOMIntervention = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailMiscEnoughProcessingResource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailMiscEnoughProcessingResource() {
        return x2IntereNBOutPrepFailMiscEnoughProcessingResource;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailMiscEnoughProcessingResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailMiscEnoughProcessingResource(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailMiscEnoughProcessingResource = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailMiscUnspecified() {
        return x2IntereNBOutPrepFailMiscUnspecified;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailMiscUnspecified(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailUnknown() {
        return x2IntereNBOutPrepFailUnknown;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailUnknown(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailUnknown = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlCellNotAvail() {
        return s1IntereNBOutExecFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup() {
        return s1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlFailInRadioInfProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlFailInRadioInfProc() {
        return s1IntereNBOutExecFailRnlFailInRadioInfProc;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlFailInRadioInfProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlFailInRadioInfProc(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlFailInRadioInfProc = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlTgtNotAllow() {
        return s1IntereNBOutExecFailRnlTgtNotAllow;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlTgtNotAllow(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlTgtNotAllow = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlInvalidCsgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlInvalidCsgId() {
        return s1IntereNBOutExecFailRnlInvalidCsgId;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlInvalidCsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlInvalidCsgId(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlInvalidCsgId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell() {
        return s1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlUnspecified() {
        return s1IntereNBOutExecFailRnlUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlHOCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlHOCancelled() {
        return s1IntereNBOutExecFailRnlHOCancelled;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlHOCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlHOCancelled(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlHOCancelled = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlFailInTgtSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlFailInTgtSys() {
        return s1IntereNBOutExecFailRnlFailInTgtSys;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlFailInTgtSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlFailInTgtSys(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlFailInTgtSys = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlUnknownTgtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlUnknownTgtId() {
        return s1IntereNBOutExecFailRnlUnknownTgtId;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlUnknownTgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlUnknownTgtId(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlUnknownTgtId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlUnknownMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlUnknownMmeUeS1ApId() {
        return s1IntereNBOutExecFailRnlUnknownMmeUeS1ApId;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlUnknownMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlUnknownMmeUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlUnknownMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlUnknownEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlUnknownEnbUeS1ApId() {
        return s1IntereNBOutExecFailRnlUnknownEnbUeS1ApId;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlUnknownEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlUnknownEnbUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlUnknownEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlUnknownPairUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlUnknownPairUeS1ApId() {
        return s1IntereNBOutExecFailRnlUnknownPairUeS1ApId;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlUnknownPairUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlUnknownPairUeS1ApId(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlUnknownPairUeS1ApId = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlTX2RelocOverallExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlTX2RelocOverallExpiry() {
        return s1IntereNBOutExecFailRnlTX2RelocOverallExpiry;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlTX2RelocOverallExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlTX2RelocOverallExpiry(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlTX2RelocOverallExpiry = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason() {
        return s1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlTS1RelocOverallExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlTS1RelocOverallExpiry() {
        return s1IntereNBOutExecFailRnlTS1RelocOverallExpiry;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlTS1RelocOverallExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlTS1RelocOverallExpiry(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlTS1RelocOverallExpiry = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlTS1RelocPrepExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlTS1RelocPrepExpiry() {
        return s1IntereNBOutExecFailRnlTS1RelocPrepExpiry;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlTS1RelocPrepExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlTS1RelocPrepExpiry(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlTS1RelocPrepExpiry = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlRadioConnectionWithUELost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlRadioConnectionWithUELost() {
        return s1IntereNBOutExecFailRnlRadioConnectionWithUELost;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlRadioConnectionWithUELost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlRadioConnectionWithUELost(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlRadioConnectionWithUELost = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlUENotAvlblForPSService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlUENotAvlblForPSService() {
        return s1IntereNBOutExecFailRnlUENotAvlblForPSService;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlUENotAvlblForPSService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlUENotAvlblForPSService(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlUENotAvlblForPSService = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlRadioResourceNotAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlRadioResourceNotAvlbl() {
        return s1IntereNBOutExecFailRnlRadioResourceNotAvlbl;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlRadioResourceNotAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlRadioResourceNotAvlbl(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlRadioResourceNotAvlbl = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlFailureInRadioInterface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlFailureInRadioInterface() {
        return s1IntereNBOutExecFailRnlFailureInRadioInterface;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlFailureInRadioInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlFailureInRadioInterface(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlFailureInRadioInterface = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlInvalidQOSCombination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlInvalidQOSCombination() {
        return s1IntereNBOutExecFailRnlInvalidQOSCombination;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlInvalidQOSCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlInvalidQOSCombination(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlInvalidQOSCombination = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlInteractionWithOtherProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlInteractionWithOtherProcedure() {
        return s1IntereNBOutExecFailRnlInteractionWithOtherProcedure;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlInteractionWithOtherProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlInteractionWithOtherProcedure(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlInteractionWithOtherProcedure = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlUnknownERABID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlUnknownERABID() {
        return s1IntereNBOutExecFailRnlUnknownERABID;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlUnknownERABID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlUnknownERABID(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlUnknownERABID = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlMultipleERABIDInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlMultipleERABIDInstances() {
        return s1IntereNBOutExecFailRnlMultipleERABIDInstances;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlMultipleERABIDInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlMultipleERABIDInstances(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlMultipleERABIDInstances = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlRedirectionTowards1XRTT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlRedirectionTowards1XRTT() {
        return s1IntereNBOutExecFailRnlRedirectionTowards1XRTT;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlRedirectionTowards1XRTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlRedirectionTowards1XRTT(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlRedirectionTowards1XRTT = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlNotSupportedQCIVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlNotSupportedQCIVal() {
        return s1IntereNBOutExecFailRnlNotSupportedQCIVal;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlNotSupportedQCIVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlNotSupportedQCIVal(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlNotSupportedQCIVal = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailTlTransResUnavail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailTlTransResUnavail() {
        return s1IntereNBOutExecFailTlTransResUnavail;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailTlTransResUnavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailTlTransResUnavail(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailTlTransResUnavail = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailTlTransUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailTlTransUnspecified() {
        return s1IntereNBOutExecFailTlTransUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailTlTransUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailTlTransUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailTlTransUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailNasUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailNasUnspecified() {
        return s1IntereNBOutExecFailNasUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailNasUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailNasUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailNasUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailNasAuthenticationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailNasAuthenticationFailure() {
        return s1IntereNBOutExecFailNasAuthenticationFailure;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailNasAuthenticationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailNasAuthenticationFailure(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailNasAuthenticationFailure = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailNasCSGSubscriptionExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailNasCSGSubscriptionExpiry() {
        return s1IntereNBOutExecFailNasCSGSubscriptionExpiry;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailNasCSGSubscriptionExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailNasCSGSubscriptionExpiry(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailNasCSGSubscriptionExpiry = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg() {
        return s1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailProtAbstSynErrRej() {
        return s1IntereNBOutExecFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat() {
        return s1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailProtSemanticErr() {
        return s1IntereNBOutExecFailProtSemanticErr;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailProtSemanticErr(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailProtTransferSynErr() {
        return s1IntereNBOutExecFailProtTransferSynErr;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailProtUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailProtUnspecified() {
        return s1IntereNBOutExecFailProtUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailProtUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailProtUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailProtUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailMiscUnspecified() {
        return s1IntereNBOutExecFailMiscUnspecified;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailMiscUnspecified(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailMiscCtrlProcessingOverload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailMiscCtrlProcessingOverload() {
        return s1IntereNBOutExecFailMiscCtrlProcessingOverload;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailMiscCtrlProcessingOverload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailMiscCtrlProcessingOverload(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailMiscCtrlProcessingOverload = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc() {
        return s1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailMiscHwFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailMiscHwFailure() {
        return s1IntereNBOutExecFailMiscHwFailure;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailMiscHwFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailMiscHwFailure(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailMiscHwFailure = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailMiscOMIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailMiscOMIntervention() {
        return s1IntereNBOutExecFailMiscOMIntervention;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailMiscOMIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailMiscOMIntervention(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailMiscOMIntervention = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailMiscUnknownPLMN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailMiscUnknownPLMN() {
        return s1IntereNBOutExecFailMiscUnknownPLMN;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailMiscUnknownPLMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailMiscUnknownPLMN(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailMiscUnknownPLMN = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlCellNotAvail() {
        return x2IntereNBOutExecFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup() {
        return x2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlInvalidMmeGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlInvalidMmeGrpId() {
        return x2IntereNBOutExecFailRnlInvalidMmeGrpId;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlInvalidMmeGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlInvalidMmeGrpId(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlInvalidMmeGrpId = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlHandoverTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlHandoverTgtNotAllow() {
        return x2IntereNBOutExecFailRnlHandoverTgtNotAllow;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlHandoverTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlHandoverTgtNotAllow(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlHandoverTgtNotAllow = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell() {
        return x2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlUnknownMmeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlUnknownMmeCode() {
        return x2IntereNBOutExecFailRnlUnknownMmeCode;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlUnknownMmeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlUnknownMmeCode(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlUnknownMmeCode = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlUnspecified() {
        return x2IntereNBOutExecFailRnlUnspecified;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlUnspecified(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlPartialHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlPartialHO() {
        return x2IntereNBOutExecFailRnlPartialHO;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlPartialHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlPartialHO(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlPartialHO = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlTrelocprepExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlTrelocprepExpiry() {
        return x2IntereNBOutExecFailRnlTrelocprepExpiry;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlTrelocprepExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlTrelocprepExpiry(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlTrelocprepExpiry = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlTX2RelocOverallExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlTX2RelocOverallExpiry() {
        return x2IntereNBOutExecFailRnlTX2RelocOverallExpiry;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlTX2RelocOverallExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlTX2RelocOverallExpiry(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlTX2RelocOverallExpiry = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlUnknownNewEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlUnknownNewEnbX2ApId() {
        return x2IntereNBOutExecFailRnlUnknownNewEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlUnknownNewEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlUnknownNewEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlUnknownNewEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlUnknownOldEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlUnknownOldEnbX2ApId() {
        return x2IntereNBOutExecFailRnlUnknownOldEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlUnknownOldEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlUnknownOldEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlUnknownOldEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlUnknownPairEnbX2ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlUnknownPairEnbX2ApId() {
        return x2IntereNBOutExecFailRnlUnknownPairEnbX2ApId;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlUnknownPairEnbX2ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlUnknownPairEnbX2ApId(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlUnknownPairEnbX2ApId = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlSwitchOffOngoing() {
        return x2IntereNBOutExecFailRnlSwitchOffOngoing;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlSwitchOffOngoing(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlValueOutofAllowedRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlValueOutofAllowedRange() {
        return x2IntereNBOutExecFailRnlValueOutofAllowedRange;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlValueOutofAllowedRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlValueOutofAllowedRange(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlValueOutofAllowedRange = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlMultipleERABIDInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlMultipleERABIDInstances() {
        return x2IntereNBOutExecFailRnlMultipleERABIDInstances;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlMultipleERABIDInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlMultipleERABIDInstances(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlMultipleERABIDInstances = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRnlNotSupportedQCIVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRnlNotSupportedQCIVal() {
        return x2IntereNBOutExecFailRnlNotSupportedQCIVal;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRnlNotSupportedQCIVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRnlNotSupportedQCIVal(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRnlNotSupportedQCIVal = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailTnlTransResUnAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailTnlTransResUnAvail() {
        return x2IntereNBOutExecFailTnlTransResUnAvail;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailTnlTransResUnAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailTnlTransResUnAvail(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailTnlTransResUnAvail = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg() {
        return x2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailProtAbstSynErrRej() {
        return x2IntereNBOutExecFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat() {
        return x2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailProtSemanticErr() {
        return x2IntereNBOutExecFailProtSemanticErr;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailProtSemanticErr(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailProtTransferSynErr() {
        return x2IntereNBOutExecFailProtTransferSynErr;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailMiscControlProcessingOverload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailMiscControlProcessingOverload() {
        return x2IntereNBOutExecFailMiscControlProcessingOverload;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailMiscControlProcessingOverload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailMiscControlProcessingOverload(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailMiscControlProcessingOverload = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailMiscHwFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailMiscHwFailure() {
        return x2IntereNBOutExecFailMiscHwFailure;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailMiscHwFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailMiscHwFailure(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailMiscHwFailure = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailMiscOMIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailMiscOMIntervention() {
        return x2IntereNBOutExecFailMiscOMIntervention;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailMiscOMIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailMiscOMIntervention(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailMiscOMIntervention = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailMiscEnoughProcessingResource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailMiscEnoughProcessingResource() {
        return x2IntereNBOutExecFailMiscEnoughProcessingResource;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailMiscEnoughProcessingResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailMiscEnoughProcessingResource(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailMiscEnoughProcessingResource = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailMiscUnspecified() {
        return x2IntereNBOutExecFailMiscUnspecified;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailMiscUnspecified(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailMiscUnspecified = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailUnknown() {
        return x2IntereNBOutExecFailUnknown;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailUnknown(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailUnknown = value;
    }

    /**
     * Gets the value of the interFrameOutAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFrameOutAtt() {
        return interFrameOutAtt;
    }

    /**
     * Sets the value of the interFrameOutAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFrameOutAtt(JAXBElement<Integer> value) {
        this.interFrameOutAtt = value;
    }

    /**
     * Gets the value of the interFrameOutSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFrameOutSucc() {
        return interFrameOutSucc;
    }

    /**
     * Sets the value of the interFrameOutSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFrameOutSucc(JAXBElement<Integer> value) {
        this.interFrameOutSucc = value;
    }

    /**
     * Gets the value of the intraFreqInterEnbOutPrepAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqInterEnbOutPrepAtt() {
        return intraFreqInterEnbOutPrepAtt;
    }

    /**
     * Sets the value of the intraFreqInterEnbOutPrepAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqInterEnbOutPrepAtt(JAXBElement<Integer> value) {
        this.intraFreqInterEnbOutPrepAtt = value;
    }

    /**
     * Gets the value of the interFreqInterEnbOutPrepAtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqInterEnbOutPrepAtt() {
        return interFreqInterEnbOutPrepAtt;
    }

    /**
     * Sets the value of the interFreqInterEnbOutPrepAtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqInterEnbOutPrepAtt(JAXBElement<Integer> value) {
        this.interFreqInterEnbOutPrepAtt = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailRnlPartialHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailRnlPartialHO() {
        return s1IntereNBOutPrepFailRnlPartialHO;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailRnlPartialHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailRnlPartialHO(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailRnlPartialHO = value;
    }

    /**
     * Gets the value of the s1IntereNBOutPrepFailCritDiag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutPrepFailCritDiag() {
        return s1IntereNBOutPrepFailCritDiag;
    }

    /**
     * Sets the value of the s1IntereNBOutPrepFailCritDiag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutPrepFailCritDiag(JAXBElement<Integer> value) {
        this.s1IntereNBOutPrepFailCritDiag = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRnlPartialHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRnlPartialHO() {
        return s1IntereNBOutExecFailRnlPartialHO;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRnlPartialHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRnlPartialHO(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRnlPartialHO = value;
    }

    /**
     * Gets the value of the s1IntereNBOutExecFailRrcSignalHoFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1IntereNBOutExecFailRrcSignalHoFail() {
        return s1IntereNBOutExecFailRrcSignalHoFail;
    }

    /**
     * Sets the value of the s1IntereNBOutExecFailRrcSignalHoFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1IntereNBOutExecFailRrcSignalHoFail(JAXBElement<Integer> value) {
        this.s1IntereNBOutExecFailRrcSignalHoFail = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailTnlTransUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailTnlTransUnspecified() {
        return x2IntereNBOutPrepFailTnlTransUnspecified;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailTnlTransUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailTnlTransUnspecified(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailTnlTransUnspecified = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailProtUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailProtUnspecified() {
        return x2IntereNBOutPrepFailProtUnspecified;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailProtUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailProtUnspecified(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailProtUnspecified = value;
    }

    /**
     * Gets the value of the x2IntereNBOutPrepFailCritDiag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutPrepFailCritDiag() {
        return x2IntereNBOutPrepFailCritDiag;
    }

    /**
     * Sets the value of the x2IntereNBOutPrepFailCritDiag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutPrepFailCritDiag(JAXBElement<Integer> value) {
        this.x2IntereNBOutPrepFailCritDiag = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailTnlTransUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailTnlTransUnspecified() {
        return x2IntereNBOutExecFailTnlTransUnspecified;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailTnlTransUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailTnlTransUnspecified(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailTnlTransUnspecified = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailProtUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailProtUnspecified() {
        return x2IntereNBOutExecFailProtUnspecified;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailProtUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailProtUnspecified(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailProtUnspecified = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailRrcSignalHoFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailRrcSignalHoFail() {
        return x2IntereNBOutExecFailRrcSignalHoFail;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailRrcSignalHoFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailRrcSignalHoFail(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailRrcSignalHoFail = value;
    }

    /**
     * Gets the value of the x2IntereNBOutExecFailPathSwitchTmrExpr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntereNBOutExecFailPathSwitchTmrExpr() {
        return x2IntereNBOutExecFailPathSwitchTmrExpr;
    }

    /**
     * Sets the value of the x2IntereNBOutExecFailPathSwitchTmrExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntereNBOutExecFailPathSwitchTmrExpr(JAXBElement<Integer> value) {
        this.x2IntereNBOutExecFailPathSwitchTmrExpr = value;
    }

}
