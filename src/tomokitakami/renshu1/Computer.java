package tomokitakami.renshu1;

public class Computer extends TangibleAsset{
	String makerName;

	public Computer (String name ,int place,String color,String makerName) {
		super(name,place,color);
		this.makerName = makerName;
	}
	public String getmakerName() {return this.makerName;}
}
