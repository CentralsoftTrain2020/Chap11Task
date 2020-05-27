package tomokitakami.renshu1;

public class book extends TangibleAsset{
	String isbn;

	public book (String name ,int place,String color,String isbn) {
		super(name,place,color);
		this.isbn = isbn;

	}
	public String getisbn() {return this.isbn;}

}
