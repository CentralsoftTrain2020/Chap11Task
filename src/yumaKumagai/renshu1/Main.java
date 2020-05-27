package yumaKumagai.renshu1;

public class Main {

	public static void main(String[] args) {
		TangibleAsset tang1,tang2;
		tang1=new Book("本",500,"赤","13桁のコード");
		tang2=new Computer("コンピューター", 100000," 黒", "PCの会社");
		System.out.println(tang1.toString());
		System.out.println(tang2.toString());

	}

}
