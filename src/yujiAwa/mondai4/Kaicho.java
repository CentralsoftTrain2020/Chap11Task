package yujiAwa.mondai4;

public class Kaicho {
	Shain shain;
	ShainFactory sfactory;

	public Kaicho() {
	sfactory = new ShainFactory();
	}

	public Shain prepare(String args) {
		shain = sfactory.getShain(args);
		return shain;
	}

	public void kiritu() {
		shain.kiritu();
	}
}
