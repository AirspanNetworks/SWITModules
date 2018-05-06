package Netspan.API.Enums;

public enum DelayRate {
	ONE_HUNDRED_TWENTY_EIGHT("128"), SIXTY_FOUR("64"), THIRTY_TWO("32"), SIXTEEN("16"), EIGHT("8");
	private final String value;

	DelayRate(String v) {
		value = v;
	}

	public static DelayRate translationFromSNMP(Integer i) {
		switch (i) {
		case -7:
			return ONE_HUNDRED_TWENTY_EIGHT;
		case -6:
			return SIXTY_FOUR;
		case -5:
			return THIRTY_TWO;
		case -4:
			return SIXTEEN;
		case -3:
			return EIGHT;
		default:
			throw new AssertionError("DelayRate enum: Unknown " + i);
		}
	}

	public static DelayRate translationFromSNMP(String i) {
		switch (i) {
		case "-7":
			return ONE_HUNDRED_TWENTY_EIGHT;
		case "-6":
			return SIXTY_FOUR;
		case "-5":
			return THIRTY_TWO;
		case "-4":
			return SIXTEEN;
		case "-3":
			return EIGHT;
		default:
			throw new AssertionError("DelayRate enum: Unknown " + i);
		}
	}

	public String value() {
		return value;
	}
}
