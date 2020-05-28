package yoshikiSaito.mondai2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shain s;
		Address a;
		a=new Address("123-4567", "栃木", "野木");
		s=new Shain("あべ",100000,a);

		System.out.println(s.toString());
	}
}
