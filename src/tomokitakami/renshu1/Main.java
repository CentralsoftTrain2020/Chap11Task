package tomokitakami.renshu1;

public class Main {


		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			TangibleAsset ta01,ta02;
			ta01=new book("漫画",545,"青","BOOKs COMPANY");
			ta02=new Computer("パソコン", 200000," グレー", "ComputerSystems");

			String str1 = ta01.toString();
			String str2 = ta02.toString();
			System.out.println(str1);
			System.out.println(str2);

		}

	}

