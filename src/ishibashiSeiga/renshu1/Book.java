package ishibashiSeiga.renshu1;

import renshu1.TAngibleAsset;

public class Book extends TAngibleAsset{
	
	String writer;
	double weight;
	
	public Book(String name,int price,String color,String writer,double weight) {
		
		super(name,price,color,weight);
		this.writer = writer;
		this.weight = weight;
		
	}
	
	public void setIsbn(String writer) {
		
		return;
		
	}
	
	public String getIsbn() {
		
		return this.writer;
		
	}
	
	@Override
	public void setWeight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public double getWeight() {
		
		return this.weight;
		
	}
	
	public String toString() {
		
		return "name="+name+",price="+price+",color="+color+",writer="+writer+",weight="+weight;
		
	}



}
