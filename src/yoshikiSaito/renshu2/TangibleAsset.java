package yoshikiSaito.renshu2;

public class TangibleAsset extends Asset{
	String color;

	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "TangibleAsset [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

}
