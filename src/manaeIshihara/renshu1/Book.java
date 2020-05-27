package manaeIshihara.renshu1;

public class Book extends TangibleAsset{
	
	
	String isbn;
	//コンストラクタ
	
	public Book(String name , int price , String color , String isbn) {
		super (name, price, color);
		this.isbn = isbn ;
	}
	
	public String getIbsn() {
		return this.isbn;
		}
	 
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}
}


