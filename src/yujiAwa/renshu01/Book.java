package yujiAwa.renshu01;

public class Book extends TangibleAsset {

	String isbn;



	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}



	public String toString(){
	return "TangibleAsset [name=" + name + ", price=" + price + ", color=" + color + "isbn=" + isbn +"]";
	}

	public String getIsbn() {return this.isbn;}



}
