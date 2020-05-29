package tomokitakami.mondai3;

public class Kaicho {
	public static void main(String[] args) {
		String ti = args[0];
		Shainfactory sf = new Shainfactory();
		Shain shain;
		shain = sf.getShain(ti);
		shain.stand();
	}

}