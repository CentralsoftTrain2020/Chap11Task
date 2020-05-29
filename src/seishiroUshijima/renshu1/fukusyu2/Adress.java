package seishiroUshijima.renshu1.fukusyu2;

public class Adress {
	
	private int yuubin;
	private String ken;
	private String mati;
	
	public Adress(int yuubin, String ken, String mati) {
		super();
		this.yuubin = yuubin;
		this.ken = ken;
		this.mati = mati;
	}
	
	@Override
	public String toString() {
		return "Adress [yuubin=" + yuubin + ", ken=" + ken + ", mati=" + mati + "]";
	}
	
}
