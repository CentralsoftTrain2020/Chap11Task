package tomokitakami.renshu1;

public class TangibleAsset {
	String name;
	int place;
	String color;

	public TangibleAsset(String name, int place, String color) {
		this.name = name;
		this.place = place;
		this.color = color;
	}
	public String getName() {return this.name;}
	public int getPrice() {return this.place;}
	public String getColor() {return this.color;}

}
