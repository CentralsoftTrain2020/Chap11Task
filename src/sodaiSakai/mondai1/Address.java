package sodaiSakai.mondai1;

public class Address {
	private String yubinBangou;
	private String todouhuken;
	private String machiBanchi;
	private Shain shain;

	//constructor
	public Address(String yubinBangou, String todouhuken, String machiBanchi, Shain shain) {
		super();
		this.yubinBangou = yubinBangou;
		this.todouhuken = todouhuken;
		this.machiBanchi = machiBanchi;
		this.shain = shain;
	}

	@Override
	public String toString() {
		return "Address [yubinBangou=" + yubinBangou + ", todouhuken=" + todouhuken + ", machiBanchi=" + machiBanchi
				+ ", shain=" + shain.toString() + "]";
	}


}
