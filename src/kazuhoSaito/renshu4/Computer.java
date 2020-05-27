package kazuhoSaito.renshu4;

public class Computer extends TangibleAssset{

	String makerName;

	public Computer(String name, int price, String color,String makerName,double weight) {
		super(name, price, color,weight);
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
		return "Computer [makerName=" + makerName + ", color=" + color + ", weight=" + weight + ", name=" + name
				+ ", price=" + price + "]";
	}




}
