package sodaiSakai.sp;

public class Shain extends Address{
	//field
		String name;
		int kihonkyu;

		//constructor
		public Shain(String name, int kihonkyu, String yubinBangou, String todouhuken, String machiBanchi) {
			super(yubinBangou, todouhuken, machiBanchi);
			this.name = name;
			this.kihonkyu = kihonkyu;
		}



		@Override
		public String toString() {
			return "Shain [name=" + name + ", kihonkyu=" + kihonkyu + ", yubinBangou=" + yubinBangou + ", todouhuken=" + todouhuken + ", machiBanchi=" + machiBanchi + "]";
		}



		public int getKihonkyu() {
			return kihonkyu;
		}
}
