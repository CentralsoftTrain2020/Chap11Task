package tomokitakami.mondai3;

public class Shainfactory {
	private Shain shain;

	public Shainfactory(String sh) {
		super();
		if(sh.equals("平社員")) {
			this.shain = new Hira();
		}else if(sh.equals("主任")) {
			this.shain = new Shunin();
		}else if(sh.equals("部長"))
		this.shain = new Bucho();
	}

	public Shain getShain() {
		return shain;
	}




}

