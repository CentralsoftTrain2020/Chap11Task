package Taiki_Ujiie.mondai2;

public class Address {

	private String Poscode;
	private String todouhuken;
	private String matitobanti;

	public Address(String poscode, String todouhuken, String matitobanti) {
		super();
		this.Poscode = poscode;
		this.todouhuken = todouhuken;
		this.matitobanti = matitobanti;
	}

	@Override
	public String toString() {
		return "[Poscode=" + Poscode + ", todouhuken=" + todouhuken + ", matitobanti=" + matitobanti + "]";
	}


}
