package seishiroUshijima.renshu1.fukusyu2;


	public class Main {
		public static void main(String[] args) {
			
			Adress a;
			a = new Adress(43242414,"saitama","hikonari");
			
			Shain s;
			s = new Shain("牛嶋",100000,a);
		
			String str = s.toString();
			System.out.println(str);
		}

	}
