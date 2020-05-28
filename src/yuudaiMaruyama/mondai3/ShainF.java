package yuudaiMaruyama.mondai3;

public class ShainF {
	public Shain getShain(String position) {
		if(position.equals("平社員")) {
			return new Hirasha();
		}else if(position.equals("主任")) {
			return new Shuninsha();
		}else{
			return new Butyosha();
		}
	}
}
