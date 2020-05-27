package tomokitakami.renshu4;

public abstract class TangibleAsset extends Asset{
	String color;
	double weight;
	public TangibleAsset(String name ,int place ,String color ,double weight) {
	super(name,place);
	this.color = color;
	this.weight = weight;
	}
	public String getColor() {return this.color;}
	public double gerWeight() {return this.weight;}



	public void setWeight(double Weight) {this.weight = weight;}
}

