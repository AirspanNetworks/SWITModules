package DMTool.Measurement;

public class MeasurementCfgReport {
	private int id;
	private TriggerEvents event_trigger;
	private String info_trigger;
	private String qty;
	private int max;
	private String interval;
	private String amount;
	private String sI;
	private String rx_tx;
		
	public MeasurementCfgReport(int id, TriggerEvents event_trigger, String info_trigger, String qty, int max, String interval, String amount, String sI,
			String rx_tx) {
		setId(id);
		setEvent_trigger(event_trigger);
		setInfo_trigger(info_trigger);
		setQty(qty);
		setMax(max);
		setInterval(interval);
		setAmount(amount);
		setsI(sI);
		setRx_tx(rx_tx);
	}
	
	public String getInfo_trigger() {
		return info_trigger;
	}

	public void setInfo_trigger(String info_trigger) {
		this.info_trigger = info_trigger;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public TriggerEvents getEvent_trigger() {
		return event_trigger;
	}

	public void setEvent_trigger(TriggerEvents event_trigger) {
		this.event_trigger = event_trigger;
	}

	public String getsI() {
		return sI;
	}

	public void setsI(String sI) {
		this.sI = sI;
	}

	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getRx_tx() {
		return rx_tx;
	}
	public void setRx_tx(String rx_tx) {
		this.rx_tx = rx_tx;
	}
}
