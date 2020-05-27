package kazuhoSaito.renshu4;

public abstract class TangibleAssset extends Asset implements Thing{
	String color;
	double weight;


	public TangibleAssset(String name, int price, String color,double weight) {
		super(name,price);
		this.color = color;
		this.weight=weight;
	}



	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public double getWeight() {
		return this.weight;
	}



	@Override
	public void setWeight(double weight) {
		this.weight=weight;

	}






}
