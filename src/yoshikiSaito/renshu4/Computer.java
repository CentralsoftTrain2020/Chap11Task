package yoshikiSaito.renshu4;

public class Computer extends TangibleAsset{
	String makerName;

	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String getMakerName() {
		return makerName;
	}

	@Override
	public String toString() {
		return "Computer [makerName=" + makerName + ", color=" + color + ", weight=" + weight + ", name=" + name
				+ ", price=" + price + "]";
	}
}
