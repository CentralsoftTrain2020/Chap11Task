package hayateOta.mondai2;

public class Shain {
	private String name;
	private int kihonkyu;
	private Address address;

	public Shain(String name, int kihonkyu, Address address) {
		this.name = name;
		this.kihonkyu = kihonkyu;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKihonkyu() {
		return kihonkyu;
	}

	public void setKihonkyu(int kihonkyu) {
		this.kihonkyu = kihonkyu;
	}


}
