package ishibashiSeiga.renshu1;

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
	
	public void setWeight(double weight) {
		
		return;
		
	}
	
	public double getWeight() {
		
		return this.weight;
		
	}
	
	public String toString() {
		
		return "name="+name+",price="+price+",color="+color+",writer="+writer+",weight="+weight;
		
	}



}
