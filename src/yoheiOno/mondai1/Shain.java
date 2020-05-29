package yoheiOno.mondai1;

public class Shain {
	String name;
	int kihonkyu;
	Address address = new Address("123-4567","Tokyo","Tiyodaku");

	public Shain(String name, int kihonkyu) {
		super();
		this.name = name;
		this.kihonkyu = kihonkyu;
	}
	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + ", address=" + address.toString() + "]";
	}

}
