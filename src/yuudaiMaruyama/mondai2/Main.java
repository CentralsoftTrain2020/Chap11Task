package yuudaiMaruyama.mondai2;

public class Main {
	public static void main(String[] args) {

		Shain s;
		Adress a;
		a = new Adress("341-0003","埼玉","三郷市彦成");
		s = new Shain("丸山",100000,a);

		String ss = s.toString();
		String aa = a.toString();
		
		System.out.println(ss + aa);
	}
}
