package tomokitakami.mondai3;

public class Kaicho {
	public static void main(String[] args) {

		Shainfactory sf = new Shainfactory(args[0]);
		Shain sh=sf.getShain();
		sh.stand();
	}

}