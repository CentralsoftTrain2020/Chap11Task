package ishibashiSeiga.mondai2;

public class Adress {
	
	String AdressNumber;
	String banti;
	Shain name;
	
	public Adress(String AdressNumber,String banti,Shain name) {
		
		super();
		this.AdressNumber = AdressNumber;
		this.banti = banti;
		this.name = name;
		
	}
	
	public String toString() {
		
		return "AdressNumber="+AdressNumber+",番地="+banti+",名前="+name;
		
	}

}

