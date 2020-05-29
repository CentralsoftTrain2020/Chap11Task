package tomokitakami.mondai4;

public class Kaicho {
	private Shainfactory sfactory;
	private Shain shain;
	// TODO 自動生成されたメソッド・スタブ

	public Kaicho() {

		sfactory = new Shainfactory();
	}

	public void prepare(String args) {
		shain = sfactory.getShain(args);

	}

	public void stand() {
		shain.stand();
	}

}
