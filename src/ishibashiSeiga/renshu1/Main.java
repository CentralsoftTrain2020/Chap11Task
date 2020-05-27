package ishibashiSeiga.renshu1;

public class Main {
	
	public static void main(String[] args){
	
	Computer c = new Computer("MacBookpro",150000,"white","Apple",5.5);
	
	Book b = new Book("アンドロイドは電気羊の夢を見るか？",1000,"black","フィリップ・K・ディック",0.5);
	
	String str1 = c.toString();
	String str2 = b.toString();	
	
	System.out.println(str1);
	System.out.println(str2);

	}
	
}
