package manaeIshihara.mondai2;

public class Address {

	int yuubinbango;
	String ken;
	String shichou;
	
	public Address(int yuubinbango, String ken, String shichou) {
		super();
		this.yuubinbango = yuubinbango;
		this.ken = ken;
		this.shichou = shichou;
	}
	
	
	

	public String toString() {
		return "Address [yuubinbango=" + yuubinbango + ", ken=" + ken + ", shichou=" + shichou+ "]";
	}




	public int getYuubinbango() {
		return yuubinbango;
	}

	public void setYuubinbango(int yuubinbango) {
		this.yuubinbango = yuubinbango;
	}

	public String getKen() {
		return ken;
	}

	public void setKen(String ken) {
		this.ken = ken;
	}

	public String getShichou() {
		return shichou;
	}

	public void setShichou(String shichou) {
		this.shichou = shichou;
	}
	
}	