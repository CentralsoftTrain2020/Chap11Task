package hayateOta.mondai1;

public class Shain {
	private String name;
	private int kihonkyu;

	public Shain(String name, int kihonkyu) {
		this.name = name;
		this.kihonkyu = kihonkyu;
	}

	public int getKyuyo() {
		return kihonkyu;
	}

	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + "]";
	}


}
