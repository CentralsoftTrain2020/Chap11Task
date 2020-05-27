package ayaSugawara.renshu1;

public class Book extends TangibleAsset {
	String isbn;
	
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	
	public String getIsbn() {return this.isbn;}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	
	

}
	


