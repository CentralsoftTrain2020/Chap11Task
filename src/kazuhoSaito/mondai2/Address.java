package kazuhoSaito.mondai2;

public class Address {

	String postalCode;
	String prefectue;
	String chomeBanchi;

	public Address(String postalCode, String prefectue, String chomeBanchi) {
		super();
		this.postalCode = postalCode;
		this.prefectue = prefectue;
		this.chomeBanchi = chomeBanchi;
	}

	@Override
	public String toString() {
		return "Adrress [postalCode=" + postalCode + ", prefectue=" + prefectue + ", chomeBanchi=" + chomeBanchi + "]";
	}


}
