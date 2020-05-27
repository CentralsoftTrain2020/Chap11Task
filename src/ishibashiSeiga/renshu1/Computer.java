package ishibashiSeiga.renshu1;

import renshu1.TAngibleAsset;

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
	
	@Override
	public void setWeight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public double getWeight() {
		
		return this.weight;
		
	}
	
	public String toString() {
		
		return "name="+name+",price="+price+",color="+color+",makerName="+makerName+",weight="+weight;
		
	}



}
