package keitaWatanabe.rensyu1;

public class Conputer extends TangibleAsset {
	String makerName;

	public Conputer(String name, int price, String coler, String makerName) {
		super(name, price, coler);
		this.makerName = makerName;
	}

	@Override
	public String toString() {
		return "Conputer [makerName=" + makerName + ", name=" + name + ", price=" + price + ", coler=" + coler + "]";
	}

	public String getMakerName() {
		return this.makerName;
	}
}
