package manaeIshihara.mondai2;

	public class Main {
		public static void main(String[] args) {

		Address a = new Address(1234,"埼玉","三郷");
			Shain s = new Shain("石原", 100000, a);

		String str = s.toString();
		System.out.println(str);
	}

}


