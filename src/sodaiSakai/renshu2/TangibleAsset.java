package sodaiSakai.renshu2;

public abstract class TangibleAsset extends Asset{
	String color;

	//�R���X�g���N�^
	public TangibleAsset(String name, int price, String color) {
		super(name,price);
		this.color = color;
	}

	//���\�b�h
	public String getColor() { return this.color; }
}
