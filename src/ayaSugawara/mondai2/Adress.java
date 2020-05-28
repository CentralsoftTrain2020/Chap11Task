package ayaSugawara.mondai2;


public class Adress {
	private String postal;
	private String todohuken;
	private String banti;
	
	
	
	public Adress(String postal, String todohuken, String banti) {
		super();
		this.postal = postal;
		this.todohuken = todohuken;
		this.banti = banti;
		
	}
	public String getPostal() {
		return postal;
	}
	public String getTodohuken() {
		return todohuken;
	}
	public String getBanti() {
		return banti;
	}
	@Override
	public String toString() {
		return "Adress [postal=" + postal + ", todohuken=" + todohuken + ", banti=" + banti + "]";
	}
	
	

}
