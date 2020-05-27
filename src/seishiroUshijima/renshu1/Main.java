package seishiroUshijima.renshu1;

public class Main {
	public static void main(String[] args)
	{
		Computer c;
		c = new Computer ( "pc", 150000,"黒", "MSI" );

		Book b;
		b = new Book( "本",100,"黒","わからん" );

		String str = c.toString();
		String STR = b.toString();
		System.out.println( str );
		System.out.println( STR );
	
	}
}
