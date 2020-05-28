package yuudaiMaruyama.mondai2;

public class Adress {
	String poscode;
	String todohuken;
	String tyou;
	
	public Adress(String poscode,String todohuken,String tyou) {
		this.poscode = poscode;
		this.todohuken = todohuken;
		this.tyou = tyou;
	}
	public String getPoscode() { return this.poscode;}
	public String getTodohuken() { return this.todohuken;}
	public String getTyou() { return this.tyou;}
	
	@Override
	public String toString() {
		return "Adress [poscode=" + poscode + ", todohuken=" + todohuken + ", tyou=" + tyou  +"]";
	}
	
}
