package DMTool;class agscEvtEvt {	public static int _id = -1;	public static final String _name = "Evt";	public static int notify(final byte[] buf,EvtClient lis) {		int st = Status.STATUS_OK;		OutValue<Integer> _offset = new OutValue<Integer>(0);		// Declaration of output parameters		short[] payload;		long evtSeqNumber;		int arrSize = (int) Util.Copy32FromBuffer(buf, _offset);				payload = new short[arrSize];			for (int i = 0; i<payload.length - 2; i++) {			payload[i] = (short) Util.Copy8FromBuffer(buf, _offset);		}				try{			evtSeqNumber = (long) Util.Copy16FromBuffer(buf, _offset);		}catch(Exception e){			evtSeqNumber = 0;		}		lis.Evt(payload);		return Status.STATUS_OK;	}}