package manaeIshihara.renshu1;

public class Main {

	
	public static void main(String[] args) {

		TangibleAsset ta1,ta2;
		ta1=new Book("本",10,"赤","13桁のコード");
		ta2=new Computer("コンピューター", 100," 黒", "PCの会社");

		System.out.println(ta1.toString());
		System.out.println(ta2.toString());
	}
}