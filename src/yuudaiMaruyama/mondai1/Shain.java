package yuudaiMaruyama.mondai1;

public class Shain {
	String name;
	int kihonkyu;

	public Shain(String name, int kihonkyu) {
		this.name = name;
		this.kihonkyu = kihonkyu;
	}
	public String getName() { return this.name;}
	public int getKihonkyu() { return this.kihonkyu;}
	
	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + "]";
	}
}
