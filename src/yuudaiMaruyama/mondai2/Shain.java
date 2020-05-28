package yuudaiMaruyama.mondai2;

public class Shain {
	String name;
	int kihonkyu;
	Adress adress;

	public Shain(String name, int kihonkyu, Adress adress) {
		this.name = name;
		this.kihonkyu = kihonkyu;
		this.adress = adress;
	}
	public String getName() { return this.name;}
	public int getKihonkyu() { return this.kihonkyu;}
	
	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + "]";
	}
}
