package kazuhoSaito.mondai3;

public class Kaitho {

	public static void main(String[] args) {
		String position=args[0];

		SyainFactory sf=new SyainFactory();
		Syain s=sf.getSyain(position);

		s.standUp();

	}

}
