package kazuhoSaito.renshu1;

public class Computer extends TangibleAssset{

	String makerName;

	public Computer(String name, int price, String color,String makerName) {
		super(name, price, color);
		this.makerName=makerName;
	}

	public String getMakerName() {
		return makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	@Override
	public String toString() {
		return "Computer [makerName=" + makerName + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}



}
