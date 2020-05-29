package eiichiHayashi.mondai3;

public class Main {
	public static void main(String[] args) {
		//①
		String command = args[0];

		//②
		ShainFactory sf = new ShainFactory();

		//③
		Shain shain;
		shain = sf.getShain( command );

		//④
		shain.kiritsu();
	}
}
