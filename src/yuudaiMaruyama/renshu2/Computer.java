package yuudaiMaruyama.renshu2;

public class Computer extends TangibleAsset{
	String makerName;

	public Computer(String name, int price, String color, String makerName) {
		super(name,price,color);
		this.makerName = makerName;
	}

	//メソッド
	public String getMakerName() { return this.makerName;}

	@Override
	public String toString() {
		return "Computer [makerName=" + makerName + ", color=" + color + ", name=" + name + ", price=" + price + "]";
	}


}
