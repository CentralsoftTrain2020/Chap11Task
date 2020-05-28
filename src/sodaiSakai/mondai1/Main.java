package sodaiSakai.mondai1;

public class Main {
	public static void main(String[] args) {
		Shain shain = new Shain("sakai", 100);
		Address add = new Address("a", "a", "a", shain);

		//System.out.println(shain.toString());
		System.out.println(add.toString());
	}
}
