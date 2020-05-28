package tomokitakami.renshu1;

public class book extends TangibleAsset{
	@Override
	public String toString() {
		return "book [isbn=" + isbn + ", name=" + name + ", place=" + place + ", color=" + color + "]";
	}
	String isbn;

	public book (String name ,int place,String color,String isbn) {
		super(name,place,color);
		this.isbn = isbn;

	}
	public String getisbn() {return this.isbn;}

}
