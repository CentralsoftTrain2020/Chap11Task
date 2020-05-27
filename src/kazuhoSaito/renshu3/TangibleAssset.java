package kazuhoSaito.renshu3;

public abstract class TangibleAssset extends Asset{

	String color;


	public TangibleAssset(String name, int price, String color) {
		super(name,price);
		this.color = color;
	}



	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}




}
