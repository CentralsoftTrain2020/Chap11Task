package kazuhoSaito.renshu4;

public class Book extends TangibleAssset{

	String isbn;

	public Book(String name, int price, String color,String isbn,double weight) {
		super(name, price, color,weight);
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
		return "Book [isbn=" + isbn + ", color=" + color + ", weight=" + weight + ", name=" + name + ", price=" + price
				+ "]";
	}





}
