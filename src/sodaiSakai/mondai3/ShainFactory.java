package sodaiSakai.mondai3;

public class ShainFactory {

	Shain hirashain;
	Shain syunin;
	Shain butyou;

	public Shain getHirashain() {
		hirashain = new Hirashain();
		return hirashain;
	}

	public Shain getSyunin() {
		syunin = new Syunin();
		return syunin;
	}

	public Shain getButyou() {
		butyou = new Butyou();
		return butyou;
	}

}
