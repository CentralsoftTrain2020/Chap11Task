package tomokitakami.mondai2;

public class Address {
	String ybango;
	String to;
	String ku;
	String chou;
	String banchi;
	public Address(String ybango,String to, String ku, String chou, String banchi) {
		this.ybango = ybango;
		this.to = to;
		this.ku = ku;
		this.chou = chou;
		this.banchi = banchi;
	}
	public String getYbango() {return this.ybango;}
	public String getTo() {return this.to;}
	public String getKu() {return this.ku;}
	public String getChou() {return this.chou;}
	public String getBanchi() {return this.banchi;}
	@Override
	public String toString() {
		return "Address [ybango=" + ybango + ", to=" + to + ", ku=" + ku + ", chou=" + chou + ", banchi=" + banchi
				+ "]";
	}

}
