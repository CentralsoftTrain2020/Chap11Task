package sodaiSakai.renshu2;

public abstract class Asset {

	String name;
	int price;

	//�R���X�g���N�^
	public Asset(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//���\�b�h
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }

}
