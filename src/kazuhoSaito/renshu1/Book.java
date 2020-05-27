package kazuhoSaito.renshu1;

public class Book extends TangibleAssset{

	String isbn;

	public Book(String name, int price, String color,String isbn) {
		super(name, price, color);
		this.isbn=isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}



}
