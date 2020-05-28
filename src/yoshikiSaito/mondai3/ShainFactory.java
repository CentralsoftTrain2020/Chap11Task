package yoshikiSaito.mondai3;

public class ShainFactory {


	public Shain getShain(String name) {

		Shain shain ;
		if (name.equals("HiraShain")) {
			shain = new HiraShain();
		} else if (name.equals("Shunin")) {
			shain = new Shunin();
		} else if (name.equals("Bucho")) {
			shain = new Bucho();
		}
		else {
			shain= null;
		}
		return shain;
	}

}
