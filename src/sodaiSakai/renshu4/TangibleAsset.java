package sodaiSakai.renshu4;

public abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;

	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//�R���X�g���N�^
	public TangibleAsset(String name, int price, String color, double weight) {
		super(name,price);
		this.color = color;
		this.weight = weight;
	}

	//���\�b�h
	public String getColor() { return this.color; }
}
