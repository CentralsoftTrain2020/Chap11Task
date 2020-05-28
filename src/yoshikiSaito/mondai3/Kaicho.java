package yoshikiSaito.mondai3;

public class Kaicho {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ShainFactory sf = new ShainFactory(args[0]);
		Shain shain=sf.getShain();
		shain.stand();
	}

}
