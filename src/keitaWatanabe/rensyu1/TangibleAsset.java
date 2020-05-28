package keitaWatanabe.rensyu1;

public class TangibleAsset {
	String name;
	int price;
	String coler;

	public TangibleAsset(String name, int price, String coler) {
		this.name = name;
		this.price = price;
		this.coler = coler;
	}

	public String getName() {
		return this.name;
	}

	public int getPrise() {
		return this.price;
	}

	public String getColer() {
		return this.coler;
	}
}
