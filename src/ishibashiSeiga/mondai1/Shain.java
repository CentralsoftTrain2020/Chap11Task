package ishibashiSeiga.mondai1;

public class Shain {

	String name;
	int Kihonkyu;
	int zangyou;

	public Shain(String name,int Kihonkyu,int zangyou) {

		this.name = name;
		this.Kihonkyu = Kihonkyu;
		this.zangyou = zangyou;

	}

	public int getKihonkyu() {

		return Kihonkyu = Kihonkyu*1/5*zangyou;


	}

	public String toString() {

		return "name="+name+",Kihonkyu="+getKihonkyu();

	}

}
