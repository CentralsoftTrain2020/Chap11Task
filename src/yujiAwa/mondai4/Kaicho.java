package yujiAwa.mondai4;

public class Kaicho {
	Shain shain;
	ShainFactory sfactory;

	public void kaicho() {
	sfactory = new ShainFactory();
	}

	public Shain prepare(String args) {
		sfactory = new ShainFactory();
		shain = sfactory.getShain(args);
		return shain;
	}

	public void kiritu() {
		shain.kiritu();
	}
}
