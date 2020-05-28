package sodaiSakai.mondai1;

public class Shain {

	//field
	private String name;
	private int kihonkyu;

	//constructor
	public Shain(String name, int kihonkyu) {
		super();
		this.name = name;
		this.kihonkyu = kihonkyu;
	}

	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + "]";
	}




}
