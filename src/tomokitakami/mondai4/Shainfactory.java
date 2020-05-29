package tomokitakami.mondai4;


public class Shainfactory {

	public Shain getShain(String ti) {
		Shain sh = null;
		switch(ti) {

		case "平社員":
			sh = new Hira();
		break;
		case "主任":
			sh = new Shunin();
		break;
		case "部長":
			sh = new Bucho();
		break;
		}
		return sh;
	}
}
