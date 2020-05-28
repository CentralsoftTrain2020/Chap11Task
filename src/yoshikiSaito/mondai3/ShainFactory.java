package yoshikiSaito.mondai3;

public class ShainFactory {
	private Shain shain;

	public ShainFactory(String shain) {
		super();
		if(shain.equals("HiraShain")) {
			this.shain = new HiraShain();
		}else if(shain.equals("Shunin")) {
			this.shain = new Shunin();
		}else if(shain.equals("Bucho"))
		this.shain = new Bucho();
	}

	public Shain getShain() {
		return shain;
	}




}
