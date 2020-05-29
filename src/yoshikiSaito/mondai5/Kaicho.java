package yoshikiSaito.mondai5;

public class Kaicho {
	private ShainFactory sf;
	private Shain s;

	public Kaicho(int kihonkyu) {
		this.sf = new ShainFactory(kihonkyu);
	}

	public void prepare(String comand) {
		this.s = this.sf.getShain(comand);
	}

	public int getCost() {
		int cost = this.s.getsaraly();
		return cost;
	}

}
