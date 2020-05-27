package kazuhoSaito.renshu2;

public class Main {

	public static void main(String[] args) {

		TangibleAssset ta1,ta2;
		ta1=new Book("本",500,"赤","13桁のコード");
		ta2=new Computer("コンピューター", 100000," 黒", "PCの会社");

		System.out.println(ta1.toString());
		System.out.println(ta2.toString());

	}

}
