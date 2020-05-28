package sodaiSakai.mondai3;

public class Kaityo {
	public static void main(String[] args) {
		ShainFactory shific = new ShainFactory();

		//shain line create
		Shain[] shain = new Shain[args.length];

		//youkenmitashitenai!!
		for(int i = 0; i < (args.length); i++) {
			if(args[i].equals("a")) {
				shain[i] = shific.getHirashain();
			}else if(args[i].equals("b")) {
				shain[i] = shific.getSyunin();
			}else if(args[i].equals("c")) {
				shain[i] = shific.getButyou();
			}
		}

		//printout!!
		for(int i = 0; i < (shain.length);i++) {
			System.out.println(shain[i].kiritu());
		}

	}
}
