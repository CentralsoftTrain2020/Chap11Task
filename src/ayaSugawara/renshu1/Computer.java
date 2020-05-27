package ayaSugawara.renshu1;

public class Computer extends TangibleAsset{
	String makerName;
	
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
		}
		
		
		public String getmakerName() {return this.makerName;}


		@Override
		public String toString() {
			return "Computer [makerName=" + makerName + ", name=" + name + ", price=" + price + ", color=" + color
					+ "]";
		}
		
		
	}

