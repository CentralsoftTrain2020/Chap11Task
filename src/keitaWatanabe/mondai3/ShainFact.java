package keitaWatanabe.mondai3;

public class ShainFact {
	public Shain getShain(String s) {

		Shain a;
		if(s.equals("Hirasyain")) {
				 a = new Hirasyain();
		}else if (s.equals("Syunin")) {
				 a = new Syunin();
		}else if (s.equals("Bucho")) {
				 a = new Bucho();
		}else {
				 a = null;
		}
				return a;


	}



}
