package yujiAwa.renshu01;

public class Main {
	public static void main(String[] args) {
		TangibleAsset s1,s2;
		s1 = new Book("ehon",300,"青","aaa");
		s2 = new Computer("promax",50000,"黒","HP");
		String str1 =	s1.toString();
		String str2 = s2.toString();
		System.out.println(str1);
		System.out.println(str2);
	}
}
