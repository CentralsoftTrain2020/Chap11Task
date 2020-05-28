package Taiki_Ujiie.mondai2;

public class Shain {

	private String name;
	private int kihonkyu;
	private Address address;

	public Shain(String name, int kihonkyu, Address address) {
		super();
		this.name = name;
		this.kihonkyu = kihonkyu;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + ", address=" + address + "]";
	}
}
