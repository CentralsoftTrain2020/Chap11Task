package ishibashiSeiga.mondai2;

public class Main {

	public static void main(String[] args) {
		
		Shain s = new Shain("石橋");
		
		Adress a = new Adress("341-0003","9-1-803",s);
		
		String str = a.toString();
		
		System.out.println(str);

	}

}