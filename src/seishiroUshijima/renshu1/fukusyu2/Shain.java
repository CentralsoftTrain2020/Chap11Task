package seishiroUshijima.renshu1.fukusyu2;


public class Shain {
	
	private String name;
	private int kihonkyu;
	private Adress adress;
	
	public Shain(String name, int kihonkyu, Adress adress) {
		super();
		this.name = name;
		this.kihonkyu = kihonkyu;
		this.adress = adress;
	}

	public int getKihonkyu() {
		return kihonkyu;
	}

	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + ", adress=" + adress + "]";
	}
	
	
	
	

}
