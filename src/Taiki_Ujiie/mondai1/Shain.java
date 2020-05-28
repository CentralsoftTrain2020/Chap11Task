package Taiki_Ujiie.mondai1;

public class Shain {

	private String name;
	private int kihonkyu;

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
