package tomokitakami.renshu2;

public class TangibleAsset extends Asset{
	String color;
	public TangibleAsset(String name,int place,String color) {
		super(name,place);
		this.color = color;
	}
	public String getColor() {return this.color;}

}
