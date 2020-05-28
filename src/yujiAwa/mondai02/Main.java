package yujiAwa.mondai02;

public class Main {
	public static void main(String[] args) {
		Address s1 = new Address(11132,"千葉県","柏市");
		Shain s2 = new Shain("yuji",100,s1);

		String str = s2.toString();
		System.out.println(str);
	}

}
