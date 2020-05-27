package yoheiOno.renshu2;

public abstract class TangibleAsset extends Asset {

	int price;
	String color;

	public TangibleAsset(String name, int price, String color) {
		super(name);
		this.price = price;
		this.color = color;
	}

	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}


}