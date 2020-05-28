package yoshikiSaito.renshu4;

public class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;

	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public double getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return weight;
	}

	@Override
	public void setWeight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "TangibleAsset [color=" + color + ", weight=" + weight + ", name=" + name + ", price=" + price + "]";
	}

}
