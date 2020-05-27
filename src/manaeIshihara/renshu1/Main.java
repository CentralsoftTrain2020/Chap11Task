package manaeIshihara.renshu1;

public class Main {

	public static void main(String[] args) {
		TangibleAsset a,b;
		a=new Book("雑誌",1000,"赤","あ");
		b=new Computer("コンピュータ", 10000," 赤", "青");

		String aa = a.toString();
		String bb = b.toString();

	System.out.println(aa);
	System.out.println(bb);

	}
}