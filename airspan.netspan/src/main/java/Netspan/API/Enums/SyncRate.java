package Netspan.API.Enums;

public enum SyncRate {
	ONE_HUNDRED_TWENTY_EIGHT("128"), SIXTY_FOUR("64"), THIRTY_TWO("32"), SIXTEEN("16");

	private final String value;

	SyncRate(String v) {
		value = v;
	}

	public static SyncRate translationFromSNMP(Integer i) {
		switch (i) {
		case -7:
			return ONE_HUNDRED_TWENTY_EIGHT;
		case -6:
			return SIXTY_FOUR;
		case -5:
			return THIRTY_TWO;
		case -4:
			return SIXTEEN;
		default:
			throw new AssertionError("SyncRate enum: Unknown " + i);
		}
	}

	public static SyncRate translationFromSNMP(String i) {
		switch (i) {
		case "-7":
			return ONE_HUNDRED_TWENTY_EIGHT;
		case "-6":
			return SIXTY_FOUR;
		case "-5":
			return THIRTY_TWO;
		case "-4":
			return SIXTEEN;
		default:
			throw new AssertionError("SyncRate enum: Unknown " + i);
		}
	}

	public String value() {
		return value;
	}
}
