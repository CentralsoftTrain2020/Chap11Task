package ayaSugawara.renshu3;

import ayaSugawara.renshu2.Asset;

public abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;
	
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
			
	}
	public String getColor() { return this.color;}
	public double getWeight() { return this.weight; }
	public void setWeight(double weiht) { this.weight = weight;}
	
}




