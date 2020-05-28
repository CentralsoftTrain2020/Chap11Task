package Taiki_Ujiie.mondai2;

public class Main {
	public static void main(String[] args){

		Address address = new Address("341-0003", "埼玉県", "彦成3丁目9-1-803");

		Shain shain = new Shain("氏家", 500000, address);

		String str = shain.toString();

		System.out.println(str);
	}
}
