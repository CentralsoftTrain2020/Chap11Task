package ishibashiSeiga.renshu1;

public class Computer extends TAngibleAsset{
	
	String makerName;
	double weight;
	
	public Computer(String name,int price,String color,String makerName,double weight) {
		
		super(name,price,color,weight);
		this.makerName = makerName;
		this.weight = weight;
		
	}
	
	public void setMakerName(String makerName) {
		
		return;
		
	}
	
	public String getMakerName() {
		
		return this.makerName;
		
	}
	
	public void setWeight(double weight) {
		
		return;
		
	}
	
	public double getWeight() {
		
		return this.weight;
		
	}
	
	public String toString() {
		
		return "name="+name+",price="+price+",color="+color+",makerName="+makerName+",weight="+weight;
		
	}



}
