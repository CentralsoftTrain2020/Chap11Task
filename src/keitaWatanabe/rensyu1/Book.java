package keitaWatanabe.rensyu1;

public class Book extends TangibleAsset {
	String isbn;

	public Book(
			String name,
			int price, String coler,
			String isbn) {
		super(name, price, coler);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", coler=" + coler + "]";
	}
}
