package DMTool.Measurement;


public enum TriggerEvents {
	EVENT_A1("EVENT A1"),
	EVENT_A2("EVENT A2"),
	EVENT_A3("EVENT A3"),
	EVENT_A4("EVENT A4"),
	EVENT_A5("EVENT A5"),
	PERIODIC("PERIODIC");

	private final String value;

	TriggerEvents(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerEvents fromValue(String v) {
        for (TriggerEvents c: TriggerEvents.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
	
}
