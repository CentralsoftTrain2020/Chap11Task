package manaeIshihara.renshu1;

public class Computer extends TangibleAsset{

	
	String makerName;
	
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, makerName);
		this.makerName=makerName;
	}
	
	
	public String getIbsn() {return this.makerName;}
}
