package manaeIshihara.renshu1;

public abstract class TangibleAsset extends Asset {


		String color;
		double weight;
		public TangibleAsset(String name , int price , String color ) {
			super(name ,price);		
			this.color =color;
	}
		
		public String getColor() {return this.color;}
		public double getWaight() {return this.weight;}
		public void setWaight(double weight) {
			this.weight = weight;
					}
}
