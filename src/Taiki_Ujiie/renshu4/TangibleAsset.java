package Taiki_Ujiie.renshu4;

public abstract class TangibleAsset extends Asset implements Thing {

	int price;
	String color;
	double weight;

	public TangibleAsset(String name, int price, String color) {
		super(name);
		this.price = price;
		this.color = color;
	}

	public int getPrice() {
		return this.price;
	}

	public String getColor() {
		return this.color;
	}

	public double GetWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
