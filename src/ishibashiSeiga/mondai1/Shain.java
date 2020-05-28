package ishibashiSeiga.mondai1;

public class Shain {
	
	String name;
	int Kihonkyu;
	
	public Shain(String name,int Kihonkyu) {
		
		this.name = name;
		this.Kihonkyu = Kihonkyu;
		
	}
	
	public int getKihonkyu() {
		
		return Kihonkyu += 10000;
		
		
	}
	
	public String toString() {
		
		return "name="+name+",Kihonkyu="+getKihonkyu();
		
	}

}