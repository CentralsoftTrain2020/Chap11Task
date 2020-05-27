package seishiroUshijima.renshu1.renshu2;

public class TangibleAsset extends Assent implements Thing {

	private String name;
	private int price;
	private String color;
	private double weight;


	public TangibleAsset(String name, int price, String color, double weight) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.weight = weight;
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

	public void setWeight() {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

}
