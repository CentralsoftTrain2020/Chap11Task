package yoshikiSaito.renshu1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TangibleAsset ta1, ta2;
		ta1 = new Book("えほん", 1000, "赤", "isbn");
		ta2 = new Computer("abc", 56000, "black", "qwerty");

		String str1 = ta1.toString();
		String str2 = ta2.toString();
		System.out.println(str1);
		System.out.println(str2);
	}

}
