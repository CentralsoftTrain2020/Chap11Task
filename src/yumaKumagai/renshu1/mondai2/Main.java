package yumaKumagai.renshu1.mondai2;

public class Main {

	public static void main(String[] args) {
		Address add = new Address(3410003,"埼玉","三郷");
		Shain s = new Shain("くまがい",80000,add);

		System.out.println(s.toString());

	}

}
