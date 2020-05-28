package manaeIshihara.mondai2;

public class Address {

	int yuubinbango;
	String todouhuken;
	String shichou;
	
	public Address(int yuubinbango, String todouhuken, String shichou) {
		super();
		this.yuubinbango = yuubinbango;
		this.todouhuken = todouhuken;
		this.shichou = shichou;
	}

	public String toString() {
		return "Address [yuubinbango=" + yuubinbango + ", todouhuken=" + todouhuken + ", shichou=" + shichou+ "]";
	}

	public int getYuubinbango() {
		return yuubinbango;
	}

	public void setYuubinbango(int yuubinbango) {
		this.yuubinbango = yuubinbango;
	}

	public String getTodouhuen() {
		return todouhuken;
	}

	public void setTodouhuen(String todouhuken) {
		this.todouhuken = todouhuken;
	}

	public String getShichou() {
		return shichou;
	}

	public void setShichou(String shichou) {
		this.shichou = shichou;
	}
	
}	