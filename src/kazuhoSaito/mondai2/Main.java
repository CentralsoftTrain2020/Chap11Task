package kazuhoSaito.mondai2;

public class Main {
	public static void main(String[] args) {

		Syain syain;
		Address address=new Address("000-0000", "東京都", "10000");

		syain=new Syain("さいとう", 5,address);

		System.out.println(syain.toString());
	}
}
