package ishibashiSeiga.renshu1;

public abstract class TAngibleAsset extends Asset implements Thing{
	
	String color;
	double weight;
	
	public TAngibleAsset(String name, int price, String color,double weight) {
		
		super(name,price);
		this.color = color;

	}
	
	public String getColor() {
		
		return this.color;
		
	}
	
	public double getWeight() {
		
		return this.weight;
		
	}
	
	public void setWeight(double weight) {
		
		this.weight = weight;
		
	}

}