
package Netspan.NBI_14_50.API.Statistics;

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
 *         &lt;element name="X2IntraFreqInCompFailRnlFailInTgtSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlUnknownTgtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlUnknownMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlUnknownEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlUnknownPairUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlInteractWithotherProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRnlUnknownErabId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="X2IntraFreqInCompFailMiscunknownPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailRelocExecTmrExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailPathSwitchTmrExpr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2IntraFreqInCompFailunknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlFailInTgtSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlUnknownTgtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlUnknownMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlUnknownEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlUnknownPairUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlInteractWithotherProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="X2InterFreqInCompFailRnlUnknownErabId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="X2InterFreqInCompFailMiscunknownPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="S1UnknFreqInPrepFailRnlCellNotAvail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlFailInRadioInfProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlTgtNotAllow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlInvalidCsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlHOCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlFailInTgtSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlUnknownTgtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlUnknownMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlUnknownEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailRnlUnknownPairUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailTlTransResUnavail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailNasUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailProtAbstSynErrRej" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailProtSemanticErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailProtTransferSynErr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S1UnknFreqInPrepFailMiscUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "x2IntraFreqInCompFailRnlFailInTgtSys",
    "x2IntraFreqInCompFailRnlUnknownTgtId",
    "x2IntraFreqInCompFailRnlUnknownMmeUeS1ApId",
    "x2IntraFreqInCompFailRnlUnknownEnbUeS1ApId",
    "x2IntraFreqInCompFailRnlUnknownPairUeS1ApId",
    "x2IntraFreqInCompFailRnlInteractWithotherProc",
    "x2IntraFreqInCompFailRnlUnknownErabId",
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
    "x2IntraFreqInCompFailMiscunknownPlmn",
    "x2IntraFreqInCompFailRelocExecTmrExp",
    "x2IntraFreqInCompFailPathSwitchTmrExpr",
    "x2IntraFreqInCompFailunknown",
    "x2InterFreqInCompFailRnlFailInTgtSys",
    "x2InterFreqInCompFailRnlUnknownTgtId",
    "x2InterFreqInCompFailRnlUnknownMmeUeS1ApId",
    "x2InterFreqInCompFailRnlUnknownEnbUeS1ApId",
    "x2InterFreqInCompFailRnlUnknownPairUeS1ApId",
    "x2InterFreqInCompFailRnlInteractWithotherProc",
    "x2InterFreqInCompFailRnlUnknownErabId",
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
    "x2InterFreqInCompFailMiscunknownPlmn",
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
    "s1UnknFreqInPrepFailRnlCellNotAvail",
    "s1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup",
    "s1UnknFreqInPrepFailRnlFailInRadioInfProc",
    "s1UnknFreqInPrepFailRnlTgtNotAllow",
    "s1UnknFreqInPrepFailRnlInvalidCsgId",
    "s1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell",
    "s1UnknFreqInPrepFailRnlUnspecified",
    "s1UnknFreqInPrepFailRnlHOCancelled",
    "s1UnknFreqInPrepFailRnlFailInTgtSys",
    "s1UnknFreqInPrepFailRnlUnknownTgtId",
    "s1UnknFreqInPrepFailRnlUnknownMmeUeS1ApId",
    "s1UnknFreqInPrepFailRnlUnknownEnbUeS1ApId",
    "s1UnknFreqInPrepFailRnlUnknownPairUeS1ApId",
    "s1UnknFreqInPrepFailTlTransResUnavail",
    "s1UnknFreqInPrepFailNasUnspecified",
    "s1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg",
    "s1UnknFreqInPrepFailProtAbstSynErrRej",
    "s1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat",
    "s1UnknFreqInPrepFailProtSemanticErr",
    "s1UnknFreqInPrepFailProtTransferSynErr",
    "s1UnknFreqInPrepFailMiscUnspecified",
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
    "hoMroOutWrongCell"
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
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlFailInTgtSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlFailInTgtSys;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlUnknownTgtId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlUnknownTgtId;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlUnknownMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlUnknownMmeUeS1ApId;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlUnknownEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlUnknownEnbUeS1ApId;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlUnknownPairUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlUnknownPairUeS1ApId;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlInteractWithotherProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlInteractWithotherProc;
    @XmlElementRef(name = "X2IntraFreqInCompFailRnlUnknownErabId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRnlUnknownErabId;
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
    @XmlElementRef(name = "X2IntraFreqInCompFailMiscunknownPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailMiscunknownPlmn;
    @XmlElementRef(name = "X2IntraFreqInCompFailRelocExecTmrExp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailRelocExecTmrExp;
    @XmlElementRef(name = "X2IntraFreqInCompFailPathSwitchTmrExpr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailPathSwitchTmrExpr;
    @XmlElementRef(name = "X2IntraFreqInCompFailunknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2IntraFreqInCompFailunknown;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlFailInTgtSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlFailInTgtSys;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlUnknownTgtId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlUnknownTgtId;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlUnknownMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlUnknownMmeUeS1ApId;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlUnknownEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlUnknownEnbUeS1ApId;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlUnknownPairUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlUnknownPairUeS1ApId;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlInteractWithotherProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlInteractWithotherProc;
    @XmlElementRef(name = "X2InterFreqInCompFailRnlUnknownErabId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailRnlUnknownErabId;
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
    @XmlElementRef(name = "X2InterFreqInCompFailMiscunknownPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2InterFreqInCompFailMiscunknownPlmn;
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
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlCellNotAvail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlCellNotAvail;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlFailInRadioInfProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlFailInRadioInfProc;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlTgtNotAllow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlTgtNotAllow;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlInvalidCsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlInvalidCsgId;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlUnspecified;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlHOCancelled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlHOCancelled;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlFailInTgtSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlFailInTgtSys;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlUnknownTgtId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlUnknownTgtId;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlUnknownMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlUnknownMmeUeS1ApId;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlUnknownEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlUnknownEnbUeS1ApId;
    @XmlElementRef(name = "S1UnknFreqInPrepFailRnlUnknownPairUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailRnlUnknownPairUeS1ApId;
    @XmlElementRef(name = "S1UnknFreqInPrepFailTlTransResUnavail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailTlTransResUnavail;
    @XmlElementRef(name = "S1UnknFreqInPrepFailNasUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailNasUnspecified;
    @XmlElementRef(name = "S1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    @XmlElementRef(name = "S1UnknFreqInPrepFailProtAbstSynErrRej", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailProtAbstSynErrRej;
    @XmlElementRef(name = "S1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat;
    @XmlElementRef(name = "S1UnknFreqInPrepFailProtSemanticErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailProtSemanticErr;
    @XmlElementRef(name = "S1UnknFreqInPrepFailProtTransferSynErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailProtTransferSynErr;
    @XmlElementRef(name = "S1UnknFreqInPrepFailMiscUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UnknFreqInPrepFailMiscUnspecified;
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
     * Gets the value of the x2IntraFreqInCompFailRnlFailInTgtSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlFailInTgtSys() {
        return x2IntraFreqInCompFailRnlFailInTgtSys;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlFailInTgtSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlFailInTgtSys(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlFailInTgtSys = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlUnknownTgtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlUnknownTgtId() {
        return x2IntraFreqInCompFailRnlUnknownTgtId;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlUnknownTgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlUnknownTgtId(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlUnknownTgtId = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlUnknownMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlUnknownMmeUeS1ApId() {
        return x2IntraFreqInCompFailRnlUnknownMmeUeS1ApId;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlUnknownMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlUnknownMmeUeS1ApId(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlUnknownMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlUnknownEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlUnknownEnbUeS1ApId() {
        return x2IntraFreqInCompFailRnlUnknownEnbUeS1ApId;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlUnknownEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlUnknownEnbUeS1ApId(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlUnknownEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlUnknownPairUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlUnknownPairUeS1ApId() {
        return x2IntraFreqInCompFailRnlUnknownPairUeS1ApId;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlUnknownPairUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlUnknownPairUeS1ApId(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlUnknownPairUeS1ApId = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlInteractWithotherProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlInteractWithotherProc() {
        return x2IntraFreqInCompFailRnlInteractWithotherProc;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlInteractWithotherProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlInteractWithotherProc(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlInteractWithotherProc = value;
    }

    /**
     * Gets the value of the x2IntraFreqInCompFailRnlUnknownErabId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailRnlUnknownErabId() {
        return x2IntraFreqInCompFailRnlUnknownErabId;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailRnlUnknownErabId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailRnlUnknownErabId(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailRnlUnknownErabId = value;
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
     * Gets the value of the x2IntraFreqInCompFailMiscunknownPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2IntraFreqInCompFailMiscunknownPlmn() {
        return x2IntraFreqInCompFailMiscunknownPlmn;
    }

    /**
     * Sets the value of the x2IntraFreqInCompFailMiscunknownPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2IntraFreqInCompFailMiscunknownPlmn(JAXBElement<Integer> value) {
        this.x2IntraFreqInCompFailMiscunknownPlmn = value;
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
     * Gets the value of the x2InterFreqInCompFailRnlFailInTgtSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlFailInTgtSys() {
        return x2InterFreqInCompFailRnlFailInTgtSys;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlFailInTgtSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlFailInTgtSys(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlFailInTgtSys = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlUnknownTgtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlUnknownTgtId() {
        return x2InterFreqInCompFailRnlUnknownTgtId;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlUnknownTgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlUnknownTgtId(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlUnknownTgtId = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlUnknownMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlUnknownMmeUeS1ApId() {
        return x2InterFreqInCompFailRnlUnknownMmeUeS1ApId;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlUnknownMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlUnknownMmeUeS1ApId(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlUnknownMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlUnknownEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlUnknownEnbUeS1ApId() {
        return x2InterFreqInCompFailRnlUnknownEnbUeS1ApId;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlUnknownEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlUnknownEnbUeS1ApId(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlUnknownEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlUnknownPairUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlUnknownPairUeS1ApId() {
        return x2InterFreqInCompFailRnlUnknownPairUeS1ApId;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlUnknownPairUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlUnknownPairUeS1ApId(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlUnknownPairUeS1ApId = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlInteractWithotherProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlInteractWithotherProc() {
        return x2InterFreqInCompFailRnlInteractWithotherProc;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlInteractWithotherProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlInteractWithotherProc(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlInteractWithotherProc = value;
    }

    /**
     * Gets the value of the x2InterFreqInCompFailRnlUnknownErabId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailRnlUnknownErabId() {
        return x2InterFreqInCompFailRnlUnknownErabId;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailRnlUnknownErabId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailRnlUnknownErabId(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailRnlUnknownErabId = value;
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
     * Gets the value of the x2InterFreqInCompFailMiscunknownPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2InterFreqInCompFailMiscunknownPlmn() {
        return x2InterFreqInCompFailMiscunknownPlmn;
    }

    /**
     * Sets the value of the x2InterFreqInCompFailMiscunknownPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2InterFreqInCompFailMiscunknownPlmn(JAXBElement<Integer> value) {
        this.x2InterFreqInCompFailMiscunknownPlmn = value;
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
     * Gets the value of the s1UnknFreqInPrepFailRnlCellNotAvail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlCellNotAvail() {
        return s1UnknFreqInPrepFailRnlCellNotAvail;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlCellNotAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlCellNotAvail(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlCellNotAvail = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup() {
        return s1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlEncAndOrIntgProtectAlgoNotSup = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlFailInRadioInfProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlFailInRadioInfProc() {
        return s1UnknFreqInPrepFailRnlFailInRadioInfProc;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlFailInRadioInfProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlFailInRadioInfProc(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlFailInRadioInfProc = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlTgtNotAllow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlTgtNotAllow() {
        return s1UnknFreqInPrepFailRnlTgtNotAllow;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlTgtNotAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlTgtNotAllow(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlTgtNotAllow = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlInvalidCsgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlInvalidCsgId() {
        return s1UnknFreqInPrepFailRnlInvalidCsgId;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlInvalidCsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlInvalidCsgId(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlInvalidCsgId = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell() {
        return s1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlNoRadioResAvailInTgtCell = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlUnspecified() {
        return s1UnknFreqInPrepFailRnlUnspecified;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlUnspecified(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlUnspecified = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlHOCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlHOCancelled() {
        return s1UnknFreqInPrepFailRnlHOCancelled;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlHOCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlHOCancelled(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlHOCancelled = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlFailInTgtSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlFailInTgtSys() {
        return s1UnknFreqInPrepFailRnlFailInTgtSys;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlFailInTgtSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlFailInTgtSys(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlFailInTgtSys = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlUnknownTgtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlUnknownTgtId() {
        return s1UnknFreqInPrepFailRnlUnknownTgtId;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlUnknownTgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlUnknownTgtId(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlUnknownTgtId = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlUnknownMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlUnknownMmeUeS1ApId() {
        return s1UnknFreqInPrepFailRnlUnknownMmeUeS1ApId;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlUnknownMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlUnknownMmeUeS1ApId(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlUnknownMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlUnknownEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlUnknownEnbUeS1ApId() {
        return s1UnknFreqInPrepFailRnlUnknownEnbUeS1ApId;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlUnknownEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlUnknownEnbUeS1ApId(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlUnknownEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailRnlUnknownPairUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailRnlUnknownPairUeS1ApId() {
        return s1UnknFreqInPrepFailRnlUnknownPairUeS1ApId;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailRnlUnknownPairUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailRnlUnknownPairUeS1ApId(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailRnlUnknownPairUeS1ApId = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailTlTransResUnavail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailTlTransResUnavail() {
        return s1UnknFreqInPrepFailTlTransResUnavail;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailTlTransResUnavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailTlTransResUnavail(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailTlTransResUnavail = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailNasUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailNasUnspecified() {
        return s1UnknFreqInPrepFailNasUnspecified;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailNasUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailNasUnspecified(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailNasUnspecified = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg() {
        return s1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailProtAbstSynErrFlsConstructMsg = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailProtAbstSynErrRej() {
        return s1UnknFreqInPrepFailProtAbstSynErrRej;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailProtAbstSynErrRej property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailProtAbstSynErrRej(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailProtAbstSynErrRej = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat() {
        return s1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailProtMsgNotCompatibleWithRcvrStat = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailProtSemanticErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailProtSemanticErr() {
        return s1UnknFreqInPrepFailProtSemanticErr;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailProtSemanticErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailProtSemanticErr(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailProtSemanticErr = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailProtTransferSynErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailProtTransferSynErr() {
        return s1UnknFreqInPrepFailProtTransferSynErr;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailProtTransferSynErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailProtTransferSynErr(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailProtTransferSynErr = value;
    }

    /**
     * Gets the value of the s1UnknFreqInPrepFailMiscUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UnknFreqInPrepFailMiscUnspecified() {
        return s1UnknFreqInPrepFailMiscUnspecified;
    }

    /**
     * Sets the value of the s1UnknFreqInPrepFailMiscUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UnknFreqInPrepFailMiscUnspecified(JAXBElement<Integer> value) {
        this.s1UnknFreqInPrepFailMiscUnspecified = value;
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

}
