package sodaiSakai.sp;

public abstract class Address {
	String yubinBangou;
	String todouhuken;
	String machiBanchi;


	//constructor
	public Address(String yubinBangou, String todouhuken, String machiBanchi) {
		super();
		this.yubinBangou = yubinBangou;
		this.todouhuken = todouhuken;
		this.machiBanchi = machiBanchi;
	}



	@Override
	public String toString() {
		return "Address [yubinBangou=" + yubinBangou + ", todouhuken=" + todouhuken + ", machiBanchi=" + machiBanchi
				+ "]";
	}


}
