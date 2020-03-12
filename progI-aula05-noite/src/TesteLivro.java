
public class TesteLivro {

	public static void main(String[] args) {
		
//		String titulo = "Apredendo Java";
//		String autor = "Mario";
//		double valor = 45.99;
//		String isbn = "1234ABC";
//		
//		String titulo1 = "Apredendo C++";
//		String autor1 = "Carlos";
//		double valor1 = 29.99;
//		String isbn1 = "7890ABC";
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = livro1;
		Livro livro4 = new Livro();
		
		Autor autor = new Autor();
		autor.nome = "Mario José";
		autor.email = "ze@email.com";
		autor.cpf = "12345678910";
		
		livro1.titulo = "Apredendo Java";
		livro1.autor = autor;
		livro1.valor = 75.99;
		livro1.isbn = "ABC1234";
		
		livro2.titulo = "Curso de C++";
		livro2.autor = autor;
		livro2.valor = 34.99;
		livro2.isbn = "FEG8989";
		
		livro4.titulo = "Curso de C++";
		//livro4.autor = autor;
		livro4.valor = 34.99;
		livro4.isbn = "FEG8989";
		
		System.out.println("Posição de memória: (livro1) " + livro1);
		livro1.exibeInformacao();
		
		System.out.println();
		
		System.out.println("Posição de memória: (livro2) " + livro2);
		livro2.exibeInformacao();
		
		System.out.println();
		System.out.println("Posição de memória: (livro3) " + livro3);
		livro3.exibeInformacao();
		
		//livro3.autor = "Joao macedo";
		
		System.out.println(livro1.autor);
		System.out.println(livro3.autor);
		
		livro4.exibeInformacao();
		
		if(livro2 == livro4) {
			System.out.println("Livros iguais");
		}else {
			System.out.println("Livros diferentes");
		}
		
		
		if(livro2.valor == livro4.valor) {
			System.out.println("Preços iguais");
		}else {
			System.out.println("Preços diferentes");
		}
		
		System.out.println(livro4.autor);
		
//		if(livro4.autor== null) {
//			System.out.println("Nao tem autor");
//		}else {
//			System.out.println("Tem autor");
//		}
		
		boolean possuiAutor = livro2.temAutor();
		
		System.out.println(livro1.temAutor());
		System.out.println(livro4.temAutor());
		
		livro1.exibeInformacao();
		
		livro1.aplicarDesconto(0.1);
		
		livro1.exibeInformacao();
		
		//livro2.aplicarDesconto(desconto);
	}
}
