package yoshikiSaito.mondai2;

public class Address {
	private String yubinbangou;
	private String todohuken;
	private String machi_banchi;



	public Address(String yubinbangou, String todohuken, String machi_banchi) {
		super();
		this.yubinbangou = yubinbangou;
		this.todohuken = todohuken;
		this.machi_banchi = machi_banchi;
	}



	@Override
	public String toString() {
		return "Address [yubinbangou=" + yubinbangou + ", todohuken=" + todohuken + ", machi_banchi=" + machi_banchi
				+ "]";
	}

}
