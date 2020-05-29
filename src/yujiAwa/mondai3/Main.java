package yujiAwa.mondai3;

public class Main {
	public static void main(String[] args) {
		ShainFactory fac = new ShainFactory();
		Shain shain = fac.getShain(args[0]);
		shain.kiritu();
	}
}