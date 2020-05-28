package manaeIshihara.mondai2;

public class Shain {

	private String name;
	private int kihonkyu;
	private Address a;
		public Shain(String name, int kihonkyu, Address a) {
		
			super();
			this.name = name;
			this.kihonkyu = kihonkyu;
			this.a = a;
		}
		public String toString() {
			return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + ", address=" + a + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getKihonkyu() {
			return kihonkyu;
		}

		public void setKihonkyu(int kihonkyu) {
			this.kihonkyu = kihonkyu;
		}


		}
