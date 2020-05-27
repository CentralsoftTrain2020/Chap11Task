package sodaiSakai.renshu4;

public abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;

	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//コンストラクタ
	public TangibleAsset(String name, int price, String color, double weight) {
		super(name,price);
		this.color = color;
		this.weight = weight;
	}

	//メソッド
	public String getColor() { return this.color; }
}
