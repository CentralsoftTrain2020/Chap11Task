package ayaSugawara.renshu1;

public class Main {

	public static void main(String[] args) {
		TangibleAsset ta1, ta2;
		ta1 = new Book("？？？", 5000 ,"黄色", "a");
		ta2 = new Computer("！！！", 10000 , "緑" , "a");
		
		
		String s = ta1.toString();
		String n = ta2.toString();
		
		System.out.println(s);
		System.out.println(n);

	
	}

}
