package seishiroUshijima.renshu1.fukusyu1;

public class Shain {
	
	private String name;
	private int kihonkyu;
	
	
	public Shain(String name, int kihonkyu) {
		super();
		this.name = name;
		this.kihonkyu = kihonkyu;
	}


	public int getKihonkyu() {
		return kihonkyu;
	}


	@Override
	public String toString() {
		return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + "]";
	}
	
	
	

}
