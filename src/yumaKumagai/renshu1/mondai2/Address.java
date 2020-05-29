package yumaKumagai.renshu1.mondai2;

public class Address{

	private int yubin;
	private String todouhuken;
	private String matibanti;

	public Address(int yuubin, String todou, String mati) {
		super();
		this.yubin = yuubin;
		this.todouhuken = todou;
		this.matibanti = mati;
}
	public String toString() {
		return "Address [yuubin=" + yubin + ", todou=" + todouhuken + ", mati=" + matibanti + "]";
	}
	public int getYubin() {
		return yubin;
	}
	public void setYubin(int yubin) {
		this.yubin = yubin;
	}
	public String getTodouhuken() {
		return todouhuken;
	}
	public void setTodouhuken(String todouhuken) {
		this.todouhuken = todouhuken;
	}
	public String getMatibanti() {
		return matibanti;
	}
	public void setMatibanti(String matibanti) {
		this.matibanti = matibanti;
	}


}

