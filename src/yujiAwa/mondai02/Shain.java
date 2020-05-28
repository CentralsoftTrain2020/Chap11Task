package yujiAwa.mondai02;

public class Shain {
	String name;
	int kyuyo;
	Address address;
	
	public Shain(String name, int kyuyo, Address address) {
		super();
		this.name = name;
		this.kyuyo = kyuyo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Shain [name=" + name + ", kyuyo=" + kyuyo + ", address=" + address + "]";
	}
	
	
	
	

}
