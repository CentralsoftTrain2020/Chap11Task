package kazuhoSaito.mondai3;

public class SyainFactory {

	public Syain getSyain(String position) {
		Syain s = null;
		if(position.equals("平社員")) {
			s=new HiraSyain();
		}else if(position.equals("主任")) {
			s=new Syunin();
		}else 	if(position.equals("部長")){
			s=new Butho();
		}
		return s;
	}
}
