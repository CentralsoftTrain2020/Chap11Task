package seishiroUshijima.renshu1.mondai4;

public class Kaicho {

	private ShainFactory sf;
	private Shain shain;


	public Kaicho() {
		sf = new ShainFactory();
	}

	public void prepare(String s) {
		shain = sf.getShain(s);
	}

	public void kiritsu() {
		shain.kiritsu();
	}


}
/*
String command = args[0];

//②
ShainFactory sf = new ShainFactory();

//③
Shain shain;
shain = sf.getShain( command );

//④
shain.kiritsu();
*/