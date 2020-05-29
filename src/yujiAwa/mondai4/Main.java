package yujiAwa.mondai4;

public class Main {
	public static void main(String[] args) {
		Kaicho a = new Kaicho();
		ShainFactory s = a.Kaicho();
		a.prepare(args[0]);
		a.kiritu();
	}
}
