package yujiAwa.mondai02;

public class Address {
	int yuubin;
	String todou;
	String mati;
	
	public Address(int yuubin, String todou, String mati) {
		super();
		this.yuubin = yuubin;
		this.todou = todou;
		this.mati = mati;
	}
	
	
	

	@Override
	public String toString() {
		return "Address [yuubin=" + yuubin + ", todou=" + todou + ", mati=" + mati + "]";
	}




	public int getYuubin() {
		return yuubin;
	}

	public void setYuubin(int yuubin) {
		this.yuubin = yuubin;
	}

	public String getTodou() {
		return todou;
	}

	public void setTodou(String todou) {
		this.todou = todou;
	}

	public String getMati() {
		return mati;
	}

	public void setMati(String mati) {
		this.mati = mati;
	}
	
	
	
}
