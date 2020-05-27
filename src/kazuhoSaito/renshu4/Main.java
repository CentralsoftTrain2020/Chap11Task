package kazuhoSaito.renshu4;

public class Main {

	public static void main(String[] args) {

		TangibleAssset ta1,ta2;
		ta1=new Book("本",500,"赤","13桁のコード",55.55);
		ta2=new Computer("コンピューター", 100000," 黒", "PCの会社",1000.1000);

		System.out.println(ta1.toString());
		System.out.println(ta2.toString());
		System.out.println(ta1.getWeight()+"  "+ta2.getWeight());

	}

}
