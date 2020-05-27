package Taiki_Ujiie.renshu1;

public class Main {
	public static void main(String[] args){

		TangibleAsset ta1 = new Book("参考書", 5000, "赤", "123");
		TangibleAsset ta2 = new Computer("098", 10000, "黒", "三菱");

		String str1 = ta1.toString();
		String str2 = ta2.toString();

		System.out.println(str1 + str2);
	}
}
