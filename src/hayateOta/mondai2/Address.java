package hayateOta.mondai2;

public class Address {
	private String pCode;
	private String prefecture;
	private String address;

	public Address(String pCode, String prefecture, String address) {
		this.pCode = pCode;
		this.prefecture = prefecture;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [pCode=" + pCode + ", prefecture=" + prefecture + ", address=" + address + "]";
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getPrefecture() {
		return prefecture;
	}

	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
