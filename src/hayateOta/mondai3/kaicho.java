package hayateOta.mondai3;

public class kaicho {

	public static void main(String[] args) {
		ShainFactory sf = new ShainFactory();
		Shain s;
		for(int i = 0; i < 3; i++) {
			s = sf.getShain(args[i]);
			s.kiritsu();
		}


	}

}
//	 args0 args1       args2     args3  args4
//   /java kaicho.java hirashain shunin bucho
//                     args0     args1  args2