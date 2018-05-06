package Netspan.API.Lte;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

public class AlarmInfo {
	public BigInteger alarmId;
	public String alarmType;
	public String alarmSource;
	public String alarmInfo;
	public Integer severity;
	public XMLGregorianCalendar firstReceived;
	public XMLGregorianCalendar lastReceived;
	public Integer alarmCount;
	public boolean acknowledged;
	public String userName;

	@Override
	public String toString() {
		String res = "[ID=" + alarmId + ", Type=" + alarmType + ", Source=" + alarmSource + ", Info=" + alarmInfo
				+ ", Severity=" + severity + ", Count=" + alarmCount + ", acknowledged=" + acknowledged + ", UserName="
				+ userName + "]";
		return res;
	}
}