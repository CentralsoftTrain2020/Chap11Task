package yujiAwa.mondai4;

public class ShainFactory {
	Shain s;
	public Shain getShain(String args) {
		if(args.equals("平社員")) {
			this.s = new Hira();
		}else if(args.equals("部長")) {
			this.s = new Bucho();
		}else if(args.equals("主任")) {
			this.s = new Shunin();
		}
		return s;
	}
	
	
}
