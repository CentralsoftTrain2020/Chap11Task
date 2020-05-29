package yoshikiSaito.mondai5;

public class Kaicho {
	private ShainFactory sf;
	private Shain s;

	public Kaicho(int kihonkyu) {
		sf = new ShainFactory(kihonkyu);
	}

	public void prepare(String comand) {
		s=sf.getShain(comand);
	}
	public int getCost() {
		int cost=s.getsaraly();
		return cost;
	}

}
