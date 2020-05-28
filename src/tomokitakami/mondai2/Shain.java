package tomokitakami.mondai2;

public class Shain {
	String name;
	int kihonkyu;
	Address address;

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
	public String getName() {return this.name;}
	public int getkyuyo() {return this.kihonkyu;}
}
