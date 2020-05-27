package yujiAwa.renshu01;
class Computer extends TangibleAsset{

	String makerName;




	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String toString() {
		return "TangibleAsset [name=" + name + ", price=" + price + ", color=" + color + "makerName" + makerName +"]";
	}



	public String getMakerName() { return this.makerName; }

}
