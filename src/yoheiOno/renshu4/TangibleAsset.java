package yoheiOno.renshu4;

public abstract class TangibleAsset implements Asset Thing {

	String name;
	int price;
	String color;
	double weight;


	public TangibleAsset(String name, int price, String color ,double weight) {
		this.name = name;
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