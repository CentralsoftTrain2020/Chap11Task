package yoshikiSaito.mondai5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Kaicho k = new Kaicho(500000);
		k.prepare(args[0]);
		System.out.println(k.getCost());

	}

}
