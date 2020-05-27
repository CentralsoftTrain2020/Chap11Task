package yoshikiSaito.renshu4;

public class Book extends TangibleAsset{

	String isbn;

	public Book(String name, int price, String color,String isbn) {
		super(name,price,color);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", color=" + color + ", weight=" + weight + ", name=" + name + ", price=" + price
				+ "]";
	}


}
