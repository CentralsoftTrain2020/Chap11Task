package hayateOta.mondai2;

public class Main
{
	public static void main(String[] args)
	{
		Address a = new Address("341-0052", "埼玉県", "彦野一丁目 52-2");

		Shain s = new Shain( "太田", 200000, a );

		String str = s.toString();

		System.out.println( str);
	}
}
