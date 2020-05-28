package keitaWatanabe.rensyu1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TangibleAsset ta1, ta2;
		ta1 = new Book("w", 1, "l", "a");
		ta2 = new Conputer("d", 2, "z", "m");

		String s = ta1.toString();
		String a = ta2.toString();

		System.out.println(s+"\n"+a);
	}

}
