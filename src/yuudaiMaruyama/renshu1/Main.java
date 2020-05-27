package yuudaiMaruyama.renshu1;

public class Main {
	public static void main(String[] args) {

		Book b;
		b = new Book("book-A",400,"黒","AAAA-B");
		
		Computer c;
		c = new Computer("PC-A",40000,"黒","レノボ");
		
		String bb = b.toString();
		String cc = c.toString();
		
		System.out.println(bb);
		System.out.println(cc);
	}
}
