package yuudaiMaruyama.mondai3;

public class Kaityo {
	public static void main(String[] args) {
	String position = args[0];

	ShainF sf = new ShainF();
	Shain s = sf.getShain(position);

	s.kiritu();
	}
}
