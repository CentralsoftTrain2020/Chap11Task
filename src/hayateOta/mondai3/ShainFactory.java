package hayateOta.mondai3;

public class ShainFactory {

	public Shain getShain(String str) {
		Shain s;

		if(str.equals("hirashain")) {   // str == hirashain NG
			s = new Hirashain();
		}else if(str.equals("shunin")) {
			s = new Syunin();
		}else if(str.equals("bucho")) {
			s = new Bucho();
		}else {
			s = null;
		}

		return s;
	}
}
