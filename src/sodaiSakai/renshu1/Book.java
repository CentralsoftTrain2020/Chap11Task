package sodaiSakai.renshu1;

public class Book extends TangibleAsset{

	String isbn;

	//�R���X�g���N�^
	public Book(String name, int price, String color, String isbn) {
		super(name,price,color);
		this.isbn = isbn;
	}

	//method
	public String getIsbn() { return this.isbn; }

}
