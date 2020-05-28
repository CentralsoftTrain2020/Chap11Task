package tomokitakami.mondai2;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shain ta01;
		Address ta02;
		ta01=new Shain("お金",150000);
		ta02=new Address("〒○○○-○○○○","東京","京都","大阪","1-10-1");

		String str1 = ta01.toString();
		String str2 = ta02.toString();
		System.out.println(str1);
		System.out.println(str2);

	}

}
