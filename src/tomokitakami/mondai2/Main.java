package tomokitakami.mondai2;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shain ta01;
		Address ta02;

		ta02=new Address("〒○○○-○○○○","東京","京都","大阪","1-10-1");
		ta01=new Shain("お金",150000,ta02);

		String str1 = ta01.toString();

		System.out.println(str1);


	}

}
