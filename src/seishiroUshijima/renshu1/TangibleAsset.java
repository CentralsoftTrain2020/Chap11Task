package seishiroUshijima.renshu1;

public class TangibleAsset {

	private String name;
	private int price;
	private String color;



	public TangibleAsset(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public String getColor() {
		return color;
	}



}
