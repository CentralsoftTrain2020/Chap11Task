package kazuhoSaito.mondai3;

public class SyainFactory {

	public Syain getSyain(String position) {
		if(position.equals("平社員")) {
			return new HiraSyain();
		}else if(position.equals("主任")) {
			return new Syunin();
		}else 	if(position.equals("部長")){
			return new Butho();
		}
		return new Syain();
	}
}
