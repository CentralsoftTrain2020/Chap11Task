package sodaiSakai.renshu4;

public abstract class Asset {

	String name;
	int price;

	//コンストラクタ
	public Asset(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//メソッド
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }

}
