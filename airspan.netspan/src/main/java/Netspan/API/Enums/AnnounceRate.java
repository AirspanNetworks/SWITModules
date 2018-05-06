package Netspan.API.Enums;

public enum AnnounceRate {
	FOUR_ANNOUNCE("4"), TWO_ANNOUNCE("2"), ONE_ANNOUNCE("1"), HALF_ANNOUNCE("0.5"), QUARTER_ANNOUNCE("0.25");

	private final String value;

	AnnounceRate(String v) {
		value = v;
	}

	public static AnnounceRate translationSNMP(Integer i) {
		switch (i) {
		case -2:
			return FOUR_ANNOUNCE;
		case -1:
			return TWO_ANNOUNCE;
		case 0:
			return ONE_ANNOUNCE;
		case 1:
			return HALF_ANNOUNCE;
		case 2:
			return QUARTER_ANNOUNCE;
		default:
			throw new AssertionError("AnnounceRate enum: Unknown " + i);
		}
	}

	public String value() {
		return value;
	}
}
