package yoheiOno.mondai1;

public class Address {

	String postNumber;
	String prefecture;
	String town;
	public Address(String postNumber, String prefecture, String town) {
		super();
		this.postNumber = postNumber;
		this.prefecture = prefecture;
		this.town = town;
	}
	@Override
	public String toString() {
		return "Adress [postNumber=" + postNumber + ", prefecture=" + prefecture + ", town=" + town + "]";
	}



}

