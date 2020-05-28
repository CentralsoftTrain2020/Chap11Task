package ayaSugawara.mondai2;

public class Main {

	public static void main(String[] args) {
		Adress a = new Adress("000-9999" , "北海道", "3丁目４－５");
		Shain s = new Shain("山田" ,10000000, a);
		
		
		String S1 = s.toString();
		
		
		System.out.println(S1);		
		
		
		
		

	}

}
