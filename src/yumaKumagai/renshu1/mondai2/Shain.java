package yumaKumagai.renshu1.mondai2;

public class Shain {
	private String name;
	private int kihonkyu;
	Address address;

	public Shain(String name, int kihonkyu, Address address) {
		super();
		this.name = name;
		this.kihonkyu = kihonkyu;
		this.address = address;
	}
	
	public String toString() {
		return "Shain [name=" + name + ", kyuyo=" + kihonkyu + "], " + address ;
	}
}
