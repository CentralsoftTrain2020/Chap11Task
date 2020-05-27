package manaeIshihara.renshu1;

public class Computer extends TangibleAsset{

	
	String makerName;
	
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, makerName);
		this.makerName=makerName;
	}
	
	
	public String getIbsn() {
		return this.makerName;
		}
	
	public String toString() {
		return "Computer [makerName=" + makerName + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}
}
