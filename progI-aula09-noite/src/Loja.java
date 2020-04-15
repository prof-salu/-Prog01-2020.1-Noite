
public class Loja {
	public static void main(String[] args) {
		Produto p1 = new Livro("1234", "Aprendendo Java", 49.90, "Jon Wilson");
		Livro p2 = new Livro("5678", "Introdução a POO", 78.90, "Ana Clara");
		Produto p3 = new Cd("9012", "Nirvana Unpluged", 19.90, 12);
		Produto p4 = new Dvd("1122", "Rocky 2", 19.90, 120);
		Produto p5 = new Cd("8765", "Mamonas Assassinas", 14.90, 15);
		Produto p6 = new Livro("1234", "Aprendendo Java 2", 79.90, "Jon Wilson");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		System.out.println();
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.equals(p6));
		
		//p1.equals(p2);
		
		//p1.equals(p6);
	}
}
