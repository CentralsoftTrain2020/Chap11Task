package yoheiOno.renshu4;

public abstract class TangibleAsset extends Asset implements Thing {

	String name;
	int price;
	String color;
	double weight;


	public TangibleAsset(String name, int price, String color ,double weight) {
		super(name);
		this.price = price;
		this.color = color;
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}


}