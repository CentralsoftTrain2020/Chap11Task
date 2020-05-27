package Taiki_Ujiie.renshu2;

public abstract class TangibleAsset extends Asset{

	int price;
	String color;

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

}
