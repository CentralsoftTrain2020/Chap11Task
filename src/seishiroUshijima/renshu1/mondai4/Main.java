package seishiroUshijima.renshu1.mondai4;

public class Main {
	public static void main(String[] args) {

		String commnd = args[0];

		Kaicho k = new Kaicho();

		k.prepare(commnd);
		k.kiritsu();


	}

}
