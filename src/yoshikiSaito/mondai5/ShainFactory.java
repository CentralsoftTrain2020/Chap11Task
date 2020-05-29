package yoshikiSaito.mondai5;

public class ShainFactory {
	private int kihonkyu;

	public ShainFactory(int kihonkyu) {
		this.kihonkyu = kihonkyu;
	}

	public Shain getShain(String comand) {
		Shain shain=null;
		switch(comand) {
		case"平社員":
			shain = new HiraShain(this.kihonkyu);
			break;
		case"主任":
			shain = new Shunin(this.kihonkyu);
			break;
		case"部長":
			shain = new Bucho(this.kihonkyu);
			break;
		}

		return shain;
	}

}
