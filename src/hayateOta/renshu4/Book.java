package hayateOta.renshu4;

public class Book extends TangibleAsset {
	String name;
	int price;
	String color;
	String isbn;

	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

}
